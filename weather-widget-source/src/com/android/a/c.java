// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a;

import java.util.Collections;
import java.util.Map;

public class c
{

    public byte a[];
    public String b;
    public long c;
    public long d;
    public long e;
    public Map f;

    public c()
    {
        f = Collections.emptyMap();
    }

    public boolean a()
    {
        return d < System.currentTimeMillis();
    }

    public boolean b()
    {
        return e < System.currentTimeMillis();
    }
}
