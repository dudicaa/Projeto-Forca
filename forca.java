package com.example.projetoforca;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private Button q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,z,x,c,v,b,n,m;
    private ArrayList<String> Lista;
    private int indiceLista;
    private String palavraSorteada;
    private Button btn1, btn2, btn3, btn4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // setContentView(R.layout.activity_main2);

        btn1= (Button) findViewById(R.id.button4);
        btn2= (Button) findViewById(R.id.button3);
        btn3= (Button) findViewById(R.id.button2);
        btn4= (Button) findViewById(R.id.button);

        Lista= new ArrayList<String>();
        indiceLista = 0;
        palavraSorteada = new String();

        Lista= new ArrayList<String>();
        q=(Button) findViewById(R.id.q);
        q.setOnClickListener(this);

        w=(Button) findViewById(R.id.w);
        w.setOnClickListener(this);

        e=(Button) findViewById(R.id.e);
        e.setOnClickListener(this);

        r=(Button) findViewById(R.id.r);
        r.setOnClickListener(this);

        t=(Button) findViewById(R.id.t);
        t.setOnClickListener(this);

        y=(Button) findViewById(R.id.y);
        y.setOnClickListener(this);

        u=(Button) findViewById(R.id.u);
        u.setOnClickListener(this);

        i=(Button) findViewById(R.id.i);
        i.setOnClickListener(this);

        o=(Button) findViewById(R.id.o);
        o.setOnClickListener(this);

        p=(Button) findViewById(R.id.p);
        p.setOnClickListener(this);


        a=(Button) findViewById(R.id.a);
        a.setOnClickListener(this);

        s=(Button) findViewById(R.id.s);
        s.setOnClickListener(this);

        d=(Button) findViewById(R.id.d);
        d.setOnClickListener(this);

        f=(Button) findViewById(R.id.f);
        f.setOnClickListener(this);

        g=(Button) findViewById(R.id.g);
        g.setOnClickListener(this);

        h=(Button) findViewById(R.id.h);
        h.setOnClickListener(this);

        j=(Button) findViewById(R.id.j);
        j.setOnClickListener(this);

        k=(Button) findViewById(R.id.k);
        k.setOnClickListener(this);

        l=(Button) findViewById(R.id.l);
        l.setOnClickListener(this);

        z=(Button) findViewById(R.id.z);
        z.setOnClickListener(this);

        x=(Button) findViewById(R.id.x);
        x.setOnClickListener(this);

        c=(Button) findViewById(R.id.c);
        c.setOnClickListener(this);

        v=(Button) findViewById(R.id.v);
        v.setOnClickListener(this);

        b=(Button) findViewById(R.id.b);
        b.setOnClickListener(this);

        n=(Button) findViewById(R.id.n);
        n.setOnClickListener(this);

        m=(Button) findViewById(R.id.m);
        m.setOnClickListener(this);

        carregaPalavras();
        definirPalavraJogo();


    }
    public void definirPalavraJogo(){
        Collections.shuffle(Lista);
        palavraSorteada= Lista.get(indiceLista);
    }
    public void carregaPalavras() {
        Lista.add("bola");
        Lista.add("mala");
        Lista.add("cola");
        Lista.add("pato");
        Lista.add("cara");
        Lista.add("gato");
        Lista.add("maçã");
        Lista.add("mesa");
        Lista.add("lula");
        Lista.add("nome");
        Lista.add("cama");
        Lista.add("lama");
        Lista.add("luxo");
        Lista.add("moda");
        Lista.add("caju");



    }
    public void verificaForca(String textoBotaoTocado){
        char letra1, letra2, letra3, letra4;
        letra1 = palavraSorteada.charAt(0);
        letra2 = palavraSorteada.charAt(1);
        letra3 = palavraSorteada.charAt(2);
        letra4 = palavraSorteada.charAt(3);

        if(textoBotaoTocado.compareToIgnoreCase(Character.toString(letra1))==0) {
            btn1.setText(Character.toString(letra1));
        }
        if(textoBotaoTocado.compareToIgnoreCase(Character.toString(letra2))==0){
            btn2.setText(Character.toString(letra2));
        }
        if(textoBotaoTocado.compareToIgnoreCase(Character.toString(letra3))==0){
            btn3.setText(Character.toString(letra3));
        }
        if(textoBotaoTocado.compareToIgnoreCase(Character.toString(letra4))==0){
            btn4.setText(Character.toString(letra4));
        }
                }






    @Override
    public void onClick(View view) {

        Button b= new Button(this);
        b= (Button) view;
        String x = new String ();
        x= b.getText().toString();
        verificaForca(x);
        }
    }
