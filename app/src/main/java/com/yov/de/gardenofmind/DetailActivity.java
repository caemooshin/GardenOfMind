package com.yov.de.gardenofmind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView taskDescView;
    private TextView taskWordView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        taskDescView = (TextView) findViewById(R.id.detailtaskDescription);
        taskWordView = (TextView) findViewById(R.id.detailtaskWord);
         String desc = getIntent().getExtras().getString("ARG_MOVIE");
         String word = getIntent().getExtras().getString("ARG_WORD");
        taskWordView.setText(word);
         taskDescView.setText(desc);
    }
}
