package com.cuong.android.android_07;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 23/3/2017.
 */

public class PlayStoreAdapter extends RecyclerView.Adapter<PlayStoreAdapter.ViewHolder> {

    private List<PlayStoreItem> items;

    public PlayStoreAdapter(List<PlayStoreItem> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_play_store, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        PlayStoreItem item = items.get(position);
        holder.bindData(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageViewThumb;
        private TextView mTextViewTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            mImageViewThumb = (ImageView) itemView.findViewById(R.id.image_view_thumb);
            mTextViewTitle = (TextView) itemView.findViewById(R.id.text_view_title);
        }

        public ImageView getImageViewThumb() {
            return mImageViewThumb;
        }

        public void setImageViewThumb(ImageView imageViewThumb) {
            mImageViewThumb = imageViewThumb;
        }

        public TextView getTextViewTitle() {
            return mTextViewTitle;
        }

        public void setTextViewTitle(TextView textViewTitle) {
            mTextViewTitle = textViewTitle;
        }
        public void bindData(PlayStoreItem item) {
            mImageViewThumb.setImageResource(item.getImageRes());
            mTextViewTitle.setText(item.getTitle());
        }
    }
}
