package com.example.estudiante.patronobserved;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

public class DialogoColor extends AppCompatDialogFragment{

    //clase observable

    //2. Crear objeto global de la clase
    MiListener listener;

    //1. Crear la interfaz
    interface  MiListener{
        void onChangeColor (String color);


    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //sirve para construir diálogo set título
        builder.setTitle("Cambiar color");
        builder.setMessage("Seleccione un color");
        //poner los listener
        builder.setPositiveButton("Blanco", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("Blanco");

            }
        });
        builder.setNeutralButton("Gris", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("Gris");

            }
        });
        builder.setNegativeButton("Negro", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("Negro");

            }
        });
        return builder.create();
    }

    //Método set para el listener


    public void setListener(MiListener listener) {
        this.listener = listener;
    }
}
