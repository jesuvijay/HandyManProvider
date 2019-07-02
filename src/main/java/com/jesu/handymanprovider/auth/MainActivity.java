package com.jesu.handymanprovider.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.jesu.handymanprovider.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startLogin();
    }

    private void startLogin() {
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.login_placeholder,new LoginFragment());
//        ft.addToBackStack(null);
        ft.commit();
    }

    @Override
    public boolean onSupportNavigateUp() {
        Toast.makeText(this, "tttt", Toast.LENGTH_SHORT).show();
        return super.onSupportNavigateUp();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                Toast.makeText(this, "called", Toast.LENGTH_SHORT).show();
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public void onBackPressed() {
        int count =getSupportFragmentManager().getBackStackEntryCount();
        if (count==0)
        super.onBackPressed();
    else
        getSupportFragmentManager().popBackStack();
    }
}
