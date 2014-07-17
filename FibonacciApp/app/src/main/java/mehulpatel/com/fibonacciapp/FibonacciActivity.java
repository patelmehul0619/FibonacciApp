package mehulpatel.com.fibonacciapp;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import mehulpatel.com.fibonacciapp.R;

public class FibonacciActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        String nNumber = getIntent().getStringExtra("nNumber");

        final TextView text = (TextView) findViewById(R.id.text);
        if(nNumber == null || nNumber.isEmpty()) {
            text.setText("No Number Provided");
        } else {
            text.setText(getFib(Integer.parseInt(nNumber)));
            text.setAlpha(0);



        }

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                text.setAlpha(1);
                text.startAnimation(AnimationUtils.loadAnimation(FibonacciActivity.this, android.R.anim.slide_in_left));
            }
        }, 100);

    }


    public static int fibonacci(int n) {
        int prev1=0, prev2=1;
        for(int i=0; i<n; i++) {
            int savePrev1 = prev1;
            prev1 = prev2;
            prev2 = savePrev1 + prev2;
        }
        return prev1;
    }

    public static String getFib(int n) {
        StringBuilder sb = new StringBuilder(fibonacci(0));
        sb.append("0");
        for (int i = 1; i < n; ++i) {
            sb.append(", ");
            sb.append(fibonacci(i));
        }
        return sb.toString();
    }}
