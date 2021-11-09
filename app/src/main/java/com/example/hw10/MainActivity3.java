package com.example.hw10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        AA gv=(AA) getApplicationContext();
        TextView answer=findViewById(R.id.textView14);
        int etnum_8= Integer.parseInt(gv.getEtnum());
        int etnum_7= (int) (etnum_8-Math.floor(etnum_8/Math.pow(10,7))*Math.pow(10,7));
        int etnum_6= (int) (etnum_7-Math.floor(etnum_7/Math.pow(10,6))*Math.pow(10,6));
        int etnum_5= (int) (etnum_6-Math.floor(etnum_6/Math.pow(10,5))*Math.pow(10,5));
        int etnum_4= (int) (etnum_5-Math.floor(etnum_5/Math.pow(10,4))*Math.pow(10,4));
        int etnum_3= (int) (etnum_4-Math.floor(etnum_4/Math.pow(10,3))*Math.pow(10,3));
        int num_8= Integer.parseInt(gv.getNum());
        int num2_8= Integer.parseInt(gv.getNum2());
        int num3_8= Integer.parseInt(gv.getNum3());
        int num3_7= (int) (num3_8-Math.floor(num3_8/Math.pow(10,7))*Math.pow(10,7));
        int num3_6= (int) (num3_7-Math.floor(num3_7/Math.pow(10,6))*Math.pow(10,6));
        int num3_5= (int) (num3_6-Math.floor(num3_6/Math.pow(10,5))*Math.pow(10,5));
        int num3_4= (int) (num3_5-Math.floor(num3_5/Math.pow(10,4))*Math.pow(10,4));
        int num3_3= (int) (num3_4-Math.floor(num3_4/Math.pow(10,3))*Math.pow(10,3));
        int num4_8= Integer.parseInt(gv.getNum4());
        int num4_7= (int) (num4_8-Math.floor(num4_8/Math.pow(10,7))*Math.pow(10,7));
        int num4_6= (int) (num4_7-Math.floor(num4_7/Math.pow(10,6))*Math.pow(10,6));
        int num4_5= (int) (num4_6-Math.floor(num4_6/Math.pow(10,5))*Math.pow(10,5));
        int num4_4= (int) (num4_5-Math.floor(num4_5/Math.pow(10,4))*Math.pow(10,4));
        int num4_3= (int) (num4_4-Math.floor(num4_4/Math.pow(10,3))*Math.pow(10,3));
        int num5_8= Integer.parseInt(gv.getNum5());
        int num5_7= (int) (num5_8-Math.floor(num5_8/Math.pow(10,7))*Math.pow(10,7));
        int num5_6= (int) (num5_7-Math.floor(num5_7/Math.pow(10,6))*Math.pow(10,6));
        int num5_5= (int) (num5_6-Math.floor(num5_6/Math.pow(10,5))*Math.pow(10,5));
        int num5_4= (int) (num5_5-Math.floor(num5_5/Math.pow(10,4))*Math.pow(10,4));
        int num5_3= (int) (num5_4-Math.floor(num5_4/Math.pow(10,3))*Math.pow(10,3));
        if(etnum_8==num_8){
            answer.setText("1000萬");
        }
        else if(etnum_8==num2_8){
            answer.setText("200萬");
        }
        else if(etnum_8==num3_8||etnum_8==num4_8||etnum_8==num5_8){
            answer.setText("20萬");
        }
        else if(etnum_7==num3_7||etnum_7==num4_7||etnum_7==num5_7){
            answer.setText("4萬");
        }
        else if(etnum_6==num3_6||etnum_6==num4_6||etnum_6==num5_6){
            answer.setText("1萬");
        }
        else if(etnum_5==num3_5||etnum_5==num4_5||etnum_5==num5_5){
            answer.setText("4000");
        }
        else if(etnum_4==num3_4||etnum_4==num4_4||etnum_4==num5_4){
            answer.setText("1000");
        }
        else if(etnum_3==num3_3||etnum_3==num4_3||etnum_3==num5_3){
            answer.setText("200");
        }
        else {
            answer.setText("再接再厲！");
        }
    }
    public void but_click(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity3.this, MainActivity2.class);
        startActivity(intent);
    }
    public void but_click2(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity3.this, MainActivity.class);
        startActivity(intent);
    }
}
