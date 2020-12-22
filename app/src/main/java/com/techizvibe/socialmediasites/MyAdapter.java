package com.techizvibe.socialmediasites;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context mContext;
    String mStrSites[], mStrDesc[];
    int mImgLogos[];

    public MyAdapter(Context context, String strSites[], String strDesc[], int imgLogos[]) {
        mContext = context;
        mStrSites = strSites;
        mStrDesc = strDesc;
        mImgLogos = imgLogos;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.my_row_item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
       holder.mTextSites.setText(mStrSites[position]);
       holder.mTextDesc.setText(mStrDesc[position]);
       holder.mImgLogo.setImageResource(mImgLogos[position]);
    }

    @Override
    public int getItemCount() {
        return mStrSites.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mTextSites, mTextDesc;
        ImageView mImgLogo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextSites = itemView.findViewById(R.id.tvSocialSites);
            mTextDesc = itemView.findViewById(R.id.tvDescription);
            mImgLogo = itemView.findViewById(R.id.imgLogos);
        }
    }
}
