package com.example.cice.myrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by cice on 17/2/17.
 */

public class AdapterLibros extends RecyclerView.Adapter<LibroViewHolder>{

    private ArrayList<Libro> datos;

    public AdapterLibros(ArrayList<Libro> datos) {
        this.datos = datos;
    }

    @Override
    public LibroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LibroViewHolder libroViewHolder = null;

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());//Como no le he pasado context puedo llamar al inflater con layoutinflater.from
        View viewLibro = layoutInflater.inflate(R.layout.layout_libro_item, parent, false); //Inflo el layout y lo meto en un view
        libroViewHolder = new LibroViewHolder(viewLibro);//Al view holder le meto la vista

        return libroViewHolder;
    }

    @Override
    public void onBindViewHolder(LibroViewHolder holder, int position) { //Para actualizar los datos

        Libro libro = datos.get(position);
        holder.cargarLibroEnHolder(libro);

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}
