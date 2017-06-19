package com.example.asus.taniticisesler;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ListView animalliste;
    ArrayList<SatirModel> liste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animalliste= (ListView) findViewById(R.id.listviewanimal);
        liste=new ArrayList<>();

        liste.add(new SatirModel(R.drawable.at,"At"));
        liste.add(new SatirModel(R.drawable.birds,"Kuş"));
        liste.add(new SatirModel(R.drawable.circir,"Cıcır Böceği"));
        liste.add(new SatirModel(R.drawable.fil,"Fil"));
        liste.add(new SatirModel(R.drawable.frog,"Kurbağa"));
        liste.add(new SatirModel(R.drawable.kedi,"Kedi"));
        liste.add(new SatirModel(R.drawable.kaz,"Kaz"));
        liste.add(new SatirModel(R.drawable.ordek,"Ördek"));
        liste.add(new SatirModel(R.drawable.sheep,"Koyun"));
        CustomAdapter adapter= new CustomAdapter(this,liste);
        animalliste.setAdapter(adapter);

        animalliste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }

        });

    }

    @Override
    public void onClick(View v) {
        final MediaPlayer ses = MediaPlayer.create(getApplicationContext(), R.raw.atsesi);
        final Button btn= (Button)findViewById(R.id.buttonsesçal);
             final int position = (Integer) v.getTag();
             btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==0){
                    ses.start();
                }
            }
        });
        Button dur= (Button) v.findViewById(R.id.buttonsesdurdur);
             final int position1= (Integer) v.getTag();
             dur.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     if (position1==0) {
                         ses.stop();
                     }
                 }
             });



        }







}
