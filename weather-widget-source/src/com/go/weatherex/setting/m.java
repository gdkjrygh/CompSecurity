// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.go.weatherex.setting:
//            k

class m extends Handler
{

    final WeakReference a;

    public m(k k1)
    {
        a = new WeakReference(k1);
    }

    public void handleMessage(Message message)
    {
        k k1 = (k)a.get();
        if (k1 == null)
        {
            return;
        }
        switch (message.arg1)
        {
        default:
            return;

        case 1: // '\001'
            k.a(k1, true);
            return;

        case 2: // '\002'
            k.a(k1, false);
            break;
        }
    }
}
