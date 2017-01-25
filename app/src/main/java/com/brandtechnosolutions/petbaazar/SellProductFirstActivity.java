package com.brandtechnosolutions.petbaazar;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SellProductFirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_product_first);
    }

    public void sellerLogin(View view) {
        Snackbar.make(view, "This part is under development!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    public void createSellerAccount(View view) {
        Intent intent = new Intent(SellProductFirstActivity.this, SellerTypeEntryActivity.class);
        startActivity(intent);
    }

    public void forgotPassword(View view) {
        Snackbar.make(view, "This part is under development!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}