package com.example.vishujaatsandroidlabs;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.CompoundButton;
import android.view.View;
import android.widget.Switch;
import android.widget.RadioButton;
import android.widget.ImageView;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView2);
        EditText editText = findViewById(R.id.editTextText);
        Button button = findViewById(R.id.button);
        CheckBox checkBox = findViewById(R.id.checkBox);
        Switch Switch = findViewById(R.id.switch1);
        ImageView imageView = findViewById(R.id.imageView);
        ImageButton imageButton = findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the width and height of the ImageButton
                int width = imageButton.getWidth();
                int height = imageButton.getHeight();

                // Create a Toast message with the width and height
                String toastMessage = "ImageButton Width: " + width + ", Height: " + height;
                Toast.makeText(MainActivity.this, toastMessage, Toast.LENGTH_SHORT).show();
            }
        });

        // OnClickListener for the Button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the text of the TextView
                textView.setText("Button Clicked");
            }
        });

        // OnClickListener for the ImageButton
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the width and height of the ImageButton
                int width = imageButton.getWidth();
                int height = imageButton.getHeight();

                // Create a Toast message with the width and height
                String toastMessage = "ImageButton Width: " + width + " Height: " + height;
                Toast.makeText(MainActivity.this, toastMessage, Toast.LENGTH_SHORT).show();
            }
        });

        // Listener for the CheckBox
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Update the Toast message with the state of the CheckBox and Switch
                updateToastMessage(checkBox.isChecked(), Switch.isChecked());
            }
        });

        // Listener for the Switch
        Switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Update the Toast message with the state of the CheckBox and Switch
                updateToastMessage(checkBox.isChecked(), Switch.isChecked());
            }
        });
    }

    // Method to update the Toast message with the state of compound buttons
    private void updateToastMessage(boolean checkBoxState, boolean switchState) {
        // Create a Toast message with the state of compound buttons
        String toastMessage = "CheckBox: " + checkBoxState + ", Switch: " + switchState;
        Toast.makeText(MainActivity.this, toastMessage, Toast.LENGTH_SHORT).show();
    }
}

