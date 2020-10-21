package com.rodrigo.appexampleproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolderDatos>{
    ArrayList<Usuario> listaUsuarios;

    public MiAdaptador(Revisar revisar, ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @NonNull
    @Override
    public MiAdaptador.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.simple_recycler_item, parent,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        holder.txtNombre.setText(listaUsuarios.get(position).getNombre());
        holder.txtApellido.setText(listaUsuarios.get(position).getApellido());
        holder.txtCorreo.setText(listaUsuarios.get(position).getCorreo());
        holder.txtContraseña.setText(listaUsuarios.get(position).getContrasenia());
        holder.txtRContraseña.setText(listaUsuarios.get(position).getRContrasenia());
        holder.txtTelefono.setText(listaUsuarios.get(position).getTelefono());
        holder.spinner.setText(listaUsuarios.get(position).getGenero());
    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView txtNombre, txtApellido, txtCorreo, txtContraseña, txtRContraseña, txtTelefono,spinner;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            txtNombre = itemView.findViewById(R.id.txtNombreProducto);
            txtApellido = itemView.findViewById(R.id.txtApellido);
            txtCorreo = itemView.findViewById(R.id.txtCorreo);
            txtContraseña = itemView.findViewById(R.id.txtContraseña);
            txtRContraseña = itemView.findViewById(R.id.txtRContraseña);
            txtTelefono = itemView.findViewById(R.id.txtTelefono);
            spinner = itemView.findViewById(R.id.txtGenero);
        }
    }
}
