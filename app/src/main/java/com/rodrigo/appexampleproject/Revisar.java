package com.rodrigo.appexampleproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Revisar extends AppCompatActivity {

    RecyclerView recyclerReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revisar);
        recyclerReg = findViewById(R.id.recyclerReg);

        recyclerReg.setLayoutManager(new LinearLayoutManager(this));
        MiAdaptador adaptador = new MiAdaptador(this, Registro.listaUsuarios);
        recyclerReg.setAdapter(adaptador);
    }
}