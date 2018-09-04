package com.aliatec.douglas.finder.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.design.internal.BottomNavigationItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aliatec.douglas.finder.R;


public class PerfilFragment extends android.support.v4.app.Fragment {

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil, container, false);


    }
}