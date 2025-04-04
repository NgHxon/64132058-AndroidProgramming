package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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
    }


    public void Xulydiemtb(View view) {
        EditText editTextsoA = findViewById(R.id.editA);
        EditText editTextsoB = findViewById(R.id.editB);
        EditText editTextKetqua = findViewById(R.id.editKQ);

        // Lấy dữ liệu
        String strA = editTextsoA.getText().toString();
        String strB = editTextsoB.getText().toString();

        // Kiểm tra dữ liệu có hợp lệ không
        if (strA.isEmpty() || strB.isEmpty()) {
            editTextKetqua.setText("Vui lòng nhập số!");
            return;
        }

        // Chuyển đổi dữ liệu
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        // Tính tổng
        int tong = soA + soB;

        // Hiển thị kết quả
        editTextKetqua.setText(String.valueOf(tong));
    }
}
