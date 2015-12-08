// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.content.res.Resources;
import android.preference.Preference;

final class g
    implements android.preference.Preference.OnPreferenceChangeListener
{

    final Resources a;
    final int b;

    g(Resources resources, int i)
    {
        a = resources;
        b = i;
        super();
    }

    public final boolean onPreferenceChange(Preference preference, Object obj)
    {
        preference.setSummary(a.getString(b, new Object[] {
            obj.toString()
        }));
        return true;
    }
}
