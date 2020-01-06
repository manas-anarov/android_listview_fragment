package com.example.samuray.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Myfrag1 extends Fragment {

    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String > aa;


    public Myfrag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_myfrag1, container, false);

        lv = v.findViewById(R.id.list1);

        al = new ArrayList<String>();
        aa = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_activated_1, al);
        lv.setAdapter(aa);

        al.add("Linux");
        al.add("Windows");
        al.add("Mac OS");
        al.add("Dos");

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s = al.get(i);
                MainActivity mnl = (MainActivity) getActivity();
                mnl.fl(s);
            }
        });

        return v;
    }

}
