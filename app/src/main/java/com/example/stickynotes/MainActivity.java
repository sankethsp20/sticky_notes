package com.example.stickynotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText noteEditText;
    private Button addButton;
    private LinearLayout notesLayout;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            noteEditText = findViewById(R.id.noteEditText);
            addButton = findViewById(R.id.addButton);
            notesLayout = findViewById(R.id.notesLayout);

            addButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    addNote();
                }
            });
        }

        private void addNote() {
            String noteText = noteEditText.getText().toString();
            if (!noteText.isEmpty()) {
                // Create a new TextView to display the note
                TextView textView = new TextView(this);
                textView.setText(noteText);

                // Add the TextView to the notesLayout
                notesLayout.addView(textView);

                // Clear the input field
                noteEditText.getText().clear();
            }
        }
    }

