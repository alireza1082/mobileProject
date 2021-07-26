package ir.sharif.mobileproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button createButton = findViewById(R.id.createButton);
        Button checkButton = findViewById(R.id.checkButton);
        Button editButton = findViewById(R.id.editButton);
        Button tutorialButton = findViewById(R.id.tutorialButton);
        Button aboutButton = findViewById(R.id.aboutButton);
        createButton.setOnClickListener(this::setCreateButton);
        checkButton.setOnClickListener(this::setCheckButton);
        editButton.setOnClickListener(this::setEditButton);
        tutorialButton.setOnClickListener(this::setTutorialButton);
        aboutButton.setOnClickListener(this::setAboutButton);

    }

    public void setCreateButton(View view) {
        Intent intent = new Intent(this , DateActivity.class);
        startActivity(intent);
    }

    public void setCheckButton(View view) {
    }

    public void setEditButton(View view) {
    }

    public void setTutorialButton(View view){
    }

    public void setAboutButton(View view){
        Intent intent = new Intent(this , AboutUsActivity.class);
        startActivity(intent);
    }

}