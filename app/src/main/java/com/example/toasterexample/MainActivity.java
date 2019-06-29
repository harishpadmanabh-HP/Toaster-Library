package com.example.toasterexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toasterlibrary.ToasterMessage;
import com.mrntlu.toastie.Toastie;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToasterMessage.toaster(this,"Example toast");

    }
}
