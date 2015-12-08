// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.view.Surface;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            dg, df

final class dh
    implements Runnable
{

    final Surface a;
    final dg b;

    dh(dg dg1, Surface surface)
    {
        b = dg1;
        a = surface;
        super();
    }

    public final void run()
    {
        if (dg.a(b) != null)
        {
            dg.a(b).a(a);
        }
    }
}
