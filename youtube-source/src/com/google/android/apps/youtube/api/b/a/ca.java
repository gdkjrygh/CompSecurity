// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import com.google.android.apps.youtube.core.player.overlay.p;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            bx

final class ca
    implements Runnable
{

    final boolean a;
    final bx b;

    ca(bx bx1, boolean flag)
    {
        b = bx1;
        a = flag;
        super();
    }

    public final void run()
    {
        bx.a(b).b(a);
    }
}
