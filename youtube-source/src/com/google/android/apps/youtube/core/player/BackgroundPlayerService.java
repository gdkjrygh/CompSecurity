// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.apps.youtube.core.BaseApplication;
import com.google.android.apps.youtube.core.a;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;
import com.google.android.apps.youtube.core.player.event.ac;
import com.google.android.apps.youtube.core.player.event.ae;
import com.google.android.apps.youtube.core.player.event.af;
import com.google.android.apps.youtube.core.player.event.u;
import com.google.android.apps.youtube.core.player.event.z;
import com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup;
import com.google.android.apps.youtube.core.player.overlay.ControlsState;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.exoplayer.e.k;
import com.google.android.youtube.h;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            f, ae, g, e

public class BackgroundPlayerService extends Service
{

    private PlaybackControllerGroup a;
    private com.google.android.apps.youtube.core.player.ae b;
    private com.google.android.apps.youtube.common.c.a c;
    private boolean d;
    private long e;
    private boolean f;

    public BackgroundPlayerService()
    {
    }

    static long a(BackgroundPlayerService backgroundplayerservice)
    {
        return backgroundplayerservice.e;
    }

    static com.google.android.apps.youtube.core.player.ae b(BackgroundPlayerService backgroundplayerservice)
    {
        return backgroundplayerservice.b;
    }

    static PlaybackControllerGroup c(BackgroundPlayerService backgroundplayerservice)
    {
        return backgroundplayerservice.a;
    }

    static boolean d(BackgroundPlayerService backgroundplayerservice)
    {
        return backgroundplayerservice.d;
    }

    private void handlePlaybackServiceException(PlaybackServiceException playbackserviceexception)
    {
        a.a(com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup.PlaybackInfo.PlaybackState.ERROR);
        stopForeground(false);
    }

    private void handleSequencerHasPreviousNextEvent(u u1)
    {
        a.a(u1.a(), u1.b());
    }

    private void handleVideoControlsStateEvent(z z1)
    {
        com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup.PlaybackInfo.PlaybackState playbackstate = com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup.PlaybackInfo.PlaybackState.STOPPED;
        com.google.android.apps.youtube.core.player.f.a[z1.a.ordinal()];
        JVM INSTR tableswitch 1 7: default 56
    //                   1 67
    //                   2 67
    //                   3 74
    //                   4 81
    //                   5 88
    //                   6 95
    //                   7 95;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L6 _L6
_L1:
        z1 = playbackstate;
_L8:
        a.a(z1);
        return;
_L2:
        z1 = com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup.PlaybackInfo.PlaybackState.BUFFERING;
        continue; /* Loop/switch isn't completed */
_L3:
        z1 = com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup.PlaybackInfo.PlaybackState.PLAYING;
        continue; /* Loop/switch isn't completed */
_L4:
        z1 = com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup.PlaybackInfo.PlaybackState.PAUSED;
        continue; /* Loop/switch isn't completed */
_L5:
        z1 = com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup.PlaybackInfo.PlaybackState.ENDED;
        continue; /* Loop/switch isn't completed */
_L6:
        z1 = com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup.PlaybackInfo.PlaybackState.ERROR;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void handleVideoStageEvent(ac ac1)
    {
        Object obj = a;
        boolean flag;
        if (!ac1.c().onAd())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((PlaybackControllerGroup) (obj)).b(flag);
        obj = ac1.c();
        if (((Director.VideoStage) (obj)).isIn(new Director.VideoStage[] {
    Director.VideoStage.ENDED
}))
        {
            stopForeground(false);
        } else
        if ((((Director.VideoStage) (obj)).isIn(new Director.VideoStage[] {
    Director.VideoStage.PLAYBACK_LOADED
}) || f && ((Director.VideoStage) (obj)).isOrPast(Director.VideoStage.PLAYBACK_LOADED)) && !TextUtils.isEmpty(ac1.d().getPlayerResponse().getVideoId()))
        {
            f = false;
            if (ac1.d().getPlayerResponse() != null)
            {
                a.b(ac1.d().getPlayerResponse().getVideoId());
                return;
            }
        }
    }

    private void handleVideoTimeEvent(ae ae1)
    {
        e = ae1.a();
    }

    private void handleYouTubePlayerStateEvent(af af1)
    {
        boolean flag;
        if (af1.a() == 2 || af1.a() == 6)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        af1.a();
        JVM INSTR tableswitch 2 4: default 56
    //                   2 62
    //                   3 56
    //                   4 80;
           goto _L1 _L2 _L1 _L3
_L1:
        return;
_L2:
        if (b.w())
        {
            a.a();
            return;
        }
          goto _L1
_L3:
        stopForeground(false);
        return;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        BaseApplication baseapplication = (BaseApplication)getApplication();
        a a1 = baseapplication.y();
        c = a1.bf();
        a = new PlaybackControllerGroup(baseapplication.getApplicationContext(), a1.f(), a1.aw(), a1.aT(), a1.q(), a1.aX(), a1.aY(), a1.g(), new g(this, (byte)0), getString(p.z, new Object[] {
            a1.aY()
        }), h.ae, null, (byte)0);
        b = a1.ac();
        if (k.a >= 18)
        {
            a.a(new e(this));
        }
    }

    public void onDestroy()
    {
        c.b(this);
        c.b(a);
        if (b.w())
        {
            b.k();
        }
        a.b();
        a = null;
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent.getBooleanExtra("background_mode", false))
        {
            f = true;
            c.a(this);
            b.v();
            if (d)
            {
                a.a();
            }
        } else
        {
            c.b(this);
            a.b();
        }
        return 2;
    }

    public void onTaskRemoved(Intent intent)
    {
        b.E();
        stopSelf();
    }
}
