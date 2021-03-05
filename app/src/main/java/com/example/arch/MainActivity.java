package com.example.arch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import io.opentimeline.opentime.RationalTime;
import io.opentimeline.opentime.TimeRange;
import io.opentimeline.opentimelineio.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textview);
        textView.setText(System.getProperty("os.arch") + "\n" + System.getProperty("java.vm.name") + "\n" + System.getProperty("os.name"));

        Clip clip = new Clip.ClipBuilder()
                .setName("test_clip")
                .build();
        textView.setText(clip.toString());
    }
}