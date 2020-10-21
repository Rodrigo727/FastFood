package com.rodrigo.appexampleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Registro extends AppCompatActivity {
    EditText txtNombre, txtApellido, txtCorreo, txtContraseña, txtRContraseña, txtTelefono;
    Spinner spinner;
    Button btnRegistrar, btnCancelar;
    //ImageButton visible1, visible2;
    private boolean NombreOk = false;
    private boolean ApellidoOk = false;
    private boolean EmailOk = false;
    private boolean PasswordOk = false;
    private boolean ConfirmacionOk = false;
    private boolean PhoneOk = false;
    private boolean esVisible;
    static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        txtNombre = findViewById(R.id.txtNombreProducto);
        txtApellido = findViewById(R.id.txtApellido);
        txtCorreo = findViewById(R.id.txtCorreo);
        txtContraseña = findViewById(R.id.txtContraseña);
        txtRContraseña = findViewById(R.id.txtRContraseña);
        txtTelefono = findViewById(R.id.txtTelefono);
        spinner = findViewById(R.id.spinner);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        btnCancelar = findViewById(R.id.btnCancelar);
        //visible1 = findViewById(R.id.visible1);
        //visible2 = findViewById(R.id.visible2);

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(Registro.this,R.array.Genero_array,
                        android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        txtNombre.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() < 2){
                    txtNombre.setError("Nombre Muy Corto");
                    NombreOk = false;
                }else {
                    NombreOk = true;
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        txtApellido.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() < 2){
                    txtApellido.setError("Apellido Muy Corto");
                    ApellidoOk = false;
                }else {
                    ApellidoOk = true;
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        txtCorreo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() < 8){
                    txtCorreo.setError("Correo Muy Corto");
                    EmailOk = false;
                }else {
                    EmailOk = true;
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        txtContraseña.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() < 8){
                    txtContraseña.setError("Contraseña Muy Corta");
                    PasswordOk = false;
                }else {
                    PasswordOk = true;
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        txtRContraseña.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (PasswordOk == ConfirmacionOk){
                    txtRContraseña.setError("Contraseña no coinside");
                    ConfirmacionOk = false;
                }else{
                    ConfirmacionOk = true;
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        txtTelefono.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() < 8){
                    txtTelefono.setError("Telefono Muy Corto");
                    PhoneOk = false;
                }else {
                    PhoneOk = true;
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Registro.this, "Registrado",
                        Toast.LENGTH_SHORT).show();
                String Nombre = txtNombre.getText().toString();
                String Apellido = txtApellido.getText().toString();
                String Correo = txtCorreo.getText().toString();
                String Contrasenia = txtContraseña.getText().toString();
                String RContrasenia = txtRContraseña.getText().toString();
                String Telefono = txtTelefono.getText().toString();
                String Genero = spinner.getSelectedItem().toString();

                Usuario usuario = new Usuario(Nombre, Apellido, Correo, Contrasenia,
                        RContrasenia, Telefono, Genero);
                listaUsuarios.add(usuario);
                Intent intento = new Intent(Registro.this, Revisar.class);
                startActivity(intento);
            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(Registro.this, MainActivity.class);
                startActivity(intento);
            }
        });

        /*visible1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!esVisible) {
                    txtContraseña.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    esVisible = true;

                }
                else {
                    txtContraseña.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    esVisible = false;
                    visible1.setBackgroundResource(R.drawable.novisible);
                }
            }
        });

        visible2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!esVisible) {
                    txtRContraseña.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    esVisible = true;

                }
                else {
                    txtRContraseña.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    esVisible = false;
                    visible2.setBackgroundResource(R.drawable.novisible);
                }
            }
        });*/
                }
}