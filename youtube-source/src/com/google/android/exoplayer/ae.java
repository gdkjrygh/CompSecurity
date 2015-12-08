// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//            ab, af

final class ae
    implements Runnable
{

    final int a;
    final long b;
    final ab c;

    ae(ab ab1, int i, long l)
    {
        c = ab1;
        a = i;
        b = l;
        super();
    }

    public final void run()
    {
        af af1 = ab.a(c);
        int i = a;
        long l = b;
        af1.a(i);
    }
}
