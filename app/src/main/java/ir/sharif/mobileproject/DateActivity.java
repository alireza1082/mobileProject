package ir.sharif.mobileproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;


public class DateActivity extends AppCompatActivity {


    private AdapterView adapterView;
    private ArrayList<User> userList;

    private FloatingActionButton plusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        userList = new ArrayList<>();

        userList.add(new User());
        userList.add(new User());

        RecyclerView recyclerView = findViewById(R.id.personsList);
        adapterView= new AdapterView();
        recyclerView.setAdapter(adapterView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        adapterView.setListItem(userList);
        adapterView.notifyDataSetChanged();

        plusButton = findViewById(R.id.plusButton);
        plusButton.setOnClickListener(this::setPlusButton);
        plusButton.setOnLongClickListener(this::setLongPlusButton);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItem = menu.add("OK").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                startActivity(new Intent());
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

    public Boolean setLongPlusButton(View view){
        userList.remove(userList.size() - 1);
        adapterView.notifyDataSetChanged();
        return false;
    }

}