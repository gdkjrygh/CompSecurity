// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import com.google.android.apps.youtube.core.player.overlay.h;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            bq

final class bv
    implements Runnable
{

    final bq a;

    bv(bq bq1)
    {
        a = bq1;
        super();
    }

    public final void run()
    {
        bq.a(a).e();
    }
}
