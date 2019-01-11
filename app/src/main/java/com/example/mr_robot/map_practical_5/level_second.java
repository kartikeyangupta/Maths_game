package com.example.mr_robot.map_practical_5;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class level_second extends AppCompatActivity {
    static int count=0;
    static String ans1 = "";
    ProgressBar pb ;
    ProgressTask task;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_second);
        final TextView tv = findViewById(R.id.tv);
        final EditText et = findViewById(R.id.et);
        equation_generator eg = new equation_generator();
        final String ans = eg.generator_method(2,tv);
        final Button btn = findViewById(R.id.btn);
        pb = findViewById(R.id.pb);
        showProgress();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count==0) {
                    String value1 = String.valueOf(et.getText());
                    if (Integer.parseInt(ans)!=Integer.parseInt(value1)) {
                        Toast.makeText(level_second.this,"Wrong",Toast.LENGTH_LONG).show();
                        et.setText("");
                    } else {
                        count++;
                        Toast.makeText(level_second.this,"Correct",Toast.LENGTH_LONG).show();
                        equation_generator eg1 = new equation_generator();
                        ans1 = eg1.generator_method(2,tv);
                        et.setText("");
                    }
                }
                else if(count<5) {
                    String value = String.valueOf(et.getText());
                    if (Integer.parseInt(ans1)!=Integer.parseInt(value)) {
                        Toast.makeText(level_second.this,"Wrong",Toast.LENGTH_LONG).show();
                        et.setText("");
                    } else {
                        count++;
                        Toast.makeText(level_second.this,"Correct",Toast.LENGTH_LONG).show();
                        equation_generator eg1 = new equation_generator();
                        ans1 = eg1.generator_method(2,tv);
                        et.setText("");
                    }
                }
                if(count==5) {
                    btn.setText("Next Level");
                    Intent i =  new Intent(level_second.this,level_third.class);
                    startActivity(i);
                }
            }
        });
    }
    private class ProgressTask extends AsyncTask<Integer,Integer,Void> {
        protected void onPreExecute() {
            pb.setMax(60);
        }
        protected Void doInBackground(Integer... params) {
            int start=params[0];
            for(int i=start;i<=60;i++){
                try {
                    onProgressUpdate(i);
                    SystemClock.sleep(1000);
                } catch (Exception e) {
                    Log.e("Error", e.toString());
                }
            }
            return null;
        }
        protected void onProgressUpdate(Integer... values) {
            pb.setProgress(values[0]);
        }
        protected void onPostExecute(Void result) {
            AlertDialog alertDialog = new AlertDialog.Builder(level_second.this).create();
            TextView title = new TextView(level_second.this);
            title.setText("GAME OVER");
            title.setPadding(10, 10, 10, 10);   // Set Position
            title.setGravity(Gravity.CENTER);
            title.setTextColor(Color.BLACK);
            title.setTextSize(20);
            alertDialog.setCustomTitle(title);
            TextView msg = new TextView(level_second.this);
            msg.setText("YOU LOST THE GAME YOUR SCORE IS"+String.valueOf(count+5)+"\nSELECT YOUR OPTION");
            msg.setGravity(Gravity.CENTER_HORIZONTAL);
            msg.setTextColor(Color.BLACK);
            alertDialog.setView(msg);
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL,"NEW GAME", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    Intent i1 = new Intent(level_second.this,MainActivity.class);
                    startActivity(i1);
                }
            });
            alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE,"RESET SAME LEVEL", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    Intent i1 = new Intent(level_second.this,level_second.class);
                    startActivity(i1);
                }
            });
            new Dialog(getApplicationContext());
            alertDialog.show();
            final Button okBT = alertDialog.getButton(AlertDialog.BUTTON_NEUTRAL);
            LinearLayout.LayoutParams neutralBtnLP = (LinearLayout.LayoutParams) okBT.getLayoutParams();
            neutralBtnLP.gravity = Gravity.FILL_HORIZONTAL;
            okBT.setPadding(50, 10, 10, 10);
            okBT.setTextColor(Color.BLUE);
            okBT.setLayoutParams(neutralBtnLP);
            final Button cancelBT = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE);
            LinearLayout.LayoutParams negBtnLP = (LinearLayout.LayoutParams) okBT.getLayoutParams();
            negBtnLP.gravity = Gravity.FILL_HORIZONTAL;
            cancelBT.setTextColor(Color.RED);
            cancelBT.setLayoutParams(negBtnLP);
            Log.v("Progress", "Finished");
        }
    }
    public void showProgress() {
        pb.setProgress(1);
        task = new ProgressTask();
        task.execute(1);
    }
}
