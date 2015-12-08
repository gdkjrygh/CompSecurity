// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.view.Surface;

// Referenced classes of package com.google.android.exoplayer:
//            ab, af

final class ad
    implements Runnable
{

    final Surface a;
    final ab b;

    ad(ab ab1, Surface surface)
    {
        b = ab1;
        a = surface;
        super();
    }

    public final void run()
    {
        af af1 = ab.a(b);
        Surface surface = a;
        af1.a();
    }
}
