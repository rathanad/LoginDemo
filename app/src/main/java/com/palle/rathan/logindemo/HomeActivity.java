package com.palle.rathan.logindemo;

import android.content.Intent;
import android.support.annotation.IntDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        textViewMessage = (TextView) findViewById(R.id.textView);

        Intent i = getIntent();
        Bundle b = i.getExtras();
        String s = b.getString("uname");
        String p = b.getString("uPassword");

        textViewMessage.setText("Welcome " + s);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean handled=false;

        if (item.getItemId()== R.id.action_setting){
            Toast.makeText(HomeActivity.this, "Setting Clicked", Toast.LENGTH_SHORT).show();
            handled =true;
        } else  if (item.getItemId()== R.id.action_quit){
            handled =true;
            finish();
        }else{

            if (getIntent().getBooleanExtra("EXIT", false)) {
                finish();
            }
        }

        return handled;



    }

}
