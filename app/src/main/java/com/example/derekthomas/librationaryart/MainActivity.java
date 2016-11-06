package com.example.derekthomas.librationaryart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] drinks = {
            "Americano",
            "Angel Face",
            "Aviation",
            "B52",
            "Brandy Alexander"
    };
    Integer[] imageId = {
            R.drawable.xhdpi_americano,
            R.drawable.xhdpi_angel_face,
            R.drawable.xhdpi_aviation,
            R.drawable.xhdpi_b52,
            R.drawable.xhdpi_brandy_alexander
    };

    String[] desc = {
            "The cocktail was first served in creator Gaspare Campari's bar, Caffè Campari, in the 1860s. It was originally known as the \"Milano-Torino\" because of its ingredients: Campari, the bitter liqueur, is from Milan (Milano) and Punt e Mes, the vermouth, is from Turin (Torino). It is popular belief that in the early 1900s, the Italians noticed a surge of Americans who enjoyed the cocktail. As a compliment to the Americans, the cocktail later became known as the \"Americano\".",
            "The Angel Face is a cocktail made from gin, apricot brandy and Calvados in equal amounts.",
            "The Aviation was created by Hugo Ensslin, head bartender at the Hotel Wallick in New York, in the early twentieth century.[1] The first published recipe for the drink appeared in Ensslin's 1916 Recipes for Mixed Drinks. ",
            "The name refers to the US B-52 Stratofortress long-range bomber. This bomber was used in the Vietnam War for the release of incendiary bombs, which likely inspired today's flaming variant of the cocktail; another hypothesis centers on B-52 combat losses (\"Burns like a B-52 over Hanoi\").",
            "There are many rumors about its origins. Some sources say it was created at the time of the London wedding of Princess Mary and Viscount Lascelles in 1922.[2] Drama critic and Algonquin Round Table member Alexander Woollcott claimed that it was named after him. Other sources say it was named after the Russian tsar Alexander II."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        CustomList adapter = new
                CustomList(MainActivity.this, drinks, desc, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +drinks[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}