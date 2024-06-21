package com.example.myapplication;

import android.provider.DocumentsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


 class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder>
{
    ArrayList<MyModel.Article> list;

    public NewsAdapter(ArrayList<MyModel.Article> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view= LayoutInflater.from(parent.getContext())
              .inflate(R.layout.recyler_item_list, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.ViewHolder holder, int position) {
        holder.textView.setText(list.get(position).content);



    }

    @Override
    public int getItemCount()
    {

        return list.size();
    }




 class ViewHolder extends  RecyclerView.ViewHolder{
        TextView textView;
        public ViewHolder(@NonNull View itemview){
            super(itemview);
            textView=itemview.findViewById(R.id.textView);


        }
}
}


