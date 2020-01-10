package com.example.pizzaswap;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class StoresFragment extends ListFragment {


    public StoresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this.getContext(),
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.stores)
        );
        setListAdapter(adapter);

        return super.onCreateView(inflater,container,savedInstanceState);
    }

}
