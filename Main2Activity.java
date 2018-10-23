package com.example.carlo.suma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tvdatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recibir();

    }

    public void recibir(){
        Bundle extras =getIntent().getExtras();
        String d1 = extras.getString("a");
        tvdatos=(TextView) findViewById(R.id.Res);
        tvdatos.setText(d1);

    }


}
