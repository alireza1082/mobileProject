package ir.sharif.mobileproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button createButton = findViewById(R.id.createButton);
    private Button checkButton = findViewById(R.id.checkButton);
    private Button editButton = findViewById(R.id.editButton);
    private Button tutorialButton = findViewById(R.id.tutorialButton);
    private Button aboutButton = findViewById(R.id.aboutButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createButton.setOnClickListener(this::setCreateButton);
        checkButton.setOnClickListener(this::setCheckButton);
        editButton.setOnClickListener(this::setEditButton);
        tutorialButton.setOnClickListener(this::setTutorialButton);
        aboutButton.setOnClickListener(this::setAboutButton);

    }

    public void setCreateButton(View view) {
    }

    public void setCheckButton(View view) {
    }

    public void setEditButton(View view) {
    }

    public void setTutorialButton(View view){
    }

    public void setAboutButton(View view){
    }

}