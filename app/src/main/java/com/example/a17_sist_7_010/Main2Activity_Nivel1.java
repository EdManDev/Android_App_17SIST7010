package com.example.a17_sist_7_010;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity_Nivel1 extends AppCompatActivity {

    private TextView tv_nombre, tv_score;
    private ImageView iv_Auno, iv_Ados, iv_vidas;
    private EditText et_respuesta;
    private MediaPlayer mp, mp_great, mp_bad;


    int score, numAleatorio_uno, numAleatorio_dos, resultado, vidas = 3;
    String nombre_jugador, string_score, string_vidas;

    String numero [] = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2__nivel1);

        Toast.makeText(this, "Nivel 1 - Sumas básicas", Toast.LENGTH_SHORT).show();

        tv_nombre = (TextView) findViewById(R.id.textView_nombre);
        tv_score = (TextView)findViewById(R.id.textView_score);
        iv_vidas = (ImageView)findViewById(R.id.imageView_vidas);
        iv_Auno = (ImageView)findViewById(R.id.imageView_NumUno);
        iv_Ados = (ImageView)findViewById(R.id.imageView_NumDos);
        et_respuesta = (EditText)findViewById(R.id.editText_resultado);

        nombre_jugador = getIntent().getStringExtra("jugador");
        tv_nombre.setText("Jugador: " + nombre_jugador);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        mp = MediaPlayer.create(this, R.raw.goats);
        mp.start();
        mp.setLooping(true);

        mp_great = MediaPlayer.create(this, R.raw.wonderful);
        mp_bad = MediaPlayer.create(this, R.raw.bad);

//        NumAleatorio();
    }

//    public void Comparar(View view){
//        String respuesta = et_respuesta.getText().toString();
//
//        if(!respuesta.equals("")){
//
//            int respuesta_jugador = Integer.parseInt(respuesta);
//            if(resultado == respuesta_jugador){
//
//                mp_great.start();
//                score++;
//                tv_score.setText("Score: " + score);
//                et_respuesta.setText("");
//                BaseDeDatos();
//
//            } else {
//
//                mp_bad.start();
//                vidas--;
//                BaseDeDatos();
//
//                switch (vidas){
//                    case 3:
//                        iv_vidas.setImageResource(R.drawable.tresvidas);
//                        break;
//                    case 2:
//                        Toast.makeText(this, "Te quedan 2 manzanas", Toast.LENGTH_LONG).show();
//                        iv_vidas.setImageResource(R.drawable.dosvidas);
//                        break;
//                    case 1:
//                        Toast.makeText(this, "Te queda 1 manzana", Toast.LENGTH_LONG).show();
//                        iv_vidas.setImageResource(R.drawable.unavida);
//                        break;
//                    case 0:
//                        Toast.makeText(this, "Has perdido todas tus manzanas", Toast.LENGTH_LONG).show();
//                        Intent intent = new Intent(this, MainActivity.class);
//                        startActivity(intent);
//                        finish();
//                        mp.stop();
//                        mp.release();
//                        break;
//                }
//
//                et_respuesta.setText("");
//            }
//
//            NumAleatorio();
//
//        } else {
//            Toast.makeText(this, "Escribe tu respuesta", Toast.LENGTH_SHORT).show();
//        }
//    }



}