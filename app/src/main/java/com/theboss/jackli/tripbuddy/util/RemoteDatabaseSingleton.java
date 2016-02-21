package com.theboss.jackli.tripbuddy.util;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.theboss.jackli.tripbuddy.model.beans.CityTrip;
import com.theboss.jackli.tripbuddy.model.beans.Sight;
import com.theboss.jackli.tripbuddy.model.beans.User;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by jianhuizhu on 2016-02-19.
 */
public class RemoteDatabaseSingleton {

    private RemoteDatabaseSingleton() {

    }

    private static RemoteDatabaseSingleton remoteDB = null;

    public static RemoteDatabaseSingleton getInstance() {
        if (remoteDB == null) {
            RemoteDatabaseSingleton.remoteDB = new RemoteDatabaseSingleton();
        }
        return remoteDB;
    }
    public Observable<User> loginUser(final User tobeAuthUser){
        return Observable.create(new Observable.OnSubscribe<User>() {
            @Override
            public void call(final Subscriber<? super User> subscriber) {
                Firebase ref = new Firebase(Constant.urlUser);
                ref.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for (DataSnapshot userSnapshot : dataSnapshot.getChildren()) {
                            User user = userSnapshot.getValue(User.class);
                            if (tobeAuthUser.getEmail().equals( user.getEmail()) && tobeAuthUser.getPassword() .equals( user.getPassword())) {
                                subscriber.onNext(user);
                                subscriber.onCompleted();
                            }
                        }
                        subscriber.onNext(null);
                        subscriber.onCompleted();
                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {

                    }
                });
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io());
    }
    public Observable<User> registerUser(final User user){
        return Observable.create(new Observable.OnSubscribe<User>() {
            @Override
            public void call(final Subscriber<? super User> subscriber) {

                Firebase ref=new Firebase(Constant.urlUser);
                ref.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.hasChild(user.getFirstname())) {
                            subscriber.onNext(null);
                            subscriber.onCompleted();
                        } else {
                            Firebase cur = new Firebase(Constant.urlUser).child(user.getFirstname());
                            cur.setValue(user);
                            subscriber.onNext(user);
                            subscriber.onCompleted();
                        }
                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {

                    }
                });

            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io());
    }
    public void insertImage(String url,int id){
        Firebase ref=new Firebase(Constant.urlImage);
        ref.child(String.valueOf(id)).setValue(url);
    }
    public void addCityTrip(String userID,long time,String city,List<Integer> sightID){
        Firebase ref=new Firebase(Constant.urlUser).child(userID).child("CityTrips").push();
        CityTrip cityTrip=new CityTrip();
        cityTrip.setCityName(city);
        cityTrip.setTime(time);
        ref.setValue(cityTrip);
        Firebase sightRef=ref.child("Sights");
        for(Integer id:sightID){
            Sight sight=new Sight();
            sight.setId(id);
            sightRef.push().setValue(sight);
        }
    }

}
