package com.example.teacher.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ContActivity extends AppCompatActivity {



    String [] maintitle={
            "cake","bread",
            "Pan Cake","pizza",
            "hamburger","wrap",
            "chicken massala","chips",
            "salads","croque Madam"
    };
    String [] price={
            "price:5000","price:1000",
            "price:2000","price:6000",
            "price:3000","price:4000",
            "price:6000","price:1000",
            "price:3000","price:7000",
    };
    Integer [] imgid={
            R.drawable.cake,R.drawable.bread ,
            R.drawable.pancake,R.drawable.pizza ,
            R.drawable.hamburger,R.drawable.wrap ,
            R.drawable.chicken,R.drawable.chips ,
            R.drawable.salads, R.drawable.croque ,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cont);

        MyListView.MyListAdapter dapter =new MyListView.MyListAdapter(this,maintitle,price,imgid);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(dapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item


                }

                else if(position == 1) {
                    //code specific to 2nd list item

                }

                else if(position == 2) {


                }
                else if(position == 3) {


                }
                else if(position == 4) {


                }

            }
        });
    }
}


