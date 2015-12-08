// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.datalib.c.f;
import com.google.android.apps.youtube.datalib.config.ApiaryHostSelection;
import com.google.android.apps.youtube.datalib.config.InnerTubeApiSelection;
import com.google.android.youtube.p;
import com.google.android.youtube.s;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb:
//            SettingsActivity, h, i, j, 
//            k, l

public class  extends PreferenceFragment
    implements android.content.geListener
{

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getPreferenceManager().setSharedPreferencesName("youtube");
        addPreferencesFromResource(s.b);
        getPreferenceManager().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
        bundle = (ListPreference)findPreference("gdata_hostname");
        if (bundle.getEntry() == null)
        {
            bundle.setValueIndex(0);
        }
        bundle.setSummary(getResources().getString(p.dT, new Object[] {
            bundle.getEntry().toString()
        }));
        SettingsActivity.a(ApiaryHostSelection.values(), ApiaryHostSelection.getDefaultIndex(), (ListPreference)findPreference("ApiaryHostSelection"), p.dR, getResources());
        SettingsActivity.a(InnerTubeApiSelection.values(), InnerTubeApiSelection.getDefaultIndex(), (ListPreference)findPreference("InnerTubeApiSelection"), p.dU, getResources());
        bundle.setOnPreferenceChangeListener(new h(this));
        findPreference("ShowOfflineHttpQueue").setOnPreferenceClickListener(new i(this));
        findPreference("OfflineResync").setOnPreferenceClickListener(new j(this));
        findPreference("OfflineAd").setOnPreferenceClickListener(new k(this));
        findPreference("OnlineAd").setOnPreferenceClickListener(new l(this));
    }

    public void onDestroy()
    {
        getPreferenceManager().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
        super.onDestroy();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s1)
    {
        if ("ApiaryHostSelection".equals(s1))
        {
            L.e("Invalidating DeviceAuth due to apiary host change");
            ((YouTubeApplication)getActivity().getApplication()).o().a();
        }
    }

    public ()
    {
    }
}
