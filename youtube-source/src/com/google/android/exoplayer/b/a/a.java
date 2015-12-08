// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.b.a;

import android.net.Uri;
import com.google.android.exoplayer.a.m;

public final class a
{

    public final String a;
    public final long b;
    public final m c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i = 0L;
    public final long j;
    public final Uri k;

    public a(String s, long l, m m1, Uri uri, long l1, 
            long l2, long l3, long l4, long l5, long l6, long l7)
    {
        a = s;
        b = l;
        c = m1;
        d = l1;
        e = l2;
        f = l3;
        g = l4;
        h = l5;
        j = l7;
        k = uri;
    }

    public final String a()
    {
        return (new StringBuilder()).append(a).append(".").append(c.a).append(".").append(b).toString();
    }
}
