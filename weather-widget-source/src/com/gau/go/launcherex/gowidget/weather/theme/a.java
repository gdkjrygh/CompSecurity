// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.theme;

import android.content.res.Resources;
import java.util.HashMap;

public class a
{

    public String a;
    public Resources b;
    public String c[];
    public String d[];
    public String e[];
    public String f[];
    private HashMap g;

    public a()
    {
        a = "";
        b = null;
        c = new String[10];
        d = new String[10];
        e = new String[10];
        f = new String[8];
        g = new HashMap();
    }

    public String a(String s)
    {
        return (String)g.get(s);
    }

    public void a(String s, String s1)
    {
        g.put(s, s1);
    }

    public void a(HashMap hashmap)
    {
        g = hashmap;
    }

    public String[] a()
    {
        return c;
    }

    public String[] b()
    {
        return d;
    }

    public String[] c()
    {
        return e;
    }
}
