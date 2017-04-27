package com.saqo.viewinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    View view1;
    View view2;

    TextView textView1;
    TextView textView2;

    int counter = 1;
    int counter1 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view1 =  findViewById(R.id.view1);
        view2 =  findViewById(R.id.view2);
        view1.setOnClickListener(this);
        view2.setOnClickListener(this);

        textView1 = (TextView) findViewById(R.id.firstScroll);
        textView2 = (TextView) findViewById(R.id.secondScroll);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.view1:
                counter++;
                if (counter % 2 == 0) {
                    textView1.setVisibility(View.VISIBLE);
                } else {
                    textView1.setVisibility(View.GONE);
                }

                break;
            case R.id.view2:
                counter1++;
                if (counter1 % 2 == 0) {
                    textView2.setVisibility(View.VISIBLE);
                } else {
                    textView2.setVisibility(View.GONE);
                }
                break;
            default:
                break;
        }
    }
}
