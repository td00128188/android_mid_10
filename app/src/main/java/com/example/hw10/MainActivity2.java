package com.example.hw10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        AA gv=(AA) getApplicationContext();
        TextView month=findViewById(R.id.textView7);
        TextView num=findViewById(R.id.textView8);
        TextView num2=findViewById(R.id.textView9);
        TextView num3=findViewById(R.id.textView10);
        TextView num4=findViewById(R.id.textView11);
        TextView num5=findViewById(R.id.textView12);
        month.setText(gv.getMonth());
        int[] x=new int[5];
        for(int i=0;i<5;i++){
            x[i]=(int) (Math.random()*99999999);
        }
        num.setText(String.format("%08d",x[0]));
        num2.setText(String.format("%08d",x[1]));
        num3.setText(String.format("%08d",x[2]));
        num4.setText(String.format("%08d",x[3]));
        num5.setText(String.format("%08d",x[4]));
        gv.setNum(String.format("%08d",x[0]));
        gv.setNum2(String.format("%08d",x[1]));
        gv.setNum3(String.format("%08d",x[2]));
        gv.setNum4(String.format("%08d",x[3]));
        gv.setNum5(String.format("%08d",x[4]));
    }
    public void but_click(View view){
        EditText edn=findViewById(R.id.editTextNumber);
        AA gv=(AA) getApplicationContext();
        gv.setEtnum(edn.getText().toString());
        Intent intent = new Intent();
        intent.setClass(MainActivity2.this, MainActivity3.class);
        startActivity(intent);
    }
    public void but_click2(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}