package com.example.abhinavraj.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    public final static String Message="me";
    ImageButton tick,tack;
    int a;
    Button bee;
    boolean s1=false,s2=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tick= (ImageButton) findViewById(R.id.imageButton);
        tack= (ImageButton) findViewById(R.id.imageButton10);
        bee= (Button) findViewById(R.id.button);
        tick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(s2==false) {
                    tick.setBackgroundResource(R.color.select);
                    a = 0;
                    s1 = true;
                }
                else{
                    tick.setBackgroundResource(R.color.select);
                    tack.setBackgroundResource(R.color.nonSelect);
                    a = 0;
                    s1 = true;
                    s2=false;
                }
            }
        });
        tack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(s1==false) {
                    tack.setBackgroundResource(R.color.select);
                    a = 1;
                    s2 = true;
                }
                else{
                    tick.setBackgroundResource(R.color.nonSelect);
                    tack.setBackgroundResource(R.color.select);
                    a = 1;
                    s2 = true;
                    s1=false;
                }
            }
        });
        bee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(s1==false && s2==false) {
                    Toast.makeText(Main2Activity.this, "Please select anyone of these", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent i = new Intent(Main2Activity.this, MainActivity.class);
                    i.putExtra(Message, String.valueOf(a));
                    startActivity(i);
                }
            }
        });
    }
}
