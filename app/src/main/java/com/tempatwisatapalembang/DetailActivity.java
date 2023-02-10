package com.tempatwisatapalembang;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    private ImageView imgWisata;
    private TextView tvName, tvDesc;
    private String yName, yDesc, yLokasi;
    private int yFoto;
    private Button btnLokasi;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setTitle("Deskripsi Tempat Wisata");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgWisata = findViewById(R.id.iv_foto_detail);
        tvName = findViewById(R.id.tv_nama_detail);
        tvDesc = findViewById(R.id.tv_desc);
        btnLokasi = findViewById(R.id.btn_lokasi);

        Intent terima = getIntent();
        yName = terima.getStringExtra("xNama");
        yDesc = terima.getStringExtra("xDesc");
        yFoto = terima.getIntExtra("xFoto", yFoto);
        yLokasi = terima.getStringExtra("xLokasi");

        tvName.setText(yName);
        tvDesc.setText(yDesc);
        Glide.with(DetailActivity.this).load(yFoto).into(imgWisata);

        btnLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri lokasi = Uri.parse(yLokasi);
                Intent cekLokasi = new Intent(Intent.ACTION_VIEW, lokasi);
                startActivity(cekLokasi);
            }
        });

    }
}