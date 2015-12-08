// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;

// Referenced classes of package com.google.android.gms.internal:
//            fd, fg, fo

final class ff extends Handler
{

    final fd a;

    public ff(fd fd1, Looper looper)
    {
        a = fd1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 1 && !a.f())
        {
            ((fg)message.obj).b();
            return;
        }
        synchronized (fd.b(a))
        {
            a.c = false;
        }
        if (message.what == 3)
        {
            com.google.android.gms.internal.fd.a(a).a(new a(((Integer)message.obj).intValue(), null));
            return;
        }
        if (message.what == 4)
        {
            com.google.android.gms.internal.fd.a(a).a(((Integer)message.obj).intValue());
            return;
        }
        if (message.what == 2 && !a.e())
        {
            ((fg)message.obj).b();
            return;
        }
        if (message.what == 2 || message.what == 1)
        {
            ((fg)message.obj).a();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }
}
