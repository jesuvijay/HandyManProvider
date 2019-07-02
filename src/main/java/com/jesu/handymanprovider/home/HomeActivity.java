package com.jesu.handymanprovider.home;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.jesu.handymanprovider.R;
import com.jesu.handymanprovider.home.fragments.AccountFragment;
import com.jesu.handymanprovider.home.fragments.ChatsFragment;
import com.jesu.handymanprovider.home.fragments.NotificationsFragment;
import com.jesu.handymanprovider.home.fragments.RequestsFragment;
import com.jesu.handymanprovider.home.fragments.ReviewFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.MenuItem;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
//    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_requests:
                    fragment = new RequestsFragment();
                    break;
                case R.id.navigation_notifications:
                    fragment = new NotificationsFragment();
                    break;
                case R.id.navigation_review:
                    fragment = new RequestsFragment();
                    break;
                case R.id.navigation_account:
                    fragment = new AccountFragment();
                    break;
                case R.id.navigation_chats:
                    fragment = new ChatsFragment();
                    break;

            }
            return loadFragment(fragment);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView navView = findViewById(R.id.nav_view);

//        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        loadFragment(new ReviewFragment());
    }

    private boolean loadFragment(Fragment fragment) {

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.home_framecontainer, fragment).commit();
            return true;
        }
        return false;
    }

}
