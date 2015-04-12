package com.example.teeshirt.listviewexample;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class Story1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story1);

        TextView story1 = (TextView)findViewById(R.id.story1);
        story1.setText(readTxt());
        Typeface font = Typeface.createFromAsset(getAssets(), "opensans.ttf");
        story1.setTypeface(font);
    }


    private String readTxt(){
        InputStream inputStream = getResources().openRawResource(R.raw.story1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        int i;
        try {
            i = inputStream.read();
            while (i != -1){
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
            inputStream.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return byteArrayOutputStream.toString();
    }

}
