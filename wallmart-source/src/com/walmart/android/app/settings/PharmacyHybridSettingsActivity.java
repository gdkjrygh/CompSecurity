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
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import com.walmart.android.app.moremenu.UrlSettingsManager;

public class PharmacyHybridSettingsActivity extends Activity
{
    public static class PharmacySettingsFragment extends PreferenceFragment
        implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
    {

        private UrlSettingsManager mUrlSettingsManager;

        public void onCreate(Bundle bundle)
        {
            super.onCreate(bundle);
            addPreferencesFromResource(0x7f070004);
            mUrlSettingsManager = new UrlSettingsManager(this, "pharmacy_urls.txt", getString(0x7f09035e));
            mUrlSettingsManager.addUrl("http://candid82.com:8000");
            mUrlSettingsManager.addUrl("http://10.0.2.2:8080");
            mUrlSettingsManager.readUrls();
            mUrlSettingsManager.setDefaultUrl("http://candid82.com:8000");
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

        public PharmacySettingsFragment()
        {
        }
    }


    public static final String DEFAULT_URL = "http://candid82.com:8000";

    public PharmacyHybridSettingsActivity()
    {
    }

    public static boolean isHybridPharmacyEnabled(Context context)
    {
        PreferenceManager.getDefaultSharedPreferences(context);
        return false;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getFragmentManager().beginTransaction().replace(0x1020002, new PharmacySettingsFragment()).commit();
    }
}
