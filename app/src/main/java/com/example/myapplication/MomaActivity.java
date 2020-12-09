package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;



public class MomaActivity extends AppCompatActivity {
    int adultTickets = 0;
    int studentTickets = 0;
    int seniorTickets = 0;
    int totalTickets = 0;
    static final int MAX_TICKETS = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moma);
        Toast.makeText(getApplicationContext(), getString(R.string.maxTickets), Toast.LENGTH_SHORT).show();
    }

    public void increaseIntegerAdult(View view) {
        if(adultTickets < 5){
            adultTickets++;
            displayAdult(adultTickets);
        }else{
            Toast.makeText(getApplicationContext(), getString(R.string.maxTickets), Toast.LENGTH_SHORT).show();
        }

    }public void decreaseIntegerAdult(View view) {
        if(adultTickets > 0){
            adultTickets--;
            displayAdult(adultTickets);
        }
    }

    public void increaseIntegerStudent(View view) {
        if(studentTickets < 5){
            studentTickets++;
            displayStudent(studentTickets);
        }else{
            Toast.makeText(getApplicationContext(), getString(R.string.maxTickets), Toast.LENGTH_SHORT).show();
        }

    }public void decreaseIntegerStudent(View view) {
        if(studentTickets > 0){
            studentTickets--;
            displayStudent(studentTickets);
        }
    }

    public void increaseIntegerSenior(View view) {
        if(seniorTickets< 5){
            seniorTickets++;
            displaySenior(seniorTickets);
        }else{
            Toast.makeText(getApplicationContext(), getString(R.string.maxTickets), Toast.LENGTH_SHORT).show();
        }

    }public void decreaseIntegerSenior(View view) {
        if(seniorTickets > 0){
            seniorTickets--;
            displaySenior(seniorTickets);
        }
    }

    private void displayAdult(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number);
        displayInteger.setText("" + number);
    }

    private void displaySenior(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number_senior);
        displayInteger.setText("" + number);
    }

    private void displayStudent(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number_student);
        displayInteger.setText("" + number);
    }
}