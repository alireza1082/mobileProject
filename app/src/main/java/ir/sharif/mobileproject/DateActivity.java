package ir.sharif.mobileproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;


public class DateActivity extends AppCompatActivity {


    private AdapterView adapterView;
    private List<User> userList;
    private List<User> users;

    private FloatingActionButton plusButton;
    private FloatingActionButton minusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        userList = new ArrayList<User>();

        userList.add(new User());
        userList.add(new User());

        RecyclerView recyclerView = findViewById(R.id.personsList);
        adapterView= new AdapterView();
        recyclerView.setAdapter(adapterView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        adapterView.setListItem(userList);
        adapterView.notifyDataSetChanged();

        plusButton = findViewById(R.id.plusButton);
        minusButton = findViewById(R.id.minusButton);
        plusButton.setOnClickListener(this::setPlusButton);
        minusButton.setOnClickListener(this::setMinusButton);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItem = menu.add("OK").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                users = adapterView.getListItem();
                if (users.get(0).getName() == null || users.get(0).getCost() == null ||
                        users.get(1).getName() == null || users.get(1).getCost() == null) {
                    Toast.makeText(DateActivity.this, R.string.notComplete, Toast.LENGTH_SHORT).show();
                    return false;
                }
                return false;
            }
        });
        menuItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        return super.onCreateOptionsMenu(menu);
    }

    public void setPlusButton(View view) {
        userList.add(new User());
        adapterView.notifyDataSetChanged();
    }

    public void setMinusButton(View view){
        if (userList.size() > 2)
            userList.remove(userList.size() - 1);
        adapterView.notifyDataSetChanged();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}