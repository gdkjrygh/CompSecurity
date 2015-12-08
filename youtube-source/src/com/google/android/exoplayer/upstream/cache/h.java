// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream.cache;

import android.os.ConditionVariable;

// Referenced classes of package com.google.android.exoplayer.upstream.cache:
//            g

final class h extends Thread
{

    final ConditionVariable a;
    final g b;

    h(g g1, ConditionVariable conditionvariable)
    {
        b = g1;
        a = conditionvariable;
        super();
    }

    public final void run()
    {
        synchronized (b)
        {
            a.open();
            g.a(b);
        }
    }
}
