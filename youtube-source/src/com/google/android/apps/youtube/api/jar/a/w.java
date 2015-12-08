// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.api.b.a.af;
import com.google.android.apps.youtube.core.player.overlay.a;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ad, v

final class w
    implements Runnable
{

    final af a;
    final v b;

    w(v v1, af af)
    {
        b = v1;
        a = af;
        super();
    }

    public final void run()
    {
        com.google.android.apps.youtube.api.jar.a.v.a(b, new ad(a));
        v.b(b).setListener(com.google.android.apps.youtube.api.jar.a.v.a(b));
    }
}
