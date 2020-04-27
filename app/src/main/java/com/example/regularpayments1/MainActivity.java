package com.example.regularpayments1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<product> productList;
    List<cardproduct> pdlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setLayoutManager(new RelativeLayout(this));


        int i=0 ;
        if(i==1) {
            productList = new ArrayList<>();
            productadapter adapter = new productadapter(this,productList);
            productList.add(
                    new product(R.drawable.finakya_oldman, "Oops no data found", "Please add"));
            recyclerView.setAdapter(adapter);
        }
        //run pdlist
        else {
            pdlist = new ArrayList<>();
            cardadapter ad2 = new cardadapter(this, pdlist);
            pdlist.add(new cardproduct("LIC", "Rs 2000", "/week", "Next payment on", R.drawable.lic_icon));
            recyclerView.setAdapter(ad2);

        }

        //setting adapter to recyclerview


    }
}
