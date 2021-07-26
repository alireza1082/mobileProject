package ir.sharif.mobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

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

}