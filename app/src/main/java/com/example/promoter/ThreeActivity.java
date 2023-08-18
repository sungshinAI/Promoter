package com.example.promoter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThreeActivity extends AppCompatActivity {

    private Button btn4_1; // 지금 공유할게요


    @Override
    protected void onCreate(Bundle savedInstanceState) { // MainActivity가 처음 실행이 될 때 이 안의 구문들을 쫙 한번 실행을 해줘라.라는 의미
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);

        btn4_1 = findViewById(R.id.btn4_1);


        btn4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // btn9_3 버튼은 클릭했을 때 이 안쪽을 실행해라.
                // 지금 공유하면 10page로 넘아가면 되는데 나중에 공유하면 어케 되는거임..?
                // 9에서 10으로 넘어가는게 자연스러운게 맞나?
                // 화면 전환
                Intent intent = new Intent(ThreeActivity.this, FourActivity.class);
                startActivity(intent); // 액티비티 이동.
            }
        });
    }
}