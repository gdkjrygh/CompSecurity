// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.api.service;

import android.os.IBinder;
import com.google.android.apps.youtube.api.j;
import com.google.android.youtube.player.internal.d;

// Referenced classes of package com.google.android.youtube.api.service:
//            d

final class e
    implements Runnable
{

    final boolean a;
    final com.google.android.youtube.api.service.d b;

    e(com.google.android.youtube.api.service.d d1, boolean flag)
    {
        b = d1;
        a = flag;
        super();
    }

    public final void run()
    {
        if (d.a(b) != null)
        {
            j j1 = d.a(b);
            boolean flag;
            if (!a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j1.a(flag);
            d.a(b, null);
        }
        d.a(b, null);
        if (d.b(b) != null)
        {
            d.b(b).asBinder().unlinkToDeath(b, 0);
            d.a(b, null);
        }
        System.gc();
    }
}
