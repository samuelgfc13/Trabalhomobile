package com.example.trabalho_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ListView listView = findViewById(R.id.lisview);

        List<String> list = new ArrayList<>();
        list.add("EMENTAS");
        list.add("ACC");
        list.add("EXTENSÃO");
        list.add("TCC");
        list.add("ESTÁGIO SUPERVISIONADO");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.row, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){

                    startActivity(new Intent(Home.this,Ementa.class));

                }if(position==1){

                    startActivity(new Intent(Home.this,Acc.class));

                }if(position==2){

                    startActivity(new Intent(Home.this,Extensao.class));

                }if(position==3){

                    startActivity(new Intent(Home.this,Tcc.class));

                }if(position==4){

                    startActivity(new Intent(Home.this,Estagiosupervisionado.class));

                }else{

                }

            }
        });


    }

}