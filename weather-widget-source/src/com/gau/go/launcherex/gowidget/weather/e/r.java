// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.e;

import java.util.Locale;

public class r
{

    public static final int a;
    public static final int b;
    public static final String c;

    static 
    {
        String s = Locale.getDefault().getCountry();
        String s1 = Locale.getDefault().getLanguage();
        if (s.indexOf("CN") != -1 && s1.equalsIgnoreCase("zh"))
        {
            a = 1;
        } else
        {
            a = 2;
        }
        if (s.indexOf("KR") != -1 && s1.equalsIgnoreCase("ko"))
        {
            b = 4;
        } else
        {
            b = 2;
        }
        c = (new StringBuilder()).append("INSERT INTO setting (autoUpdate,autpUpdateFreq,tempUnit,calendarType,festival,auto_update_time_begin,auto_update_time_end, isCycle, dateStyle, notify, notify_city, notify_type, manual_refresh, windUnit,notify_city_type, world_clock, widgt_clock, widgt_calendar)values(1,3600000,").append(a).append(",0,0,0,0,1,1,0,'',1,0,").append(b).append(",1,1,'','')").toString();
    }
}
