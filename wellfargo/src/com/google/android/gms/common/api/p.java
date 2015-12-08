// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

// Referenced classes of package com.google.android.gms.common.api:
//            o, bm, n

class p
    implements Runnable
{

    final n a;
    final o b;

    p(o o1, n n)
    {
        b = o1;
        a = n;
        super();
    }

    public void run()
    {
        if (o.a(b).isFinishing() || o.a(b).getSupportFragmentManager().isDestroyed())
        {
            return;
        } else
        {
            o.a(b, bm.b(o.a(b)), a);
            return;
        }
    }
}
