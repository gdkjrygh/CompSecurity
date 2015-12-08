// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;


// Referenced classes of package com.google.android.exoplayer.upstream:
//            c, e

final class d
    implements Runnable
{

    final int a;
    final long b;
    final long c;
    final c d;

    d(c c1, int i, long l, long l1)
    {
        d = c1;
        a = i;
        b = l;
        c = l1;
        super();
    }

    public final void run()
    {
        com.google.android.exoplayer.upstream.c.a(d).a(a, b, c);
    }
}
