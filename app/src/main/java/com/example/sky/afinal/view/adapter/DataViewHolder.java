package com.example.sky.afinal.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.sky.afinal.R;

/**
 * Created by Sky on 23/01/2017.
 */

public class DataViewHolder extends RecyclerView.ViewHolder {
    private ImageButton imgIcon;
    private TextView tvTitle;
    private TextView tvDiscription;

    public DataViewHolder(View itemView) {
        super(itemView);
        tvTitle = (TextView)itemView.findViewById(R.id.title_textView);
        tvDiscription = (TextView) itemView.findViewById(R.id.discrip_textView);
        imgIcon = (ImageButton) itemView.findViewById(R.id.icon_imgButton);
    }

    public ImageButton getImgIcon() {

        return imgIcon;
    }

    public void setImgIcon(ImageButton imgIcon) {
        this.imgIcon = imgIcon;
    }

    public TextView getTvTitle() {

        return tvTitle;
    }

    public void setTvTitle(TextView tvTitle) {

        this.tvTitle = tvTitle;
    }

    public TextView getTvDiscription() {

        return tvDiscription;
    }

    public void setTvDiscription(TextView tvDiscription) {

        this.tvDiscription = tvDiscription;
    }
}