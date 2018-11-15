package com.houseofgod.questionone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.numbers_recycler_view)
    RecyclerView recyclerView;

    private LinearLayoutManager linearLayoutManager;
    private NumbersAdapter numbersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        List<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < 99999; i++) {
            dataList.add(i);
        }

        linearLayoutManager = new LinearLayoutManager(this);
        numbersAdapter = new NumbersAdapter(dataList);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(numbersAdapter);
    }
}
