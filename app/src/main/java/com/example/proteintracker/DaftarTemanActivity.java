package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proteintracker.Adapter.DaftarTemanAdapter;
import com.example.proteintracker.Model.DaftarTeman;

import java.util.ArrayList;

public class DaftarTemanActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DaftarTemanAdapter daftarTemanAdapter;
    private ArrayList<DaftarTeman> daftarTemanArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_teman);
        tambahData();

        recyclerView = findViewById(R.id.rvTeman);
        daftarTemanAdapter = new DaftarTemanAdapter(daftarTemanArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DaftarTemanActivity.this);
        recyclerView .setLayoutManager(layoutManager);
        recyclerView .setAdapter( daftarTemanAdapter );
    }

    private void tambahData(){
        daftarTemanArrayList = new ArrayList<>();
        daftarTemanArrayList.add(new DaftarTeman("Desta Siwi Prabawan","72170126","Main PB","Kaya","Cari uang terus",R.drawable.desta,"Laki-aki"));
        daftarTemanArrayList.add(new DaftarTeman("Tita Marita Simangunsong","72170154","Membaca Buku","Ibu Rumah Tangga","Jadi orang baik",R.drawable.tita, "Perempuan"));
        daftarTemanArrayList.add(new DaftarTeman("Laurentia Yulia Christi","72170170","Memasak","Kaya raya","memasak dan memasak",R.drawable.lau,"Perempuan"));
        daftarTemanArrayList.add(new DaftarTeman("Adrian Paskalis","72170125","Mendengarkan Musik","Menjadi Teladan","hmmmm",R.drawable.adrian,"Laki-laki"));
    }
}
