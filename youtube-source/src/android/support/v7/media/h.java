// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v7.media:
//            f

final class h extends Handler
{

    final f a;

    private h(f f1)
    {
        a = f1;
        super();
    }

    h(f f1, byte byte0)
    {
        this(f1);
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            f.a(a);
            return;

        case 2: // '\002'
            f.b(a);
            break;
        }
    }
}
