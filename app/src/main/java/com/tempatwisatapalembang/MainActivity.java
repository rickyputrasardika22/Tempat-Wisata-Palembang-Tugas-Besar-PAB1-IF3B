package com.tempatwisatapalembang;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWisata;
    private ArrayList<GetterAndSetterWisataData> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Wisata Sumsel");
        rvWisata = findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);

        list.addAll(WisataData.getListData());
        showRecyclerList();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_about, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent kirim = new Intent(MainActivity.this, AboutActivity.class);

        switch (item.getItemId())
        {
            case R.id.item_about:
            {
                startActivity(kirim);
            }
        }
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerList()
    {
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        ListWisataAdapter listWisataAdapter = new ListWisataAdapter(list,MainActivity.this);
        rvWisata.setAdapter(listWisataAdapter);
    }

}