package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class ActivityDaftar extends AppCompatActivity {
    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        edtNama=findViewById(R.id.EdNama);
        edtEmail=findViewById(R.id.EdEmail);
        edtAlamat=findViewById(R.id.EdAlamat);
        edtPassword=findViewById(R.id.EdPass);
        edtrepass=findViewById(R.id.Edrepas);
        fab=findViewById(R.id.fabSimpan);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void OnClick(View view){
                if (edtNama.getText().toString().isEmpty() || edtEmail.getText().toString().isEmpty() ||
                edtAlamat.getText().toString().isEmpty() || edtPassword.getText().toString().isEmpty() ||
                        edtrepass.getText().toString().isEmpty()){
                    Snackbar.make(view, "Isi seluruh data!!", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    if (edtPassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(), "Pendaftaran berhasil.....",
                                Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class)
                                startActivity(i);
                    }
                    else
                    {
                        Snackbar.make(view, "Password dan Repassword harus sama!!!",
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        }
    }
}
