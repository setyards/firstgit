package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        View.OnClickListener bayar = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, Bayar.class));
            }
        };

        TextView bayar1 = (TextView) findViewById(R.id.bayar);
        bayar1.setOnClickListener(bayar);
 
        View.OnClickListener transfer = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, Transfer.class));
            }
        };

        TextView transfer1 = (TextView) findViewById(R.id.transfer);
        transfer1.setOnClickListener(transfer);

        View.OnClickListener ewallet = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, Ewallet.class));
            }
        };

        TextView ewallet1 = (TextView) findViewById(R.id.ewallet);
        ewallet1.setOnClickListener(ewallet);
    }


}

