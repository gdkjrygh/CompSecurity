// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.e;


public class t
{

    public static final String a;

    static 
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("CREATE TABLE IF NOT EXISTS appwidget_info_table");
        stringbuilder.append(" (");
        stringbuilder.append("_id INTEGER PRIMARY KEY, ");
        stringbuilder.append("widget_id INTEGER, ");
        stringbuilder.append("widget_type INTEGER, ");
        stringbuilder.append("current_cityid TEXT, ");
        stringbuilder.append("widget_location_type INTEGER, ");
        stringbuilder.append("theme_package_name TEXT)");
        a = stringbuilder.toString();
    }
}
