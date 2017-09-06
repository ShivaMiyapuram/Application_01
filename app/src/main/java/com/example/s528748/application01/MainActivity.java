package com.example.s528748.application01;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shorterActivity(View v) {
        EditText s = (EditText) findViewById(R.id.editText);
        String value = s.getText().toString();
        String newStr = "";
        for (int i = 0; i < value.length(); i++) {
            switch (value.charAt(i)) {
                case 'a':
                    newStr += 'o';
                    break;
                case 'A':
                    newStr += 'O';
                    break;
                case 'o':
                    newStr += 'a';
                    break;
                case 'O':
                    newStr += 'A';
                    break;
                default:
                    newStr += value.charAt(i);
                    break;
            }

        }
        System.out.println(newStr);
        // value = value.substring(1);

        //  System.out.println(value);
        s.setText(newStr);
    }

    public void changeColor(View v) {
        EditText s = (EditText) findViewById(R.id.editText);
        String value = s.getText().toString();
        Random rand = new Random();
        int val = rand.nextInt(4);
        switch (val) {
            case 0:
                s.setTextColor(Color.BLUE);
                break;
            case 1:
                s.setTextColor(Color.GREEN);
                break;
            case 2:
                s.setTextColor(Color.RED);
                break;
            case 3:
                s.setTextColor(Color.DKGRAY);
                break;
            default:
                s.setTextColor(Color.BLACK);
                break;
        }
    }

    public void changeFont(View v) {
        EditText s = (EditText) findViewById(R.id.editText);
        Random rand = new Random();
        int val = rand.nextInt(4);
        switch (val) {
            case 0:
                s.setTypeface(Typeface.SERIF);
                break;
            case 1:
                s.setTypeface(Typeface.SANS_SERIF);
                break;
            case 2:
                s.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
                break;
            case 3:
                s.setTypeface(Typeface.MONOSPACE);
                break;
            default:
                s.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                break;
        }


    }


}
