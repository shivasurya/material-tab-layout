package com.ivisionblog.apps.materialtabsexample;

import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.ivisionblog.apps.materialtabsexample.fragments.ContactsFragment;
import com.ivisionblog.apps.materialtabsexample.fragments.CustomersFragment;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mtoolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setTitle("Customer App");

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        addFragmentsToViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
    private void addFragmentsToViewPager(ViewPager viewPager) {
        TabsFragmentPagerAdapter adapter = new TabsFragmentPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CustomersFragment(), "Customers");
        adapter.addFragment(new ContactsFragment(), "Contacts");
        viewPager.setAdapter(adapter);
    }

}
