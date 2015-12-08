// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.a;


// Referenced classes of package com.google.android.exoplayer.a:
//            b

final class c
    implements Runnable
{

    final int a;
    final int b;
    final boolean c;
    final long d;
    final long e;
    final long f;
    final b g;

    c(b b1, int i, int j, boolean flag, long l, long l1, long l2)
    {
        g = b1;
        a = i;
        b = j;
        c = flag;
        d = l;
        e = l1;
        f = l2;
        super();
    }

    public final void run()
    {
        com.google.android.exoplayer.a.b.b(g);
        com.google.android.exoplayer.a.b.a(g);
        int i = a;
        i = b;
        boolean flag = c;
        b b1 = g;
        long l = d;
        b1 = g;
        l = e;
        l = f;
    }
}
