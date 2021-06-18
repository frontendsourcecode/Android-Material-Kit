package com.frontend.source.materialkit.activity.menu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.frontend.source.materialkit.R;
import com.frontend.source.materialkit.adapter.AdapterPeopleWithMore;
import com.frontend.source.materialkit.data.DataGenerator;
import com.frontend.source.materialkit.model.People;
import com.frontend.source.materialkit.utils.Tools;
import com.frontend.source.materialkit.widget.SpacesItemDecoration;

public class MenuOverflowList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterPeopleWithMore adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_overflow_list);

        initToolbar();
        initComponent();
    }

    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this);
    }

    private void initComponent() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new SpacesItemDecoration(10));

        //set data and list adapter
        adapter = new AdapterPeopleWithMore(this, DataGenerator.getPeopleData(this));
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new AdapterPeopleWithMore.OnItemClickListener() {
            @Override
            public void onItemClick(View view, People obj, int pos) {
                Toast.makeText(getApplicationContext(), obj.name, Toast.LENGTH_SHORT).show();
            }
        });

        adapter.setOnMoreButtonClickListener(new AdapterPeopleWithMore.OnMoreButtonClickListener() {
            @Override
            public void onItemClick(View view, People obj, MenuItem item) {
                Toast.makeText(getApplicationContext(), obj.name + " (" + item.getTitle() + ") clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
