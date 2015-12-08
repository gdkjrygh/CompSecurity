// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import com.google.android.apps.youtube.core.player.overlay.p;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            bx

final class ch
    implements Runnable
{

    final int a;
    final bx b;

    ch(bx bx1, int i)
    {
        b = bx1;
        a = i;
        super();
    }

    public final void run()
    {
        bx.a(b).a(a);
    }
}
