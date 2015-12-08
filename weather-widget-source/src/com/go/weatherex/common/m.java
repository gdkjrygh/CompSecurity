// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.common;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.go.weatherex.common:
//            l, g, h

class m extends Handler
{

    private m()
    {
    }

    m(h h)
    {
        this();
    }

    public void handleMessage(Message message)
    {
        l l1 = (l)message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            g.c(l1.a, l1.b[0]);
            return;

        case 2: // '\002'
            l1.a.b(l1.b);
            break;
        }
    }
}
