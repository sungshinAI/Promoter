package com.example.promoter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FourActivity extends AppCompatActivity {

    private Button btn9_1; // 지금 공유할게요
    private Button btn9_2; // 나중에 할게요
    private Button btn9_3; // 다음

    @Override
    protected void onCreate(Bundle savedInstanceState) { // MainActivity가 처음 실행이 될 때 이 안의 구문들을 쫙 한번 실행을 해줘라.라는 의미
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);

        btn9_1 = findViewById(R.id.btn9_1);
        btn9_2 = findViewById(R.id.btn9_2);
        btn9_3 = findViewById(R.id.btn9_3);


        btn9_1.setOnClickListener(new View.OnClickListener() { // 지금 공유할게요
            @Override
            public void onClick(View view) { // btn9_1 버튼은 클릭했을 때 이 안쪽을 실행해라.
                // 버튼 누르면 색깔 변하는 기능
                btn9_1.setBackgroundTintList(getResources().getColorStateList(R.color.blue)); // 이 부분은 실제로 사용하고 있는 버튼 모양 리소스로 변경해야 합니다.
            }
        });

        btn9_2.setOnClickListener(new View.OnClickListener() { // 나중에 공유할게요
            @Override
            public void onClick(View view) {
                // 버튼 누르면 색깔 변하는 기능
                btn9_2.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                // 나중에 공유하면 어떻게 되는거임..?
            }

        });

        btn9_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // btn9_3 버튼은 클릭했을 때 이 안쪽을 실행해라.
                // 화면 전환
                Toast.makeText(FourActivity.this, "초대링크가 클립보드에 복사되었습니다", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FourActivity.this, Home2Activity.class);
                startActivity(intent); // 액티비티 이동.
            }
        });
    }
}