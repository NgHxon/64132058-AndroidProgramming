package com.example.ex5_addsubmuldiv_anynomous;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button nutCong,nutTru,nutNhan,nutChia;
    EditText editTextSo2,editTextSo1,editTextKq;
    void TimDieuKhien(){
        EditText editTextSo1 =findViewById(R.id.edtSo1);
        EditText editTextSo2 =  findViewById(R.id.edtSo2);
        EditText editTextKq =  findViewById(R.id.edtKQ);
         nutCong = (Button) findViewById(R.id.btnCong);
         nutTru = (Button) findViewById(R.id.btnTru);
         nutNhan = (Button) findViewById(R.id.btnNhan);
         nutChia =(Button)  findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        View.OnClickListener boLangNgheCong =new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                XuLyCong();
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               XuLyTru();
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyNhan();
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyChia();
            }
        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
    }
     void XuLyCong(){
        EditText editTextso1 = findViewById(R.id.edtSo1);
        EditText editTextso2 = findViewById(R.id.edtSo2);
        EditText editTextKetqua = findViewById(R.id.edtKQ);
        //lay du lieu
        String strA = editTextso1.getText().toString();
        String strB = editTextso2.getText().toString();
        //chuyen doi du lieu
        Float so1=Float.parseFloat(strA);
        Float so2=Float.parseFloat(strB);
        //tinh tong
        float tong= so1+so2;
        //chuyen sang dang chuoi
        String strTong=String.valueOf(tong);
        //hien ra man hinh
        editTextKetqua.setText(strTong);
    }
     void XuLyTru(){
        EditText editTextso1 = findViewById(R.id.edtSo1);
        EditText editTextso2 = findViewById(R.id.edtSo2);
        EditText editTextKetqua = findViewById(R.id.edtKQ);
        //lay du lieu
        String strA = editTextso1.getText().toString();
        String strB = editTextso2.getText().toString();
        //chuyen doi du lieu
        Float so1=Float.parseFloat(strA);
        Float so2=Float.parseFloat(strB);
        //tinh tong
        float tong= so1-so2;
        //chuyen sang dang chuoi
        String strTong=String.valueOf(tong);
        //hien ra man hinh
        editTextKetqua.setText(strTong);
    }
     void XuLyNhan(){
        EditText editTextso1 = findViewById(R.id.edtSo1);
        EditText editTextso2 = findViewById(R.id.edtSo2);
        EditText editTextKetqua = findViewById(R.id.edtKQ);
        //lay du lieu
        String strA = editTextso1.getText().toString();
        String strB = editTextso2.getText().toString();
        //chuyen doi du lieu
        Float so1=Float.parseFloat(strA);
        Float so2=Float.parseFloat(strB);
        //tinh tong
        float tong= so1*so2;
        //chuyen sang dang chuoi
        String strTong=String.valueOf(tong);
        //hien ra man hinh
        editTextKetqua.setText(strTong);
    }
     void XuLyChia(){
        EditText editTextso1 = findViewById(R.id.edtSo1);
        EditText editTextso2 = findViewById(R.id.edtSo2);
        EditText editTextKetqua = findViewById(R.id.edtKQ);
        //lay du lieu
        String strA = editTextso1.getText().toString();
        String strB = editTextso2.getText().toString();
        //chuyen doi du lieu
        Float so1=Float.parseFloat(strA);
        Float so2=Float.parseFloat(strB);
        //tinh tong
        float tong= so1/so2;
        //chuyen sang dang chuoi
        String strTong=String.valueOf(tong);
        //hien ra man hinh
        editTextKetqua.setText(strTong);
    }
}