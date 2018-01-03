package com.example.abhinavraj.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9;
    Boolean r1=true,r2=true,r3=true,r4=true,r5=true,r6=true,r7=true,r8=true,r9=true;
   int a;

    public final static String Message="me";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i= getIntent();
        a=Integer.parseInt(i.getStringExtra(Message));
        setContentView(R.layout.activity_main);
        ib1= (ImageButton) findViewById(R.id.imageButton1);
        ib2= (ImageButton) findViewById(R.id.imageButton2);
        ib3= (ImageButton) findViewById(R.id.imageButton3);
        ib4= (ImageButton) findViewById(R.id.imageButton4);
        ib5= (ImageButton) findViewById(R.id.imageButton5);
        ib6= (ImageButton) findViewById(R.id.imageButton6);
        ib7= (ImageButton) findViewById(R.id.imageButton7);
        ib8= (ImageButton) findViewById(R.id.imageButton8);
        ib9= (ImageButton) findViewById(R.id.imageButton9);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r1==true) {
                    if (a % 2 == 0) {
                        ib1.setImageResource(R.drawable.tick);
                        a++;
                    } else {
                        ib1.setImageResource(R.drawable.tack);
                        a++;
                    }

                    r1=false;
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid move", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r2==true) {
                    if (a % 2 == 0) {
                        ib2.setImageResource(R.drawable.tick);
                        a++;
                    } else {
                        ib2.setImageResource(R.drawable.tack);
                        a++;
                    }
                    r2=false;
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid move", Toast.LENGTH_SHORT).show();
                }

            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r3==true) {
                    if (a % 2 == 0) {
                        ib3.setImageResource(R.drawable.tick);
                        a++;
                    } else {
                        ib3.setImageResource(R.drawable.tack);
                        a++;
                    }
                    r3=false;
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid move", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r4==true) {
                    if (a % 2 == 0) {
                        ib4.setImageResource(R.drawable.tick);
                        a++;
                    } else {
                        ib4.setImageResource(R.drawable.tack);
                        a++;
                    }
                    r4=false;
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid move", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r5==true) {
                    if (a % 2 == 0) {
                        ib5.setImageResource(R.drawable.tick);
                        a++;
                    } else {
                        ib5.setImageResource(R.drawable.tack);
                        a++;
                    }
                    r5=false;
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid move", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r6==true) {
                    if (a % 2 == 0) {
                        ib6.setImageResource(R.drawable.tick);
                        a++;
                    } else {
                        ib6.setImageResource(R.drawable.tack);
                        a++;
                    }
                    r6=false;
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid move", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r7==true) {
                    if (a % 2 == 0) {
                        ib7.setImageResource(R.drawable.tick);
                        a++;
                    } else {
                        ib7.setImageResource(R.drawable.tack);
                        a++;
                    }
                    r7=false;
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid move", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r8==true) {
                    if (a % 2 == 0) {
                        ib8.setImageResource(R.drawable.tick);
                        a++;
                    } else {
                        ib8.setImageResource(R.drawable.tack);
                        a++;
                    }
                    r8=false;
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid move", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r9==true) {
                    if (a % 2 == 0) {
                        ib9.setImageResource(R.drawable.tick);
                        a++;
                    } else {
                        ib9.setImageResource(R.drawable.tack);
                        a++;
                    }
                    r9=false;
                }
                else{
                     Toast.makeText(MainActivity.this, "Invalid move", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
