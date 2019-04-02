package com.zhangxq.softkeyboardtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etBottom = findViewById(R.id.etBottom);

        new HeightProvider(this).init().setHeightListener(new HeightProvider.HeightListener() {
            @Override
            public void onHeightChanged(int height) {
                etBottom.setTranslationY(-height);
            }
        });
    }
}
