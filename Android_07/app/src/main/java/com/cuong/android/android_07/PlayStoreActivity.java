package com.cuong.android.android_07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PlayStoreActivity extends AppCompatActivity {

    private RecyclerView mRecyclerViewPlayStore;
    private RecyclerView mRecyclerViewPlayStore2;
    private RecyclerView mRecyclerViewPlayStore3;
    private RecyclerView mRecyclerViewPlayStore4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_store);

        initRecyclerView();
        initRecyclerView2();
        initRecyclerView3();
        initRecyclerView4();
    }

    private void initRecyclerView() {
        mRecyclerViewPlayStore = (RecyclerView) findViewById(R.id.recycler_play_store);
        mRecyclerViewPlayStore.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<PlayStoreItem> items = new ArrayList<>();
        items.add(new PlayStoreItem(R.drawable.apple, "Apple"));
        items.add(new PlayStoreItem(R.drawable.badoo, "Badoo"));
        items.add(new PlayStoreItem(R.drawable.cardiogram, "Cardiogram"));
        items.add(new PlayStoreItem(R.drawable.dribbble, "Dribbble"));
        items.add(new PlayStoreItem(R.drawable.dropper, "Dropper"));
        items.add(new PlayStoreItem(R.drawable.facebook, "Facebook"));
        items.add(new PlayStoreItem(R.drawable.flickr, "Flickr"));
        items.add(new PlayStoreItem(R.drawable.frog, "Frog"));

        PlayStoreAdapter adapter = new PlayStoreAdapter(items);
        mRecyclerViewPlayStore.setAdapter(adapter);
    }

    private void initRecyclerView2() {
        mRecyclerViewPlayStore2 = (RecyclerView) findViewById(R.id.recycler_play_store2);
        mRecyclerViewPlayStore2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<PlayStoreItem> items = new ArrayList<>();
        items.add(new PlayStoreItem(R.drawable.play_button, "PlayButton"));
        items.add(new PlayStoreItem(R.drawable.google_plus, "Google Plus"));
        items.add(new PlayStoreItem(R.drawable.ice_cream, "Ice Cream"));
        items.add(new PlayStoreItem(R.drawable.instagram, "Instagram"));
        items.add(new PlayStoreItem(R.drawable.like, "Like"));
        items.add(new PlayStoreItem(R.drawable.search, "Search"));
        items.add(new PlayStoreItem(R.drawable.snapchat, "Snapchat"));
        items.add(new PlayStoreItem(R.drawable.pills, "Pills"));

        PlayStoreAdapter adapter = new PlayStoreAdapter(items);
        mRecyclerViewPlayStore2.setAdapter(adapter);
    }

    private void initRecyclerView3() {
        mRecyclerViewPlayStore3 = (RecyclerView) findViewById(R.id.recycler_play_store3);
        mRecyclerViewPlayStore3.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<PlayStoreItem> items = new ArrayList<>();
        items.add(new PlayStoreItem(R.drawable.internet, "Interner"));
        items.add(new PlayStoreItem(R.drawable.heart, "Heart"));
        items.add(new PlayStoreItem(R.drawable.nurse, "Nurse"));
        items.add(new PlayStoreItem(R.drawable.play_button, "Play Button"));
        items.add(new PlayStoreItem(R.drawable.twitter, "Twitter"));
        items.add(new PlayStoreItem(R.drawable.search, "Search"));
        items.add(new PlayStoreItem(R.drawable.skype, "Skype"));
        items.add(new PlayStoreItem(R.drawable.tooth, "Tooth"));

        PlayStoreAdapter adapter = new PlayStoreAdapter(items);
        mRecyclerViewPlayStore3.setAdapter(adapter);
    }

    private void initRecyclerView4() {
        mRecyclerViewPlayStore4 = (RecyclerView) findViewById(R.id.recycler_play_store4);
        mRecyclerViewPlayStore4.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<PlayStoreItem> items = new ArrayList<>();
        items.add(new PlayStoreItem(R.drawable.water, "Water"));
        items.add(new PlayStoreItem(R.drawable.whatsapp, "Whatsapp"));
        items.add(new PlayStoreItem(R.drawable.strawberry, "Strawberry"));
        items.add(new PlayStoreItem(R.drawable.youtube, "Youtube"));
        items.add(new PlayStoreItem(R.drawable.telegram, "Telegram"));
        items.add(new PlayStoreItem(R.drawable.line, "Line"));
        items.add(new PlayStoreItem(R.drawable.google_plus, "Google Plus"));
        items.add(new PlayStoreItem(R.drawable.stethoscope, "Stethoscope"));

        PlayStoreAdapter adapter = new PlayStoreAdapter(items);
        mRecyclerViewPlayStore4.setAdapter(adapter);
    }
}
