package com.gzeinnumer.dialogwithicon;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showDialog();
    }

    private void showDialog() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        Fragment previous = getSupportFragmentManager().findFragmentByTag(DialogIcon.TAG);
        if (previous != null) {
            transaction.remove(previous);
        }
        DialogIcon dialog = DialogIcon.newInstance();
        dialog.show(transaction, DialogIcon.TAG);
    }
}