package com.theboss.jackli.tripbuddy.splashes;

import com.theboss.jackli.tripbuddy.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saulmm on 15/02/16.
 */
public class ModelItem {
    private String author;
    private int imgId;

    public ModelItem(String author, int imgId) {
        this.author = author;
        this.imgId = imgId;
    }

    public int getImgId() {
        return imgId;
    }

    public String getAuthor() {
        return author;
    }

    public static List<ModelItem> getFakeItems() {
        ArrayList<ModelItem> itemsList = new ArrayList<>();
        itemsList.add(new ModelItem("Donald Trump", R.drawable.donald));
        itemsList.add(new ModelItem("Homer Simpson", R.drawable.homer_excited));
        itemsList.add(new ModelItem("Mystery Man", R.drawable.question_mark_man));
        itemsList.add(new ModelItem("Justin Bieber", R.drawable.justin_bieber));
        itemsList.add(new ModelItem("Ralph", R.drawable.ralph));
        return itemsList;
    }
}
