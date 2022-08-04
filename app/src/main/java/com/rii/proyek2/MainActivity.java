package com.rii.proyek2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //untuk mengubah titlebar aplikasi
        getSupportActionBar().setTitle("Login");

        //deklarasi variable
        TextInputLayout etUsername = findViewById(R.id.et_username);
        TextInputLayout etPassword = findViewById(R.id.et_password);
        Button btnLogin = findViewById(R.id.btn_login);

        //ketika tombol login di-klik
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ambil input username & password
                String username = etUsername.getEditText().getText().toString();
                String password = etPassword.getEditText().getText().toString();

                //validasi
                if(username.equals("jmp-a") && password.equals("123")) {
                    //mencegah untuk kembali ke activity login
                    finish();

                    Intent intent = new Intent(MainActivity.this, DaftarNegaraActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Username/Password Salah!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}