// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import com.google.android.apps.youtube.core.player.overlay.bn;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            dm

final class dn
    implements Runnable
{

    final int a;
    final int b;
    final dm c;

    dn(dm dm1, int i, int j)
    {
        c = dm1;
        a = i;
        b = j;
        super();
    }

    public final void run()
    {
        dm.a(c).a(a, b);
    }
}
