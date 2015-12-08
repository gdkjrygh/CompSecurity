// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.b;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            fo, fq

final class fp extends Handler
{

    final fo a;

    public fp(fo fo1, Looper looper)
    {
        a = fo1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 1)
        {
            synchronized (fo.a(a))
            {
                if (com.google.android.gms.internal.fo.b(a).k() && com.google.android.gms.internal.fo.b(a).e() && fo.a(a).contains(message.obj))
                {
                    com.google.android.gms.internal.fo.b(a);
                    ((b)message.obj).a(null);
                }
            }
            return;
        } else
        {
            Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
            return;
        }
    }
}
