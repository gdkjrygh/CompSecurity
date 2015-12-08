// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.e;


public class k
{

    public static final String a;

    static 
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("CREATE TABLE IF NOT EXISTS my_award_table");
        stringbuilder.append(" (_id INTEGER PRIMARY KEY, ");
        stringbuilder.append("user_award_id LONG, ");
        stringbuilder.append("award_id LONG, ");
        stringbuilder.append("prompt_type INTEGER, ");
        stringbuilder.append("award_desc TEXT, ");
        stringbuilder.append("award_time LONG, ");
        stringbuilder.append("award_type INTEGER, ");
        stringbuilder.append("small_pic_url TEXT, ");
        stringbuilder.append("small_pic_path TEXT, ");
        stringbuilder.append("is_receive INTEGER)");
        a = stringbuilder.toString();
    }
}
