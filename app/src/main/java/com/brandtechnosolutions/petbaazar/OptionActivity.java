package com.brandtechnosolutions.petbaazar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class OptionActivity extends AppCompatActivity {

    private boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton find = (FloatingActionButton) findViewById(R.id.sell_menu_id);
        FloatingActionButton post = (FloatingActionButton) findViewById(R.id.post_ad_menu_id);
        FloatingActionButton sell = (FloatingActionButton) findViewById(R.id.buy_menu_id);
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Please mention category!", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent intent = new Intent(OptionActivity.this, WebActivity.class);
                intent.putExtra("url", "http://brandtechnosolutions.com/bts/petbaazar/index.php?route=product/search");
                startActivity(intent);
            }
        });
        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OptionActivity.this, SellProductFirstActivity.class);
                startActivity(intent);
                Snackbar.make(view, "Please select options!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OptionActivity.this, TakeAdInfoActivity.class);
                startActivity(intent);
                Snackbar.make(view, "Want to capture?", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
//                super.onBackPressed();
            finishAffinity();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();
// handler min sdk 21
        new CountDownTimer(2300, 100) {
            @Override
            public void onTick(long l) {
            }

            @Override
            public void onFinish() {
                doubleBackToExitPressedOnce = false;
            }
        }.start();
    }
}
