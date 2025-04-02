package com.example.retouf2;

import android.media.MediaPlayer;
import android.os.Bundle;
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

        num1= (int) (Math.random() *9);
        num2= (int) (Math.random() *9);

        texto2.setText(String.valueOf(num1));
        texto4.setText(String.valueOf(num2));

        rSuma = num1 +num2;



    }
}