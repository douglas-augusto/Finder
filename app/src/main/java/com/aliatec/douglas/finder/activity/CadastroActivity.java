package com.aliatec.douglas.finder.activity;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.aliatec.douglas.finder.R;

import static java.security.AccessController.getContext;

public class CadastroActivity extends AppCompatActivity {

    private Spinner listaTags;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        getSupportActionBar().setTitle("Novo cadastro");

        listaTags = findViewById(R.id.listaTagsSpinner);


    }
}
