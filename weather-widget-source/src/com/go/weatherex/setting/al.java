// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.go.weatherex.setting:
//            aj

class al extends Handler
{

    final WeakReference a;

    public al(aj aj1)
    {
        a = new WeakReference(aj1);
    }

    public void handleMessage(Message message)
    {
        aj aj1 = (aj)a.get();
        if (aj1 == null)
        {
            return;
        }
        switch (message.arg1)
        {
        default:
            return;

        case 1: // '\001'
            aj.a(aj1, true);
            return;

        case 2: // '\002'
            aj.a(aj1, false);
            break;
        }
    }
}
