package com.example.regularpayments1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class cardadapter extends RecyclerView.Adapter<cardadapter.ProductViewHolder> {

    private Context mCtx2;
    private List<cardproduct> pdlist;
    private onItemClickListener mlistener;

    public interface onItemClickListener{
        void onItemClick(int posi);
    }

    public void setOnItemClickListener(onItemClickListener listener){
        mlistener = listener;
    }

    public cardadapter(Context mCtx2, List<cardproduct> pdlist) {
        this.mCtx2=mCtx2;
        this.pdlist=pdlist;
    }



    @Override
    public cardadapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater2 = LayoutInflater.from(mCtx2);
        View view2 = inflater2.inflate(R.layout.cardview, null);
        return new cardadapter.ProductViewHolder(view2,mlistener);
    }

    @Override
    public void onBindViewHolder(@NonNull cardadapter.ProductViewHolder holder2, int position) {

        cardproduct cp = pdlist.get(position);

        holder2.tvname.setText(cp.getName());
        holder2.tvmoney.setText((cp.getMoney()));
        holder2.tvpayment.setText(cp.getPayment());
        holder2.tvweek.setText(cp.getWeek());
        holder2.logo.setImageDrawable(mCtx2.getResources().getDrawable(cp.getImage()));


    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView tvname, tvmoney,tvweek,tvpayment;
        ImageView logo;

        public ProductViewHolder(View view2 , final onItemClickListener listener) {
            super(view2);
            tvname = view2.findViewById(R.id.paymentText);
            tvmoney = view2.findViewById(R.id.weeklyText);
            tvweek = view2.findViewById(R.id.textView);
            tvpayment =  view2.findViewById(R.id.textView2);
            logo = view2.findViewById(R.id.imageIcon);

            view2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(mCtx2, PopupActivity.class);
                    mCtx2.startActivity(i);
                }
            });
        }
    }
}
