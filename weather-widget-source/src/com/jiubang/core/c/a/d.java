// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.c.a;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.jiubang.core.c.a:
//            b, a, c

class d extends Handler
{

    private WeakReference a;

    public d(b b1)
    {
        a = new WeakReference(b1);
    }

    public void handleMessage(Message message)
    {
        super.handleMessage(message);
        b b1;
        if (a != null)
        {
            b1 = (b)a.get();
        } else
        {
            b1 = null;
        }
        a a1;
        if (b1 != null)
        {
            if ((a1 = (a)message.obj) != null && b.c(b1) != null)
            {
                switch (message.what)
                {
                default:
                    return;

                case 0: // '\0'
                    b.c(b1).a(a1);
                    return;

                case 1: // '\001'
                    b.c(b1).b(a1);
                    return;

                case 2: // '\002'
                    b.c(b1).c(a1);
                    b.d(b1).remove(a1.a);
                    return;

                case 3: // '\003'
                    b.c(b1).d(a1);
                    break;
                }
                return;
            }
        }
    }
}
