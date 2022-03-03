package com.example.bitmapapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bitmapapp.R;

import java.util.ArrayList;

public class adapterLista extends RecyclerView.Adapter<adapterLista.ViewHolder> {
    ArrayList<String> lista;

    public adapterLista(ArrayList lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, null , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.asignarDatos(lista.get(position));
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        CheckBox cb;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cb = (CheckBox) itemView.findViewById(R.id.cbbit);
        }
        public void asignarDatos(String s){
            cb.setText(s);
        }
    }
}
