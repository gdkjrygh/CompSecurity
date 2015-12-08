// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            l

final class m extends Handler
{

    final l a;

    m(l l1, Looper looper)
    {
        a = l1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 0)
        {
            l.a(a);
        }
    }
}
