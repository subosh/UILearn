package com.example.subosh.uilearn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterUsers extends RecyclerView.Adapter<AdapterUsers.MyHolder> {
    Context context;
    //ArrayList<CustomerInformation> customerInformationArrayList;
    // CustomerInformation customerInformation=new CustomerInformation();
    public AdapterUsers(Context c) {
        context = c;
      //  customerInformationArrayList = p;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return new MyHolder(LayoutInflater.from(context).inflate(R.layout.orderslineitem,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
//myHolder.orderno.setText("Order No");
//        myHolder.ordernovalue.setText("12324564");
//        myHolder.channelname.setText("ZOMATO");
//        myHolder.locationname.setText("GFT SHOP");
//
//        myHolder.marketname.setText(customerInformationArrayList.get(i).getOwnername());
////myHolder.phone.setText(customerInformationArrayList.get(i).getOwnerphone());
////myHolder.date.setText(customerInformationArrayList.get(i).getDate());
//        String path=customerInformationArrayList.get(i).getDownloadpath();
//        final String emailview=customerInformationArrayList.get(i).getEmail();
//
//        Picasso.get().load(path)
//                .placeholder(R.drawable.ic_default_img)
//                .into(myHolder.profilepic);
//
////    catch (Exception e){
////Toast.makeText(Owners.this,e.getMessage(),Toast.LENGTH_LONG)
//        //  }
        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, "hello order", Toast.LENGTH_SHORT).show();
            }
        });








    }

    @Override
    public int getItemCount() {
        return 1;
    }

    class MyHolder extends RecyclerView.ViewHolder{
        //ImageView profilepic;
        TextView orderno;
        TextView ordernovalue;
        TextView channelname;
        TextView locationname;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
           orderno=(TextView) itemView.findViewById(R.id.order_no);
            channelname=(TextView) itemView.findViewById(R.id.channel_name);
            ordernovalue=(TextView)itemView.findViewById(R.id.order_no_value);
            locationname=(TextView) itemView.findViewById(R.id.location_name);

        }
    }
}

