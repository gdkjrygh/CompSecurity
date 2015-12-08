// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.d;

import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class e
{

    private int a;
    private CharSequence b;
    private CharSequence c;
    private Map d;
    private URL e;

    public e()
    {
    }

    public int a()
    {
        return a;
    }

    public String a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder(127);
        for (s = ((List)d.get(s)).iterator(); s.hasNext(); stringbuilder.append((String)s.next()).append("\n")) { }
        return stringbuilder.toString();
    }

    public void a(int i)
    {
        a = i;
    }

    public void a(CharSequence charsequence)
    {
        b = charsequence;
    }

    public void a(URL url)
    {
        e = url;
    }

    public void a(Map map)
    {
        d = map;
    }

    public CharSequence b()
    {
        return c;
    }

    public void b(CharSequence charsequence)
    {
        c = charsequence;
    }

    public URL c()
    {
        return e;
    }
}
