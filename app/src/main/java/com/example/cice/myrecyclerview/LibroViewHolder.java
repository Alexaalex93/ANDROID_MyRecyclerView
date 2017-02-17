package com.example.cice.myrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by cice on 17/2/17.
 */

public class LibroViewHolder extends RecyclerView.ViewHolder {

    private TextView caja_titulo;
    private TextView caja_autor;

    public LibroViewHolder(View itemView) {
        super(itemView);
        caja_autor = (TextView) itemView.findViewById(R.id.autor);
        caja_titulo = (TextView) itemView.findViewById(R.id.titulo);

    }

    public void cargarLibroEnHolder(Libro l){

        caja_autor.setText(l.getAutor());
        caja_titulo.setText(l.getTitulo());

    }

}
