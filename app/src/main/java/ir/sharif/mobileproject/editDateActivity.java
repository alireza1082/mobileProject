package ir.sharif.mobileproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class editDateActivity extends AppCompatActivity {

    Button edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_date);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        edit = findViewById(R.id.editButton);
        edit.setOnClickListener(this::setEditButton);

    }

    public void setEditButton(View view) {
        Intent intent = new Intent(this , DateActivity.class);
        //intent.putStringArrayListExtra(new ArrayList<String>());
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}