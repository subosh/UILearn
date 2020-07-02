package com.example.subosh.uilearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
OrdersListFragment ordersListFragment;
OrdersDetailsFragment ordersDetailsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeFragment();
    }
    public void initializeFragment(){
        if (findViewById(R.id.portrait)!=null)
        {
            ordersListFragment= new OrdersListFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.orders_list_portrait,
                    ordersListFragment).commit();
        }
        else if (findViewById(R.id.landscape) != null) {
            ordersDetailsFragment=new  OrdersDetailsFragment();
            ordersListFragment= new OrdersListFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.orders_list_landscape,
                    ordersListFragment).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.order_details_landscape,
                    ordersDetailsFragment).commit();
        }
    }
}
