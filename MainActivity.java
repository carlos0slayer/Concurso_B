package com.example.carlo.suma;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<RelativeLayout> HRelativeLayout = new ArrayList<>();
    ArrayList<TextView> TTextView = new ArrayList<>();
    Button Agregar;
    Button Ctotales;
    int x=1;
    LinearLayout Padre;
    EditText dat1,dat2,dat3,dat4,dat5,dat6,dat7,dat8,dat9,dat10;
    TextView result;
    int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Agregar=findViewById(R.id.agregar);
        Ctotales=findViewById(R.id.ct);
        Padre=findViewById(R.id.Padre);

        dat1=(EditText)findViewById(R.id.uno);
        dat2=(EditText)findViewById(R.id.dos);
        dat3=(EditText)findViewById(R.id.tres);
        dat4=(EditText)findViewById(R.id.cuatro);
        dat5=(EditText)findViewById(R.id.cinco);
        dat6=(EditText)findViewById(R.id.seis);
        dat7=(EditText)findViewById(R.id.siete);
        dat8=(EditText)findViewById(R.id.ocho);
        dat9=(EditText)findViewById(R.id.nueve);
        dat10=(EditText)findViewById(R.id.diez);

        result=(TextView)findViewById(R.id.Resss);



        Agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView txcambiado=(TextView) getLayoutInflater().inflate(R.layout.texto,null);
                TTextView.add(txcambiado);
                Padre.addView(txcambiado);
                txcambiado.setText("Participante"+x++);

                RelativeLayout et1=(RelativeLayout) getLayoutInflater() .inflate(R.layout.main, null);
                HRelativeLayout.add(et1);
                Padre.addView(et1);




            }
        });





    }

    public void onClickCtotales(View view){



                num1= Integer.parseInt(dat1.getText().toString());
                num2= Integer.parseInt(dat2.getText().toString());
                num3= Integer.parseInt(dat3.getText().toString());
                num4= Integer.parseInt(dat4.getText().toString());
                num5= Integer.parseInt(dat5.getText().toString());
                num6= Integer.parseInt(dat6.getText().toString());
                num7= Integer.parseInt(dat7.getText().toString());
                num8= Integer.parseInt(dat8.getText().toString());
                num9= Integer.parseInt(dat9.getText().toString());
                num10= Integer.parseInt(dat10.getText().toString());
                int suma=num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
                result.setText(suma);

        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("a",suma);
        startActivity(intent);


    }


}
