package com.irfandev.project.latihanandroid1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;


/**
 * created by Irfan Assidiq
 * email : assidiq.irfan@gmail.com
 **/
public class MainActivityLinear extends AppCompatActivity {
    TextInputEditText etUsername, etPassword;
    Button btnLogin;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear2);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etUsername.getText().toString().equals(null) && etPassword.getText().toString().equals(null)){
                    Toast.makeText(MainActivityLinear.this, "username dan password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }else {
                    String uname = etUsername.getText().toString(); // digunakan untuk mengambil teks didalam editext kemudian di convert ke string
                    String pass = etPassword.getText().toString();
                    cekData(uname, pass);
                }
            }
        });
    }

    void cekData(String username, String pass){
        if(username.equals("irfan") && pass.equals("12345")){
            Intent intent = new Intent(MainActivityLinear.this, MainActivity.class);
            intent.putExtra("nama", username);
            startActivity(intent);
            finish();
        }else{
            Toast.makeText(this, "username atau password salah", Toast.LENGTH_SHORT).show();
        }
    }
}
