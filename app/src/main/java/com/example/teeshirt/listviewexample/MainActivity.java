package com.example.teeshirt.listviewexample;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] favoriteTVShows = {"The Wolf and the Lamb","The Man and the Serpent","The Sick Lion","The Swallow and the Other Birds","The Mountains in Labor"
        ,"The Hares and the Frogs","The Woodman and the Serpent","The Frog and the Ox","The Hart and the Hunter","The Tree and the Reed"};

        ListAdapter theAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,favoriteTVShows);

        ListView theListView = (ListView) findViewById(R.id.theListView);

        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String tvShowPicked =  String.valueOf(adapterView.getItemAtPosition(position));

                Toast.makeText(MainActivity.this, tvShowPicked, Toast.LENGTH_SHORT).show();
                Intent kwenda = new Intent();
                switch(position){
                    case 0:
                        kwenda = new Intent(getApplicationContext(), Story1.class);
                        break;

                    case 1:
                        kwenda = new Intent(getApplicationContext(), Story2.class);
                        break;

                    case 2:
                        kwenda = new Intent(getApplicationContext(), Story3.class);
                        break;

                    case 3:
                        kwenda = new Intent(getApplicationContext(), Story4.class);
                        break;

                    case 4:
                        kwenda = new Intent(getApplicationContext(), Story5.class);
                        break;

                    case 5:
                        kwenda = new Intent(getApplicationContext(), Story6.class);
                        break;

                    case 6:
                        kwenda = new Intent(getApplicationContext(), story7.class);
                        break;

                    case 7:
                        kwenda = new Intent(getApplicationContext(), Story8.class);
                        break;

                    case 8:
                        kwenda = new Intent(getApplicationContext(), Story9.class);
                        break;

                    case 9:
                        kwenda = new Intent(getApplicationContext(), Story10.class);
                        break;

                }
               startActivity(kwenda);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
