package com.tutor.projek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MinumanActivity extends AppCompatActivity {

    Button bt_1, bt_2, bt_3, bt_4, bt_5;

    private void initBinding() {
        bt_1 = findViewById(R.id.bt_resepminum1);
        bt_2 = findViewById(R.id.bt_resepminum2);
        bt_3 = findViewById(R.id.bt_resepminum3);
        bt_4 = findViewById(R.id.bt_resepminum4);
        bt_5 = findViewById(R.id.bt_resepminum5);

    }

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);
        initBinding();


        bt_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MinumanActivity.this, MinumSatuActivity.class);
                startActivity(intent);
            }
        });

        bt_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MinumanActivity.this, MinumDuaActivity.class);
                startActivity(intent);
            }
        });

        bt_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MinumanActivity.this, MinumTigaActivity.class);
                startActivity(intent);
            }
        });

        bt_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MinumanActivity.this, MinumEmpatActivity.class);
                startActivity(intent);
            }
        });

        bt_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MinumanActivity.this, MinumLimaActivity.class);
                startActivity(intent);
            }
        });


    }
}