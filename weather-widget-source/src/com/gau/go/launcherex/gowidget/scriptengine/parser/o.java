// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;


public class o
{

    private float a;
    private float b;
    private String c;
    private int d;

    public o()
    {
    }

    public String a()
    {
        return c;
    }

    public void a(float f)
    {
        a = f;
    }

    public void a(String s)
    {
        c = s;
    }

    public void b(float f)
    {
        b = f;
    }

    public String toString()
    {
        return (new StringBuilder()).append("foreground x = ").append(a).append(", y = ").append(b).append(", src = ").append(c).append(", color = ").append(d).append("\n").toString();
    }
}
