// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            r, bk

final class s extends Handler
{

    final r a;

    s(r r1)
    {
        a = r1;
        super();
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            a.a.d(message.arg1);
            return;

        case 1: // '\001'
            a.a.b(message.arg1);
            break;
        }
    }
}
