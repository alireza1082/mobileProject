package ir.sharif.mobileproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button checkByNameButton = findViewById(R.id.checkByNameButton);
        Button checkByIDButton = findViewById(R.id.checkByIDButton);
        Button checkByTimeButton = findViewById(R.id.checkByTimeButton);
        checkByNameButton.setOnClickListener(this::setCheckByNameButton);
        checkByIDButton.setOnClickListener(this::setCheckByIDButton);
        checkByTimeButton.setOnClickListener(this::setCheckByTimeButton);

    }

    public void setCheckByNameButton(View view){
        Intent intent = new Intent(this , SearchActivity.class);
        intent.putExtra("value" , "name");
        startActivity(intent);
    }

    public void setCheckByIDButton(View view){
        Intent intent = new Intent(this , SearchActivity.class);
        intent.putExtra("value" , "ID");
        startActivity(intent);
    }

    public void setCheckByTimeButton(View view){
        Intent intent = new Intent(this , SearchActivity.class);
        intent.putExtra("value" , "time");
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}