// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.b.a;

import org.json.JSONObject;

public class a
{

    private int a;

    public a()
    {
    }

    public static a a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return null;
        } else
        {
            a a1 = new a();
            a1.a = jsonobject.optInt("preloadperday", -1);
            return a1;
        }
    }

    public int a()
    {
        return a;
    }
}
