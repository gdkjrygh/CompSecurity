// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.a.a.f;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a
{

    private Map a;
    private long b;

    public a()
    {
        a = new ConcurrentHashMap();
        b = -1L;
    }

    public long a()
    {
        return b;
    }

    public String a(String s)
    {
        return (String)a.get(s);
    }
}
