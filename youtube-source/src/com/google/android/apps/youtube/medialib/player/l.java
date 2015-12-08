// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;

public class l
{

    private final FormatStream a;
    private final FormatStream b;
    private final boolean c;
    private final boolean d;
    private final int e;

    public l(FormatStream formatstream, FormatStream formatstream1, boolean flag, boolean flag1, int i)
    {
        a = formatstream;
        b = formatstream1;
        c = flag;
        d = flag1;
        e = i;
    }

    public final FormatStream a()
    {
        return a;
    }

    public final FormatStream b()
    {
        return b;
    }

    public final boolean c()
    {
        return c;
    }

    public final boolean d()
    {
        return d;
    }

    public final int e()
    {
        return e;
    }
}
