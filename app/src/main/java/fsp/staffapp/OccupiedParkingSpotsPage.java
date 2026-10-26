package fsp.staffapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import fsp.staffapp.template.Template;

public class OccupiedParkingSpotsPage extends Template {

    @Override
    protected void onCreate(Bundle instance) {
        super.onCreate(instance);
        setContentView(R.layout.activity_occupied_parking_spots);

        EditText spotInput = findViewById(R.id.spotInput);
        Button searchBtn = findViewById(R.id.searchBtn);
        TextView result = findViewById(R.id.result);
        Button reportBtn = findViewById(R.id.reportBtn);

        searchBtn.setOnClickListener(view -> {
            String parkingSpot = spotInput.getText().toString()
                    .trim().toUpperCase();

            if (parkingSpot.isEmpty()) {
                result.setText(R.string.enter_parking_spot);
                result.setVisibility(View.VISIBLE);
                reportBtn.setVisibility(View.GONE);
                return;
            }

            // Temporary data for testing
            switch (parkingSpot) {
                case "A1":
                    result.setText("Expected license plate: (DK) AB 11223");
                    reportBtn.setVisibility(View.GONE);
                    break;

                case "B2":
                    result.setText("Expected license plate: (DK) XY 55667");
                    reportBtn.setVisibility(View.GONE);
                    break;

                case "C3":
                    result.setText("No car should be parked here.");
                    reportBtn.setVisibility(View.VISIBLE);
                    break;

                default:
                    result.setText("Parking spot not found.");
                    reportBtn.setVisibility(View.GONE);
                    break;
            }

            result.setVisibility(View.VISIBLE);
        });

        reportBtn.setOnClickListener(view -> {
            Intent intent = new Intent(
                    OccupiedParkingSpotsPage.this,
                    ReportIllegalParkingPage.class
            );

            startActivity(intent);
        });
    }
}
