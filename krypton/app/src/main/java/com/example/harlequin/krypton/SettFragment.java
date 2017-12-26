package com.example.harlequin.krypton;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by harlequin on 22/12/17.
 */
//PREFERENCES
public class SettFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.prefvisu);
    }
}
