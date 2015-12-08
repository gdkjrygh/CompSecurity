// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;
import com.google.android.apps.youtube.core.player.event.ab;
import com.google.android.apps.youtube.core.player.event.ac;
import com.google.android.apps.youtube.core.player.event.ae;
import com.google.android.apps.youtube.core.player.event.u;
import com.google.android.apps.youtube.core.player.event.z;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.medialib.player.l;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            ControlsOverlay, s, DefaultControlsOverlay, r, 
//            ControlsState, t

public final class q
{

    private final com.google.android.apps.youtube.core.player.ae a;
    private final a b;
    private final ControlsOverlay c;
    private t d;
    private boolean e;

    public q(com.google.android.apps.youtube.core.player.ae ae1, a a1, ControlsOverlay controlsoverlay)
    {
        a = ae1;
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        c = (ControlsOverlay)com.google.android.apps.youtube.common.fromguava.c.a(controlsoverlay);
        controlsoverlay.setListener(new s(this, (byte)0));
    }

    static com.google.android.apps.youtube.core.player.ae a(q q1)
    {
        return q1.a;
    }

    static ControlsOverlay b(q q1)
    {
        return q1.c;
    }

    static t c(q q1)
    {
        return q1.d;
    }

    static boolean d(q q1)
    {
        return q1.e;
    }

    static a e(q q1)
    {
        return q1.b;
    }

    public final void a(t t)
    {
        d = t;
    }

    public final void a(List list)
    {
        c.a(list);
    }

    public final void a(boolean flag)
    {
        c.setHasCc(flag);
    }

    public final void b(boolean flag)
    {
        c.setCcEnabled(flag);
    }

    public final void handleAudioOnlyEvent(com.google.android.apps.youtube.core.player.event.a a1)
    {
        e = a1.a();
        c.setAudioOnlyEnabled(e);
        if (c instanceof DefaultControlsOverlay)
        {
            ((DefaultControlsOverlay)c).setAlwaysShowControls(e);
        }
    }

    public final void handleFormatStreamChangeEvent(l l1)
    {
        c.setHQ(l1.c());
        c.setHQisHD(l1.b().isHD());
        c.setSupportsQualityToggle(l1.d());
    }

    public final void handlePlaybackServiceException(PlaybackServiceException playbackserviceexception)
    {
        if (playbackserviceexception.reason.isCritical())
        {
            c.setErrorAndShowMessage(playbackserviceexception.getMessage(), playbackserviceexception.isRetriable);
        }
    }

    public final void handleSequencerHasPreviousNextEvent(u u1)
    {
        c.setHasPrevious(u1.a());
        c.setHasNext(u1.b());
    }

    public final void handleVideoControlsStateEvent(z z1)
    {
        switch (com.google.android.apps.youtube.core.player.overlay.r.a[z1.a.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            c.setInitial();
            return;

        case 2: // '\002'
            c.setPlaying();
            return;

        case 3: // '\003'
            c.setAndShowPaused();
            return;

        case 4: // '\004'
            c.setLoading();
            return;

        case 5: // '\005'
        case 6: // '\006'
            throw new IllegalStateException("This method shouldn't be used for errors.");

        case 7: // '\007'
            c.setAndShowEnded();
            break;
        }
    }

    public final void handleVideoFullscreenEvent(ab ab1)
    {
        c.setFullscreen(ab1.a());
        c.setShowFullscreen(ab1.b());
    }

    public final void handleVideoStageEvent(ac ac1)
    {
        boolean flag;
        boolean flag3;
        boolean flag4;
        flag3 = true;
        flag4 = true;
        flag = true;
        if (ac1.c() != com.google.android.apps.youtube.core.player.Director.VideoStage.NEW) goto _L2; else goto _L1
_L1:
        c.g();
        c.setStyle(ControlsOverlay.Style.YOUTUBE);
_L4:
        flag = ac1.c().isOrPast(com.google.android.apps.youtube.core.player.Director.VideoStage.READY);
        c.setScrubbingEnabled(flag);
        return;
_L2:
        if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.AD_LOADED)
        {
            c.setStyle(ControlsOverlay.Style.AD);
            ControlsOverlay controlsoverlay = c;
            if (ac1.e() == null || ac1.e().getClickthroughUri() == null)
            {
                flag = false;
            }
            controlsoverlay.setLearnMoreEnabled(flag);
        } else
        if (ac1.c().isPlayingVideo())
        {
            ControlsOverlay controlsoverlay1 = c;
            boolean flag1;
            if (ac1.d() != null && ac1.d().getPlayerResponse().getInfoCardCollection() != null)
            {
                flag1 = flag3;
            } else
            {
                flag1 = false;
            }
            controlsoverlay1.setHasInfoCard(flag1);
            if (!ac1.f())
            {
                c.setStyle(ControlsOverlay.Style.YOUTUBE);
            } else
            {
                c.setStyle(ControlsOverlay.Style.LIVE);
            }
        } else
        if (ac1.c().isPlayingAd())
        {
            ControlsOverlay controlsoverlay2 = c;
            boolean flag2;
            if (ac1.e() != null && ac1.e().adInfoCards != null)
            {
                flag2 = flag4;
            } else
            {
                flag2 = false;
            }
            controlsoverlay2.setHasInfoCard(flag2);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void handleVideoTimeEvent(ae ae1)
    {
        c.setTimes(ae1.a(), ae1.b(), ae1.c());
    }
}
