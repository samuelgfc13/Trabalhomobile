package com.example.trabalho_mobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Modulo_um extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulo1);

        ListView listView = findViewById(R.id.lisview);

        List<String> list = new ArrayList<>();
        list.add("PROGRAMAÇÃO 1");
        list.add("MATEMÁTICA DISCRETA");
        list.add("LÓGICA  APLICADA À COMPUTAÇÃO");
        list.add("ESTATÍSTICA");
        list.add("METODOLOGIA CIENTIICA E TECNOLOGICA");
        list.add("TEORIA GERAL DE SISTEMAS");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){

                    startActivity(new Intent(Modulo_um.this,Programacao.class));

                }if(position==1){

                }if(position==2){

                }else if(position==3){

                }else{

                }

            }
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


}