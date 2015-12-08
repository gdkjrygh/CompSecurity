// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.ui:
//            g

final class i extends Handler
{

    WeakReference a;

    public i(g g1)
    {
        a = new WeakReference(g1);
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (a.get() != null)
        {
            g.b((g)a.get());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
