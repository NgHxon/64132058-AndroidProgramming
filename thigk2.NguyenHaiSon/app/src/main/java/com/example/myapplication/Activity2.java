package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        public void XuLyCong(View view){
            EditText editTextsoA = findViewById(R.id.editA);
            EditText editTextsoB = findViewById(R.id.editB);
            EditText editTextKetqua = findViewById(R.id.editKQ);
            //lay du lieu
            String strA = editTextsoA.getText().toString();
            String strB = editTextsoB.getText().toString();
            //chuyen doi du lieu
            int soA=Integer.parseInt(strA);
            int soB= Integer.parseInt(strB);
            //tinh tong
            int tong= soA+soB;
            //chuyen sang dang chuoi
            String strTong=String.valueOf(tong);
            //hien ra man hinh
            editTextKetqua.setText(strTong);
        }
    }
    }
}