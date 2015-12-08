// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import com.google.android.apps.youtube.core.LicensesActivity;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.core.utils.e;
import com.google.android.apps.youtube.core.utils.m;
import com.google.android.youtube.p;
import com.google.android.youtube.s;

public class  extends PreferenceFragment
{

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getPreferenceManager().setSharedPreferencesName("youtube");
        addPreferencesFromResource(s.a);
        findPreference("version").setSummary(PackageUtil.f(getActivity()));
    }

    public boolean onPreferenceTreeClick(PreferenceScreen preferencescreen, Preference preference)
    {
        String s1;
        android.app.Activity activity;
        s1 = preference.getKey();
        activity = getActivity();
        if (!"mobile_terms".equals(s1)) goto _L2; else goto _L1
_L1:
        m.a(activity, Uri.parse(getString(p.gA)));
_L4:
        return super.onPreferenceTreeClick(preferencescreen, preference);
_L2:
        if ("youtube_terms".equals(s1))
        {
            m.a(activity, Uri.parse(getString(p.gD)));
        } else
        if ("mobile_privacy".equals(s1))
        {
            m.a(activity, Uri.parse(getString(p.gz)));
        } else
        if ("youtube_privacy".equals(s1))
        {
            m.a(activity, Uri.parse(getString(p.gC)));
        } else
        if ("open_source_licenses".equals(s1))
        {
            startActivity(LicensesActivity.a(activity));
        } else
        if ("feedback".equals(s1))
        {
            if (e.a(activity))
            {
                e.a(activity);
            } else
            {
                m.a(activity, Uri.parse(m.a(activity, PackageUtil.f(activity), p.gx)));
            }
        } else
        if ("help".equals(s1))
        {
            m.a(activity, Uri.parse(m.a(activity, p.gy)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public ()
    {
    }
}
