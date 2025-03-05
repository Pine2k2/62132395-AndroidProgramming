package com.example.ex4_addsubmuldiv_onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // khai bao cac doi tuong  gan ovi dkhien tuong ung o day
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong,nutTru,nutNhan,nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }
    void TimDieuKhien() {
         editTextSo1 = (EditText)findViewById(R.id.edt1);
         editTextSo2 = (EditText)findViewById(R.id.edt2);
         editTextKQ = (EditText)findViewById(R.id.edt3);
         nutCong = (Button)findViewById(R.id.btn1);
         nutTru = (Button)findViewById(R.id.btn2);
        nutNhan = (Button)findViewById(R.id.btn3);
        nutChia = (Button)findViewById(R.id.btn4);
    }
    // Xu ly +
    public    void XuLyCong(View v) {
    //b1. lay du lieu 2 so
        // Tim edittext so 1 va 2

        //b2. lay du lieu tu 2 dkhien do
        String soThu1 =   editTextSo1.getText().toString();
        String soThu2 =   editTextSo2.getText().toString();
        //b3 chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        // Tinh Toan
        float Tong = soA + soB;
        // hien thi kq
        // chuan bi du lieu
        String chuoiKQ = String.valueOf(Tong);
        // gan kq len dieu khien
        editTextKQ.setText(chuoiKQ);
    }
    // Xu ly -
    public void XuLyTru(View v) {
        //b1. lay du lieu 2 so
        // Tim edittext so 1 va 2
        //b2. lay du lieu tu 2 dkhien do
        String soThu1 =   editTextSo1.getText().toString();
        String soThu2 =   editTextSo2.getText().toString();
        //b3 chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        // Tinh Toan
        float Tru = soA - soB;
        // hien thi kq
        // chuan bi du lieu
        String chuoiKQ = String.valueOf(Tru);
        // gan kq len dieu khien
        editTextKQ.setText(chuoiKQ);
    }
    // Xu ly *
    public void XuLyNhan(View v) {
        //b1. lay du lieu 2 so
        // Tim edittext so 1 va 2
        //b2. lay du lieu tu 2 dkhien do
        String soThu1 =   editTextSo1.getText().toString();
        String soThu2 =   editTextSo2.getText().toString();
        //b3 chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        // Tinh Toan
        float Nhan = soA * soB;
        // hien thi kq
        // chuan bi du lieu
        String chuoiKQ = String.valueOf(Nhan);
        // gan kq len dieu khien
        editTextKQ.setText(chuoiKQ);
    }
    // Xu ly /
    public void XuLyChia(View v) {
        //b1. lay du lieu 2 so
        // Tim edittext so 1 va 2
        //b2. lay du lieu tu 2 dkhien do
        String soThu1 =   editTextSo1.getText().toString();
        String soThu2 =   editTextSo2.getText().toString();
        //b3 chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        // Tinh Toan
        float Chia = soA / soB;
        // hien thi kq

        // chuan bi du lieu
        String chuoiKQ = String.valueOf(Chia);
        // gan kq len dieu khien
        editTextKQ.setText(chuoiKQ);
    }
}