package com.thyago.permissions;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @OnClick(R.id.test_permission_granted)
    @SuppressWarnings("unused")
    public void onTestPermissionGrantedClick() {
        int permissionCheckResult = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_CALENDAR);
        if (PackageManager.PERMISSION_GRANTED == permissionCheckResult) {
            Log.i(LOG_TAG, "Permission granted!");
        } else {
            Log.i(LOG_TAG, "Permission not granted!");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
