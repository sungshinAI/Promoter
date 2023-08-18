package com.example.promoter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home1Activity extends AppCompatActivity {

    private Button btnhome1_1; // 약속 만들기 Button
    private Button btnhome1_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home1);

        btnhome1_1 = findViewById(R.id.btnhome1_1);
        btnhome1_2 = findViewById(R.id.btnhome1_2);

        btnhome1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 약속 정보를 입력해 주세요 Activity로 전환
                Intent intent = new Intent(Home1Activity.this, OneActivity.class);
                startActivity(intent);
            }
        });

        btnhome1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home1Activity.this, ThreeActivity.class);
                startActivity(intent);
            }
        });
    }
}