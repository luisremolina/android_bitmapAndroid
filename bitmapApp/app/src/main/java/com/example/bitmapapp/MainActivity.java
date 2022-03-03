package com.example.bitmapapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import com.example.bitmapapp.databinding.ActivityMainBinding;
import com.example.bitmapapp.fragments.bitmapFragment;
import com.example.bitmapapp.fragments.secondFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;
    Fragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        mBinding.firstBitmap.setOnClickListener(view -> {
            mFragment = new bitmapFragment();
            getSupportFragmentManager().beginTransaction().replace(mBinding.contenedorFragment.getId(), mFragment).commit();
        });
        mBinding.SecondBitmap.setOnClickListener(view -> {
            mFragment = new secondFragment();
            getSupportFragmentManager().beginTransaction().replace(mBinding.contenedorFragment.getId(), mFragment).commit();
        });
    }
}