// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Html;
import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.app.remote.bg;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ei, RemoteControlView

final class ej extends Handler
{

    final Activity a;
    final ei b;

    ej(ei ei1, Looper looper, Activity activity)
    {
        b = ei1;
        a = activity;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 29
    //                   2 66;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (ei.a(b))
        {
            ei.b(b);
            ei.c(b).sendMessageDelayed(Message.obtain(this, 1), 1000L);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (ei.d(b) && ei.e(b) && (ei.f(b).n() == com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.UNCONFIRMED || ei.f(b).n() == com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.UNSTARTED || ei.f(b).n() == com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.BUFFERING))
        {
            message = Html.fromHtml(a.getString(p.bu, new Object[] {
                ei.f(b).o().getScreenName()
            })).toString();
            int i;
            if (ei.g(b))
            {
                i = p.K;
            } else
            {
                i = p.cx;
            }
            ei.h(b).a(message, i);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
