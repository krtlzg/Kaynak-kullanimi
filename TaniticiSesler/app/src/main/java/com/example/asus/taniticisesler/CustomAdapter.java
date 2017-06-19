package com.example.asus.taniticisesler;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;

import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by asus on 19.6.2017.
 */

public class CustomAdapter extends BaseAdapter {
    private LayoutInflater userInflater;
    private ArrayList<SatirModel> hayvanlistesi;
    public CustomAdapter(Activity activity, ArrayList<SatirModel> liste){
        hayvanlistesi=liste;
        userInflater= (LayoutInflater)activity.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return hayvanlistesi.size();
    }
    @Override
    public Object getItem(int position) {
        return hayvanlistesi.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View satir;
        satir= userInflater.inflate(R.layout.satirtasarim,null);
        ImageView imresim= (ImageView) satir.findViewById(R.id.imageViewresim);
        TextView  tvhayvan= (TextView) satir.findViewById(R.id.textViewisim);
        Button  btnçal= (Button)satir.findViewById(R.id.buttonsesçal);
        Button btndurdur= (Button)satir.findViewById(R.id.buttonsesdurdur);
        SatirModel hayvan = hayvanlistesi.get(position);
        imresim.setImageResource(hayvan.getLogoId());
        tvhayvan.setText(hayvan.getIsim());

        btnçal.setTag(position);
        btnçal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (Integer) v.getTag();


            }
        });

        btndurdur.setTag(position);
        btndurdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position= (Integer)v.getTag();
            }
        });

        return satir;
    }



}




/*btnçal.setTag(position);
        btnçal.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        int position = (Integer) v.getTag();


        }
        });


         btndurdur.setTag(position);
        btndurdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position= (Integer)v.getTag();
            }
        });


*/