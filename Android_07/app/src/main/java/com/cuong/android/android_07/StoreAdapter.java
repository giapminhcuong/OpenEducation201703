package com.cuong.android.android_07;

import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 21/3/2017.
 */

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.ViewHolder> {
    private List<AppItem> mAppItems;

    public StoreAdapter(List<AppItem> appItems) {
        mAppItems = appItems;
    }

    public StoreAdapter() {
        mAppItems = new ArrayList<>();
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo - Nhắn gữi yêu đương"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo - Nhắn gữi yêu đương"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo - Nhắn gữi yêu đương"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo - Nhắn gữi yêu đương"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo - Nhắn gữi yêu đương"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo - Nhắn gữi yêu đương"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo - Nhắn gữi yêu đương"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo - Nhắn gữi yêu đương"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo - Nhắn gữi yêu đương"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo - Nhắn gữi yêu đương"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo - Nhắn gữi yêu đương"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo - Nhắn gữi yêu đương"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo - Nhắn gữi yêu đương"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo - Nhắn gữi yêu đương"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo - Nhắn gữi yêu đương"));
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_store, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        AppItem item = mAppItems.get(position);
        holder.bindData(item);
    }

    @Override
    public int getItemCount() {
        return mAppItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView tv;

        public ViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.image_avatar);
            tv = (TextView) itemView.findViewById(R.id.text_title);
        }

        public void bindData(AppItem item) {
            tv.setText(item.getTitle());
            img.setImageResource(item.getImageResource());
        }
    }
}
