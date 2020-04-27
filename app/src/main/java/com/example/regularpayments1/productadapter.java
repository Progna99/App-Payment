package com.example.regularpayments1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class productadapter extends RecyclerView.Adapter<productadapter.ProductViewHolder>{
    private Context mCtx;
    private List<product>productList;

    public productadapter(Context mCtx,List<product> productList) {
        this.mCtx=mCtx;
        this.productList=productList;

    }


    @Override
    public productadapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_item, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull productadapter.ProductViewHolder holder, int position) {
        //holder.textViewTitle.setText(product.getName());

        product product = productList.get(position);

        holder.txt1.setText(product.getStr1());
        holder.txt2.setText(product.getStr2());
        holder.image.setImageDrawable(mCtx.getResources().getDrawable(product.getImg()));


    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView txt1,txt2;
        public ProductViewHolder(View itemView) {
            super(itemView);
            //  button=itemView.findViewById(Integer.parseInt("@+id/button"));
            image = itemView.findViewById(R.id.imageView3);
            txt1=itemView.findViewById(R.id.text1);
            txt2=itemView.findViewById(R.id.text2);


        }
    }
}