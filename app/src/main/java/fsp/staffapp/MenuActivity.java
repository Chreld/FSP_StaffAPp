package fsp.staffapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle instance) {
        super.onCreate(instance);
        setContentView(R.layout.activity_menu);

        Button usedSpotsButton = findViewById(R.id.usedSpotsButton);
        Button reportIllegalButton = findViewById(R.id.reportIllegalButton);

        usedSpotsButton.setOnClickListener(view -> {
            Intent intent = new Intent(MenuActivity.this, OccupiedParkingSpotsActivity.class);
            startActivity(intent);
        });

        reportIllegalButton.setOnClickListener(view -> {
            Intent intent = new Intent(MenuActivity.this, ReportIllegalParkingActivity.class);
            startActivity(intent);
        });
    }
}
