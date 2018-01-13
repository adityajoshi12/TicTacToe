package com.example.abhinavraj.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton[] ib= new ImageButton[10];
    Boolean draw=true;
    Boolean[] r= new Boolean[10];
   int a;
   public int b;
   int[] c=new int[10];

    public final static String Message="me";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        a = Integer.parseInt(i.getStringExtra(Message));
        b=a+1;
        for(int z=1;z<=9;z++) {
            r[z] = true;
            c[z] = 0;
        }
        setContentView(R.layout.activity_main);
        ib[1] = (ImageButton) findViewById(R.id.imageButton1);
        ib[2] = (ImageButton) findViewById(R.id.imageButton2);
        ib[3] = (ImageButton) findViewById(R.id.imageButton3);
        ib[4] = (ImageButton) findViewById(R.id.imageButton4);
        ib[5] = (ImageButton) findViewById(R.id.imageButton5);
        ib[6] = (ImageButton) findViewById(R.id.imageButton6);
        ib[7] = (ImageButton) findViewById(R.id.imageButton7);
        ib[8] = (ImageButton) findViewById(R.id.imageButton8);
        ib[9]= (ImageButton) findViewById(R.id.imageButton9);


          for(int w=1;w<=9;w++){
              final int j=w;
                ib[j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (r[j] == true) {
                            if (a % 2 == 0) {
                                ib[j].setImageResource(R.drawable.tick);
                                a++;
                                c[j] = 1;
                            } else {
                                ib[j].setImageResource(R.drawable.tack);
                                a++;
                                c[j] = -1;
                            }

                            r[j] = false;
                        } else {
                            Toast.makeText(MainActivity.this, "Invalid move", Toast.LENGTH_SHORT).show();
                        }
                        checkGame();

                    }
                });}

  }
    public void checkWinner(int b1, int b2, int b3){
        if (b1==b2 && b2==b3 && b3==1){
            Toast.makeText(MainActivity.this,"Player "+b+" wins ",Toast.LENGTH_LONG).show();
            final Intent i = new Intent(MainActivity.this,Main2Activity.class);
            Thread timer =new Thread(){
                public void run () {
                    try{
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    finally {
                        startActivity(i);
                        finish();
                    }

                }
            };
            draw=false;
        }
       else if (b1==b2 && b2==b3 && b3==-1){
            //player 2 wins
            Toast.makeText(MainActivity.this,"Player "+(3-b)+" wins ",Toast.LENGTH_LONG).show();
            final Intent i = new Intent(MainActivity.this,Main2Activity.class);
            Thread timer =new Thread(){
                public void run () {
                    try{
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    finally {
                        startActivity(i);
                        finish();
                    }

                }
            };
            draw=false;
        }
        else if((a==9 || a==10)&&(draw==true)){
            Toast.makeText(MainActivity.this,"Game Draw ",Toast.LENGTH_LONG).show();
            final Intent i = new Intent(MainActivity.this,Main2Activity.class);
            Thread timer =new Thread(){
                public void run () {
                    try{
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    finally {
                        startActivity(i);
                        finish();
                    }

                }
            };
        }

    }
    public void checkGame(){
            checkWinner(c[1],c[2],c[3]);
            checkWinner(c[4],c[5],c[6]);
            checkWinner(c[7],c[8],c[9]);
            checkWinner(c[1],c[4],c[7]);
            checkWinner(c[2],c[5],c[8]);
            checkWinner(c[3],c[6],c[9]);
            checkWinner(c[1],c[5],c[9]);
            checkWinner(c[3],c[5],c[7]);
    }

}
