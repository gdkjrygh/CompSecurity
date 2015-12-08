// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.os.Message;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            ah, af, x

final class ag extends ah
{

    final af a;

    private ag(af af1)
    {
        a = af1;
        super(af1, (byte)0);
    }

    ag(af af1, byte byte0)
    {
        this(af1);
    }

    protected final boolean a()
    {
        return false;
    }

    public final boolean handleMessage(Message message)
    {
        if (!af.c(a)) goto _L2; else goto _L1
_L1:
        if (message.what != 7 && message.what != 4) goto _L4; else goto _L3
_L3:
        af.d(a).d();
        af.e(a);
_L2:
        return super.handleMessage(message);
_L4:
        if (message.what == 3)
        {
            af.d(a).c();
            af.e(a);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
