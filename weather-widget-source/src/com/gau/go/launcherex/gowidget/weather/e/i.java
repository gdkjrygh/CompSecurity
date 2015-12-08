// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.e;


public abstract class i
{

    public static final String a;

    static 
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("CREATE TABLE IF NOT EXISTS go_widget_binding_city_table");
        stringbuilder.append(" (");
        stringbuilder.append("_id INTEGER PRIMARY KEY, ");
        stringbuilder.append("go_widget_id INTEGER, ");
        stringbuilder.append("go_widget_type INTEGER, ");
        stringbuilder.append("city_id TEXT, ");
        stringbuilder.append("widget_theme TEXT)");
        a = stringbuilder.toString();
    }
}
