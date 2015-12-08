// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.youtube.player.internal:
//            e, aj, an

public final class ao extends e
{

    final aj a;

    protected ao(aj aj1)
    {
        a = aj1;
        super();
    }

    public final void a(String s, IBinder ibinder)
    {
        a.a.sendMessage(a.a.obtainMessage(1, new an(a, s, ibinder)));
    }
}
