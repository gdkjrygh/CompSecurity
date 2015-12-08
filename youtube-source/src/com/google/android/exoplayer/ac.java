// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//            ab, af

final class ac
    implements Runnable
{

    final int a;
    final int b;
    final ab c;

    ac(ab ab1, int i, int j)
    {
        c = ab1;
        a = i;
        b = j;
        super();
    }

    public final void run()
    {
        ab.a(c).a(a, b);
    }
}
