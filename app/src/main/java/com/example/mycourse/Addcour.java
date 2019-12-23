package com.example.mycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Addcour extends AppCompatActivity {
    EditText dur,ven,dat,des,tit;
    Button button;
    Addcmodel c;
    String d,venu,d1,d2,t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcour);
        dur = (EditText) findViewById(R.id.id3);
        ven = (EditText) findViewById(R.id.id4);
        dat = (EditText) findViewById(R.id.id5);
        des = (EditText) findViewById(R.id.id6);
        tit = (EditText) findViewById(R.id.id7);
        button=(Button)findViewById(R.id.id8);
        c=new Addcmodel();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tdur=dur.getText().toString().trim();
                String tven=ven.getText().toString().trim();
                String tdat=dat.getText().toString().trim();
                String tdes=des.getText().toString().trim();
                String ttit=tit.getText().toString().trim();

                c.setDu(tdur);
                c.setVe(tven);
                c.setDa(tdat);
                c.setDe(tdes);
                c.setTi(ttit);

                d=c.getDu();
                venu=c.getVe();
                d1=c.getDa();
                d2=c.getDe();
                t=c.getTi();

                Toast.makeText(getApplicationContext(),d+" "+venu+" "+d1+" "+d2+" "+t+" ",Toast.LENGTH_SHORT).show();




            }
        });
    }
}
