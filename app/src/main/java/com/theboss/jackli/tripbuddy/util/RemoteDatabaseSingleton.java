package com.theboss.jackli.tripbuddy.util;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.theboss.jackli.tripbuddy.model.beans.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

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
                Firebase ref = new Firebase(Constant.urlRoot);
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
        }).observeOn(Schedulers.io()).subscribeOn(AndroidSchedulers.mainThread());
    }
    public Observable<User> registerUser(final User user){
        return Observable.create(new Observable.OnSubscribe<User>() {
            @Override
            public void call(Subscriber<? super User> subscriber) {
                Firebase ref=new Firebase(Constant.urlRoot).child(user.getEmail());
                ref.setValue(user);
                subscriber.onNext(user);
                subscriber.onCompleted();
            }
        }).observeOn(Schedulers.io()).subscribeOn(AndroidSchedulers.mainThread());
    }

}
