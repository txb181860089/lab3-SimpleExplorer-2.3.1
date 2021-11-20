package com.dnielfe.manager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.dnielfe.manager.settings.Settings;
import com.dnielfe.manager.settings.SettingsActivity;

public class JumpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump);
        Button jump1 = (Button)findViewById(R.id.button10);
        jump1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.v("tag","onclick");
                Intent intent = new Intent(JumpActivity.this, BrowserActivity.class);
                startActivity(intent);

    }}));
        Button jump2 = (Button)findViewById(R.id.button11);
        jump2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.v("tag","onclick");
                Intent intent = new Intent(JumpActivity.this, PickerActivity.class);
                startActivity(intent);
            }}));

        Button jump3 = (Button)findViewById(R.id.button12);
        jump3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.v("tag","onclick");
                Intent intent = new Intent(JumpActivity.this, SearchActivity.class);
                startActivity(intent);
            }}));
        Button jump4 = (Button)findViewById(R.id.button13);
        jump4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.v("tag","onclick");
                Intent intent = new Intent(JumpActivity.this, SettingsActivity.class);
                startActivity(intent);
            }}));
        Button jump5 = (Button)findViewById(R.id.button14);
        jump5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.v("tag","onclick");
                Intent intent = new Intent(JumpActivity.this,  BrowserActivity.class);
                startActivity(intent);
            }}));

}}