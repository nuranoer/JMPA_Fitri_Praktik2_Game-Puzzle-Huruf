package com.fitrizuyinanurazizah.puzzlehurufsederhana;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {
    private Button[] buttons;
    private static final String[] goal = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
    private ArrayList<String> cells = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = this.getMenuInflater();

        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.option_Ulang) {
            Intent i = new Intent(this, MainActivity.class);
            this.startActivity(i);
        }
        else if(item.getItemId() == R.id.option_Keluar){
            Intent i = new Intent(this, DashboardActivity.class);
            this.startActivity(i);
        }

        return true;
    }

    public Button[] findButtons() {
        Button[] b = new Button[15];
        b[0] = findViewById(R.id.btnA);
        b[1] = findViewById(R.id.btnB);
        b[2] = findViewById(R.id.btnC);
        b[3] = findViewById(R.id.btnD);
        b[4] = findViewById(R.id.btnE);
        b[5] = findViewById(R.id.btnF);
        b[6] = findViewById(R.id.btnG);
        b[7] = findViewById(R.id.btnH);
        b[8] = findViewById(R.id.btnI);
        b[9] = findViewById(R.id.btnJ);
        b[10] = findViewById(R.id.btnK);
        b[11] = findViewById(R.id.btnL);
        b[12] = findViewById(R.id.btnM);
        b[13] = findViewById(R.id.btnN);
        b[14] = findViewById(R.id.btnO);
        b[15] = findViewById(R.id.btn);
        return b;
    }

}