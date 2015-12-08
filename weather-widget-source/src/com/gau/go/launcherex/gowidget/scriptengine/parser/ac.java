// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import android.graphics.Color;

public class ac
{

    private String a;
    private int b;

    public ac()
    {
        a = "";
        b = 0;
    }

    public void a(String s, String s1)
    {
        if (s.equals("gw_weather_ex_main_selector"))
        {
            a = s1;
            return;
        }
        try
        {
            if (s.equals("go_weather_ex_main_shadowcolor"))
            {
                b = Color.parseColor(s1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return;
    }
}
