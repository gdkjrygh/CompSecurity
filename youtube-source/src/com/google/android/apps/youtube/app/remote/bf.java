// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.text.TextUtils;
import com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            aq, bb, RemoteControl, bd

final class bf
    implements aq
{

    final bb a;

    private bf(bb bb1)
    {
        a = bb1;
        super();
    }

    bf(bb bb1, byte byte0)
    {
        this(bb1);
    }

    private void b()
    {
        if (bb.a(a) != null)
        {
            bb.b(a).a(bb.a(a).h(), bb.a(a).k());
        }
    }

    public final void a(RemoteControl.RemotePlayerState remoteplayerstate)
    {
        Object obj = com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup.PlaybackInfo.PlaybackState.STOPPED;
        bd.a[remoteplayerstate.ordinal()];
        JVM INSTR tableswitch 1 9: default 64
    //                   1 108
    //                   2 115
    //                   3 122
    //                   4 129
    //                   5 129
    //                   6 129
    //                   7 129
    //                   8 129
    //                   9 136;
           goto _L1 _L2 _L3 _L4 _L5 _L5 _L5 _L5 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_136;
_L7:
        bb.b(a).a(((com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup.PlaybackInfo.PlaybackState) (obj)));
        obj = bb.b(a);
        boolean flag;
        if (remoteplayerstate != RemoteControl.RemotePlayerState.ADVERTISEMENT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((PlaybackControllerGroup) (obj)).b(flag);
        bb.b(a).a();
        return;
_L2:
        obj = com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup.PlaybackInfo.PlaybackState.PAUSED;
          goto _L7
_L3:
        obj = com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup.PlaybackInfo.PlaybackState.ERROR;
          goto _L7
_L4:
        obj = com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup.PlaybackInfo.PlaybackState.PLAYING;
          goto _L7
_L5:
        obj = com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup.PlaybackInfo.PlaybackState.BUFFERING;
          goto _L7
        obj = com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup.PlaybackInfo.PlaybackState.ENDED;
          goto _L7
    }

    public final void a(RemoteControl.State state)
    {
        if (state == RemoteControl.State.OFFLINE || state == RemoteControl.State.ERROR)
        {
            bb.b(a).b();
            return;
        } else
        {
            bb.b(a).a();
            return;
        }
    }

    public final void a(SubtitleTrack subtitletrack)
    {
    }

    public final void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            bb.b(a).b(s);
        }
        b();
    }

    public final void a(List list)
    {
        b();
    }

    public final void l_()
    {
    }
}
