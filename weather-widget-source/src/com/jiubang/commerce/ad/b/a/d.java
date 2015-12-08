// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.b.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class d
{

    private int a;
    private String b;
    private int c;
    private String d;
    private String e;
    private int f;
    private String g;
    private String h;
    private int i;

    public d()
    {
    }

    public static d a(Context context, JSONObject jsonobject, int j)
    {
        if (jsonobject == null)
        {
            return null;
        } else
        {
            context = new d();
            context.a = jsonobject.optInt("corpId");
            context.b = jsonobject.optString("packageName");
            context.c = jsonobject.optInt("mapid");
            context.d = jsonobject.optString("targetUrl");
            context.e = jsonobject.optString("appName");
            context.f = jsonobject.optInt("preClick");
            context.g = jsonobject.optString("iconUrl");
            context.h = jsonobject.optString("bannerUrl");
            context.i = jsonobject.optInt("needUA");
            return context;
        }
    }

    public static List a(Context context, JSONArray jsonarray, int j)
    {
        ArrayList arraylist;
        int k;
        if (jsonarray == null || jsonarray.length() < 1)
        {
            return null;
        }
        arraylist = new ArrayList();
        k = 0;
_L3:
        if (k >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        d d1 = a(context, jsonarray.getJSONObject(k), j);
        if (d1 != null)
        {
            try
            {
                arraylist.add(d1);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        k++;
          goto _L3
_L2:
        return arraylist;
    }

    public String a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public String d()
    {
        return e;
    }

    public int e()
    {
        return f;
    }

    public String f()
    {
        return g;
    }

    public String g()
    {
        return h;
    }

    public int h()
    {
        return i;
    }
}
