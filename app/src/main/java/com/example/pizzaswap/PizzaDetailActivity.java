package com.example.pizzaswap;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaDetailActivity extends AppCompatActivity {

    public static final String EXTRA_PIZZA_ID = "pizzaId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Integer pizzaId = (Integer) getIntent().getExtras().get(EXTRA_PIZZA_ID);
        if (pizzaId != null) {
            Pizza pizza = Pizza.pizzas[pizzaId];

            if (actionBar != null) {
                actionBar.setTitle(pizza.getName());
            }

            TextView pizzaDescriptionView = findViewById(R.id.pizza_description);
            pizzaDescriptionView.setText(pizza.getDescription());

            int PizzaImage = pizza.getResourseImageId();
            ImageView imageView = findViewById(R.id.image_pizza);
            imageView.setImageDrawable(ContextCompat.getDrawable(this, PizzaImage));
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
