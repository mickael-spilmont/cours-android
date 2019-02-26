package com.counterapp.spilmonm.mycounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText champNombre_et;
    private TextView cumul_tv;
    private TextView inverse_tv;

    private int champNombre;
    private int cumul;
    private double inverse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // On réaffiche les données dans les champs
        champNombre_et = (EditText) findViewById(R.id.champNombre);
        cumul_tv = (TextView) findViewById(R.id.cumul);
        inverse_tv = (TextView) findViewById(R.id.inverse);
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onRestart() {
        super.onRestart();
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onStop() {
        super.onStop();
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        // On sauvegarde les variables
        savedInstanceState.putInt("champNombre", champNombre);
        savedInstanceState.putInt("cumul", cumul);
        savedInstanceState.putDouble("inverse", inverse);

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        champNombre = savedInstanceState.getInt("champNombre");
        cumul = savedInstanceState.getInt("cumul");
        inverse = savedInstanceState.getDouble("inverse");

        champNombre_et.setText("" + champNombre);
        cumul_tv.setText("" + cumul);
        inverse_tv.setText("" + inverse);

        super.onRestoreInstanceState(savedInstanceState);
    }

    public void doOk(View view) {
        champNombre = Integer.parseInt(champNombre_et.getText().toString());
        cumul = Integer.parseInt(cumul_tv.getText().toString());
        cumul += champNombre;
        inverse = 1.00 / cumul;

        cumul_tv.setText("" + cumul);
        inverse_tv.setText("" + inverse);
    }
}
