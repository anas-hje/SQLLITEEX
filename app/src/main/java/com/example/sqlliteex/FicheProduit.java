package com.example.sqlliteex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class FicheProduit extends AppCompatActivity {

    Spinner sp;
    TextView tlib, tfam, tpa, tpv;
    MyDBProduit db;
    ArrayList<PRODUIT> prds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_produit);

        db = new MyDBProduit(this);
        sp= findViewById(R.id.spfiche);
        tlib = findViewById(R.id.fichelibelle);
        tfam = findViewById(R.id.fichefamille);
        tpa = findViewById(R.id.ficheprixa);
        tpv = findViewById(R.id.ficheprixv);

        prds = MyDBProduit.getAllProds(db.getReadableDatabase());

        ArrayList<String> nomsProds = new ArrayList<>();
        for(PRODUIT pp: prds)
            nomsProds.add(pp.getId() + " - " + pp.getLibelle());

        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1,nomsProds);
        sp.setAdapter(ad);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                PRODUIT p = prds.get(i);
                tlib.setText("Libelle : " + p.getLibelle());
                tfam.setText("Famille : " + p.getFamille());
                tpa.setText(String.format("Prix Achat : %.2f DH",p.getPrixAchat()));
                tpv.setText(String.format("Prix Vente : %.2f DH",p.getPrixVente()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}