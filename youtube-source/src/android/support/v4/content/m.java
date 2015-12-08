// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v4.content:
//            l, ModernAsyncTask

final class m extends Handler
{

    private m()
    {
    }

    m(byte byte0)
    {
        this();
    }

    public final void handleMessage(Message message)
    {
        l l1 = (l)message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            ModernAsyncTask.a(l1.a, l1.b[0]);
            return;

        case 2: // '\002'
            message = l1.a;
            break;
        }
        message = ((Message) (l1.b));
        ModernAsyncTask.a();
    }
}
