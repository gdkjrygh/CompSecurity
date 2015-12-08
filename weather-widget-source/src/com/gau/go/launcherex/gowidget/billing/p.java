// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.billing;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import java.util.Locale;

public class p
{

    private static String a = "";

    public static String a(Context context)
    {
        if ("".equals(a) && context != null)
        {
            TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
            if (telephonymanager.getSimState() == 5 && telephonymanager.getSimCountryIso() != null)
            {
                a = telephonymanager.getSimCountryIso().toLowerCase();
            }
            if ("".equals(a))
            {
                context = context.getResources().getConfiguration().locale;
                if (context != null && context.getCountry() != null)
                {
                    a = context.getCountry().toLowerCase();
                } else
                if (Locale.getDefault().getCountry() != null)
                {
                    a = Locale.getDefault().getCountry().toLowerCase();
                } else
                {
                    a = "ZZ";
                }
            }
        }
        return a;
    }

}
