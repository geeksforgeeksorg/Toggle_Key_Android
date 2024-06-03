package com.gfg.toggle_button;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ToggleButton togglebutton;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        togglebutton = (ToggleButton)findViewById(R.id.button_toggle);
        textview = (TextView)findViewById(R.id.textView1);
    }

    public void onToggleClick(View view)
    {
        if (togglebutton.isChecked()) {
            textview.setText("Toggle is ON");
        }
        else {
            textview.setText("Toggle is OFF");
        }
    }
}