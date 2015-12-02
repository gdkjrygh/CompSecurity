// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.s;

// Referenced classes of package com.whatsapp:
//            akr

class _t extends Handler
{

    final akr a;

    _t(akr akr1)
    {
        a = akr1;
        super();
    }

    public void handleMessage(Message message)
    {
        if (akr.e(a) != null)
        {
            if (!akr.e(a).f())
            {
                if (!akr.c(a))
                {
                    a.b();
                    return;
                }
            } else
            {
                akr.a(a, a.g());
                sendEmptyMessageDelayed(0, 50L);
                return;
            }
        }
    }
}
