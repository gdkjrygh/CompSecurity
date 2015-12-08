// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.settings;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import com.walmart.android.app.moremenu.UrlSettingsManager;

public class RegistrySettingsActivity extends Activity
{
    public static class RegistrySettingsFragment extends PreferenceFragment
        implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
    {

        private UrlSettingsManager mUrlSettingsManager;

        public void onCreate(Bundle bundle)
        {
            super.onCreate(bundle);
            addPreferencesFromResource(0x7f070005);
            mUrlSettingsManager = new UrlSettingsManager(this, "registry_urls.txt", getString(0x7f090474));
            mUrlSettingsManager.addUrl("http://candid82.com:8000");
            mUrlSettingsManager.addUrl("https://www-e6.walmart.com/lists/registry-homepage");
            mUrlSettingsManager.addUrl("https://www.qa1-walmart.com/lists/registry-homepage");
            mUrlSettingsManager.addUrl("https://www.walmart.com/lists/registry-homepage");
            mUrlSettingsManager.addUrl("https://dev.walmart.com/lists");
            mUrlSettingsManager.addUrl("https://dl.dropboxusercontent.com/u/1276923/holiday_demo/index.html");
            mUrlSettingsManager.addUrl("https://172.29.217.228/lists/create-baby-registry");
            mUrlSettingsManager.addUrl("http://dev.walmart.com/lists/registry-homepage?_wml_bundle=1");
            mUrlSettingsManager.readUrls();
            mUrlSettingsManager.setDefaultUrl("https://www.walmart.com/lists/registry-homepage");
            bundle = (ListPreference)findPreference(getString(0x7f090472));
            bundle.setEntries(new CharSequence[] {
                "None", "Prod-B", "Prod-C", "Prod-D", "Prod-P"
            });
            bundle.setEntryValues(new CharSequence[] {
                "", "SENV=prodb", "SENV=prodc", "SENV=prodd", "SENV=prodp"
            });
        }

        public void onPause()
        {
            super.onPause();
            getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
        }

        public void onResume()
        {
            super.onResume();
            getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
        }

        public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
        {
            mUrlSettingsManager.onSharedPreferenceChanged(sharedpreferences, s);
        }

        public RegistrySettingsFragment()
        {
        }
    }


    public RegistrySettingsActivity()
    {
    }

    public static String getProdCookie(Context context)
    {
        PreferenceManager.getDefaultSharedPreferences(context);
        return "";
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getFragmentManager().beginTransaction().replace(0x1020002, new RegistrySettingsFragment()).commit();
    }
}
