// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.app.Activity;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import com.google.android.youtube.s;

public class  extends PreferenceFragment
{

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getPreferenceManager().setSharedPreferencesName("youtube");
        addPreferencesFromResource(s.h);
    }

    public boolean onPreferenceTreeClick(PreferenceScreen preferencescreen, Preference preference)
    {
        String s1 = preference.getKey();
        if ("clear_history".equals(s1))
        {
            getActivity().showDialog(1002);
            return true;
        }
        if ("safety_mode".equals(s1))
        {
            getActivity().showDialog(1014);
            return true;
        } else
        {
            return super.onPreferenceTreeClick(preferencescreen, preference);
        }
    }

    public ()
    {
    }
}
