// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.a.b;

import android.text.TextUtils;

public class a
{

    public static final String a(String s, int i)
    {
        if (!TextUtils.isEmpty(s) && s.contains("#") && i >= 0 && i < 6)
        {
            s = s.split("#");
            if (s.length >= 6)
            {
                return s[i];
            }
        }
        return "";
    }
}
