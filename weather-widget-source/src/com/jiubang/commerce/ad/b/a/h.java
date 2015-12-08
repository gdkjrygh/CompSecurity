// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.b.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.commerce.ad.b.a:
//            i

public class h
{

    private int a;
    private int b;
    private String c;
    private int d;
    private String e;
    private int f;
    private String g;
    private int h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private int r;
    private float s;
    private int t;
    private int u;
    private String v;
    private int w;

    public h()
    {
    }

    public static h a(Context context, JSONObject jsonobject, int i1, int j1, int k1, int l1)
    {
        if (jsonobject == null)
        {
            return null;
        } else
        {
            context = new h();
            context.h(i1);
            context.a(j1);
            context.b(k1);
            context.a(jsonobject.optString("id", ""));
            context.c(jsonobject.optInt("corpId", 0));
            context.b(jsonobject.optString("packageName", ""));
            context.d(jsonobject.optInt("mapid", 0));
            context.c(jsonobject.optString("targetUrl", ""));
            context.e(jsonobject.optInt("downType", 0));
            context.d(jsonobject.optString("iconUrl", ""));
            context.e(jsonobject.optString("bannerUrl", ""));
            context.f(jsonobject.optString("appName", ""));
            context.g(jsonobject.optString("previewImgUrl", ""));
            context.h(jsonobject.optString("appInfo", ""));
            context.i(jsonobject.optString("showUrl", ""));
            context.j(jsonobject.optString("clickUrl", ""));
            context.k(jsonobject.optString("installCallUrl", ""));
            context.l(jsonobject.optString("dismissUrl", ""));
            context.f(jsonobject.optInt("preClick", 0));
            context.a((float)jsonobject.optDouble("price", 0.0D));
            context.g(jsonobject.optInt("ua", 0));
            context.m(com.jiubang.commerce.ad.b.a.i.a(k1));
            context.w = l1;
            return context;
        }
    }

    public static List a(Context context, JSONArray jsonarray, int i1, int j1, int k1, int l1)
    {
        ArrayList arraylist;
        int i2;
        if (jsonarray == null || jsonarray.length() < 1)
        {
            return null;
        }
        arraylist = new ArrayList();
        i2 = 0;
_L3:
        if (i2 >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        h h1 = a(context, jsonarray.getJSONObject(i2), i1, j1, k1, l1);
        if (h1 != null)
        {
            try
            {
                arraylist.add(h1);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        i2++;
          goto _L3
_L2:
        return arraylist;
    }

    public int a()
    {
        return a;
    }

    public void a(float f1)
    {
        s = f1;
    }

    public void a(int i1)
    {
        a = i1;
    }

    public void a(String s1)
    {
        c = s1;
    }

    public int b()
    {
        return b;
    }

    public void b(int i1)
    {
        b = i1;
    }

    public void b(String s1)
    {
        e = s1;
    }

    public String c()
    {
        return e;
    }

    public void c(int i1)
    {
        d = i1;
    }

    public void c(String s1)
    {
        g = s1;
    }

    public int d()
    {
        return f;
    }

    public void d(int i1)
    {
        f = i1;
    }

    public void d(String s1)
    {
        i = s1;
    }

    public String e()
    {
        return g;
    }

    public void e(int i1)
    {
        h = i1;
    }

    public void e(String s1)
    {
        j = s1;
    }

    public int f()
    {
        return h;
    }

    public void f(int i1)
    {
        r = i1;
    }

    public void f(String s1)
    {
        k = s1;
    }

    public String g()
    {
        return i;
    }

    public void g(int i1)
    {
        t = i1;
    }

    public void g(String s1)
    {
        l = s1;
    }

    public String h()
    {
        return j;
    }

    public void h(int i1)
    {
        u = i1;
    }

    public void h(String s1)
    {
        m = s1;
    }

    public String i()
    {
        return k;
    }

    public void i(String s1)
    {
        n = s1;
    }

    public String j()
    {
        return l;
    }

    public void j(String s1)
    {
        o = s1;
    }

    public String k()
    {
        return m;
    }

    public void k(String s1)
    {
        p = s1;
    }

    public String l()
    {
        return n;
    }

    public void l(String s1)
    {
        q = s1;
    }

    public String m()
    {
        return o;
    }

    public void m(String s1)
    {
        v = s1;
    }

    public String n()
    {
        return p;
    }

    public int o()
    {
        return r;
    }

    public float p()
    {
        return s;
    }

    public int q()
    {
        return t;
    }

    public int r()
    {
        return u;
    }

    public String s()
    {
        return v;
    }

    public int t()
    {
        return w;
    }
}
