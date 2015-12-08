// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import java.util.ArrayList;

public class t
{

    private ArrayList a;
    private String b;
    private boolean c;

    public ArrayList a()
    {
        if (a == null)
        {
            a = new ArrayList();
        }
        return a;
    }

    public void a(String s)
    {
        b = s;
    }

    public void a(boolean flag)
    {
        c = flag;
    }
}
