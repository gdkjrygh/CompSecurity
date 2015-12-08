// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.e;


public class l
{

    public static final String a;

    static 
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("CREATE TABLE IF NOT EXISTS my_photo_table");
        stringbuilder.append(" (_id INTEGER PRIMARY KEY, ");
        stringbuilder.append("photo_id LONG, ");
        stringbuilder.append("photo_path TEXT, ");
        stringbuilder.append("watermark_path TEXT, ");
        stringbuilder.append("has_watermark TEXT, ");
        stringbuilder.append("description TEXT, ");
        stringbuilder.append("city_id TEXT, ");
        stringbuilder.append("city_name TEXT, ");
        stringbuilder.append("photo_upload_size LONG, ");
        stringbuilder.append("watermark_upload_size LONG)");
        a = stringbuilder.toString();
    }
}
