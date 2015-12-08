// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.a;

import android.os.Handler;
import android.os.Message;
import com.jiubang.core.a.i;
import java.lang.ref.WeakReference;

// Referenced classes of package com.go.weatherex.home.a:
//            f, k

class g extends Handler
{

    WeakReference a;

    public g(f f1)
    {
        a = new WeakReference(f1);
    }

    public void handleMessage(Message message)
    {
        super.handleMessage(message);
        f f1 = (f)a.get();
        if (f1 == null)
        {
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            message = ((Message) ((Object[])(Object[])message.obj));
            break;
        }
        f.b(f1, (k)message[0], (i)message[1]);
    }
}
