package com.example.Ex3_SimpleSumApp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void XuLyCong(View view) {
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKQ = findViewById(R.id.edtKQ);
        // Lay du lieu ve
        String strA =    editTextSoA.getText().toString();
        String strB =    editTextSoB.getText().toString();

        // Chuyển dữ liệu sang dạng số
         int soA =  Integer.parseInt(strA);
         int soB =  Integer.parseInt(strB);

        // Tính Toán
            int tong = soA + soB;
            String strTong = String.valueOf(tong);
        // Hien ra man hinh
        editTextKQ.setText(strTong);

    }
}