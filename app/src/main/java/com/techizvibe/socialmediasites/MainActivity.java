package com.techizvibe.socialmediasites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView rvSocialSites;
String strSocialSites[],strDescription[];
RecyclerView.LayoutManager mLayoutManager;
int imgLogos[]={R.drawable.youtube,
        R.drawable.facebook,
        R.drawable.instagram,
        R.drawable.whatsapp,
        R.drawable.telegram,
        R.drawable.skype,
        R.drawable.twitter,
        R.drawable.snapchat,
        R.drawable.pinterest,
        R.drawable.linkedin
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSocialSites=findViewById(R.id.rv_social_sites);
        strSocialSites=getResources().getStringArray(R.array.social_sites);
        strDescription=getResources().getStringArray(R.array.description);

        MyAdapter mAdapter=new MyAdapter(this,strSocialSites,strDescription,imgLogos);
        rvSocialSites.setAdapter(mAdapter);

        mLayoutManager=new LinearLayoutManager(this);
        rvSocialSites.setLayoutManager(mLayoutManager);

        rvSocialSites.setHasFixedSize(true);
    }
}