// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.content.Context;
import android.os.Message;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;
import com.google.android.apps.youtube.core.player.event.ad;
import com.google.android.apps.youtube.core.player.event.k;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.medialib.player.l;
import com.google.android.apps.youtube.medialib.player.x;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            Director, PlaybackClientManager, n

final class m
    implements android.os.Handler.Callback
{

    final Director a;

    private m(Director director)
    {
        a = director;
        super();
    }

    m(Director director, byte byte0)
    {
        this(director);
    }

    public final boolean handleMessage(Message message)
    {
        boolean flag;
        flag = false;
        L.e((new StringBuilder("PlayerEvent: ")).append(message.what).toString());
        message.what;
        JVM INSTR lookupswitch 7: default 96
    //                   0: 272
    //                   1: 286
    //                   2: 286
    //                   4: 323
    //                   8: 323
    //                   13: 337
    //                   16: 394;
           goto _L1 _L2 _L3 _L3 _L4 _L4 _L5 _L6
_L1:
        if (!Director.b(a).isPlaying()) goto _L8; else goto _L7
_L7:
        message.what;
        JVM INSTR tableswitch 2 15: default 184
    //                   2 434
    //                   3 643
    //                   4 584
    //                   5 673
    //                   6 694
    //                   7 760
    //                   8 824
    //                   9 1335
    //                   10 184
    //                   11 715
    //                   12 184
    //                   13 184
    //                   14 184
    //                   15 1353;
           goto _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L9 _L18 _L9 _L9 _L9 _L19
_L9:
        int i = ((flag) ? 1 : 0);
        message.what;
        JVM INSTR tableswitch 2 11: default 244
    //                   2 1370
    //                   3 1370
    //                   4 1370
    //                   5 1370
    //                   6 1370
    //                   7 1370
    //                   8 1370
    //                   9 1370
    //                   10 247
    //                   11 1370;
           goto _L20 _L21 _L21 _L21 _L21 _L21 _L21 _L21 _L21 _L22 _L21
_L20:
        i = ((flag) ? 1 : 0);
_L22:
        if (i != 0)
        {
            com.google.android.apps.youtube.core.player.Director.a(a, message.what);
            com.google.android.apps.youtube.core.player.Director.p(a);
        }
_L8:
        return true;
_L2:
        com.google.android.apps.youtube.core.player.Director.a(a, Director.PlayerState.PREPARING);
          goto _L1
_L3:
        if (Director.c(a) != Director.PlayerState.PREPARED)
        {
            com.google.android.apps.youtube.core.player.Director.a(a, "PlayStarted", -1);
        }
        com.google.android.apps.youtube.core.player.Director.a(a, Director.PlayerState.PREPARED);
          goto _L1
_L4:
        com.google.android.apps.youtube.core.player.Director.a(a, Director.PlayerState.NOT_PREPARED);
          goto _L1
_L5:
        l l1 = (l)message.obj;
        Director.d(a).a(l1.a().getItag(), l1.b().getItag(), l1.e(), l1.a().isWidevine());
        Director.e(a).c(l1);
          goto _L1
_L6:
        a a1 = Director.e(a);
        boolean flag1;
        if (message.arg1 != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a1.c(new ad(flag1));
          goto _L1
_L10:
        PlaybackClientManager playbackclientmanager = Director.d(a);
        long l2;
        if (Director.b(a).onAd())
        {
            l2 = Director.f(a);
        } else
        {
            l2 = Director.g(a);
        }
        playbackclientmanager.b(l2);
        com.google.android.apps.youtube.core.player.Director.h(a).a();
        if (a.b(Director.VideoStage.MEDIA_AD_PLAY_REQUESTED))
        {
            com.google.android.apps.youtube.core.player.Director.a(a, Director.VideoStage.MEDIA_PLAYING_AD);
            Director.e(a).a(new k());
        }
        if (a.b(Director.VideoStage.MEDIA_VIDEO_PLAY_REQUESTED))
        {
            com.google.android.apps.youtube.core.player.Director.a(a, Director.VideoStage.MEDIA_PLAYING_VIDEO);
            Director.e(a).a(new k());
        }
        Director.i(a);
          goto _L9
_L12:
        if (Director.b(a).isPlayingVideo())
        {
            com.google.android.apps.youtube.core.player.Director.a(a, "PlayStopped", a.w());
        }
        Director.d(a).f();
        Director.i(a);
        com.google.android.apps.youtube.core.player.Director.h(a).b();
          goto _L9
_L11:
        Director.d(a).e();
        Director.i(a);
        com.google.android.apps.youtube.core.player.Director.h(a).b();
          goto _L9
_L13:
        Director.d(a).a(true);
        Director.i(a);
          goto _L9
_L14:
        Director.d(a).a(false);
        Director.i(a);
          goto _L9
_L18:
        if (Director.j(a) == 1 && com.google.android.apps.youtube.core.player.Director.k(a).a().isHD())
        {
            L.d("Notified about buffer underrun, switching to lq stream");
            com.google.android.apps.youtube.core.player.Director.a(a, true);
        }
          goto _L9
_L15:
        com.google.android.apps.youtube.core.player.Director.a(a, "PlayEnded", -1);
        Director.d(a).g();
        if (Director.b(a).isPlayingAd())
        {
            Director.b(a, false);
        } else
        {
            com.google.android.apps.youtube.core.player.Director.l(a);
        }
        com.google.android.apps.youtube.core.player.Director.h(a).c();
          goto _L9
_L16:
        if (Director.m(a) && Director.b(a).isPlayingAd() && (message.obj instanceof com.google.android.apps.youtube.medialib.player.YouTubePlayerEvents.CantPlayStreamException))
        {
            Director.o(a).a("AdAbandonedInBackground", null, Director.n(a));
        } else
        {
            Director.d(a).a(message.arg1, message.arg2, com.google.android.apps.youtube.core.player.Director.k(a).f(), message.obj);
            com.google.android.apps.youtube.core.player.Director.a(a, message.obj, message.arg1, message.arg2);
        }
        if (!Director.b(a).isPlayingAd()) goto _L24; else goto _L23
_L23:
        Director.b(a, true);
_L27:
        com.google.android.apps.youtube.core.player.Director.h(a).b();
          goto _L9
_L24:
        int j;
        int i1;
        j = message.arg1;
        i1 = message.arg2;
        i = p.eH;
        if (Director.q(a).a()) goto _L26; else goto _L25
_L25:
        boolean flag2;
        i = p.cO;
        flag2 = true;
_L32:
        com.google.android.apps.youtube.core.player.Director.a(a, new PlaybackServiceException(com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.PLAYER_ERROR, flag2, Director.r(a).getString(i)));
        if (flag2 && Director.b(a).isPlayingVideo())
        {
            Director.b(a, com.google.android.apps.youtube.core.player.Director.k(a).f());
        }
          goto _L27
_L26:
        if (j != 1) goto _L29; else goto _L28
_L28:
        if (i1 != -1002) goto _L31; else goto _L30
_L30:
        i = p.gl;
        flag2 = true;
          goto _L32
_L31:
        if (i1 != -1003) goto _L34; else goto _L33
_L33:
        i = p.gl;
        flag2 = true;
          goto _L32
_L34:
        if (i1 != -1004) goto _L36; else goto _L35
_L35:
        i = p.aA;
        flag2 = true;
          goto _L32
_L36:
        if (i1 != -1005) goto _L38; else goto _L37
_L37:
        i = p.aA;
        flag2 = true;
          goto _L32
_L38:
        if (i1 != -1010) goto _L40; else goto _L39
_L39:
        i = p.go;
        flag2 = false;
          goto _L32
_L40:
        if (i1 != 33) goto _L42; else goto _L41
_L41:
        i = p.H;
        flag2 = true;
          goto _L32
_L42:
        if (i1 != com.google.android.apps.youtube.medialib.player.p.a) goto _L44; else goto _L43
_L43:
        i = p.aS;
        flag2 = true;
          goto _L32
_L44:
        if (i1 != com.google.android.apps.youtube.medialib.player.p.b) goto _L46; else goto _L45
_L45:
        i = p.aW;
        flag2 = false;
          goto _L32
_L46:
        if (i1 != com.google.android.apps.youtube.medialib.player.p.c) goto _L48; else goto _L47
_L47:
        i = p.aU;
        flag2 = true;
          goto _L32
_L48:
        if (i1 != com.google.android.apps.youtube.medialib.player.p.d) goto _L50; else goto _L49
_L49:
        i = p.aY;
        flag2 = false;
          goto _L32
_L50:
        if (i1 != com.google.android.apps.youtube.medialib.player.p.e) goto _L52; else goto _L51
_L51:
        i = p.aX;
        flag2 = true;
          goto _L32
_L52:
        if (i1 != com.google.android.apps.youtube.medialib.player.p.f) goto _L54; else goto _L53
_L53:
        i = p.aT;
        flag2 = false;
          goto _L32
_L54:
        if (i1 != com.google.android.apps.youtube.medialib.player.p.g) goto _L56; else goto _L55
_L55:
        i = p.aV;
        flag2 = true;
          goto _L32
_L56:
        if (i1 != com.google.android.apps.youtube.medialib.player.p.h) goto _L29; else goto _L57
_L57:
        i = p.aA;
        flag2 = true;
          goto _L32
_L17:
        Director.d(a).a(true, message.arg1);
          goto _L9
_L19:
        Director.d(a).a(message.arg1);
          goto _L9
_L21:
        i = 1;
          goto _L22
_L29:
        flag2 = true;
          goto _L32
    }
}
