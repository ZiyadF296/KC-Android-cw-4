package com.example.classwork4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.activity_main);

        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryDark));
    }

    public static int totalGrade(int num1, int num2) {
        return num1 + num2;
    }

    // Thought return type should've been String since instructions 
    // said "returning the value", not "printing".
    public static void temperature(int num1) { 
        if (num1 >= 23) {
            System.out.println("Hot");
            // return "Hot"; 
        } else {
            System.out.println("COld");
            // return "Cold";
        }
    }

    public static void incremental() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
