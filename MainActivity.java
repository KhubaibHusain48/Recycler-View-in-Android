package com.example.recyclerviewpractice;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView imgV;
    TextView tv1,tv2;

    ArrayList<DataClass> card=new ArrayList<>();
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_structure);
        imgV=findViewById(R.id.image);
        tv1=findViewById(R.id.contact);
        tv2=findViewById(R.id.ContactNum);
        rv=findViewById(R.id.RecycleView);

        card.add(new DataClass(R.drawable.a,"Khubaib","1234"));
        card.add(new DataClass(R.drawable.b,"Salman","134312"));
        card.add(new DataClass(R.drawable.c,"Ismaeel","21321"));
        card.add(new DataClass(R.drawable.d,"Junaid","43543"));
        card.add(new DataClass(R.drawable.e,"Bilal","7854"));
        card.add(new DataClass(R.drawable.f,"Huzaifa","24512`"));
        card.add(new DataClass(R.drawable.g,"Ammar","68972"));

        RecyclerAdapter adapter= new RecyclerAdapter(this,card);
        rv.setAdapter(adapter);





    }
}