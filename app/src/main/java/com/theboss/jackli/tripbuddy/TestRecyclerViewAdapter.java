package com.theboss.jackli.tripbuddy;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by yucunli on 2016-02-21.
 */
public class TestRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Object> contents;
    Context context;
    int type;

    static final int TYPE_HEADER = 0;
    static final int TYPE_CELL = 1;

    public TestRecyclerViewAdapter(List<Object> contents, Context context, int type) {
        this.contents = contents;
        this.context = context;
        this.type = type;
    }

    @Override
    public int getItemViewType(int position) {
        switch (position) {
            default:
                return TYPE_CELL;
        }
    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;

        switch (viewType) {
            case TYPE_HEADER: {
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.list_item_card_small, parent, false);
                /* un add on click listener*/
                return new RecyclerView.ViewHolder(view) {
                };
            }
            case TYPE_CELL: {
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.list_item_card_small, parent, false);
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ImageView checkBox=(ImageView)v.findViewById(R.id.checkbox_icon);
                        if(checkBox.getTag().equals("unchecked")){
                            checkBox.setImageResource(R.drawable.like);
                            checkBox.setTag("checked");
                        }else{
                            checkBox.setImageResource(R.drawable.unlike);
                            checkBox.setTag("unchecked");
                        }
                    }
                });

                ImageView iv = (ImageView) view.findViewById(R.id.img_background);

                TypedArray images;
                int choice;
                switch (type) {
                    case 0:
                        images = context.getResources().obtainTypedArray(R.array.landmarks);
                        choice = (int) (Math.random() * images.length());
                        iv.setImageResource(images.getResourceId(choice, R.drawable.landmark1));
                        images.recycle();
                        break;
                    case 1:
                        images = context.getResources().obtainTypedArray(R.array.sight_tour);
                        choice = (int) (Math.random() * images.length());
                        iv.setImageResource(images.getResourceId(choice, R.drawable.sight_tour1));
                        images.recycle();
                        break;
                    case 2:
                        images = context.getResources().obtainTypedArray(R.array.night_life);
                        choice = (int) (Math.random() * images.length());
                        iv.setImageResource(images.getResourceId(choice, R.drawable.night_life1));
                        images.recycle();
                        break;
                    case 3:
                        images = context.getResources().obtainTypedArray(R.array.food_drink);
                        choice = (int) (Math.random() * images.length());
                        iv.setImageResource(images.getResourceId(choice, R.drawable.food_drink1));
                        images.recycle();
                        break;
                    default:
                        images = context.getResources().obtainTypedArray(R.array.landmarks);
                        choice = (int) (Math.random() * images.length());
                        iv.setImageResource(images.getResourceId(choice, R.drawable.landmark1));
                        images.recycle();
                        break;
                }

                return new RecyclerView.ViewHolder(view) {

                };
            }
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case TYPE_HEADER:
                break;
            case TYPE_CELL:
                break;
        }
    }


}
