// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import com.google.android.apps.youtube.core.player.overlay.al;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            cp

final class cq
    implements Runnable
{

    final cp a;

    cq(cp cp1)
    {
        a = cp1;
        super();
    }

    public final void run()
    {
        cp.a(a).b();
    }
}
