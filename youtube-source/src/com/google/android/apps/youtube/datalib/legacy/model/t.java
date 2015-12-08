// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;

public final class t
{

    private final FormatStream a;
    private final boolean b;
    private final long c;

    public t(FormatStream formatstream, boolean flag)
    {
        this(formatstream, flag, 0L);
    }

    public t(FormatStream formatstream, boolean flag, long l)
    {
        a = (FormatStream)com.google.android.apps.youtube.common.fromguava.c.a(formatstream);
        b = flag;
        c = l;
    }

    public final FormatStream a()
    {
        return a;
    }

    public final t a(FormatStream formatstream)
    {
        return new t(formatstream, b, c);
    }

    public final String b()
    {
        return a.getVideoId();
    }

    public final int c()
    {
        return a.getItag();
    }

    public final boolean d()
    {
        return b;
    }

    public final long e()
    {
        return c;
    }

    public final long f()
    {
        return a.getContentLength();
    }

    public final boolean g()
    {
        return c == a.getContentLength();
    }
}
