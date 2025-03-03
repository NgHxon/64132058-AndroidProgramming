package com.example.tinhtoan;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void XuLyCong(View view){
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
    public void XuLyTru(View view){
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
    public void XuLyNhan(View view){
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
    public void XuLyChia(View view){
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