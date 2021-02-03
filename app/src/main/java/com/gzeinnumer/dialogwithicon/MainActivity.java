package com.gzeinnumer.dialogwithicon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testDummy();
    }

    private void testDummy() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        Fragment previous = getSupportFragmentManager().findFragmentByTag(DialogIcon.TAG);
        if (previous != null) {
            transaction.remove(previous);
        }
        DialogIcon dialog = DialogIcon.newInstance();
        dialog.show(transaction, DialogIcon.TAG);
    }
}