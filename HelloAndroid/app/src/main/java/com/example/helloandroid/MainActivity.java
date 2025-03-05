package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btnSayHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //B3: gắn bộ lắng nghe cho nút bấm
        btnSayHello = findViewById(R.id.button);
        btnSayHello.setOnClickListener(bo_lang_nghe_XL_XinChao);
    }
    //2.1 Listener in Varible
    //B1+2
    View.OnClickListener bo_lang_nghe_XL_XinChao = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Code xử lý ở đây
            //Ví dụ, hiện thông báo nhanh bằng lớp Toast
            //Toast.makeText(ngữ_cảnh, nội_dung_Tbao, thời_gian_hiện).show();
            Toast.makeText(MainActivity.this, "Chào tất cả HTTT và các bạn ", Toast.LENGTH_LONG).show();
        }
    };
}