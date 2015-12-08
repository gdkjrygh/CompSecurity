// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.view.Surface;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            cz, cv

final class da
    implements Runnable
{

    final Surface a;
    final cz b;

    da(cz cz1, Surface surface)
    {
        b = cz1;
        a = surface;
        super();
    }

    public final void run()
    {
        cv.a(b.b, a);
        cv.c(b.b);
    }
}
