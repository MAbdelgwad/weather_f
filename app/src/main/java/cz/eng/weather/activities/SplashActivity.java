package cz.eng.weather.activities;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import cz.eng.weather.R;
import cz.eng.weather.notifications.WeatherNotificationService;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        showWeatherNotificationIfNeeded();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    private void showWeatherNotificationIfNeeded() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs == null)
            return;
        boolean isWeatherNotificationEnabled = prefs.getBoolean(getString(R.string.settings_enable_notification_key), false);
        if (isWeatherNotificationEnabled ) {
            WeatherNotificationService.start(this);
        }
    }
}
