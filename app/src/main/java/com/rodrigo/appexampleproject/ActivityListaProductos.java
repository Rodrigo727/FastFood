package com.rodrigo.appexampleproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ActivityListaProductos extends AppCompatActivity {

    private RecyclerView recyclerProductos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_productos);

        recyclerProductos = findViewById(R.id.recyclerProductos);
        recyclerProductos.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Producto> listadoProducto= new ArrayList<>();
        listadoProducto.add(new Producto(1,"Cafe",990,"Rico Cafe"));
        listadoProducto.add(new Producto(2,"Hamburgesa",1990,"Rica Hamburguesa"));
        listadoProducto.add(new Producto(3,"Sandwich",1500,"Rico Sandwich"));
        listadoProducto.add(new Producto(4,"Bebida",990,"Coca-Cola"));
        listadoProducto.add(new Producto(5,"Helado",1200,"Paleta Helada"));

        AdapterProducto adaptador = new AdapterProducto(listadoProducto);
        recyclerProductos.setAdapter(adaptador);
    }
}