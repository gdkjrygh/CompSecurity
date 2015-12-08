// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.youtube.app.ui.WatchWhileLayout;
import com.google.android.apps.youtube.common.fromguava.c;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.apps.youtube.app:
//            WatchWhileActivity

final class ar extends Handler
{

    final WeakReference a;

    ar(WatchWhileActivity watchwhileactivity)
    {
        a = new WeakReference(c.a(watchwhileactivity));
    }

    public final void handleMessage(Message message)
    {
        WatchWhileActivity watchwhileactivity = (WatchWhileActivity)a.get();
        if (watchwhileactivity == null) goto _L2; else goto _L1
_L1:
        message.what;
        JVM INSTR tableswitch 1 1: default 36
    //                   1 37;
           goto _L2 _L3
_L2:
        return;
_L3:
        WatchWhileActivity.b(watchwhileactivity).f();
        return;
    }
}
