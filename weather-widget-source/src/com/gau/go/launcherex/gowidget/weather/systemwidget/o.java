// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import com.gau.go.launcherex.gowidget.weather.globaltheme.c;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.systemwidget:
//            t, n

public class o extends t
{

    public String a[];
    public String b[];
    private HashMap c;

    public o()
    {
        a = new String[10];
        b = new String[10];
        c = new HashMap();
        a("systemwidget_style", String.valueOf(21));
    }

    public String a(String s)
    {
        if (s != null && !s.equals(""))
        {
            try
            {
                s = (String)c.get(s);
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
        c.put(s, s1);
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
            return com.gau.go.launcherex.gowidget.weather.globaltheme.c.a(3, com.gau.go.launcherex.gowidget.weather.globaltheme.c.c(g));
        } else
        {
            return "z_appwidget_s_provider_ex";
        }
    }
}
