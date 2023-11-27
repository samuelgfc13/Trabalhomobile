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
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ementa extends AppCompatActivity {

    List<String> ChildList;
    Map<String, List<String>> ParentListItems;
    ExpandableListView expandableListView;

    List<String> ParentList = new ArrayList<>();

    {
        ParentList.add("MODULO 1");
        ParentList.add("MODULO 2");
        ParentList.add("MODULO 3");
        ParentList.add("MODULO 4");
        ParentList.add("MODULO 5");
        ParentList.add("MODULO 6");
        ParentList.add("MODULO 7");
        ParentList.add("MODULO 8");
        ParentList.add("OPTATIVAS");

    }

    String[] modulo1Name = {
            "Programação I", "Matemática Discreta", "Lógica Aplicada à Computação", "Estatística", "Metodologia Cientifica e Tecnológica", "Teoria Geral de Sistemas"
    };

    String[] modulo2Name = {
            "Programação II", "Cálculo I", "Filsofia das Ciências", "Estruturas de Dados I", "Organização e Arquitetura de Computadores"

    };

    String[] modulo3Name = {
            "Administração I", "Probabilidade", "Banco de Dados I", "Estrutura de Dados II", "Engenharia de Software", "Economia"

    };

    String[] modulo4Name = {
            "Administração II", "Análise e Projetos de Sistemas", "Banco de Dados II", "Sistemas Operacionais", "Interface Homem Computador", "Psicologia Aplicada à Informática"

    };

    String[] modulo5Name = {
            "Desenvolvimento de Sistemas para Web I", "Redes de Computadores", "Gestão da Informação", "Gerência e Projeto de Software", "Computação Gráfica e Realidade Virtual", "Sociedade e Informática"

    };

    String[] modulo6Name = {
            "Desenvolvimento de Sistemas para Web II", "Gerência de Redes de Computadores", "Direito e Legislação", "Segurança em Redes de Computadores", "Organização de Sistemas e Métodos", "Empreendedorismo em Informática", "Inteligência Artificial"

    };

    String[] modulo7Name = {
            "Optativa I", "Sistemas Distribuídos", "Sistemas de Informação Gerenciais", "Trabalho de Conclusão de Curso I", "Estágio Supervisionado", "Atividades Curriculares Complementares"

    };

    String[] modulo8Name = {
            "Optativa II", "Programação para Dispositivos Móveis", "Segurança e Auditoria de Sistemas de informação", "Trabalho de Conclusão de Curso  II", "Atividades de Extensão Universitária"

    };

    String[] optativaName = {
            "Simulação e Avaliação de Desempenho", "Complexidade de algoritmos", "Qualidade de Software", "Mineração de dados", "Tecnologias Aplicadas à Educação"

    };

    String[] defaultName = {
            "android sam"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ementa);

        ParentListItems = new LinkedHashMap<>();
        for (String HoldItem : ParentList){
            if (HoldItem.equals("MODULO 1")){
                loadChild(modulo1Name);
            }else if (HoldItem.equals("MODULO 2")){
                loadChild(modulo2Name);
            }else if (HoldItem.equals("MODULO 3")){
                loadChild(modulo3Name);
            }else if (HoldItem.equals("MODULO 4")){
                loadChild(modulo4Name);
            }else if (HoldItem.equals("MODULO 5")){
                loadChild(modulo5Name);
            }else if (HoldItem.equals("MODULO 6")){
                loadChild(modulo6Name);
            }else if (HoldItem.equals("MODULO 7")){
                loadChild(modulo7Name);
            }else if (HoldItem.equals("MODULO 8")){
                loadChild(modulo8Name);
            }else if (HoldItem.equals("OPTATIVAS")){
                loadChild(optativaName);
            }else
                loadChild(defaultName);

            ParentListItems.put(HoldItem, ChildList);
        }

        expandableListView = findViewById(R.id.expandListView);
        final ExpandableListAdapter expandableListAdapter = new ListAdapter( this, ParentList, ParentListItems);
        expandableListView.setAdapter(expandableListAdapter);

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition, long id) {
                final String selected = (String) expandableListAdapter.getChild(groupPosition, childPosition);

                Intent intent;

                switch ((selected)){
                    case "Programação I":
                        intent = new Intent( Ementa.this, Programacao.class);
                        startActivity(intent);
                        break;
                    case "Matemática Discreta":
                        intent = new Intent( Ementa.this, Matematicadiscreta.class);
                        startActivity(intent);
                        break;
                    case "Lógica Aplicada à Computação":
                        intent = new Intent( Ementa.this, Logicaaplicada.class);
                        startActivity(intent);
                        break;
                    case "Estatística":
                        intent = new Intent( Ementa.this, Estatistica.class);
                        startActivity(intent);
                        break;
                    case "Metodologia Cientifica e Tecnológica":
                        intent = new Intent( Ementa.this, Metodologia.class);
                        startActivity(intent);
                        break;
                    case "Teoria Geral de Sistemas":
                        intent = new Intent( Ementa.this, TeoriaGeral.class);
                        startActivity(intent);
                        break;
                    case "Programação II":
                        intent = new Intent( Ementa.this, Programacaodois.class);
                        startActivity(intent);
                        break;
                    case "Organização e Arquitetura de Computadores":
                        intent = new Intent( Ementa.this, Organizacaoarquitetura.class);
                        startActivity(intent);
                        break;
                    case "Cálculo I":
                        intent = new Intent( Ementa.this, Calculo.class);
                        startActivity(intent);
                        break;
                    case "Economia":
                        intent = new Intent( Ementa.this, Economia.class);
                        startActivity(intent);
                        break;
                    case "Filsofia das Ciências":
                        intent = new Intent( Ementa.this, Filosofiaciencia.class);
                        startActivity(intent);
                        break;
                    case "Estruturas de Dados I":
                        intent = new Intent( Ementa.this, estruturadedadosumppc.class);
                        startActivity(intent);
                        break;
                    case "Administração I":
                        intent = new Intent( Ementa.this, Administracaoumppc.class);
                        startActivity(intent);
                        break;
                    case "Probabilidade":
                        intent = new Intent( Ementa.this, Probabilidadeppc.class);
                        startActivity(intent);
                        break;
                    case "Banco de Dados I":
                        intent = new Intent( Ementa.this, BancoDeDadosumppc.class);
                        startActivity(intent);
                        break;
                    case "Estrutura de Dados II":
                        intent = new Intent( Ementa.this, Estruturadedadosdoisppc.class);
                        startActivity(intent);
                        break;
                    case "Engenharia de Software":
                        intent = new Intent( Ementa.this, Engenhariadesoftwareppc.class);
                        startActivity(intent);
                        break;
                    case "Administração II":
                        intent = new Intent( Ementa.this, Administracaodoisppc.class);
                        startActivity(intent);
                        break;
                    case "Análise e Projetos de Sistemas":
                        intent = new Intent( Ementa.this, AnaliseEProjetosDeSistemasppc.class);
                        startActivity(intent);
                        break;
                    case "Banco de Dados II":
                        intent = new Intent( Ementa.this, BancoDeDadosdoisppc.class);
                        startActivity(intent);
                        break;
                    case "Sistemas Operacionais":
                        intent = new Intent( Ementa.this, Sistemasopercionaisppc.class);
                        startActivity(intent);
                        break;
                    case "Interface Homem Computador":
                        intent = new Intent( Ementa.this, InterfaceHomemComputadorppc.class);
                        startActivity(intent);
                        break;
                    case "Psicologia Aplicada à Informática":
                        intent = new Intent( Ementa.this, PsicologiaAplicadaAInformaticappc.class);
                        startActivity(intent);
                        break;
                    case "Desenvolvimento de Sistemas para Web I":
                        intent = new Intent( Ementa.this, DesenvolvimentoWebippc.class);
                        startActivity(intent);
                        break;
                    case "Redes de Computadores":
                        intent = new Intent( Ementa.this, RedesDeComputadoresppc.class);
                        startActivity(intent);
                        break;
                    case "Gestão da Informação":
                        intent = new Intent( Ementa.this, GestaoDainformacaoppc.class);
                        startActivity(intent);
                        break;
                    case "Gerência e Projeto de Software":
                        intent = new Intent( Ementa.this, GerenciaeProjetoDeSoftwareppc.class);
                        startActivity(intent);
                        break;
                    case "Computação Gráfica e Realidade Virtual":
                        intent = new Intent( Ementa.this, ComputacaoGraficaErealidadeVirtualppc.class);
                        startActivity(intent);
                        break;
                    case "Sociedade e Informática":
                        intent = new Intent( Ementa.this, SociedadeeInformaticappc.class);
                        startActivity(intent);
                        break;
                    case "Desenvolvimento de Sistemas para Web II":
                        intent = new Intent( Ementa.this, Dev_web_2.class);
                        startActivity(intent);
                        break;
                    case "Gerência de Redes de Computadores":
                        intent = new Intent( Ementa.this, Gerencia_Redes.class);
                        startActivity(intent);
                        break;
                    case "Direito e Legislação":
                        intent = new Intent( Ementa.this, Direito_Legisla.class);
                        startActivity(intent);
                        break;
                    case "Segurança em Redes de Computadores":
                        intent = new Intent( Ementa.this, Seg_Redes_Computadores.class);
                        startActivity(intent);
                        break;
                    case "Organização de Sistemas e Métodos":
                        intent = new Intent( Ementa.this, Org_Sistemas.class);
                        startActivity(intent);
                        break;
                    case "Empreendedorismo em Informática":
                        intent = new Intent( Ementa.this, Empreendedorismo.class);
                        startActivity(intent);
                        break;
                    case "Inteligência Artificial":
                        intent = new Intent( Ementa.this, Inteligencia_Artificial.class);
                        startActivity(intent);
                        break;
                    case "Sistemas Distribuídos":
                        intent = new Intent( Ementa.this, Sistemas_Distribuidos.class);
                        startActivity(intent);
                        break;
                    case "Sistemas de Informação Gerenciais":
                        intent = new Intent( Ementa.this, Sistemas_Informacao_Gerenciais.class);
                        startActivity(intent);
                        break;
                    case "Trabalho de Conclusão de Curso I":
                        intent = new Intent( Ementa.this, tccum.class);
                        startActivity(intent);
                        break;
                    case "Estágio Supervisionado":
                        intent = new Intent( Ementa.this, Estagioppc.class);
                        startActivity(intent);
                        break;
                    case "Atividades Curriculares Complementares":
                        intent = new Intent( Ementa.this, Accppc.class);
                        startActivity(intent);
                        break;
                    case "Programação para Dispositivos Móveis":
                        intent = new Intent( Ementa.this, Prog_Mobile.class);
                        startActivity(intent);
                        break;
                    case "Segurança e Auditoria de Sistemas de informação":
                        intent = new Intent( Ementa.this, Seguranca_Auditoria.class);
                        startActivity(intent);
                        break;
                    case "Trabalho de Conclusão de Curso  II":
                        intent = new Intent( Ementa.this, tccdois.class);
                        startActivity(intent);
                        break;
                    case "Atividades de Extensão Universitária":
                        intent = new Intent( Ementa.this, AEU.class);
                        startActivity(intent);
                        break;
                    case "Simulação e Avaliação de Desempenho":
                        intent = new Intent( Ementa.this, Simulacaoavaliacaodedesempenho.class);
                        startActivity(intent);
                        break;
                    case "Complexidade de algoritmos":
                        intent = new Intent( Ementa.this, Complexidadedealgoritimos.class);
                        startActivity(intent);
                        break;
                    case "Qualidade de Software":
                        intent = new Intent( Ementa.this, QualidadedeSoftware.class);
                        startActivity(intent);
                        break;
                    case "Mineração de dados":
                        intent = new Intent( Ementa.this, Mineracaodedados.class);
                        startActivity(intent);
                        break;
                    case "Tecnologias Aplicadas à Educação":
                        intent = new Intent( Ementa.this, TecnologiaAplicaadasaeducacao.class);
                        startActivity(intent);
                        break;


                }
                return true;
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void loadChild(String[] ParentElementName){

        ChildList = new ArrayList<>();
        Collections.addAll(ChildList, ParentElementName);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}