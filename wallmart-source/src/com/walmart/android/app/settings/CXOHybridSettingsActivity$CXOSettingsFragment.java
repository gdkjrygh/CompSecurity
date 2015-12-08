// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.settings;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import com.walmart.android.app.moremenu.UrlSettingsManager;

// Referenced classes of package com.walmart.android.app.settings:
//            CXOHybridSettingsActivity

public static class  extends PreferenceFragment
    implements android.content.ener
{

    private UrlSettingsManager mUrlSettingsManager;

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(0x7f070003);
        mUrlSettingsManager = new UrlSettingsManager(this, "cart_urls.txt", getString(0x7f0900ad));
        mUrlSettingsManager.readUrls();
        mUrlSettingsManager.setDefaultUrl("");
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

    public ()
    {
    }
}
