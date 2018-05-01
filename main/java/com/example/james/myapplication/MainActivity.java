package com.example.james.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

public int g = 20;



        public void dietwenty(View v) {
            Random rand = new Random();

            // Generate random integers in range 0 to 999
            int rand_int1 = rand.nextInt(20);
            if(rand_int1==0){
                TextView newText = (TextView) findViewById(R.id.output);
                newText.setText(Integer.toString(20));
            }
            else {
                TextView newText = (TextView) findViewById(R.id.output);
                newText.setText(Integer.toString(rand_int1));
            }

        }


    public void dieten(View v) {
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int rand_int2 = rand.nextInt(10);
        if(rand_int2==0){
            TextView newText = (TextView) findViewById(R.id.output);
            newText.setText(Integer.toString(10));
        }
        else {
            TextView newText = (TextView) findViewById(R.id.output);
            newText.setText(Integer.toString(rand_int2));
        }

    }

    public void diesix(View v) {
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int rand_int3 = rand.nextInt(6);
        if(rand_int3==0){
            TextView newText = (TextView) findViewById(R.id.output);
            newText.setText(Integer.toString(6));
        }
        else {
            TextView newText = (TextView) findViewById(R.id.output);
            newText.setText(Integer.toString(rand_int3));
        }
    }

    public void penny(View v) {
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int rand_int3 = rand.nextInt(2);
        if(rand_int3 == 0){
            TextView newText = (TextView) findViewById(R.id.output);
            newText.setText("Heads");
        }
        if(rand_int3 == 1){
            TextView newText = (TextView) findViewById(R.id.output);
            newText.setText("Tails");
        }


    }
       public int row = 0;
    public void checkGuess(View v){

        TextView newText = (TextView) findViewById(R.id.output);
        TextView guess = (TextView) findViewById(R.id.editText4);

        if(row == 3){
            guess.setText("You win a prize!!");
            row = 0 ;
        } else {

            if (newText.getText().toString().equals(guess.getText().toString())) {
                guess.setText("Congrats");
                row++;
            } else {
                guess.setText("Try again");
                row = 0;
            }
        }
    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
