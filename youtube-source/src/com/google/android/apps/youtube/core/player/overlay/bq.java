// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.os.CountDownTimer;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            bo

final class bq extends CountDownTimer
{

    final bo a;

    public bq(bo bo1, int i)
    {
        a = bo1;
        super(i, 1000L);
    }

    public final void onFinish()
    {
        bo.a(a, 0L);
    }

    public final void onTick(long l)
    {
        bo.a(a, l);
    }
}
