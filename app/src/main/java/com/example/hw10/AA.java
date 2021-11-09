package com.example.hw10;

import android.app.Application;

public class AA extends Application {
    private String month="";
    private String num;
    private String num2;
    private String num3;
    private String num4;
    private String num5;
    private String etnum;
    public void setMonth(String month){
        this.month=month;
    }
    public void setNum(String num){
        this.num=num;
    }
    public void setNum2(String num2){
        this.num2=num2;
    }
    public void setNum3(String num3){
        this.num3=num3;
    }
    public void setNum4(String num4){
        this.num4=num4;
    }
    public void setNum5(String num5){
        this.num5=num5;
    }
    public void setEtnum(String etnum){
        this.etnum=etnum;
    }
    public String getMonth(){
        return month;
    }
    public String getNum(){
        return num;
    }
    public String getNum2(){
        return num2;
    }
    public String getNum3(){
        return num3;
    }
    public String getNum4(){
        return num4;
    }
    public String getNum5(){
        return num5;
    }
    public String getEtnum(){
        return etnum;
    }
}