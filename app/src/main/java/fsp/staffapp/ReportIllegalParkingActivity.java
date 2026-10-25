package fsp.staffapp;

import android.os.Bundle;

import fsp.staffapp.template.Template;

public class ReportIllegalParkingActivity extends Template {

    @Override
    protected void onCreate(Bundle instance) {
        super.onCreate(instance);
        menuTemplate(R.string.occupied_spots_title, R.string.scan_license_plate);
    }
}
