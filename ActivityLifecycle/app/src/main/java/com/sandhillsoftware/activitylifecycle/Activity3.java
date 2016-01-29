package com.sandhillsoftware.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Boolean handled = true;

        switch (item.getItemId()) {
            case R.id.action_showToast:
                onMenuClickShowToast(item);
                break;
            case R.id.action_close:
                onMenuClickClose(item);
                break;
            default:
                handled = super.onOptionsItemSelected(item);
                break;
        }

        return handled;
    }

    private void onMenuClickClose(MenuItem item) {
        finish();
    }

    private void onMenuClickShowToast(MenuItem item) {
        Toast t = Toast.makeText(this, getString(R.string.thisIsAToastText), Toast.LENGTH_LONG);
        t.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }
}
