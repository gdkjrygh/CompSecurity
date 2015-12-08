// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import com.google.android.apps.youtube.core.player.overlay.h;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            bq

final class bt
    implements Runnable
{

    final boolean a;
    final bq b;

    bt(bq bq1, boolean flag)
    {
        b = bq1;
        a = flag;
        super();
    }

    public final void run()
    {
        bq.a(b).a(a);
    }
}
