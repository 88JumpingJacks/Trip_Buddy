package com.theboss.jackli.tripbuddy;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.theboss.jackli.tripbuddy.model.LoginModel;
import com.theboss.jackli.tripbuddy.model.beans.User;
import com.theboss.jackli.tripbuddy.util.DataTestingViewInterfaece;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements DataTestingViewInterfaece
{
    @Bind(R.id.editText)
    EditText username;
    @Bind(R.id.editText2)
    EditText password;
    @OnClick(R.id.button)
    public void click(View view){
        loginModel.login(username.getText().toString(),password.getText().toString());
    }
    LoginModel loginModel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Firebase.setAndroidContext(getApplicationContext());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        ButterKnife.bind(this);
        this.loginModel=new LoginModel(this);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showTag(String text) {
        Toast.makeText(this,text,Toast.LENGTH_LONG).show();
    }
}
