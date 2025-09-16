package com.example.hostelmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {


    final String gp ="Greek Palace";
    final String  jk= "Hotel JK";
    final String  hi= "Holiday Inn";
    final String mp ="Mumta Palace";
    final String lh = "Hotel Luxury";
    Button b1,b2,b3,b4,b5;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.Vieww) {
            Intent intent = new Intent(MainActivity3.this, MainActivity6.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.Refersh) {
            recreate();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        b1 = findViewById(R.id.buttonView1);
        b2 = findViewById(R.id.buttonView2);
        b3 = findViewById(R.id.buttonView3);
        b4 = findViewById(R.id.buttonView4);
        b5 = findViewById(R.id.buttonView5);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity4.class);
                i.putExtra("GP",gp);
                startActivity(i);



                // Toast.makeText(Main3Activity.this, "1", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity4.class);

                i.putExtra("HJK",jk);
                startActivity(i);


                // Toast.makeText(Main3Activity.this, "2", Toast.LENGTH_SHORT).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity4.class);
                i.putExtra("MP",mp);
                startActivity(i);



                //   Toast.makeText(Main3Activity.this, "3", Toast.LENGTH_SHORT).show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity4.class);
                i.putExtra("HI",hi);

                startActivity(i);

                //   Toast.makeText(Main3Activity.this, "4", Toast.LENGTH_SHORT).show();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity4.class);
                i.putExtra("HL",lh);
                startActivity(i);



                //Toast.makeText(Main3Activity.this, "5", Toast.LENGTH_SHORT).show();
            }
        });

    }
}