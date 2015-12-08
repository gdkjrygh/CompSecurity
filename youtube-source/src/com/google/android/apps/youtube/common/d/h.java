// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.d;

import com.google.android.apps.youtube.a.a.g;
import com.google.android.apps.youtube.common.fromguava.c;

public abstract class h
{

    private final g a;

    protected h(g g1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(g1.b());
        com.google.android.apps.youtube.common.fromguava.c.a(g1.d());
        a = g1;
    }

    protected abstract void a();

    public final String c()
    {
        return a.a();
    }

    final long d()
    {
        return a.c();
    }

    final boolean e()
    {
        return a.g() > 0L;
    }
}
