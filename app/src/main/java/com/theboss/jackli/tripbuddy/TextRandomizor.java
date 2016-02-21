package com.theboss.jackli.tripbuddy;

import java.util.ArrayList;
import java.util.Random;
import com.theboss.jackli.tripbuddy.model.pojo.*;
/**
 * Created by jianhuizhu on 2016-02-21.
 */
public  final class TextRandomizor {
    private static TextRandomizor instance=null;

    private static ArrayList<FakeUser> fakeUsers=new ArrayList<>();
    public synchronized static TextRandomizor getInstance(){
        if(instance==null){
            return instance=new TextRandomizor();
        }
        return instance;
    }
    private TextRandomizor(){
        FakeUser u1=new FakeUser("Donald Trump","I like to climb towers in city, hope you join me","like people energetic");
        FakeUser u2=new FakeUser("Homer Simpson","I like to get the experience with sea","Like travel to meet friends");
        FakeUser u3=new FakeUser("Mystery Man","I love to discover castle","like people with love to animal");
        FakeUser u4=new FakeUser("Justin Bieber","I like good hotel","like people with love to building");
        FakeUser u5=new FakeUser("Ralph","I enjoy with nature and wild animals","hope you like my style");
        TextRandomizor.fakeUsers.add(u1);
        TextRandomizor.fakeUsers.add(u2);
        TextRandomizor.fakeUsers.add(u3);
        TextRandomizor.fakeUsers.add(u4);
        TextRandomizor.fakeUsers.add(u5);
    }
    public FakeUser randomPicker(){
        Random random=new Random(System.currentTimeMillis());
        return fakeUsers.get(Math.abs(random.nextInt()%fakeUsers.size()));
    }
}
