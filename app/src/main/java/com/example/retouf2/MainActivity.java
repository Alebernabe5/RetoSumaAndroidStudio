package com.example.retouf2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    protected TextView texto1,texto2,texto3,texto4;
    protected Button boton1,boton2,boton3;
    protected MediaPlayer mp;
    protected int num1,num2;
    protected int rSuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        texto1 = (TextView) findViewById(R.id.text1_main);
        texto2 = (TextView) findViewById(R.id.text2_main);
        texto3 = (TextView) findViewById(R.id.text3_main);
        texto4 = (TextView) findViewById(R.id.text4_main);
        boton1 = (Button) findViewById(R.id.boton1_main);
        boton2 = (Button) findViewById(R.id.boton2_main);
        boton3 = (Button) findViewById(R.id.boton3_main);

        //ASIGNO NUMEROS RANDO
        num1= (int) (Math.random() *9);
        num2= (int) (Math.random() *9);

        //AGREGO LOS NUMEROS A LOS TEXTVIEW
        texto2.setText(String.valueOf(num1));
        texto4.setText(String.valueOf(num2));

        //CALCULO DE SUMA
        rSuma = num1 +num2;

        if (rSuma>=0 && rSuma <=6)
        {
            boton1.setText(String.valueOf(rSuma + 2));
            boton2.setText(String.valueOf(rSuma - 1));
            boton3.setText(String.valueOf(rSuma));

            boton1. setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    fallo();
                }
            });
            boton2. setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    fallo();
                }
            });
            boton3. setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    acierto();
                }
            });

        }
        if (rSuma>=7 && rSuma <=14)
        {
            boton1.setText(String.valueOf(rSuma + 4));
            boton3.setText(String.valueOf(rSuma - 2));
            boton2.setText(String.valueOf(rSuma));

            boton1. setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    fallo();
                }
            });
            boton2. setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    acierto();
                }
            });
            boton3. setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    fallo();
                }
            });

        }
        if (rSuma>=15 && rSuma <=18)
        {
            boton2.setText(String.valueOf(rSuma - 8));
            boton3.setText(String.valueOf(rSuma -4));
            boton1.setText(String.valueOf(rSuma));

            boton1. setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    acierto();
                }
            });
            boton2. setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    fallo();
                }
            });
            boton3. setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    fallo();
                }
            });

        }




    }

    public void acierto(){
        mp = MediaPlayer.create(MainActivity.this,R.raw.aplausos);
        mp.start();
    }
    public void fallo(){
        mp = MediaPlayer.create(MainActivity.this, R.raw.error);
        mp.start();
    }
}