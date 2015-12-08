// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.content.res.Resources;
import android.preference.Preference;
import com.google.android.youtube.p;

final class h
    implements android.preference.Preference.OnPreferenceChangeListener
{

    final SettingsActivity.DeveloperPrefsFragment a;

    h(SettingsActivity.DeveloperPrefsFragment developerprefsfragment)
    {
        a = developerprefsfragment;
        super();
    }

    public final boolean onPreferenceChange(Preference preference, Object obj)
    {
        preference.setSummary(a.getResources().getString(p.dT, new Object[] {
            obj.toString()
        }));
        return true;
    }
}
