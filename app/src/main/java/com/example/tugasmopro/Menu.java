package com.example.tugasmopro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button Aplication;
    private Button Company;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Aplication = (Button)findViewById(R.id.AP);
        Company = (Button)findViewById(R.id.CP);

        Aplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Aplikasi.class);
                startActivity(intent);
            }
        });
        Company.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Profile.class);
                startActivity(intent);
            }
        });
    }
}
