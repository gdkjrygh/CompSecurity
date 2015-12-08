// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.e;


public class q
{

    public static final String a;

    static 
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("CREATE TABLE IF NOT EXISTS prompt_table");
        stringbuilder.append(" (_id INTEGER PRIMARY KEY, ");
        stringbuilder.append("page_type INTEGER, ");
        stringbuilder.append("need_show INTEGER, ");
        stringbuilder.append("local_type INTEGER, ");
        stringbuilder.append("response_type INTEGER, ");
        stringbuilder.append("prompt_id INTEGER, ");
        stringbuilder.append("prompt_text TEXT, ");
        stringbuilder.append("prompt_type INTEGER)");
        a = stringbuilder.toString();
    }
}
