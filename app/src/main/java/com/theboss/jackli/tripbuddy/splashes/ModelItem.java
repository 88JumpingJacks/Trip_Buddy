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
        itemsList.add(new ModelItem("Donal Trump", R.drawable.donald));
        itemsList.add(new ModelItem("Besim  Mazhiqi", R.drawable.img_besim));
        itemsList.add(new ModelItem("Mark Bridger", R.drawable.img_mark));
        itemsList.add(new ModelItem("William Mevissem", R.drawable.img_william));
        itemsList.add(new ModelItem("Darren J Bennet", R.drawable.img_darren));
        return itemsList;
    }
}
