package com.example.android.precentage;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import sdk.insert.io.Insert;


public class MainActivity extends AppCompatActivity {

    TextView totalTextView;
    EditText percentageTxt;
    EditText NumberTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        totalTextView = findViewById(R.id.totalTextView);
        percentageTxt = findViewById(R.id.PercentageTxt);
        NumberTxt =  findViewById(R.id.NumbrtTxt);
       TextView txtQQ = findViewById(R.id.textQQ);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Helvetica.ttf");
        txtQQ.setTypeface(typeface);

        Button calcButton = findViewById(R.id.CalcBtn);
        calcButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                Float percentage = Float.parseFloat(percentageTxt.getText().toString());
                Float dec = percentage / 100;
                Float total = dec * Float.parseFloat(NumberTxt.getText().toString());
                totalTextView.setText(Float.toString(total));

                Map<String, String> userData = new HashMap<>();
                userData.put("key", "value");
                userData.put("key2", "value2");

                Map<String, String> accountData = new HashMap<>();
                accountData.put("key", "value");
                accountData.put("key2", "value2");



                HashMap<String, String> properties = new HashMap<>();
                properties.put ("key", "value1");
                properties.put ("key2", "value2");

                Insert.eventOccurred("clicks_ok", properties);

 // Insert.switchVisitor(randVisitor, randVisitor2, userData, accountData);

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
