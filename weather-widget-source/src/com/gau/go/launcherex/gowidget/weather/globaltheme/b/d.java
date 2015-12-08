// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.b;

import android.content.Context;
import android.text.format.Time;
import com.gau.go.launcherex.gowidget.statistics.w;

public class d
{

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    private Time q;

    public d(Context context)
    {
        a = "0";
        b = "0";
        c = "0";
        d = "0";
        e = "0";
        f = "0";
        g = "1";
        h = "0";
        i = "0";
        j = "0";
        k = "0";
        l = "0";
        m = "0";
        n = "0";
        o = "0";
        p = "0";
        q = new Time();
        a = "20";
        b = w.v(context);
        d = "11";
        h = w.n(context);
        i = w.f(context);
        j = String.valueOf(w.e(context));
        k = w.c(context);
    }

    public String a()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(a);
        stringbuffer.append("||");
        stringbuffer.append(b);
        stringbuffer.append("||");
        q.setToNow();
        q.set(q.toMillis(true) - (q.gmtoff - 28800L) * 1000L);
        c = q.format("%Y/%m/%d %H:%M:%S");
        stringbuffer.append(c);
        stringbuffer.append("||");
        stringbuffer.append(d);
        stringbuffer.append("||");
        stringbuffer.append(e);
        stringbuffer.append("||");
        stringbuffer.append(f);
        stringbuffer.append("||");
        stringbuffer.append(g);
        stringbuffer.append("||");
        stringbuffer.append(h);
        stringbuffer.append("||");
        stringbuffer.append(i);
        stringbuffer.append("||");
        stringbuffer.append(j);
        stringbuffer.append("||");
        stringbuffer.append(k);
        stringbuffer.append("||");
        stringbuffer.append(l);
        stringbuffer.append("||");
        stringbuffer.append(m);
        stringbuffer.append("||");
        stringbuffer.append(n);
        stringbuffer.append("||");
        stringbuffer.append(o);
        stringbuffer.append("||");
        stringbuffer.append(p);
        return stringbuffer.toString();
    }
}
