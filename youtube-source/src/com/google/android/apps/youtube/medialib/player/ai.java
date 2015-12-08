// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.youtube.common.L;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            ah, af, x, aj

final class ai extends ah
{

    final af a;
    private int c;

    private ai(af af1)
    {
        a = af1;
        super(af1, (byte)0);
    }

    ai(af af1, byte byte0)
    {
        this(af1);
    }

    public final boolean handleMessage(Message message)
    {
        if (!af.c(a)) goto _L2; else goto _L1
_L1:
        if (message.what == 8)
        {
            af.e(a);
            return super.handleMessage(message);
        }
        if (message.what != 10) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        j = af.d(a).f();
        i = af.f(a).f();
        j -= i;
        if (j <= 50) goto _L6; else goto _L5
_L5:
        L.d((new StringBuilder("Foreground sync is ahead by ")).append(j).toString());
        c = 0;
        af.d(a).c();
        (new Handler()).postDelayed(new aj(this), j);
_L4:
        return true;
_L6:
        if (j < -50)
        {
            int k = c;
            c = k + 1;
            if (k < 2)
            {
                L.d((new StringBuilder("Foreground sync is behind. Retry seek ahead: ")).append(c).toString());
                af.d(a).a(i + 4000);
                continue; /* Loop/switch isn't completed */
            }
        }
        L.d((new StringBuilder("Foreground synced with time diff: ")).append(j).append(", retries: ").append(c).toString());
        c = 0;
        af.e(a);
        if (true) goto _L4; else goto _L2
_L2:
        return super.handleMessage(message);
    }
}
