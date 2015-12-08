// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import com.gau.go.launcherex.gowidget.weather.globaltheme.c;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.systemwidget:
//            t, n

public class s extends t
{

    public String a[];
    public String b[];
    public String c[];
    public String d[];
    public String e[];
    private HashMap h;

    public s()
    {
        a = new String[10];
        b = new String[10];
        c = new String[10];
        d = new String[10];
        e = new String[10];
        h = new HashMap();
        a("systemwidget_style", String.valueOf(425));
    }

    public String a(String s1)
    {
        if (s1 != null && !s1.equals(""))
        {
            try
            {
                s1 = (String)h.get(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return "";
            }
            return s1;
        } else
        {
            return "";
        }
    }

    public void a(n n1, XmlPullParser xmlpullparser)
    {
        n1.a(xmlpullparser, this);
    }

    public void a(String s1, String s2)
    {
        h.put(s1, s2);
    }

    public String[] a()
    {
        return b;
    }

    public String[] b()
    {
        return a;
    }

    public String c()
    {
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.c.a(g))
        {
            return com.gau.go.launcherex.gowidget.weather.globaltheme.c.a(4, com.gau.go.launcherex.gowidget.weather.globaltheme.c.c(g));
        } else
        {
            return "z_appwidget_days_l_provider";
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

    public String[] f()
    {
        return e;
    }
}
