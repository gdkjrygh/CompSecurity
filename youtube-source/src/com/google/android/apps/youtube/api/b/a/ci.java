// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import com.google.android.apps.youtube.core.player.overlay.p;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            bx

final class ci
    implements Runnable
{

    final bx a;

    ci(bx bx1)
    {
        a = bx1;
        super();
    }

    public final void run()
    {
        bx.a(a).d();
    }
}
