package com.example.bitmapapp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bitmapapp.R;
import com.example.bitmapapp.adapters.adapterLista;
import com.example.bitmapapp.databinding.FragmentBitmapBinding;

import java.util.ArrayList;

public class secondFragment extends Fragment {

    ArrayList lista;
    FragmentBitmapBinding fBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fBinding = FragmentBitmapBinding.inflate(getLayoutInflater(), container, false);
        return fBinding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),16);
        gridLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL); // set Horizontal Orientation
        fBinding.recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView
        lista = new ArrayList<String>();

        for (int i = 64; i < 128; i++) {
            lista.add("#"+(i+1));
        }
        adapterLista adapter = new adapterLista(lista);
        fBinding.recyclerView.setAdapter(adapter);

    }
}