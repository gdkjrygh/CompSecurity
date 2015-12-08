// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            bt, bj

final class bk
    implements Runnable
{

    final bt a;
    final bj b;
    private final WeakReference c;

    bk(bj bj1, bt bt1)
    {
        b = bj1;
        a = bt1;
        super();
        c = new WeakReference(a);
    }

    public final void run()
    {
        bt bt1 = (bt)c.get();
        if (!bj.a(b) && bt1 != null)
        {
            bt1.e();
            b.b();
        }
    }
}
