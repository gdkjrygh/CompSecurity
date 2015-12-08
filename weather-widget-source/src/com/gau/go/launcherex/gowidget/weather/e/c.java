// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.e;

import java.util.Locale;

public abstract class c
{

    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;

    public static final String a(String s)
    {
        return (new StringBuilder()).append("INSERT INTO common_setting_table (setting_key, setting_value)values('dynamic_bg_switch', '").append(s).append("')").toString();
    }

    public static final String a(String s, String s1)
    {
        return (new StringBuilder()).append("INSERT INTO common_setting_table (setting_key, setting_value)values('").append(s).append("', '").append(s1).append("')").toString();
    }

    public static String[] a()
    {
        return (new String[] {
            "setting_key", "setting_value"
        });
    }

    static 
    {
        String s = Locale.getDefault().getCountry();
        String s1 = Locale.getDefault().getLanguage();
        if (s.indexOf("CN") != -1 && s1.equalsIgnoreCase("zh"))
        {
            a = 1;
            b = 5;
            c = 2;
            d = 6;
            f = 0;
            e = 1;
        } else
        if (s.indexOf("KR") != -1 && s1.equalsIgnoreCase("ko"))
        {
            a = 1;
            b = 4;
            c = 2;
            d = 6;
            f = 0;
            e = 1;
        } else
        if (s1.equalsIgnoreCase("en"))
        {
            a = 2;
            b = 2;
            c = 1;
            d = 6;
            f = 0;
            e = 0;
        } else
        if (s.indexOf("DE") != -1 && s1.equalsIgnoreCase("de"))
        {
            a = 1;
            b = 2;
            c = 2;
            d = 6;
            f = 0;
            e = 0;
        } else
        if (s.indexOf("FR") != -1 && s1.equalsIgnoreCase("fr"))
        {
            a = 1;
            b = 2;
            c = 2;
            d = 6;
            f = 0;
            e = 0;
        } else
        if (s.indexOf("IT") != -1 && s1.equalsIgnoreCase("it"))
        {
            a = 1;
            b = 2;
            c = 2;
            d = 6;
            f = 0;
            e = 0;
        } else
        {
            a = 1;
            b = 2;
            c = 2;
            d = 6;
            f = 0;
            e = 0;
        }
        g = (new StringBuilder()).append("INSERT INTO common_setting_table (setting_key, setting_value)values('tempUnit', '").append(a).append("')").toString();
        h = (new StringBuilder()).append("INSERT INTO common_setting_table (setting_key, setting_value)values('calendarType', '").append(e).append("')").toString();
        i = (new StringBuilder()).append("INSERT INTO common_setting_table (setting_key, setting_value)values('festival', '").append(f).append("')").toString();
        j = (new StringBuilder()).append("INSERT INTO common_setting_table (setting_key, setting_value)values('windUnit', '").append(b).append("')").toString();
        k = (new StringBuilder()).append("INSERT INTO common_setting_table (setting_key, setting_value)values('visibility_unit', '").append(c).append("')").toString();
        l = (new StringBuilder()).append("INSERT INTO common_setting_table (setting_key, setting_value)values('pressure_unit', '").append(d).append("')").toString();
    }
}
