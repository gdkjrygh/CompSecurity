// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.common.L;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            an, RemoteControl

public class MediaButtonIntentReceiver extends BroadcastReceiver
{

    public MediaButtonIntentReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        L.e((new StringBuilder("Received intent: ")).append(intent).toString());
        context = (YouTubeApplication)context.getApplicationContext();
        if (!"android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        intent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        context = context.p().e();
        if (context == null || context.b() != RemoteControl.State.CONNECTED || intent.getAction() != 1) goto _L2; else goto _L3
_L3:
        intent.getKeyCode();
        JVM INSTR tableswitch 85 88: default 116
    //                   85 136
    //                   86 116
    //                   87 186
    //                   88 202;
           goto _L4 _L5 _L4 _L6 _L7
_L4:
        L.c((new StringBuilder("Unrecognized event: ")).append(intent).toString());
_L2:
        return;
_L5:
        if (context.n() == RemoteControl.RemotePlayerState.PLAYING)
        {
            context.f();
            return;
        }
        if (context.n() == RemoteControl.RemotePlayerState.PAUSED || context.n() == RemoteControl.RemotePlayerState.ENDED)
        {
            context.e();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (context.k())
        {
            context.m();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (context.h())
        {
            context.i();
            return;
        }
        if (!TextUtils.isEmpty(context.p()))
        {
            context.c(0);
            return;
        }
        if (true) goto _L2; else goto _L8
_L8:
    }
}
