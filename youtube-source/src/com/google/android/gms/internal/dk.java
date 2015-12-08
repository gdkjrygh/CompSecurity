// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            dj

final class dk
    implements Runnable
{

    final Context a;

    dk(Context context)
    {
        a = context;
        super();
    }

    public final void run()
    {
        synchronized (dj.c())
        {
            dj.b(dj.a(a));
            dj.c().notifyAll();
        }
    }
}
