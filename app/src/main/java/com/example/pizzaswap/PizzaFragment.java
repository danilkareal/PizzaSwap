package com.example.pizzaswap;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class PizzaFragment extends Fragment {


    public PizzaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView pizzaRecycler =(RecyclerView) inflater.inflate(
                R.layout.fragment_pizza,container,false
        );
        String[] pizzaNames =new String[Pizza.pizzas.length];
        for(int i=0;i<pizzaNames.length;i++){
            pizzaNames[i] = Pizza.pizzas[i].getName();
        }

        int[] pizzaImages = new int[Pizza.pizzas.length];
        for(int i=0;i<pizzaImages.length;i++){
            pizzaImages[i] = Pizza.pizzas[i].getResourseImageId();
        }
        CaptionedImagesAdapter captionedImagesAdapter = new CaptionedImagesAdapter(pizzaNames,pizzaImages);
        pizzaRecycler.setAdapter(captionedImagesAdapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        pizzaRecycler.setLayoutManager(layoutManager);

        captionedImagesAdapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(),PizzaDetailActivity.class);
                intent.putExtra(PizzaDetailActivity.EXTRA_PIZZA_ID,position);
                getActivity().startActivity(intent);
            }
        });

        return pizzaRecycler;
    }

}
