// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.e;


public class a
{

    public static final String a;

    static 
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("CREATE TABLE IF NOT EXISTS award_table");
        stringbuilder.append(" (_id INTEGER PRIMARY KEY, ");
        stringbuilder.append("award_id LONG, ");
        stringbuilder.append("user_award_id LONG, ");
        stringbuilder.append("award_type INTEGER, ");
        stringbuilder.append("apk_pic_url TEXT, ");
        stringbuilder.append("apk_pic_path TEXT, ");
        stringbuilder.append("apk_package_name TEXT, ");
        stringbuilder.append("apk_name TEXT, ");
        stringbuilder.append("apk_url TEXT, ");
        stringbuilder.append("apk_url_type INTEGER)");
        a = stringbuilder.toString();
    }
}
