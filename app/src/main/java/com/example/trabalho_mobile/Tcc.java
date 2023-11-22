package com.example.trabalho_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Tcc extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tcc);

        pdfView = (PDFView) findViewById(R.id.pdfview);

        pdfView.fromAsset("regimentotcc.pdf").load();

    }
}