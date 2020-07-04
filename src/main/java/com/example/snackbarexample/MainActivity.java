package com.example.snackbarexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Show_SnackBar(View view) {

        Snackbar snackbar = Snackbar.make(findViewById(R.id.cLayout), R.string.offline_status, Snackbar.LENGTH_LONG);
        snackbar.setAction(R.string.undo_string, this);
        snackbar.show();

    }

    @Override
    public void onClick(View v) {

        Toast.makeText(this, "you are just pressed the undo button", Toast.LENGTH_SHORT).show();
    }
}