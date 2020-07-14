package in.lavit.shareddemo;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class MySettingFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preference,rootKey);
    }
}
