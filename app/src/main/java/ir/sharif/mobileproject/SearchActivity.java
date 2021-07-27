package ir.sharif.mobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class SearchActivity extends AppCompatActivity {

    EditText editTextTextPersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        TextView valueText = findViewById(R.id.valueText);
        Button searchButton = findViewById(R.id.searchButton);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);

        switch(Objects.requireNonNull(getIntent().getStringExtra("value"))){
            case "ID":
                valueText.setText(R.string.IDString);
                break;
            case "time":
                valueText.setText(R.string.timeString);
                break;
            case "name" :
                valueText.setText(R.string.nameString);
                break;
            default:
                valueText.setText(R.string.OPSString);
        }
        searchButton.setOnClickListener(this::setSearchButton);

    }

    private void setSearchButton(View view) {
        if (editTextTextPersonName.getText().toString().isEmpty())
            Toast.makeText(this , R.string.emptySearchText , Toast.LENGTH_LONG).show();
        else {

        }
    }
}