package com.example.anotheractivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int  numDucks = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick (View v)
    {
        Toast.makeText(this, "You clicked the up button", Toast.LENGTH_SHORT).show();
        numDucks++;
        TextView countTextView = (TextView) findViewById(R.id.countLabelView);
        countTextView.setText("Number of Eagle Ducks: " + numDucks);
       // Log.i("info", "DOES THE INFO WORK?");
    }

    public void downClick(View v)
    {
        Toast.makeText(this,"You clicked the down button", Toast.LENGTH_SHORT);
        TextView countTextView = (TextView) findViewById(R.id.countLabelView);
        countTextView.setText("Number of Eagle Ducks: " + numDucks);
    }

    public void openDialog(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Confirm reset Count");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "YESSIREE", Toast.LENGTH_SHORT).show();
                numDucks = 0;
            }
        });


        builder.setNegativeButton("Aint No way!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
    }

        public void updateTextView()
        {
            TextView countTextView = (TextView) findViewById(R.id.countLabelView);
            countTextView.setText("Number of Eagle Ducks: " + numDucks);

        }

    }