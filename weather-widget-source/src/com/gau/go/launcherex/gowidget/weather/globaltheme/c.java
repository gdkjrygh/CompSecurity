// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme;

import java.util.ArrayList;
import java.util.List;

public abstract class c
{

    private static final List a;

    public static final String a(int i, String s)
    {
        StringBuffer stringbuffer;
        stringbuffer = new StringBuffer();
        stringbuffer.append("app_widget_default");
        stringbuffer.append(s);
        i;
        JVM INSTR tableswitch 1 5: default 56
    //                   1 61
    //                   2 71
    //                   3 81
    //                   4 91
    //                   5 101;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return stringbuffer.toString();
_L2:
        stringbuffer.append("_current_42");
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuffer.append("_current_41");
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuffer.append("_current_21");
        continue; /* Loop/switch isn't completed */
_L5:
        stringbuffer.append("_days42");
        continue; /* Loop/switch isn't completed */
_L6:
        stringbuffer.append("_days41");
        if (true) goto _L1; else goto _L7
_L7:
    }

    public static boolean a(String s)
    {
        return a.contains(s);
    }

    public static String b(String s)
    {
        String s1 = s;
        if (a(s))
        {
            s1 = "com.gau.go.launcherex.gowidget.weatherwidget";
        }
        return s1;
    }

    public static String c(String s)
    {
        if (!"com.gau.go.launcherex.gowidget.weatherwidget".equals(s) && !"app_widget_theme_white".equals(s) && !"app_widget_theme_black".equals(s))
        {
            if ("app_widget_theme_default".equals(s))
            {
                return "2";
            }
            if ("app_widget_theme_default_transparent".equals(s))
            {
                return "3";
            }
        }
        return "1";
    }

    public static final String d(String s)
    {
        StringBuffer stringbuffer = new StringBuffer("app_widget_res_xml_default");
        stringbuffer.append(s);
        stringbuffer.append(".xml");
        return stringbuffer.toString();
    }

    static 
    {
        a = new ArrayList(5);
        a.add("com.gau.go.launcherex.gowidget.weatherwidget");
        a.add("app_widget_theme_white");
        a.add("app_widget_theme_black");
        a.add("app_widget_theme_default");
        a.add("app_widget_theme_default_transparent");
    }
}
