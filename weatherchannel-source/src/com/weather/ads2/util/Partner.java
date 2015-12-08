// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.util;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.base.Strings;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;

public class Partner
{

    private String adPartner;

    public Partner()
    {
    }

    private static String loadAdPartner()
    {
        String s1 = TwcPrefs.getInstance().getString(com.weather.util.prefs.TwcPrefs.Keys.AD_PARTNER, "");
        String s = s1;
        if (Strings.isNullOrEmpty(s1))
        {
            String s2 = AbstractTwcApplication.getRootContext().getResources().getString(com.weather.ads2.R.string.AD_PARTNER);
            s = s2;
            if (Strings.isNullOrEmpty(s2))
            {
                s = "nl";
            }
            TwcPrefs.getInstance().putString(com.weather.util.prefs.TwcPrefs.Keys.AD_PARTNER, s);
        }
        return s;
    }

    public String getAdPartner()
    {
        if (adPartner == null)
        {
            adPartner = loadAdPartner();
        }
        return adPartner;
    }
}
