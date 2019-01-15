package com.example.nazrulhaque.apcomputersciencequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button AB;
    private Button AL;
    private Button AO;
    private Button AR;
    private Button C;
    private Button F;
    private Button LO;
    private Button Re;
    private Button S;
    private Button SS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AB=(Button) findViewById(R.id.ab);
        AL =(Button) findViewById(R.id.al);
        AO = (Button) findViewById(R.id.ao);
        AR = (Button) findViewById(R.id.ar);
        C = (Button) findViewById(R.id.c);
        F= (Button) findViewById(R.id.f);
        LO = (Button) findViewById(R.id.lo);
        Re = (Button) findViewById(R.id.r);
        S = (Button) findViewById(R.id.s);
        SS = (Button) findViewById(R.id.ss);

        AB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAB(v);
            }
        });
        AL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAL(v);
            }
        });
        AO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAO(v);
            }
        });
        AR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAR(v);
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startC(v);
            }
        });
        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startF(v);
            }
        });
        LO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLO(v);
            }
        });
        Re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRe(v);
            }
        });
        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startS(v);
            }
        });
        SS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSS(v);
            }
        });
    }

    public void cancel(View v ){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void startAB(View view) {
        Intent intent = new Intent(this, AB.class);
        startActivity(intent);
    }
    public void startAL(View view) {
        Intent intent = new Intent(this, AL.class);
        startActivity(intent);
    }
    public void startAO(View view) {
        Intent intent = new Intent(this, AO.class);
        startActivity(intent);
    }
    public void startAR(View view) {
        Intent intent = new Intent(this, AR.class);
        startActivity(intent);
    }
    public void startC(View view) {
        Intent intent = new Intent(this, C.class);
        startActivity(intent);
    }


    public void startF(View view) {
        Intent intent = new Intent(this, F.class);
        startActivity(intent);
    }
    public void startLO(View view) {
        Intent intent = new Intent(this, LO.class);
        startActivity(intent);
    }
    public void startRe(View view) {
        Intent intent = new Intent(this, Recursion.class);
        startActivity(intent);
    }
    public void startS(View view) {
        Intent intent = new Intent(this, S.class);
        startActivity(intent);
    }
    public void startSS(View view) {
        Intent intent = new Intent(this, SS.class);
        startActivity(intent);
    }
}
