package com.example.sky.afinal.view.news;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.sky.afinal.R;
import com.example.sky.afinal.model.News;
import com.example.sky.afinal.view.adapter.ContactAdapter;

import java.util.ArrayList;
import java.util.List;

public class InformationActivity extends AppCompatActivity implements View.OnClickListener{
    RecyclerView rvItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informatio);
        List<News> list = new ArrayList<>();
        list.add(new News("ABSBASBASBAS","Thisasdasdasdasdasdasdasdasda asdasdasdasd a asdas dasd " +
                "asdasdasdas asdsad asdasda sasd asasd asf",R.drawable.lu));

        list.add(new News("12312312","Thisasdasdasdasdasdasdasdasda",R.drawable.lu));
        list.add(new News("555555","Thisasdasdasdasdasdasdasdasda",R.drawable.lu));
        list.add(new News("555555","Thisasdasdasdasdasdasdasdasda",R.drawable.lu));
        list.add(new News("555555","Thisasdasdasdasdasdasdasdasda",R.drawable.lu));
        list.add(new News("555555","Thisasdasdasdasdasdasdasdasda",R.drawable.lu));
        list.add(new News("555555","Thisasdasdasdasdasdasdasdasda",R.drawable.lu));
        rvItems = (RecyclerView) findViewById(R.id.rv_items);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvItems.setLayoutManager(layoutManager);
        rvItems.setHasFixedSize(true);
        rvItems.setAdapter(new ContactAdapter(this, list));
    }

    @Override
    public void onClick(View view) {

    }
}
