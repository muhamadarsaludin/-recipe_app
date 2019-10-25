package com.codetarian.myresepapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvResep;
    private ArrayList<Resep>list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvResep =findViewById(R.id.rv_resep);
        rvResep.setHasFixedSize(true);
        list.addAll(ResepsData.getListData());
        showRecyclerList();
    }


    private void showRecyclerList(){
        rvResep.setLayoutManager(new LinearLayoutManager(this));
        ListResepAdapter listResepAdapter =new ListResepAdapter(list);

        rvResep.setAdapter(listResepAdapter);
        listResepAdapter.setOnItemClickCallback(new ListResepAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Resep data) {
                showSelectedResep(data);

            }
        });
    }

    private void showSelectedResep(Resep resep) {
        Toast.makeText(this, "Kamu memilih " + resep.getName(), Toast.LENGTH_SHORT).show();
        Intent detailIntent = new Intent(MainActivity.this,DetailResepActivity.class);
        detailIntent.putExtra(DetailResepActivity.photo,resep.getPhoto());
        detailIntent.putExtra(DetailResepActivity.name,resep.getName());
        detailIntent.putExtra(DetailResepActivity.bahan, resep.getBahan());
        detailIntent.putExtra(DetailResepActivity.cara, resep.getCara());
        startActivity(detailIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setOnActionBarItemClick(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setOnActionBarItemClick(int selectedItem) {
        switch (selectedItem) {
            case R.id.action_about:
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
                break;
        }
    }
}
