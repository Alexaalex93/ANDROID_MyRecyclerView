package com.example.cice.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Libro> lista_libros;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista_libros = new ArrayList<Libro>();

        Libro libro_aux = null;
        for (int i = 0; i < 20; i++){

            libro_aux = new Libro("Autor " + i, "Libro " + i);

            lista_libros.add(libro_aux);
        }

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        AdapterLibros adapterLibros = new AdapterLibros(lista_libros);

        recyclerView.setAdapter(adapterLibros);

        //recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
    }
}
