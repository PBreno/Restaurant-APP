package com.example.avaliaoi;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.Visibility;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class TableActivity extends AppCompatActivity {

    private EditText tablenumberEdit;
    private LinearLayout oneLayout;
    private LinearLayout twoLayout;
    private LinearLayout threeLayout;
    private LinearLayout fourLayout;
    private LinearLayout fiveLayout;
    private LinearLayout sixLayout;
    private LinearLayout sevenLayout;
    private LinearLayout eightLayout;
    private LinearLayout nineLayout;
    private Button onebtn;
    private Button twobtn;
    private Button threebtn;
    private Button fourbtn;
    private Button fivebtn;
    private Button sixbtn;
    private Button sevenbtn;
    private Button eightbtn;
    private Button ninebtn;
    private Button releasestablebtn;
    private Button saveoperationbtn;
    private Button releaseAlltablebtn;
    private Button configbtn;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        tablenumberEdit = findViewById(R.id.tablenumberEdit);

        releasestablebtn = findViewById(R.id.releasestablebtn);
        saveoperationbtn = findViewById(R.id.saveoperationbtn);
        releaseAlltablebtn = findViewById(R.id.releaseAlltablebtn);
        configbtn = findViewById(R.id.configbtn);

        oneLayout = findViewById(R.id.oneLayout);
        twoLayout = findViewById(R.id.twoLayout);
        threeLayout =findViewById(R.id.threeLayout);
        fourLayout = findViewById(R.id.fourLayout);
        fiveLayout = findViewById(R.id.fiveLayout);
        sixLayout =findViewById(R.id.sixLayout);
        sevenLayout = findViewById(R.id.sevenLayout);
        eightLayout = findViewById(R.id.eightLayout);
        nineLayout =findViewById(R.id.nineLayout);

        onebtn = findViewById(R.id.onebtn);
        twobtn = findViewById(R.id.twobtn);
        threebtn = findViewById(R.id.threebtn);
        fourbtn = findViewById(R.id.fourbtn);
        fivebtn = findViewById(R.id.fivebtn);
        sixbtn = findViewById(R.id.sixbtn);
        sevenbtn = findViewById(R.id.sevenbtn);
        eightbtn = findViewById(R.id.eightbtn);
        ninebtn = findViewById(R.id.ninebtn);


        onebtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                oneLayout.setBackgroundColor(Color.parseColor("#F30000"));
                onebtn.setVisibility(View.INVISIBLE);

            }
        });

        twobtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                twoLayout.setBackgroundColor(Color.parseColor("#F30000"));
                twobtn.setVisibility(View.INVISIBLE);
            }
        });

        threebtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                threeLayout.setBackgroundColor(Color.parseColor("#F30000"));
                threebtn.setVisibility(View.INVISIBLE);

            }
        });

        fourbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                fourLayout.setBackgroundColor(Color.parseColor("#F30000"));
                fourbtn.setVisibility(View.INVISIBLE);

            }
        });

        fivebtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                fiveLayout.setBackgroundColor(Color.parseColor("#F30000"));
                fivebtn.setVisibility(View.INVISIBLE);
            }
        });

        sixbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                sixLayout.setBackgroundColor(Color.parseColor("#F30000"));
                sixbtn.setVisibility(View.INVISIBLE);

            }
        });

        sevenbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                sevenLayout.setBackgroundColor(Color.parseColor("#F30000"));
                sevenbtn.setVisibility(View.INVISIBLE);

            }
        });
        eightbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                eightLayout.setBackgroundColor(Color.parseColor("#F30000"));
                eightbtn.setVisibility(View.INVISIBLE);
            }
        });

        ninebtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                nineLayout.setBackgroundColor(Color.parseColor("#F30000"));
                ninebtn.setVisibility(View.INVISIBLE);
            }

        });

        releasestablebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (Integer.parseInt(tablenumberEdit.getText().toString())) {
                    case 1:
                        if (onebtn.getVisibility() == View.INVISIBLE) {
                            onebtn.setVisibility(View.VISIBLE);
                            oneLayout.setBackgroundColor(Color.parseColor("#5425FF"));
                        } else
                            Toast.makeText(TableActivity.this, "Mesa não reservada. A mesa " + Integer.parseInt(tablenumberEdit.getText().toString()) + " encontra-se habilitada para reserva!", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        if (twobtn.getVisibility() == View.INVISIBLE) {
                            twobtn.setVisibility(View.VISIBLE);
                            twoLayout.setBackgroundColor(Color.parseColor("#5425FF"));
                        } else
                            Toast.makeText(TableActivity.this, "Mesa não reservada. A mesa " + Integer.parseInt(tablenumberEdit.getText().toString()) + " encontra-se habilitada para reserva!", Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        if (threebtn.getVisibility() == View.INVISIBLE) {
                            threebtn.setVisibility(View.VISIBLE);
                            threeLayout.setBackgroundColor(Color.parseColor("#5425FF"));
                        } else
                            Toast.makeText(TableActivity.this, "Mesa não reservada. A mesa " + Integer.parseInt(tablenumberEdit.getText().toString()) + " encontra-se habilitada para reserva!", Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        if (fourbtn.getVisibility() == View.INVISIBLE) {
                            fourbtn.setVisibility(View.VISIBLE);
                            fourLayout.setBackgroundColor(Color.parseColor("#5425FF"));
                        } else
                            Toast.makeText(TableActivity.this, "Mesa não reservada. A mesa " + Integer.parseInt(tablenumberEdit.getText().toString()) + " encontra-se habilitada para reserva!", Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        if (fivebtn.getVisibility() == View.INVISIBLE) {
                            fivebtn.setVisibility(View.VISIBLE);
                            fiveLayout.setBackgroundColor(Color.parseColor("#5425FF"));
                        } else
                            Toast.makeText(TableActivity.this, "Mesa não reservada. A mesa " + Integer.parseInt(tablenumberEdit.getText().toString()) + " encontra-se habilitada para reserva!", Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        if (sixbtn.getVisibility() == View.INVISIBLE) {
                            sixbtn.setVisibility(View.VISIBLE);
                            sixLayout.setBackgroundColor(Color.parseColor("#5425FF"));
                        } else
                            Toast.makeText(TableActivity.this, "Mesa não reservada. A mesa " + Integer.parseInt(tablenumberEdit.getText().toString()) + " encontra-se habilitada para reserva!", Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        if (sevenbtn.getVisibility() == View.INVISIBLE) {
                            sevenbtn.setVisibility(View.VISIBLE);
                            sevenLayout.setBackgroundColor(Color.parseColor("#5425FF"));
                        } else
                            Toast.makeText(TableActivity.this, "Mesa não reservada. A mesa " + Integer.parseInt(tablenumberEdit.getText().toString()) + " encontra-se habilitada para reserva!", Toast.LENGTH_LONG).show();
                        break;
                    case 8:
                        if (eightbtn.getVisibility() == View.INVISIBLE) {
                            eightbtn.setVisibility(View.VISIBLE);
                            eightLayout.setBackgroundColor(Color.parseColor("#5425FF"));
                        } else
                            Toast.makeText(TableActivity.this, "Mesa não reservada. A mesa " + Integer.parseInt(tablenumberEdit.getText().toString()) + " encontra-se habilitada para reserva!", Toast.LENGTH_LONG).show();
                        break;
                    case 9:
                        if (ninebtn.getVisibility() == View.INVISIBLE) {
                            ninebtn.setVisibility(View.VISIBLE);
                            nineLayout.setBackgroundColor(Color.parseColor("#5425FF"));
                        } else
                            Toast.makeText(TableActivity.this, "Mesa não reservada. A mesa " + Integer.parseInt(tablenumberEdit.getText().toString()) + " encontra-se habilitada para reserva!", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

        saveoperationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(TableActivity.this);
                SharedPreferences.Editor edit = preferences.edit();
                edit.putInt("tablenumberone", onebtn.getVisibility());
                edit.putInt("tablenumbertwo", twobtn.getVisibility());
                edit.putInt("tablenumberthree", threebtn.getVisibility());
                edit.putInt("tablenumberfour", fourbtn.getVisibility());
                edit.putInt("tablenumbefive", fivebtn.getVisibility());
                edit.putInt("tablenumbesix", sixbtn.getVisibility());
                edit.putInt("tablenumberseve", sevenbtn.getVisibility());
                edit.putInt("tablenumbereight", eightbtn.getVisibility());
                edit.putInt("tablenumbernine", ninebtn.getVisibility());
                edit.apply();

            }
        });

        releaseAlltablebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (onebtn.getVisibility() == View.INVISIBLE && twobtn.getVisibility() == View.INVISIBLE && threebtn.getVisibility() == View.INVISIBLE &&
                        sixbtn.getVisibility() == View.INVISIBLE && fivebtn.getVisibility() == View.INVISIBLE &&threebtn.getVisibility() == View.INVISIBLE &&
                            sevenbtn.getVisibility() == View.INVISIBLE && eightbtn.getVisibility() == View.INVISIBLE && ninebtn.getVisibility() == View.INVISIBLE){

                    Toast.makeText(TableActivity.this, "Todas as mesas j[a encontram-se reservadas!", Toast.LENGTH_LONG).show();
                }
                else{

                    oneLayout.setBackgroundColor(Color.parseColor("#F30000"));
                    onebtn.setVisibility(View.INVISIBLE);
                    twoLayout.setBackgroundColor(Color.parseColor("#F30000"));
                    twobtn.setVisibility(View.INVISIBLE);
                    threeLayout.setBackgroundColor(Color.parseColor("#F30000"));
                    threebtn.setVisibility(View.INVISIBLE);
                    fourLayout.setBackgroundColor(Color.parseColor("#F30000"));
                    fourbtn.setVisibility(View.INVISIBLE);
                    fiveLayout.setBackgroundColor(Color.parseColor("#F30000"));
                    fivebtn.setVisibility(View.INVISIBLE);
                    sixLayout.setBackgroundColor(Color.parseColor("#F30000"));
                    sixbtn.setVisibility(View.INVISIBLE);
                    sevenLayout.setBackgroundColor(Color.parseColor("#F30000"));
                    sevenbtn.setVisibility(View.INVISIBLE);
                    eightLayout.setBackgroundColor(Color.parseColor("#F30000"));
                    eightbtn.setVisibility(View.INVISIBLE);
                    nineLayout.setBackgroundColor(Color.parseColor("#F30000"));
                    ninebtn.setVisibility(View.INVISIBLE);

                }
            }
        });

    }
}
