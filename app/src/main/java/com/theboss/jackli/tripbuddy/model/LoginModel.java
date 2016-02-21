package com.theboss.jackli.tripbuddy.model;

import com.theboss.jackli.tripbuddy.model.beans.User;
import com.theboss.jackli.tripbuddy.util.DataTestingViewInterfaece;
import com.theboss.jackli.tripbuddy.util.RemoteDatabaseSingleton;

import java.util.InputMismatchException;
import java.util.List;

import rx.functions.Action1;

/**
 * Created by jianhuizhu on 2016-02-20.
 */
public class LoginModel {
    private DataTestingViewInterfaece viewHandle;
    public LoginModel(final DataTestingViewInterfaece viewHandle){
        this.viewHandle=viewHandle;
    }
    public void createDummyUsers(){

        User user1=new User();
        User user2=new User();

        user1.setEmail("fishsb19@gmail.com");
        user1.setPassword("12345678");
        user1.setFirstname("Jianhui");
        user1.setLastname("zhu");

        user2.setEmail("jianhuizhu1987@gmail.com");
        user2.setFirstname("yucun");
        user2.setLastname("li");
        user2.setPassword("12345678");

        RemoteDatabaseSingleton.getInstance().registerUser(user1).subscribe(new Action1<User>() {
            @Override
            public void call(User user) {
              //viewHandle.showTag(user.getEmail());
            }
        });
        RemoteDatabaseSingleton.getInstance().registerUser(user2).subscribe(new Action1<User>() {
            @Override
            public void call(User user) {
                //viewHandle.showTag(user);
            }
        });
    }
    public void login(String username,String password){
        User tobeAuth=new User();
        tobeAuth.setEmail(username);
        tobeAuth.setPassword(password);
        RemoteDatabaseSingleton.getInstance().loginUser(tobeAuth).subscribe(new Action1<User>() {
            @Override
            public void call(User user) {
                if(user==null){
                    viewHandle.showTag("user not exist");
                }else{
                    viewHandle.showTag("user loggedIn");
                }
            }
        });
    }
    public void insertImage(String url,int id){
        RemoteDatabaseSingleton.getInstance().insertImage(url, id);
    }
    public void addCityTrip(String uID,long time,String city,List<Integer>sightList){
        RemoteDatabaseSingleton.getInstance().addCityTrip(uID,time,city,sightList);
    }
}
