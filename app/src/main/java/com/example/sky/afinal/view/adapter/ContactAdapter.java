package com.example.sky.afinal.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sky.afinal.R;
import com.example.sky.afinal.model.News;

import java.util.List;

/**
 * Created by Sky on 23/01/2017.
 */

public class ContactAdapter extends RecyclerView.Adapter<DataViewHolder> {
    private List<News> listNew ;
    private Context context;

    public ContactAdapter(Context context, List<News> listNew) {
        this.context = context;
        this.listNew = listNew;
    }

    @Override
    public int getItemCount() {
        return listNew == null ? 0 : listNew.size();
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact_listview,parent,false);

        // Kiểm tra item view type, nếu là 1 thì inflate layout item_names.xml, 2 thì sử dụng item_names_female.

        return new DataViewHolder(itemView);
    }

    @Override
    public int getItemViewType(int position) {
        // Cài đặt kiểu item view type cho từng phần tử, nếu có giới tính là nam thì trả về 1, nữ thì trả về 2.
return 0;
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        String title =listNew.get(position).getTitle();
        String discrip =listNew.get(position).getDiscription();
        int image =listNew.get(position).getImage();
        holder.getTvTitle().setText(title);
        holder.getTvDiscription().setText(discrip);
        holder.getImgIcon().setImageResource(image);
    }

}
