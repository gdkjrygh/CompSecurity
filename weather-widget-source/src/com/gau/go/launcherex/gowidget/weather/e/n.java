// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.e;


public class n
{

    public static final String a;

    static 
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("CREATE TABLE IF NOT EXISTS photo_upload_table");
        stringbuilder.append(" (_id INTEGER PRIMARY KEY, ");
        stringbuilder.append("photo_id LONG, ");
        stringbuilder.append("data_type INTEGER, ");
        stringbuilder.append("data_value INTEGER, ");
        stringbuilder.append("user_id TEXT, ");
        stringbuilder.append("city_id TEXT)");
        a = stringbuilder.toString();
    }
}
