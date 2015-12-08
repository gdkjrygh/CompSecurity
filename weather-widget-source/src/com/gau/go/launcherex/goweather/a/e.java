// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.a;

import android.text.TextUtils;

public class e
{

    public static double[] a(String s)
    {
        double ad[] = new double[2];
        double[] _tmp = ad;
        ad[0] = -10000D;
        ad[1] = -10000D;
        if (!TextUtils.isEmpty(s) && s.contains("#"))
        {
            s = s.split("#");
            if (s.length == 2)
            {
                try
                {
                    ad[0] = Double.valueOf(s[0]).doubleValue();
                    ad[1] = Double.valueOf(s[1]).doubleValue();
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s.printStackTrace();
                    return ad;
                }
            }
        }
        return ad;
    }
}
