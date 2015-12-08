// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.e;


public class e
{

    public static final String a;

    static 
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("CREATE TABLE IF NOT EXISTS coupons_hot_table");
        stringbuilder.append(" (_id INTEGER PRIMARY KEY, ");
        stringbuilder.append("coupon_id LONG, ");
        stringbuilder.append("source_coupon_id LONG, ");
        stringbuilder.append("shop_name TEXT, ");
        stringbuilder.append("coupon_type INTEGER, ");
        stringbuilder.append("title TEXT, ");
        stringbuilder.append("desc TEXT, ");
        stringbuilder.append("exp_time TEXT, ");
        stringbuilder.append("code TEXT, ");
        stringbuilder.append("logo_url TEXT, ");
        stringbuilder.append("logo_path TEXT)");
        a = stringbuilder.toString();
    }
}
