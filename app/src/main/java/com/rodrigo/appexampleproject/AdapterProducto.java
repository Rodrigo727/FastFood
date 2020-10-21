package com.rodrigo.appexampleproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterProducto extends RecyclerView.Adapter<AdapterProducto.ViewHolderDatos> {
    ArrayList<Producto> ListaProducto;

    public AdapterProducto(ArrayList<Producto> listaProducto) {
        ListaProducto = listaProducto;
    }

    @NonNull
    @Override
    public AdapterProducto.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_producto, parent);
        ViewHolderDatos viewHolderDatos = new ViewHolderDatos(view);
        return viewHolderDatos;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProducto.ViewHolderDatos holder, int position) {
        holder.CargarProducto(ListaProducto.get(position));
    }

    @Override
    public int getItemCount() {
        return ListaProducto.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        ImageView imgProducto;
        TextView txtNombreProducto, txtPrecioProducto, txtDescProducto;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            imgProducto = itemView.findViewById(R.id.imgProducto);
            txtNombreProducto = itemView.findViewById(R.id.txtNombreProducto);
            txtPrecioProducto = itemView.findViewById(R.id.txtPrecioProducto);
            txtDescProducto = itemView.findViewById(R.id.txtDescProducto);
        }


        public void CargarProducto(Producto prod) {
            txtNombreProducto.setText(prod.getNombre());
            txtPrecioProducto.setText("$" + prod.getPrecio());
            txtDescProducto.setText(prod.getDescripcion());

            switch (prod.getNombre()) {
                case "Hamburguesa":
                    Picasso.get().load(R.drawable.hamburger1).into(imgProducto);
                    break;
                case "Café":
                    Picasso.get().load(R.drawable.coffee).into(imgProducto);
                    break;
                case "Bebida":
                    Picasso.get().load(R.drawable.drink).into(imgProducto);
                    break;
                case "Papas Fritas":
                    Picasso.get().load(R.drawable.frenchfries).into(imgProducto);
                    break;
                case "Helado":
                Picasso.get().load(R.drawable.icecream).into(imgProducto);
                    break;
                case "Panqueque":
                Picasso.get().load(R.drawable.pancake).into(imgProducto);
                    break;
                case "Pizza":
                Picasso.get().load(R.drawable.pizza).into(imgProducto);
                    break;
                case "Sandwich":
                Picasso.get().load(R.drawable.sandwich).into(imgProducto);
                    break;
            }
        }
    }
}
