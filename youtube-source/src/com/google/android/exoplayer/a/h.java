// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.a;


// Referenced classes of package com.google.android.exoplayer.a:
//            b

final class h
    implements Runnable
{

    final long a;
    final long b;
    final long c;
    final b d;

    h(b b1, long l, long l1, long l2)
    {
        d = b1;
        a = l;
        b = l1;
        c = l2;
        super();
    }

    public final void run()
    {
        com.google.android.exoplayer.a.b.b(d);
        com.google.android.exoplayer.a.b.a(d);
        b b1 = d;
        long l = a;
        b1 = d;
        l = b;
        l = c;
    }
}
