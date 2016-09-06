package com.prologic.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class HomeActivity extends AppCompatActivity {


    private FactBook factBook = new FactBook();
    private ColorStore colorStore = new ColorStore();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);
        final TextView factLabel;
        Button showFactButton;
        factLabel = (TextView) findViewById(R.id.fun_facts);
        showFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String fact=factBook.getFact();
                factLabel.setText(fact);
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);
                int color= colorStore.getColor();
                relativeLayout.setBackgroundColor(color);
            }
        };

        showFactButton.setOnClickListener(listener);

        }
}
