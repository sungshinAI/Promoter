package com.example.promoter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;
import java.util.Calendar;

public class TwoActivity extends AppCompatActivity {

    private DatePicker datePicker;
    private TimePicker timePicker;
    private Button btn2_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);

        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);
        btn2_1 = findViewById(R.id.btn2_1);

        btn2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the selected date and time from DatePicker and TimePicker
                int year = datePicker.getYear();
                int month = datePicker.getMonth();
                int day = datePicker.getDayOfMonth();

                int hour = timePicker.getHour();
                int minute = timePicker.getMinute();

                // Create a Calendar instance and set the selected date and time
                Calendar calendar = Calendar.getInstance();
                calendar.set(year, month, day, hour, minute);

                // Get the timestamp in milliseconds
                long selectedDateTimeMillis = calendar.getTimeInMillis();

                // Get the current time in milliseconds
                long currentTimeMillis = System.currentTimeMillis();

                // Calculate the time difference in seconds
                long timeDifferenceSeconds = (selectedDateTimeMillis - currentTimeMillis) / 1000;

                // Start a timer or perform other actions with the time difference
                // For now, let's display a toast message with the time difference
                String timeDifferenceMessage = "Time difference: " + timeDifferenceSeconds + " seconds";
                Toast.makeText(TwoActivity.this, timeDifferenceMessage, Toast.LENGTH_SHORT).show();

                // Home2 Activity로 전환
                Intent intent = new Intent(TwoActivity.this, Home2Activity.class);
                startActivity(intent);
            }
        });
    }
}
