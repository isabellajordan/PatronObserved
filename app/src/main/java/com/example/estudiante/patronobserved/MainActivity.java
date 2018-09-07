package com.example.estudiante.patronobserved;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements DialogoColor.MiListener{

    private ConstraintLayout padre;
    private Button btn_color;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        padre= findViewById(R.id.padre);
        btn_color=findViewById(R.id.btn_color);


        btn_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //abrir diálogo
                DialogoColor dialogoColor = new DialogoColor();
                //set antes de hacer la interface
                dialogoColor.setListener(MainActivity.this);
                dialogoColor.show(getSupportFragmentManager(),"Mi diálogo");
            }
        });

    }

    @Override
    public void onChangeColor(String color) {

        //Dependiendo del color se cambia el fondo del padre
        switch (color){
            case "Blanco":
                padre.setBackgroundColor(Color.WHITE);
                break;

            case "Gris":
                padre.setBackgroundColor(Color.GRAY);
                break;

            case "Negro":
                padre.setBackgroundColor(Color.BLACK);
                break;





        }

    }
}
