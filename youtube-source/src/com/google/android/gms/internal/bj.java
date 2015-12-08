// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal:
//            bk, dn, bt

final class bj
{

    private final Runnable a;
    private volatile boolean b;

    public bj(bt bt)
    {
        b = false;
        a = new bk(this, bt);
    }

    static boolean a(bj bj1)
    {
        return bj1.b;
    }

    public final void a()
    {
        b = true;
        dn.a.removeCallbacks(a);
    }

    public final void b()
    {
        dn.a.postDelayed(a, 250L);
    }
}
