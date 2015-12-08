// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.b;

import com.android.volley.j;
import com.android.volley.m;
import com.android.volley.n;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.a.e;
import com.google.android.apps.youtube.datalib.a.r;
import java.util.HashMap;
import java.util.Map;

public final class b extends r
{

    private final e a;

    public b(String s, e e1, n n)
    {
        super(0, s, n);
        a = (e)c.a(e1);
    }

    protected final m a(j j)
    {
        return m.a(null, null);
    }

    protected final volatile void a(Object obj)
    {
    }

    public final Map h()
    {
        HashMap hashmap = new HashMap();
        a.a(hashmap);
        return hashmap;
    }
}
