// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.exoplayer:
//            h

final class i extends Handler
{

    final h a;

    i(h h1)
    {
        a = h1;
        super();
    }

    public final void handleMessage(Message message)
    {
        a.a(message);
    }
}
