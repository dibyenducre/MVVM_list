package com.app.mvvmtestlist;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.app.mvvmtestlist.command.ButtonClickEvent;
import com.app.mvvmtestlist.databinding.ActivityMainBinding;
import com.app.mvvmtestlist.modelview.UserModelView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setUser(new UserModelView());
        activityMainBinding.setClick(new ButtonClickEvent() {
            @Override
            public void onCkickButton() {
                String getname = activityMainBinding.getUser().getUsername();
                Toast.makeText(MainActivity.this,"--"+getname,Toast.LENGTH_SHORT).show();
            }
        });


    }
}
