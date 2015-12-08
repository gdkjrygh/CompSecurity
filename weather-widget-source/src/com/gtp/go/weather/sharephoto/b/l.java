// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.b;

import org.json.JSONObject;

public class l
{

    public int a;
    public String b;
    public int c;

    public l()
    {
    }

    public static l a(JSONObject jsonobject)
    {
        l l1 = new l();
        l1.a = jsonobject.optInt("result");
        l1.b = jsonobject.optString("msg");
        l1.c = jsonobject.optInt("costTime");
        return l1;
    }
}
