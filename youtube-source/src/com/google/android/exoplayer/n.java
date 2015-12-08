// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//            m

final class n
    implements Runnable
{

    final boolean a;
    final m b;

    n(m m1, boolean flag)
    {
        b = m1;
        a = flag;
        super();
    }

    public final void run()
    {
        m.a(b);
        boolean flag = a;
    }
}
