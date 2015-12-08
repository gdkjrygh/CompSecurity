// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import com.google.android.apps.youtube.core.player.event.ScriptedPlaybackEvent;
import com.google.android.apps.youtube.core.player.event.SequencerNavigationRequestEvent;
import com.google.android.apps.youtube.core.player.event.ac;
import com.google.android.apps.youtube.core.player.event.s;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            h, DefaultPlaybackMonitor

final class i
{

    final DefaultPlaybackMonitor a;
    private String b;
    private volatile SequencerNavigationRequestEvent c;
    private volatile int d;
    private volatile boolean e;
    private volatile DefaultPlaybackMonitor.ScriptedPlayState f;

    private i(DefaultPlaybackMonitor defaultplaybackmonitor)
    {
        a = defaultplaybackmonitor;
        super();
        f = DefaultPlaybackMonitor.ScriptedPlayState.USER_PLAY;
    }

    i(DefaultPlaybackMonitor defaultplaybackmonitor, byte byte0)
    {
        this(defaultplaybackmonitor);
    }

    static int a(i j)
    {
        return j.d;
    }

    static boolean b(i j)
    {
        return j.c == SequencerNavigationRequestEvent.AUTOPLAY || j.e;
    }

    static boolean c(i j)
    {
        return j.f == DefaultPlaybackMonitor.ScriptedPlayState.SCRIPTED_PLAY;
    }

    static String d(i j)
    {
        return j.b;
    }

    private void handlePlaybackScriptedOperationEvent(ScriptedPlaybackEvent scriptedplaybackevent)
    {
        switch (h.c[scriptedplaybackevent.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            f = DefaultPlaybackMonitor.ScriptedPlayState.SCRIPTED_NAVIGATION_PENDING;
            return;

        case 2: // '\002'
            f = DefaultPlaybackMonitor.ScriptedPlayState.SCRIPTED_PLAY;
            break;
        }
    }

    private void handleSequenceChangedEvent(s s1)
    {
        b = s1.a();
    }

    private void handleSequencerNavigationRequestEvent(SequencerNavigationRequestEvent sequencernavigationrequestevent)
    {
        h.a[sequencernavigationrequestevent.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 67
    //                   2 75
    //                   3 75
    //                   4 75
    //                   5 75;
           goto _L1 _L2 _L3 _L3 _L3 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_75;
_L4:
        c = sequencernavigationrequestevent;
        if (f == DefaultPlaybackMonitor.ScriptedPlayState.SCRIPTED_NAVIGATION_PENDING)
        {
            f = DefaultPlaybackMonitor.ScriptedPlayState.SCRIPTED_PLAY;
            return;
        } else
        {
            f = DefaultPlaybackMonitor.ScriptedPlayState.USER_PLAY;
            return;
        }
_L2:
        e = true;
          goto _L4
        d = 0;
        e = false;
          goto _L4
    }

    private void handleVideoStageEvent(ac ac1)
    {
        h.b[ac1.c().ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 56;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (e)
        {
            d = d + 1;
            e = false;
            return;
        }
          goto _L1
_L3:
        d = 0;
        e = false;
        return;
    }
}
