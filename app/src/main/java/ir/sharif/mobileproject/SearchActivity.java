package ir.sharif.mobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {

    EditText editTextTextPersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        TextView valueText = findViewById(R.id.valueText);
        Button searchButton = findViewById(R.id.searchButton);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);

        valueText.setText(getIntent().getStringExtra("value"));
        searchButton.setOnClickListener(this::setSearchButton);

    }

    private void setSearchButton(View view) {
        if (editTextTextPersonName.getText().toString().isEmpty())
            Toast.makeText(this , R.string.emptySearchText , Toast.LENGTH_LONG).show();
        else {

        }
    }
}