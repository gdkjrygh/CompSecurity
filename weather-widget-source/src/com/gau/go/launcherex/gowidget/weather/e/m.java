// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.e;


public class m
{

    public static final String a;

    static 
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("CREATE TABLE IF NOT EXISTS photo_table");
        stringbuilder.append(" (_id INTEGER PRIMARY KEY, ");
        stringbuilder.append("photo_id LONG, ");
        stringbuilder.append("photo_type INTEGER, ");
        stringbuilder.append("belong_page INTEGER, ");
        stringbuilder.append("image_type INTEGER, ");
        stringbuilder.append("city_id TEXT, ");
        stringbuilder.append("city TEXT, ");
        stringbuilder.append("favour INTEGER, ");
        stringbuilder.append("backcount INTEGER, ");
        stringbuilder.append("is_myfavourite INTEGER, ");
        stringbuilder.append("user_id TEXT, ");
        stringbuilder.append("up_time_long LONG, ");
        stringbuilder.append("up_time_date TEXT, ");
        stringbuilder.append("original_url TEXT, ");
        stringbuilder.append("original_path TEXT, ");
        stringbuilder.append("original_w_h TEXT, ");
        stringbuilder.append("watermark_url TEXT, ");
        stringbuilder.append("watermark_path TEXT, ");
        stringbuilder.append("watermark_w_h TEXT, ");
        stringbuilder.append("compose_url TEXT, ");
        stringbuilder.append("compose_path TEXT, ");
        stringbuilder.append("compose_w_h TEXT, ");
        stringbuilder.append("desc TEXT, ");
        stringbuilder.append("latlng TEXT, ");
        stringbuilder.append("addr TEXT)");
        a = stringbuilder.toString();
    }
}
