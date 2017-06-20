package com.example.asus.taniticisesler;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    ListView animalliste;
    ArrayList<SatirModel> liste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animalliste = (ListView) findViewById(R.id.listviewanimal);
        liste = new ArrayList<>();

        liste.add(new SatirModel(R.drawable.at,R.raw.atsesi, "At"));
        liste.add(new SatirModel(R.drawable.birds,R.raw.kussesi, "Kuş"));
        liste.add(new SatirModel(R.drawable.circir,R.raw.circirbocegi, "Cıcır Böceği"));
        liste.add(new SatirModel(R.drawable.fil,R.raw.filsesi, "Fil"));
        liste.add(new SatirModel(R.drawable.frog,R.raw.frogsesi, "Kurbağa"));
        liste.add(new SatirModel(R.drawable.kedi,R.raw.kedisesi, "Kedi"));
        liste.add(new SatirModel(R.drawable.kaz,R.raw.kazsesi, "Kaz"));
        liste.add(new SatirModel(R.drawable.ordek,R.raw.ordeksesi, "Ördek"));
        liste.add(new SatirModel(R.drawable.sheep,R.raw.koyunsesi, "Koyun"));
        CustomAdapter adapter = new CustomAdapter(this, liste);
        animalliste.setAdapter(adapter);

    }


}

