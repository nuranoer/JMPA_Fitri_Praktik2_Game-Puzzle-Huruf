package com.fitrizuyinanurazizah.puzzlehurufsederhana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_main);

        this.btnMulai = this.findViewById(R.id.btnMulai);

        this.btnMulai.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == this.btnMulai){
            Intent i = new Intent(this, MainActivity.class);
            this.startActivity(i);
        }else{
            Intent i = new Intent(this, DashboardActivity.class);
            this.startActivity(i);
        }
    }
}

