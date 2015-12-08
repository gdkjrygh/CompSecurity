// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.u;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            p, m

final class o extends Handler
{

    final m a;

    public o(m m1, Looper looper)
    {
        a = m1;
        super(looper);
    }

    private void a(Message message)
    {
        message = (p)message.obj;
        message.b();
        message.d();
    }

    private boolean b(Message message)
    {
        return message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6;
    }

    public void handleMessage(Message message)
    {
        if (a.b.get() != message.arg1)
        {
            if (b(message))
            {
                a(message);
            }
            return;
        }
        if ((message.what == 1 || message.what == 5 || message.what == 6) && !a.h())
        {
            a(message);
            return;
        }
        if (message.what == 3)
        {
            message = new ConnectionResult(message.arg2, null);
            m.a(a).a(message);
            a.a(message);
            return;
        }
        if (message.what == 4)
        {
            m.a(a, 4, null);
            if (m.b(a) != null)
            {
                m.b(a).a(message.arg2);
            }
            a.a(message.arg2);
            m.a(a, 4, 1, null);
            return;
        }
        if (message.what == 2 && !a.b())
        {
            a(message);
            return;
        }
        if (b(message))
        {
            ((p)message.obj).c();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }
}
