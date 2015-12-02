// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.whatsapp.messaging:
//            as, t

class b5 extends Handler
{

    final as a;

    private b5(as as1)
    {
        a = as1;
        super();
    }

    b5(as as1, t t)
    {
        this(as1);
    }

    public void a()
    {
        removeMessages(0);
    }

    public void a(long l)
    {
        sendEmptyMessageDelayed(0, l);
    }

    public boolean b()
    {
        return hasMessages(0);
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            as.h(a);
            break;
        }
    }
}
