package com.example.exercicioalgoritos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int a = 0,b = 0,c = 0,d = 0,e = 0;
     public EditText Digite;
     public TextView MostraAnt,MostraSuc,MostrDobro,MostraQuad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Digite = findViewById(R.id.digitarNumero);
        MostraAnt = findViewById(R.id.lblAntecessor);
        MostraSuc = findViewById(R.id.lblSucessor);
        MostrDobro = findViewById(R.id.lblDobro);
        MostraQuad = findViewById(R.id.lblQuadrado);
    }
    public void clique (View view){
        String s = Digite.getText().toString();
        int n = Integer.parseInt(s);

         b = (n- 1);
        c = (n + 1);
        d = (n * 2);
        e = (int) Math.pow(n,2);

        MostraAnt.setText(String.valueOf(b));
        MostraSuc.setText(String.valueOf(c));
        MostrDobro.setText(String.valueOf(d));
        MostraQuad.setText(String.valueOf(e));

    }
}
