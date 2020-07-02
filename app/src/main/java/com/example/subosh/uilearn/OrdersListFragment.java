package com.example.subosh.uilearn;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Spinner;

public class OrdersListFragment extends Fragment implements AdapterView.OnItemSelectedListener{
View view;
AdapterUsers adapterUsers;
String data[]={"1234567","Zomato","GFTSHOP","23:34:45:56","230.00"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
          view = inflater.inflate(R.layout.orderslistfragment, container, false);
         initializeview();
         return  view;
    }
    public void initializeview() {
//        orderslist = view.findViewById(R.id.checkorderslist);
        Spinner orderspinner=view.findViewById(R.id.online_orders_spinner);
        orderspinner.setOnItemSelectedListener(this);



        // orderslist.setOnItemClickListener(this);
       /* orderslist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
        RecyclerView orderslist=view.findViewById(R.id.orders_list);
        adapterUsers=new AdapterUsers(getContext());

        orderslist.setLayoutManager(new LinearLayoutManager(getContext()));
        orderslist.setAdapter(adapterUsers);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
