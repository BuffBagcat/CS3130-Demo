package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitButton(View view) {
        TextView tv = (TextView) findViewById(R.id.helloText);
        EditText et = (EditText) findViewById(R.id.editText);
        tv.setText(et.getText());
    }
}
