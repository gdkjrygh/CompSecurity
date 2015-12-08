// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.a;


// Referenced classes of package com.google.android.exoplayer.a:
//            b

final class i
    implements Runnable
{

    final int a;
    final int b;
    final long c;
    final b d;

    i(b b1, int j, int k, long l)
    {
        d = b1;
        a = j;
        b = k;
        c = l;
        super();
    }

    public final void run()
    {
        com.google.android.exoplayer.a.b.b(d);
        com.google.android.exoplayer.a.b.a(d);
        int j = a;
        j = b;
        b b1 = d;
        long l = c;
    }
}
