package com.irfandev.project.latihanandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * @param savedInstanceState
     * @TODO isi setiap konten yang diinginkan
     */
    TextView tvHello;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHello = findViewById(R.id.tvHello);
        btnLogin = findViewById(R.id.btnLogin);

        String username = getIntent().getStringExtra("nama");
        if(username == null){
            Toast.makeText(this, "username kosong", Toast.LENGTH_SHORT).show();
        }
        tvHello.setText("Welcome "+username);
    }
}
