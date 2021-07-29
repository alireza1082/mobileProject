package ir.sharif.mobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class editDateActivity extends AppCompatActivity {

    Button edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_date);

        edit = findViewById(R.id.editButton);
        edit.setOnClickListener(this::setEditButton);

    }

    public void setEditButton(View view) {
    }
}