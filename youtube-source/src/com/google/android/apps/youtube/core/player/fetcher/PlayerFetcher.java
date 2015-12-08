// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.fetcher;

import com.google.android.apps.youtube.common.b.b;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.GDataResponseException;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.core.player.event.m;
import com.google.android.apps.youtube.core.player.w;
import com.google.android.apps.youtube.datalib.a.k;
import com.google.android.apps.youtube.datalib.innertube.ag;
import com.google.android.apps.youtube.datalib.innertube.ah;
import com.google.android.apps.youtube.datalib.innertube.ak;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.innertube.model.media.VideoStreamingData;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.apps.youtube.datalib.legacy.model.u;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpResponseException;

// Referenced classes of package com.google.android.apps.youtube.core.player.fetcher:
//            b, c, a

public final class PlayerFetcher
{

    public static final byte a[];
    private final a b;
    private final ah c;
    private final bc d;
    private final w e;
    private final l f;
    private final q g;
    private final Executor h;
    private final Executor i;
    private final ag j;
    private final com.google.android.apps.youtube.common.e.b k;

    protected PlayerFetcher()
    {
        b = null;
        c = null;
        e = null;
        f = null;
        g = null;
        d = null;
        h = null;
        i = null;
        j = null;
        k = null;
    }

    public PlayerFetcher(a a1, ah ah1, w w1, bc bc1, l l1, q q1, Executor executor, 
            ag ag1, com.google.android.apps.youtube.common.e.b b1)
    {
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        c = (ah)com.google.android.apps.youtube.common.fromguava.c.a(ah1);
        e = (w)com.google.android.apps.youtube.common.fromguava.c.a(w1);
        d = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        f = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        g = (q)com.google.android.apps.youtube.common.fromguava.c.a(q1);
        h = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        i = new b();
        j = (ag)com.google.android.apps.youtube.common.fromguava.c.a(ag1);
        k = (com.google.android.apps.youtube.common.e.b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
    }

    private PlaybackPair a(String s, PlayerResponse playerresponse, Video video)
    {
        Object obj;
        VideoStreamingData videostreamingdata;
        if (playerresponse == null)
        {
            videostreamingdata = null;
        } else
        {
            videostreamingdata = playerresponse.getVideoStreamingData();
        }
        obj = playerresponse;
        if (videostreamingdata == null) goto _L2; else goto _L1
_L1:
        if (!f.b())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        obj = g.a(f.c());
_L3:
        s = ((OfflineStoreInterface) (obj)).b(s, videostreamingdata.getExpirationInElapsedTimeMillis());
        obj = playerresponse;
        if (s != null)
        {
            obj = playerresponse;
            try
            {
                if (!s.e())
                {
                    obj = playerresponse.cloneAndMergeOfflineStreams(s.c(), s.d());
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                obj = playerresponse;
            }
        }
_L2:
        return new PlaybackPair(((PlayerResponse) (obj)), video);
        obj = g.a();
          goto _L3
    }

    static void a(PlayerFetcher playerfetcher, com.google.android.apps.youtube.common.a.b b1, PlaybackPair playbackpair)
    {
        playerfetcher.i.execute(new com.google.android.apps.youtube.core.player.fetcher.b(playerfetcher, b1, playbackpair));
    }

    static void a(PlayerFetcher playerfetcher, com.google.android.apps.youtube.common.a.b b1, Exception exception)
    {
        playerfetcher.i.execute(new com.google.android.apps.youtube.core.player.fetcher.c(playerfetcher, b1, exception));
    }

    public final PlaybackPair a(String s, byte abyte0[], String s1, String s2, int i1, int j1)
    {
        return a(s, abyte0, s1, s2, i1, j1, FetchType.BOTH);
    }

    public final PlaybackPair a(String s, byte abyte0[], String s1, String s2, int i1, int j1, FetchType fetchtype)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        com.google.android.apps.youtube.common.fromguava.c.a(abyte0);
        com.google.android.apps.youtube.common.fromguava.c.a(s2);
        b.a(new m());
        com.google.android.apps.youtube.common.a.c c1 = com.google.android.apps.youtube.common.a.c.a();
        k k1 = com.google.android.apps.youtube.datalib.a.k.a();
        if (fetchtype.shouldRequestGData())
        {
            d.a(s, c1);
        }
        if (fetchtype.shouldRequestPlayerService())
        {
            ak ak1 = c.a();
            ak1.a(abyte0);
            ak1.a(s);
            ak1.c(s2);
            ak1.a(i1);
            ak1.i(j1);
            ak1.b(s1);
            e.a(ak1);
            j.a(ak1);
            c.a(ak1, k1);
        }
        if (fetchtype.shouldRequestPlayerService())
        {
            s1 = (PlayerResponse)k1.get();
        } else
        {
            s1 = null;
        }
        if (!fetchtype.shouldRequestGData()) goto _L2; else goto _L1
_L1:
        abyte0 = (Video)c1.get();
_L13:
        s = a(s, ((PlayerResponse) (s1)), ((Video) (abyte0)));
        b.a(new com.google.android.apps.youtube.core.player.event.l());
        return s;
        abyte0;
        if ((abyte0.getCause() instanceof GDataResponseException) && ((GDataResponseException)abyte0.getCause()).getStatusCode() == 403)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        abyte0 = new com.google.android.apps.youtube.datalib.model.gdata.Video.Builder();
        abyte0.id(s);
        abyte0.captionTracksUri(s1.getCaptionTracksUri());
        abyte0.monetize(false);
        abyte0.duration(s1.getLengthSeconds());
        abyte0.privacy(com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.PRIVATE);
        if (s1.isLive())
        {
            if (s1.getVideoStreamingData() != null && s1.getVideoStreamingData().getHlsStream() != null)
            {
                abyte0.liveEventUri(s1.getVideoStreamingData().getHlsStream().getUri());
                abyte0.state(com.google.android.apps.youtube.datalib.model.gdata.Video.State.PROCESSING);
            } else
            {
                abyte0.state(com.google.android.apps.youtube.datalib.model.gdata.Video.State.INVALID_FORMAT);
            }
        }
        s1.getPlayabilityStatus().a();
        JVM INSTR tableswitch 0 5: default 388
    //                   0 413
    //                   1 424
    //                   2 435
    //                   3 457
    //                   4 468
    //                   5 446;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L5:
        abyte0 = abyte0.build();
        continue; /* Loop/switch isn't completed */
_L6:
        abyte0.state(com.google.android.apps.youtube.datalib.model.gdata.Video.State.PLAYABLE);
        continue; /* Loop/switch isn't completed */
_L7:
        abyte0.state(com.google.android.apps.youtube.datalib.model.gdata.Video.State.CANT_PROCESS);
        continue; /* Loop/switch isn't completed */
_L8:
        abyte0.state(com.google.android.apps.youtube.datalib.model.gdata.Video.State.NOT_AVAILABLE_ON_MOBILE);
        continue; /* Loop/switch isn't completed */
_L11:
        abyte0.state(com.google.android.apps.youtube.datalib.model.gdata.Video.State.INAPPROPRIATE);
        continue; /* Loop/switch isn't completed */
_L9:
        abyte0.state(com.google.android.apps.youtube.datalib.model.gdata.Video.State.PRIVATE);
        continue; /* Loop/switch isn't completed */
_L10:
        abyte0.state(com.google.android.apps.youtube.datalib.model.gdata.Video.State.INAPPROPRIATE);
        abyte0.adultContent(true);
        if (true) goto _L5; else goto _L4
_L4:
        if ((abyte0.getCause() instanceof HttpResponseException) && ((HttpResponseException)abyte0.getCause()).getStatusCode() == 404)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            abyte0 = new com.google.android.apps.youtube.datalib.model.gdata.Video.Builder();
            abyte0.id(s);
            abyte0.captionTracksUri(s1.getCaptionTracksUri());
            abyte0.monetize(false);
            abyte0.duration(s1.getLengthSeconds());
            abyte0.state(com.google.android.apps.youtube.datalib.model.gdata.Video.State.DELETED);
            abyte0 = abyte0.build();
        } else
        {
            throw abyte0;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        abyte0 = null;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public final void a(String s, byte abyte0[], String s1, String s2, int i1, int j1, com.google.android.apps.youtube.common.a.b b1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(b1);
        h.execute(new com.google.android.apps.youtube.core.player.fetcher.a(this, s, abyte0, s1, s2, i1, j1, b1));
    }

    static 
    {
        a = ak.a;
    }

    private class FetchType extends Enum
    {

        private static final FetchType $VALUES[];
        public static final FetchType BOTH;
        public static final FetchType GDATA_ONLY;
        public static final FetchType PLAYER_SERVICE_ONLY;

        public static FetchType valueOf(String s)
        {
            return (FetchType)Enum.valueOf(com/google/android/apps/youtube/core/player/fetcher/PlayerFetcher$FetchType, s);
        }

        public static FetchType[] values()
        {
            return (FetchType[])$VALUES.clone();
        }

        final boolean shouldRequestGData()
        {
            return this == GDATA_ONLY || this == BOTH;
        }

        final boolean shouldRequestPlayerService()
        {
            return this == PLAYER_SERVICE_ONLY || this == BOTH;
        }

        static 
        {
            PLAYER_SERVICE_ONLY = new FetchType("PLAYER_SERVICE_ONLY", 0);
            GDATA_ONLY = new FetchType("GDATA_ONLY", 1);
            BOTH = new FetchType("BOTH", 2);
            $VALUES = (new FetchType[] {
                PLAYER_SERVICE_ONLY, GDATA_ONLY, BOTH
            });
        }

        private FetchType(String s, int i1)
        {
            super(s, i1);
        }
    }

}
