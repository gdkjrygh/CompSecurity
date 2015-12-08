// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.google.android.gms.common.api:
//            ax, bd

final class bc extends Handler
{

    final ax a;

    bc(ax ax1, Looper looper)
    {
        a = ax1;
        super(looper);
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.w("GoogleApiClientImpl", (new StringBuilder()).append("Unknown message id: ").append(message.what).toString());
            return;

        case 1: // '\001'
            ax.d(a);
            return;

        case 2: // '\002'
            ax.c(a);
            return;

        case 3: // '\003'
            ((bd)message.obj).a(a);
            return;

        case 4: // '\004'
            throw (RuntimeException)message.obj;
        }
    }
}
