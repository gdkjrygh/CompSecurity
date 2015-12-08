// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;

public final class ad
{

    private final FormatStream a;
    private final FormatStream b;
    private final int c;
    private final boolean d;

    public ad(FormatStream formatstream, FormatStream formatstream1, int i, boolean flag)
    {
        a = formatstream;
        b = formatstream1;
        c = i;
        d = flag;
    }

    public final FormatStream a()
    {
        return a;
    }

    public final FormatStream b()
    {
        return b;
    }

    public final int c()
    {
        return c;
    }

    public final boolean d()
    {
        return d;
    }
}
