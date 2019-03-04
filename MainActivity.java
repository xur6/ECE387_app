package com.example.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void display(View view){
        num += 1;
        display(num);
    }

    private void display(int num) {
        TextView quantityTextView = (TextView) findViewById(R.id.displaynum);
        quantityTextView.setText("" + num);
    }

}
