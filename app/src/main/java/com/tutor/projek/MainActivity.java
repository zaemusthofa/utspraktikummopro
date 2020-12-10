package com.tutor.projek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton but_makanan, but_minuman, but_makan_penutup ;

    private void initBinding() {
        but_makanan = findViewById(R.id.bt_makanan);
        but_minuman = findViewById(R.id.bt_minuman);
        but_makan_penutup = findViewById(R.id.bt_makan_penutup);

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBinding();

        but_makanan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MakananActivity.class);
                startActivity(intent);
            }
        });

        but_minuman.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MinumanActivity.class);
                startActivity(intent);
            }
        });

        but_makan_penutup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MakanPenutupActivity.class);
                startActivity(intent);
            }
        });

    }
}