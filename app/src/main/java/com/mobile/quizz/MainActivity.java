package com.mobile.quizz;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MahasiswaVIewModel mahasiswaViewModel;
    EditText input_nama;
    TextView output_nama;
    EditText input_nim;
    TextView output_nim;
    EditText input_jurusan;
    TextView output_jurusan;
    EditText input_angkatan;
    TextView output_angkatan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input_nama=findViewById(R.id.input_nama);
        input_nim=findViewById(R.id.input_nim);
        input_jurusan=findViewById(R.id.input_jurusan);
        input_angkatan=findViewById(R.id.input_angkatan);
        output_nama=findViewById(R.id.output_nama);
        output_nim=findViewById(R.id.output_nim);
        output_jurusan=findViewById(R.id.output_jurusan);
        output_angkatan=findViewById(R.id.output_angkatan);
        mahasiswaViewModel=new ViewModelProvider(this).get(MahasiswaVIewModel.class);
        mahasiswaViewModel.getName().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String x) {
                output_nama.setText(x);
            }
        });
        mahasiswaViewModel.getNim().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String x) {
                output_nim.setText(x);
            }
        });
        mahasiswaViewModel.getJurusan().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String x) {
                output_jurusan.setText(x);
            }
        });
        mahasiswaViewModel.getAngkatan().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String x) {
                output_angkatan.setText(x);
            }
        });

        final Button tampil = (Button)findViewById(R.id.btn_tampil);
        tampil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mahasiswaViewModel.getName().setValue(String.valueOf(input_nama.getText()));
                mahasiswaViewModel.getNim().setValue(String.valueOf(input_nim.getText()));
                mahasiswaViewModel.getJurusan().setValue(String.valueOf(input_jurusan.getText()));
                mahasiswaViewModel.getAngkatan().setValue(String.valueOf(input_angkatan.getText()));
            }
        });
    }
}