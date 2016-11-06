package com.example.derekthomas.librationaryart;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] drinks;
    private final Integer[] imageId;
    private final String[] desc;
    public CustomList(Activity context,
                      String[] drinks, String[] desc, Integer[] imageId) {
        super(context, R.layout.list_drinks, drinks);
        this.context = context;
        this.drinks = drinks;
        this.imageId = imageId;
        this.desc = desc;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_drinks, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        TextView txtDesc = (TextView) rowView.findViewById(R.id.desc);
        txtTitle.setText(drinks[position]);

        imageView.setImageResource(imageId[position]);
        txtDesc.setText(desc[position]);
        return rowView;
    }
}