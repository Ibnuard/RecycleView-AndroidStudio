package com.ibnuputra.recycleviewcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PesertaAdapter adapter;
    private ArrayList<Peserta> pesertaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter =  new PesertaAdapter(pesertaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        pesertaArrayList = new ArrayList<>();
        pesertaArrayList.add(new Peserta("Aviv", "3103", "081"));
        pesertaArrayList.add(new Peserta("Ibnu", "3103", "082"));
        pesertaArrayList.add(new Peserta("Armico", "3103", "083"));
        pesertaArrayList.add(new Peserta("Abid", "3103", "084"));
        pesertaArrayList.add(new Peserta("Varel", "3103", "085"));
        pesertaArrayList.add(new Peserta("Aviv", "3103", "081"));
        pesertaArrayList.add(new Peserta("Ibnu", "3103", "082"));
        pesertaArrayList.add(new Peserta("Armico", "3103", "083"));
        pesertaArrayList.add(new Peserta("Abid", "3103", "084"));
        pesertaArrayList.add(new Peserta("Varel", "3103", "085"));
        pesertaArrayList.add(new Peserta("Aviv", "3103", "081"));
        pesertaArrayList.add(new Peserta("Ibnu", "3103", "082"));
        pesertaArrayList.add(new Peserta("Armico", "3103", "083"));
        pesertaArrayList.add(new Peserta("Abid", "3103", "084"));
        pesertaArrayList.add(new Peserta("Varel", "3103", "085"));
    }
}
