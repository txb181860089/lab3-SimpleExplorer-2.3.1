package com.dnielfe.manager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.util.Log;
import com.dnielfe.manager.AbstractBrowserActivity;

public class MoreDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_details);
        Button OK = (Button)findViewById(R.id.button10);
        OK.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("tag","onclick");
                Intent intent = new Intent(MoreDetails.this, BrowserActivity.class);
                startActivity(intent);
            ;
    }}));
        Button CANCEL = (Button)findViewById(R.id.button11);
        OK.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("tag","onclick");
                Intent intent = new Intent(MoreDetails.this, BrowserActivity.class);
                startActivity(intent);
                ;
            }}));



}}