package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // نمایش پیام "سلام"
        showToast("سلام");
    }

    // تعریف متد برای نمایش Toast
    private void showToast(String message) {
        // دریافت مرجع به Context
        Context context = getApplicationContext();

        // ایجاد یک شیء از Toast
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG);

        // نمایش Toast
        toast.show();
    }
}