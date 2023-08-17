package com.example.promoter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OneActivity extends AppCompatActivity {
    private Button btn1_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);

        btn1_1 = findViewById(R.id.btn1_1);
        btn1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 날짜와 시간대를 정해볼까요? Activity로 전환
                Intent intent = new Intent(OneActivity.this, TwoActivity.class);
                startActivity(intent);
            }
        });
    }
}