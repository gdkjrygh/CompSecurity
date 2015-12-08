// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.c;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.jiubang.core.c:
//            f, a, b

class g extends Handler
{

    private g()
    {
    }

    g(b b)
    {
        this();
    }

    public void handleMessage(Message message)
    {
        f f1 = (f)message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            a.a(f1.a, f1.b[0]);
            return;

        case 2: // '\002'
            f1.a.b(f1.b);
            return;

        case 3: // '\003'
            f1.a.b();
            break;
        }
    }
}
