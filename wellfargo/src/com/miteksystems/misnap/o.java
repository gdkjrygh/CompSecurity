// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.view.SurfaceHolder;

// Referenced classes of package com.miteksystems.misnap:
//            k

final class o
    implements Runnable
{

    final k a;
    private final SurfaceHolder b;
    private final int c;
    private final int d;

    o(k k1, SurfaceHolder surfaceholder, int i, int j)
    {
        a = k1;
        b = surfaceholder;
        c = i;
        d = j;
        super();
    }

    public final void run()
    {
        k.a(a, b, c, d);
    }
}
