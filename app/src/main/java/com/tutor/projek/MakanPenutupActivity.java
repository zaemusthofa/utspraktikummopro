package com.tutor.projek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MakanPenutupActivity extends AppCompatActivity {

    Button bt_1, bt_2, bt_3, bt_4, bt_5;

    private void initBinding() {
        bt_1 = findViewById(R.id.bt_resepmakan_pen1);
        bt_2 = findViewById(R.id.bt_resepmakan_pen2);
        bt_3 = findViewById(R.id.bt_resepmakan_pen3);
        bt_4 = findViewById(R.id.bt_resepmakan_pen4);
        bt_5 = findViewById(R.id.bt_resepmakan_pen5);

    }

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makan_penutup);
        initBinding();

        bt_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MakanPenutupActivity.this, PenutupSatuActivity.class);
                startActivity(intent);
            }
        });

        bt_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MakanPenutupActivity.this, PenutupDuaActivity.class);
                startActivity(intent);
            }
        });

        bt_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MakanPenutupActivity.this, PenutupTigaActivity.class);
                startActivity(intent);
            }
        });

        bt_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MakanPenutupActivity.this, PenutupEmpatActivity.class);
                startActivity(intent);
            }
        });

        bt_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MakanPenutupActivity.this, PenutupLimaActivity.class);
                startActivity(intent);
            }
        });

    }



}
