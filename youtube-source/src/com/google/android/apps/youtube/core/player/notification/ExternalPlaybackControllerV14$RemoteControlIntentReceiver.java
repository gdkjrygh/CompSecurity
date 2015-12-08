// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

// Referenced classes of package com.google.android.apps.youtube.core.player.notification:
//            ExternalPlaybackControllerV14, j

public class  extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        if (ExternalPlaybackControllerV14.b() == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) goto _L2; else goto _L1
_L1:
        context = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (context.getAction() != 1) goto _L2; else goto _L3
_L3:
        context.getKeyCode();
        JVM INSTR lookupswitch 6: default 108
    //                   85: 127
    //                   86: 154
    //                   87: 136
    //                   88: 145
    //                   126: 109
    //                   127: 118;
           goto _L2 _L4 _L5 _L6 _L7 _L8 _L9
_L2:
        return;
_L8:
        ExternalPlaybackControllerV14.b().b();
        return;
_L9:
        ExternalPlaybackControllerV14.b().c();
        return;
_L4:
        ExternalPlaybackControllerV14.b().d();
        return;
_L6:
        ExternalPlaybackControllerV14.b().f();
        return;
_L7:
        ExternalPlaybackControllerV14.b().e();
        return;
_L5:
        ExternalPlaybackControllerV14.b().g();
        return;
    }

    public ()
    {
    }
}
