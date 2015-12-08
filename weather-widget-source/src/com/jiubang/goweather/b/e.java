// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.b;

import a.a.a.a.a.h;
import android.content.Context;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.jiubang.goweather.b:
//            a

public class e
{

    private final String a;
    private final ArrayList b;
    private byte c[];
    private List d;
    private h e;
    private String f;
    private final int g;
    private boolean h;
    private int i;
    private int j;
    private final HashMap k;
    private int l;

    public e(String s)
    {
        i = 25000;
        j = 25000;
        l = 1;
        a = s;
        f = "GET";
        b = new ArrayList();
        g = -1;
        h = false;
        k = new HashMap();
    }

    public e(String s, int i1, int j1)
    {
        i = 25000;
        j = 25000;
        l = 1;
        a = s;
        f = "GET";
        b = new ArrayList();
        g = -1;
        h = false;
        if (i1 > 0)
        {
            i = i1;
        }
        if (j1 > 0)
        {
            j = j1;
        }
        k = new HashMap();
    }

    public e(String s, String s1)
    {
        i = 25000;
        j = 25000;
        l = 1;
        a = s;
        f = s1;
        b = new ArrayList();
        g = -1;
        h = false;
        k = new HashMap();
    }

    public a a(String s, String s1)
    {
        s = new a(s, s1);
        b.add(s);
        return s;
    }

    public void a(int i1)
    {
        i = i1;
    }

    public void a(h h1)
    {
        e = h1;
    }

    public void a(Context context)
    {
        a("lang", com.gau.go.launcherex.gowidget.language.e.a(context).d());
        a("sys", android.os.Build.VERSION.RELEASE);
        a("ps", "2.0");
    }

    public void a(String s)
    {
        f = s;
    }

    public void a(List list)
    {
        d = list;
    }

    public void a(boolean flag)
    {
        h = flag;
    }

    public void a(byte abyte0[])
    {
        c = abyte0;
    }

    public boolean a()
    {
        return h;
    }

    public int b()
    {
        return i;
    }

    public void b(int i1)
    {
        j = i1;
    }

    public void b(String s, String s1)
    {
        k.put(s, s1);
    }

    public int c()
    {
        return j;
    }

    public void c(int i1)
    {
        l = i1;
        b.add(new a("refleshTime", String.valueOf(l)));
    }

    public HashMap d()
    {
        return k;
    }

    public byte[] e()
    {
        return c;
    }

    public List f()
    {
        return d;
    }

    public h g()
    {
        return e;
    }

    public String h()
    {
        return f;
    }

    public String i()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(a);
        int j1 = b.size();
        if (j1 > 0)
        {
            stringbuilder.append("?");
        }
        for (int i1 = 0; i1 < j1; i1++)
        {
            a a1 = (a)b.get(i1);
            stringbuilder.append(URLEncoder.encode(a1.a(), "utf-8"));
            stringbuilder.append("=");
            stringbuilder.append(URLEncoder.encode(a1.b(), "utf-8"));
            if (i1 + 1 < j1)
            {
                stringbuilder.append("&");
            }
        }

        return stringbuilder.toString();
    }
}
