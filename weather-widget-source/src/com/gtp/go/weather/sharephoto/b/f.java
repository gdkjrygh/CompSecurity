// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.b;

import org.json.JSONObject;

public class f
{

    private String a;
    private int b;
    private int c;
    private int d;

    public f()
    {
    }

    public static f a(JSONObject jsonobject)
    {
        f f1 = new f();
        f1.a(jsonobject.optString("url", ""));
        f1.c(jsonobject.optInt("type", -1));
        f1.b(jsonobject.optInt("hight", 0));
        f1.a(jsonobject.optInt("width", 0));
        return f1;
    }

    public String a()
    {
        return a;
    }

    public void a(int i)
    {
        b = i;
    }

    public void a(String s)
    {
        a = s;
    }

    public void b(int i)
    {
        c = i;
    }

    public void c(int i)
    {
        d = i;
    }
}
