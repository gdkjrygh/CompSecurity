// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import com.google.android.apps.youtube.core.player.overlay.b;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            bk

final class bn
    implements Runnable
{

    final int a;
    final int b;
    final bk c;

    bn(bk bk1, int i, int j)
    {
        c = bk1;
        a = i;
        b = j;
        super();
    }

    public final void run()
    {
        bk.a(c).a(a, b);
    }
}
