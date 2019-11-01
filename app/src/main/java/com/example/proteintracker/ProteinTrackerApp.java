package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ProteinTrackerApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protein_tracker_app);
        Button btnSetting = (Button) findViewById(R.id.btnSetting);
        btnSetting.setOnClickListener(myBtnSettingClick);
        SharedPreferences prefs = ProteinTrackerApp.this.getSharedPreferences("prefs_file",MODE_PRIVATE);
        String statusLogin = prefs.getString("isLogin",null); Button btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(myBtnLoginClick);

        if (statusLogin != null){
            btnLogin.setText("Logout");
        }else {
            btnLogin.setText("Login");
        }
    }

    private View.OnClickListener myBtnLoginClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SharedPreferences prefs = ProteinTrackerApp.this.getSharedPreferences("prefs_file",MODE_PRIVATE);

            String statusLogin = prefs.getString("isLogin",null);
            SharedPreferences.Editor edit = prefs.edit();

        Button btnLogin = (Button)findViewById(R.id.btnLogin);
        if (statusLogin != null){
            edit.putString("isLogin",null);
            btnLogin.setText("Login");
        }else{
            edit.putString("isLogin","Admin");
            btnLogin.setText("Logout");
        }
        edit.commit();
        }
    };

    private View.OnClickListener myBtnSettingClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(ProteinTrackerApp.this, SettingProteinTracker.class);
            startActivity(intent);
        }
    };
}
