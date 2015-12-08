// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.apps.youtube.core.player.a:
//            o

final class p extends Handler
{

    final o a;

    private p(o o1, Looper looper)
    {
        a = o1;
        super(looper);
    }

    p(o o1, Looper looper, byte byte0)
    {
        this(o1, looper);
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 1)
        {
            o.a(a, message.arg1);
        }
    }
}
