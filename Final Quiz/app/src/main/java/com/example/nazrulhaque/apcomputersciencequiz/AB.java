package com.example.nazrulhaque.apcomputersciencequiz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;

public class AB extends AppCompatActivity {
    ArrayList<Integer> list = new ArrayList<Integer>();//all ten numbers
    ArrayList<Integer> list2 = new ArrayList<Integer>();//randomly selected numbers

    int Score = 0;

    //Pic Names
    int picN1;
    int picN2;
    int picN3;
    int picN4;
    int picN5;

    public ImageView pic1;
    public TextView answer1;
    public RadioGroup group1;
    public RadioButton radio1;

    public ImageView pic2;
    public TextView answer2;
    public RadioGroup group2;
    public RadioButton radio2;

    public ImageView pic3;
    public TextView answer3;
    public RadioGroup group3;
    public RadioButton radio3;

    public ImageView pic4;
    public TextView answer4;
    public RadioGroup group4;
    public RadioButton radio4;

    public ImageView pic5;
    public TextView answer5;
    public RadioGroup group5;
    public RadioButton radio5;

    public TextView scoreD;

    public Button finishB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ab);
        //Objects
        pic1=(ImageView) findViewById(R.id.pic1);
        answer1=(TextView) findViewById(R.id.answer1);
        group1 =(RadioGroup) findViewById(R.id.group1);

        pic2=(ImageView) findViewById(R.id.pic2);
        answer2=(TextView) findViewById(R.id.answer2);
        group2 =(RadioGroup) findViewById(R.id.group2);

        pic3=(ImageView) findViewById(R.id.pic3);
        answer3=(TextView) findViewById(R.id.answer3);
        group3 =(RadioGroup) findViewById(R.id.group3);

        pic4=(ImageView) findViewById(R.id.pic4);
        answer4=(TextView) findViewById(R.id.answer4);
        group4 =(RadioGroup) findViewById(R.id.group4);

        pic5=(ImageView) findViewById(R.id.pic5);
        answer5=(TextView) findViewById(R.id.answer5);
        group5 =(RadioGroup) findViewById(R.id.group5);


        scoreD =(TextView) findViewById(R.id.score);


        randName();

        picN1 = list2.get(0);
        picN2 = list2.get(1);
        picN3 = list2.get(2);
        picN4 = list2.get(3);
        picN5 = list2.get(4);

        //Insert Pic
        Context context = pic1.getContext();

        int id1 = context.getResources().getIdentifier("ab_"+Integer.toString(picN1), "drawable", context.getPackageName());
        pic1.setImageResource(id1);

        int id2 = context.getResources().getIdentifier("ab_"+Integer.toString(picN2), "drawable", context.getPackageName());
        pic2.setImageResource(id2);

        int id3 = context.getResources().getIdentifier("ab_"+Integer.toString(picN3), "drawable", context.getPackageName());
        pic3.setImageResource(id3);

        int id4 = context.getResources().getIdentifier("ab_"+Integer.toString(picN4), "drawable", context.getPackageName());
        pic4.setImageResource(id4);

        int id5 = context.getResources().getIdentifier("ab_"+Integer.toString(picN5), "drawable", context.getPackageName());
        pic5.setImageResource(id5);


    }

    public void startAB(View view) {
        Intent intent = new Intent(this, AB.class);
        finish();
        startActivity(intent);
    }

    public void goHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    //called by submit button:
    public void displayAnswers(View v){

        Q1(v);
        Q2(v);
        Q3(v);
        Q4(v);
        Q5(v);
        scoreD.setText("Your score is "+Integer.toString(Score)+"/5");
    }
    public void Q1(View v){
        int radioId1 = group1.getCheckedRadioButtonId();
        radio1 = (RadioButton) findViewById(radioId1);
        String chosen1 = String.valueOf(radio1.getText());
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        String val1 = databaseAccess.getValue("ab_"+Integer.toString(picN1));
        answer1.setText(val1);
        if(chosen1.equals(val1)){
            answer1.setText("CORRECT");
            Score+=1;
        }
        else {
            answer1.setText("WRONG THE ANSWER IS: " + val1);
        }
        databaseAccess.close();
    }

    public void Q2(View v){
        int radioId2 = group2.getCheckedRadioButtonId();
        radio2 = (RadioButton) findViewById(radioId2);
        String chosen2 = String.valueOf(radio1.getText());
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        String val2 = databaseAccess.getValue("ab_"+Integer.toString(picN2));
        answer2.setText(val2);
        if(chosen2.equals(val2)){
            answer2.setText("CORRECT");
            Score+=1;
        }
        else {
            answer2.setText("WRONG THE ANSWER IS: " + val2);
        }
        databaseAccess.close();
    }

    public void Q3(View v){
        int radioId3 = group3.getCheckedRadioButtonId();
        radio3 = (RadioButton) findViewById(radioId3);
        String chosen3 = String.valueOf(radio3.getText());
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        String val3 = databaseAccess.getValue("ab_"+Integer.toString(picN3));
        answer3.setText(val3);
        if(chosen3.equals(val3)){
            answer3.setText("CORRECT");
            Score+=1;
        }
        else {
            answer3.setText("WRONG THE ANSWER IS: " + val3);
        }
        databaseAccess.close();
    }

    public void Q4(View v){
        int radioId4 = group4.getCheckedRadioButtonId();
        radio4 = (RadioButton) findViewById(radioId4);
        String chosen4 = String.valueOf(radio4.getText());
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        String val4 = databaseAccess.getValue("ab_"+Integer.toString(picN4));
        answer4.setText(val4);
        if(chosen4.equals(val4)){
            answer4.setText("CORRECT");
            Score+=1;
        }
        else {
            answer4.setText("WRONG THE ANSWER IS: " + val4);
        }
        databaseAccess.close();
    }

    public void Q5(View v){
        int radioId5 = group5.getCheckedRadioButtonId();
        radio5 = (RadioButton) findViewById(radioId5);
        String chosen5 = String.valueOf(radio5.getText());
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        String val5 = databaseAccess.getValue("ab_"+Integer.toString(picN5));
        answer5.setText(val5);
        if(chosen5.equals(val5)){
            answer5.setText("CORRECT");
            Score+=1;
        }
        else {
            answer5.setText("WRONG THE ANSWER IS: " + val5);
        }
        databaseAccess.close();
    }

    public void randName(){
        //random numbers
        for (int i=1; i<11; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i=0; i<5; i++) {
            list2.add(list.get(i));
        }

    }


}
