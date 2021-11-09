package com.example.hw10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AA gv=(AA) getApplicationContext();
        TextView month=findViewById(R.id.textView);
        TextView month2=findViewById(R.id.textView2);
        TextView month3=findViewById(R.id.textView3);
        TextView month4=findViewById(R.id.textView4);
        TextView month5=findViewById(R.id.textView5);
        TextView month6=findViewById(R.id.textView6);
        if(gv.getMonth().equals(month.getText())==true){
            month.setTypeface(Typeface.DEFAULT_BOLD);
        }
        else if(gv.getMonth().equals(month2.getText())==true){
            month2.setTypeface(Typeface.DEFAULT_BOLD);
        }
        else if(gv.getMonth().equals(month3.getText())==true){
            month3.setTypeface(Typeface.DEFAULT_BOLD);
        }
        else if(gv.getMonth().equals(month4.getText())==true){
            month4.setTypeface(Typeface.DEFAULT_BOLD);
        }
        else if(gv.getMonth().equals(month5.getText())==true){
            month5.setTypeface(Typeface.DEFAULT_BOLD);
        }
        else if(gv.getMonth().equals(month6.getText())==true){
            month6.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }
    public void tv_click(View view){
        TextView month=findViewById(R.id.textView);
        TextView month2=findViewById(R.id.textView2);
        TextView month3=findViewById(R.id.textView3);
        TextView month4=findViewById(R.id.textView4);
        TextView month5=findViewById(R.id.textView5);
        TextView month6=findViewById(R.id.textView6);
        AA gv=(AA) getApplicationContext();
        gv.setMonth(month.getText().toString());
        month.setTypeface(Typeface.DEFAULT_BOLD);
        month2.setTypeface(Typeface.DEFAULT);
        month3.setTypeface(Typeface.DEFAULT);
        month4.setTypeface(Typeface.DEFAULT);
        month5.setTypeface(Typeface.DEFAULT);
        month6.setTypeface(Typeface.DEFAULT);
    }
    public void tv2_click(View view){
        TextView month=findViewById(R.id.textView);
        TextView month2=findViewById(R.id.textView2);
        TextView month3=findViewById(R.id.textView3);
        TextView month4=findViewById(R.id.textView4);
        TextView month5=findViewById(R.id.textView5);
        TextView month6=findViewById(R.id.textView6);
        AA gv=(AA) getApplicationContext();
        gv.setMonth(month2.getText().toString());
        month2.setTypeface(Typeface.DEFAULT_BOLD);
        month.setTypeface(Typeface.DEFAULT);
        month3.setTypeface(Typeface.DEFAULT);
        month4.setTypeface(Typeface.DEFAULT);
        month5.setTypeface(Typeface.DEFAULT);
        month6.setTypeface(Typeface.DEFAULT);
    }
    public void tv3_click(View view){
        TextView month=findViewById(R.id.textView);
        TextView month2=findViewById(R.id.textView2);
        TextView month3=findViewById(R.id.textView3);
        TextView month4=findViewById(R.id.textView4);
        TextView month5=findViewById(R.id.textView5);
        TextView month6=findViewById(R.id.textView6);
        AA gv=(AA) getApplicationContext();
        gv.setMonth(month3.getText().toString());
        month3.setTypeface(Typeface.DEFAULT_BOLD);
        month.setTypeface(Typeface.DEFAULT);
        month2.setTypeface(Typeface.DEFAULT);
        month4.setTypeface(Typeface.DEFAULT);
        month5.setTypeface(Typeface.DEFAULT);
        month6.setTypeface(Typeface.DEFAULT);
    }
    public void tv4_click(View view){
        TextView month=findViewById(R.id.textView);
        TextView month2=findViewById(R.id.textView2);
        TextView month3=findViewById(R.id.textView3);
        TextView month4=findViewById(R.id.textView4);
        TextView month5=findViewById(R.id.textView5);
        TextView month6=findViewById(R.id.textView6);
        AA gv=(AA) getApplicationContext();
        gv.setMonth(month4.getText().toString());
        month4.setTypeface(Typeface.DEFAULT_BOLD);
        month.setTypeface(Typeface.DEFAULT);
        month2.setTypeface(Typeface.DEFAULT);
        month3.setTypeface(Typeface.DEFAULT);
        month5.setTypeface(Typeface.DEFAULT);
        month6.setTypeface(Typeface.DEFAULT);
    }
    public void tv5_click(View view){
        TextView month=findViewById(R.id.textView);
        TextView month2=findViewById(R.id.textView2);
        TextView month3=findViewById(R.id.textView3);
        TextView month4=findViewById(R.id.textView4);
        TextView month5=findViewById(R.id.textView5);
        TextView month6=findViewById(R.id.textView6);
        AA gv=(AA) getApplicationContext();
        gv.setMonth(month5.getText().toString());
        month5.setTypeface(Typeface.DEFAULT_BOLD);
        month.setTypeface(Typeface.DEFAULT);
        month2.setTypeface(Typeface.DEFAULT);
        month3.setTypeface(Typeface.DEFAULT);
        month4.setTypeface(Typeface.DEFAULT);
        month6.setTypeface(Typeface.DEFAULT);
    }
    public void tv6_click(View view){
        TextView month=findViewById(R.id.textView);
        TextView month2=findViewById(R.id.textView2);
        TextView month3=findViewById(R.id.textView3);
        TextView month4=findViewById(R.id.textView4);
        TextView month5=findViewById(R.id.textView5);
        TextView month6=findViewById(R.id.textView6);
        AA gv=(AA) getApplicationContext();
        gv.setMonth(month6.getText().toString());
        month6.setTypeface(Typeface.DEFAULT_BOLD);
        month.setTypeface(Typeface.DEFAULT);
        month2.setTypeface(Typeface.DEFAULT);
        month3.setTypeface(Typeface.DEFAULT);
        month4.setTypeface(Typeface.DEFAULT);
        month5.setTypeface(Typeface.DEFAULT);
    }
    public void but_click(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}