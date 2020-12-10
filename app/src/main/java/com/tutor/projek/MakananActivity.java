package com.tutor.projek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MakananActivity extends AppCompatActivity {
    Button bt_1, bt_2, bt_3, bt_4, bt_5;

    private void initBinding() {
        bt_1 = findViewById(R.id.bt_resepmakan1);
        bt_2 = findViewById(R.id.bt_resepmakan2);
        bt_3 = findViewById(R.id.bt_resepmakan3);
        bt_4 = findViewById(R.id.bt_resepmakan4);
        bt_5 = findViewById(R.id.bt_resepmakan5);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);
        initBinding();

        bt_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MakananActivity.this, MakanSatuActivity.class);
                startActivity(intent);
            }
        });

        bt_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MakananActivity.this, MakanDuaActivity.class);
                startActivity(intent);
            }
        });

        bt_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MakananActivity.this, MakanTigaActivity.class);
                startActivity(intent);
            }
        });

        bt_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MakananActivity.this, MakanEmpatActivity.class);
                startActivity(intent);
            }
        });

        bt_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MakananActivity.this, MakanLimaActivity.class);
                startActivity(intent);
            }
        });


    }
}