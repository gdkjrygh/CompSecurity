// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.a;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.a:
//            a

final class b extends Handler
{

    final a a;

    b(a a1, Looper looper)
    {
        a = a1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        message = (Intent)message.obj;
        a.b.add(message);
    }
}
