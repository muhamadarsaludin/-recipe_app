package com.codetarian.myresepapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailResepActivity extends AppCompatActivity {

    public static String photo = "photo";
    public static String name = "name";
    public static String bahan = "bahan";
    public static String cara = "cara";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep);
        ImageView dataPhoto =findViewById(R.id.dataPhoto);
        TextView dataName = findViewById(R.id.dataName);
        TextView dataBahan = findViewById(R.id.dataBahan);
        TextView dataCara = findViewById(R.id.dataCara);

        int imgPhoto = getIntent().getIntExtra (photo,0);
        String namaMenu = getIntent().getStringExtra(name);
        String bahanBahan = getIntent().getStringExtra(bahan);
        String caraMasak = getIntent().getStringExtra(cara);

        dataPhoto.setImageResource(imgPhoto);
        dataName.setText(namaMenu);
        dataBahan.setText(bahanBahan);
        dataCara.setText(caraMasak);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(namaMenu);
        }
    }
}
