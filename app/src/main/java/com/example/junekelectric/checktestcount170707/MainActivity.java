package com.example.junekelectric.checktestcount170707;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.junekelectric.checktestcount170707.R.id.textView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView number = (TextView)findViewById(R.id.number);
    int count = 0;

    public void plus (View v) {
        count = count + 1 ;
        number.setText(count + "つ");
    }

    public void minus (View v) {
        count = count - 1 ;
        number.setText(count + "つ");
    }
}
