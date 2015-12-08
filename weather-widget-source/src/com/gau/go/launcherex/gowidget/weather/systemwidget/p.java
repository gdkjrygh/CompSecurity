// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import com.gau.go.launcherex.gowidget.weather.globaltheme.c;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.systemwidget:
//            t, n

public class p extends t
{

    public String a[];
    public String b[];
    public String c[];
    public String d[];
    private HashMap e;

    public p()
    {
        a = new String[10];
        b = new String[10];
        c = new String[10];
        d = new String[10];
        e = new HashMap();
        a("systemwidget_style", String.valueOf(41));
    }

    public String a(String s)
    {
        if (s != null && !s.equals(""))
        {
            try
            {
                s = (String)e.get(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return "";
            }
            return s;
        } else
        {
            return "";
        }
    }

    public void a(n n1, XmlPullParser xmlpullparser)
    {
        n1.a(xmlpullparser, this);
    }

    public void a(String s, String s1)
    {
        e.put(s, s1);
    }

    public String[] a()
    {
        return a;
    }

    public String[] b()
    {
        return b;
    }

    public String c()
    {
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.c.a(g))
        {
            return com.gau.go.launcherex.gowidget.weather.globaltheme.c.a(2, com.gau.go.launcherex.gowidget.weather.globaltheme.c.c(g));
        } else
        {
            return "z_appwidget_m_provider_ex";
        }
    }

    public String[] d()
    {
        return c;
    }

    public String[] e()
    {
        return d;
    }
}
