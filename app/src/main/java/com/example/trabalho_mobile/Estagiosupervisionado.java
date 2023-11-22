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

public class Estagiosupervisionado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estagiosupervisionado);

        ListView listView = findViewById(R.id.lisview);

        List<String> list = new ArrayList<>();
        list.add("REGIMENTO ESTÁGIO");
        list.add("TERMO DE COMPROMISSO");
        list.add("PLANO DE ATIVIDADE");
        list.add("RELATORIO FINAL");
        list.add("FICHA DE HORAS");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.row, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){

                    startActivity(new Intent(Estagiosupervisionado.this,Regimentoestagio.class));

                }if(position==1){
                    startActivity(new Intent(Estagiosupervisionado.this,Estagiotermo.class));

                }if(position==2){
                    startActivity(new Intent(Estagiosupervisionado.this,Estagioplanoatividade.class));

                }if(position==3){

                    startActivity(new Intent(Estagiosupervisionado.this,Estagiorelatorio.class));

                }else if (position==4){

                    startActivity(new Intent(Estagiosupervisionado.this,Estagiofichadehoras.class));

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

