package mehulpatel.com.fibonacciapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    public void generateNumbers(View v) {
        EditText et = (EditText)findViewById(R.id.nNumber);
        Intent myIntent = new Intent(this, FibonacciActivity.class);
        myIntent.putExtra("nNumber", et.getText().toString());
        startActivity(myIntent);
    }
}
