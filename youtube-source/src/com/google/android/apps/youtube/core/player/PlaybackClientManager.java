// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.util.Base64;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.AdStatsClient;
import com.google.android.apps.youtube.core.client.HeartbeatClient;
import com.google.android.apps.youtube.core.client.PlaybackTrackingUrlPingClient;
import com.google.android.apps.youtube.core.client.QoeStatsClient;
import com.google.android.apps.youtube.core.client.VideoStats2Client;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bf;
import com.google.android.apps.youtube.core.client.bi;
import com.google.android.apps.youtube.core.client.br;
import com.google.android.apps.youtube.core.client.bs;
import com.google.android.apps.youtube.core.client.bu;
import com.google.android.apps.youtube.core.client.bv;
import com.google.android.apps.youtube.core.client.bx;
import com.google.android.apps.youtube.core.client.cc;
import com.google.android.apps.youtube.core.client.ch;
import com.google.android.apps.youtube.core.client.d;
import com.google.android.apps.youtube.core.converter.http.ek;
import com.google.android.apps.youtube.datalib.innertube.model.PlaybackTracking;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.legacy.model.InfoCard;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak;
import com.google.android.apps.youtube.datalib.legacy.model.aw;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import java.util.Random;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            AdError, al

public final class PlaybackClientManager
{

    private final Random a;
    private final h b;
    private final d c;
    private AdStatsClient d;
    private VastAd e;
    private final bf f;
    private HeartbeatClient g;
    private final bs h;
    private br i;
    private final bv j;
    private bu k;
    private final bx l;
    private PlaybackTrackingUrlPingClient m;
    private final cc n;
    private QoeStatsClient o;
    private final ch p;
    private VideoStats2Client q;
    private String r;
    private String s;
    private String t;
    private String u;
    private PlaybackClientManagerState v;
    private VmapAdBreak w;
    private VastAd x;
    private boolean y;

    public PlaybackClientManager(Random random, h h1, d d1, bf bf1, bs bs1, bv bv1, bx bx1, 
            cc cc1, ch ch1)
    {
        a = (Random)com.google.android.apps.youtube.common.fromguava.c.a(random);
        b = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        c = (d)com.google.android.apps.youtube.common.fromguava.c.a(d1);
        f = (bf)com.google.android.apps.youtube.common.fromguava.c.a(bf1);
        h = (bs)com.google.android.apps.youtube.common.fromguava.c.a(bs1);
        j = (bv)com.google.android.apps.youtube.common.fromguava.c.a(bv1);
        l = (bx)com.google.android.apps.youtube.common.fromguava.c.a(bx1);
        n = (cc)com.google.android.apps.youtube.common.fromguava.c.a(cc1);
        p = (ch)com.google.android.apps.youtube.common.fromguava.c.a(ch1);
        r = null;
        s = null;
        v = null;
        e = null;
    }

    private boolean a(String s1)
    {
        String s2;
        StringBuilder stringbuilder;
        boolean flag;
        if (t != null && t.equals(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder = new StringBuilder("PlaybackClientManager ");
        if (flag)
        {
            s2 = "RESTORED";
        } else
        {
            s2 = "NEW";
        }
        L.e(stringbuilder.append(s2).append(": videoId=").append(s1).toString());
        t = null;
        u = s1;
        return flag;
    }

    private final String n()
    {
        byte abyte0[] = new byte[12];
        a.nextBytes(abyte0);
        return Base64.encodeToString(abyte0, 10);
    }

    private void o()
    {
        if (i != null)
        {
            i.c();
            i = null;
        }
        if (o != null)
        {
            o.h();
            o = null;
        }
        if (q != null)
        {
            q.f();
            q = null;
        }
    }

    public final PlaybackClientManagerState a()
    {
        com.google.android.apps.youtube.core.client.VideoStats2Client.VideoStats2ClientState videostats2clientstate = null;
        if (r == null || s == null)
        {
            return null;
        }
        String s1 = r;
        String s2 = s;
        String s3 = u;
        com.google.android.apps.youtube.core.client.AdStatsClient.AdStatsClientState adstatsclientstate;
        com.google.android.apps.youtube.core.client.HeartbeatClient.HeartbeatClientState heartbeatclientstate;
        com.google.android.apps.youtube.core.client.PlaybackTrackingUrlPingClient.PlaybackTrackingUrlPingClientState playbacktrackingurlpingclientstate;
        com.google.android.apps.youtube.core.client.QoeStatsClient.QoeStatsClientState qoestatsclientstate;
        if (d == null)
        {
            adstatsclientstate = null;
        } else
        {
            adstatsclientstate = d.j();
        }
        if (g == null)
        {
            heartbeatclientstate = null;
        } else
        {
            heartbeatclientstate = g.b();
        }
        if (m == null)
        {
            playbacktrackingurlpingclientstate = null;
        } else
        {
            playbacktrackingurlpingclientstate = m.a();
        }
        if (o == null)
        {
            qoestatsclientstate = null;
        } else
        {
            qoestatsclientstate = o.f();
        }
        if (q != null)
        {
            videostats2clientstate = q.e();
        }
        return new PlaybackClientManagerState(s1, s2, s3, adstatsclientstate, heartbeatclientstate, playbacktrackingurlpingclientstate, qoestatsclientstate, videostats2clientstate, e);
    }

    public final void a(int i1)
    {
        if (o != null)
        {
            o.a(i1);
        }
    }

    public final void a(int i1, int j1)
    {
        if (d != null)
        {
            d.a(i1, j1);
        }
    }

    public final void a(int i1, int j1, int k1, Object obj)
    {
        if (d != null)
        {
            AdError aderror;
            if (!b.a())
            {
                aderror = new AdError(AdError.ErrorType.VIDEO_PLAYBACK_ERROR_NO_NETWORK);
            } else
            {
                aderror = AdError.a(i1, j1);
            }
            d.b(aderror);
        }
        if (o != null)
        {
            o.a(i1, j1, k1, obj);
        }
    }

    public final void a(int i1, int j1, int k1, boolean flag)
    {
        if (g != null)
        {
            g.a(flag);
        }
        if (o != null)
        {
            o.a(i1, j1, k1);
        }
        if (q != null)
        {
            q.a(i1);
        }
    }

    public final void a(long l1)
    {
        if (d != null)
        {
            d.a((int)l1);
        }
        if (g != null)
        {
            g.a();
        }
        if (k != null)
        {
            k.a();
        }
        if (m != null)
        {
            m.a(l1);
        }
        if (q != null)
        {
            q.a(l1);
        }
    }

    public final void a(bi bi)
    {
        f.a(bi);
    }

    public final void a(PlaybackClientManagerState playbackclientmanagerstate, VmapAdBreak vmapadbreak, VastAd vastad)
    {
        v = playbackclientmanagerstate;
        w = vmapadbreak;
        x = vastad;
        y = false;
    }

    public final void a(al al)
    {
        if (y)
        {
            L.d("Suppressed an extra call to onResetVideoFlow. See b/12133789");
            return;
        }
        y = true;
        o();
        if (v != null)
        {
            r = v.adCpn;
            s = v.videoCpn;
            t = v.videoId;
            e = v.trueViewInDisplayAd;
            Object obj;
            if (w != null && x != null)
            {
                d = c.a(w, x, s, v.adState);
            } else
            if (e != null)
            {
                d = c.a(null, e, s, v.adState);
            } else
            {
                d = null;
            }
            if (v.heartbeatState == null)
            {
                obj = null;
            } else
            {
                obj = f.a(v.heartbeatState);
            }
            g = ((HeartbeatClient) (obj));
            if (v.playbackOffsetState == null)
            {
                obj = null;
            } else
            {
                obj = l.a(v.playbackOffsetState);
            }
            m = ((PlaybackTrackingUrlPingClient) (obj));
            if (v.qoeState == null)
            {
                obj = null;
            } else
            {
                obj = n.a(v.qoeState);
            }
            o = ((QoeStatsClient) (obj));
            if (v.vss2State == null)
            {
                al = null;
            } else
            {
                al = p.a(al, v.vss2State);
            }
            q = al;
        } else
        {
            r = n();
            s = n();
            t = null;
            d = null;
            g = null;
            m = null;
            o = null;
            q = null;
            e = null;
        }
        i = null;
        k = null;
        u = null;
        v = null;
    }

    public final void a(PlayerResponse playerresponse, WatchFeature watchfeature, boolean flag, boolean flag1, al al, String s1)
    {
        y = false;
        String s2;
        PlaybackTracking playbacktracking;
        boolean flag2;
        if (s != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag2, "onPlayVideo called before onResetVideoFlow");
        s2 = playerresponse.getVideoId();
        playbacktracking = playerresponse.getPlaybackTracking();
        if (!a(s2))
        {
            o();
            g = f.a(playerresponse.getHeartbeatParams(), s2);
            k = j.a(s2);
            m = l.a(playbacktracking.getPlaybackTrackingUrls(), s);
            o = n.a(playbacktracking.getQoeTrackingUrl(), s, s2, playerresponse.isLive());
            q = p.a(playbacktracking.getVss2PlaybackTrackingUrl(), playbacktracking.getVss2DelayplayTrackingUrl(), playbacktracking.getVss2WatchtimeTrackingUrl(), s2, s, s1, playerresponse.getLengthSeconds(), flag, flag1, watchfeature, al);
            d = null;
            e = ek.a(playerresponse.getVastProto(), c.a());
            if (e != null)
            {
                e = e.buildUpon().a(playerresponse.getLengthSeconds()).a(playerresponse.getVideoId()).d();
                d = c.a(e, s);
                d.a(al);
                d.c();
            }
        }
        i = h.a(s);
    }

    public final void a(InfoCard infocard, int i1)
    {
        if (d != null)
        {
            d.a(infocard, 1);
        }
    }

    public final void a(InfoCard infocard, com.google.android.apps.youtube.datalib.legacy.model.InfoCard.InfoCardAction infocardaction)
    {
        if (d != null)
        {
            d.a(infocard, infocardaction);
        }
    }

    public final void a(VastAd vastad, WatchFeature watchfeature, al al)
    {
        y = false;
        boolean flag;
        if (r != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag, "onPlayAd called before onResetVideoFlow");
        if (!a(vastad.getAdVideoId()) && vastad.getAdVideoId() != null)
        {
            PlaybackTracking playbacktracking = vastad.getPlaybackTracking();
            o();
            m = l.a(playbacktracking.getPlaybackTrackingUrls(), r);
            o = n.a(playbacktracking.getQoeTrackingUrl(), r, vastad.getAdVideoId(), false);
            q = p.a(playbacktracking.getVss2PlaybackTrackingUrl(), playbacktracking.getVss2DelayplayTrackingUrl(), playbacktracking.getVss2WatchtimeTrackingUrl(), vastad.getAdVideoId(), r, vastad.getDuration(), vastad.shouldPingVssOnEngaged(), vastad.getAdFormat(), watchfeature, al);
        }
        i = h.a(r);
        e = null;
        if (d != null)
        {
            d.a();
        }
    }

    public final void a(VmapAdBreak vmapadbreak, al al)
    {
        vmapadbreak = c.a(vmapadbreak, s);
        vmapadbreak.a(al);
        vmapadbreak.a();
        vmapadbreak.a(AdError.a);
        vmapadbreak.b();
    }

    public final void a(VmapAdBreak vmapadbreak, VastAd vastad, al al)
    {
        d = c.a(vmapadbreak, vastad, s);
        d.a(al);
        d.c();
    }

    public final void a(aw aw)
    {
        if (d != null)
        {
            d.a(aw);
        }
    }

    public final void a(boolean flag)
    {
        if (i != null)
        {
            i.a(flag);
        }
        if (o != null)
        {
            o.a(flag);
        }
    }

    public final void a(boolean flag, int i1)
    {
        if (o != null)
        {
            o.b(true);
        }
        if (q != null)
        {
            q.c(i1);
        }
    }

    public final void b()
    {
        o();
    }

    public final void b(int i1)
    {
        if (d != null)
        {
            d.b(i1);
        }
    }

    public final void b(long l1)
    {
        if (d != null)
        {
            d.f();
        }
        if (o != null)
        {
            o.e();
        }
        if (q != null)
        {
            q.b(l1);
        }
    }

    public final void b(al al)
    {
        if (q != null)
        {
            q.a(al);
        }
        if (d != null)
        {
            d.a(al);
        }
    }

    public final String c()
    {
        return r;
    }

    public final void c(int i1)
    {
        if (d != null)
        {
            d.c(i1);
        }
    }

    public final String d()
    {
        return s;
    }

    public final void d(int i1)
    {
        if (d != null)
        {
            d.d(i1);
        }
    }

    public final void e()
    {
        if (d != null)
        {
            d.h();
        }
        if (o != null)
        {
            o.c();
        }
        if (q != null)
        {
            q.b();
        }
    }

    public final void e(int i1)
    {
        if (d != null)
        {
            d.e(i1);
        }
    }

    public final void f()
    {
        if (d != null)
        {
            d.g();
        }
        h();
    }

    public final void g()
    {
        if (d != null)
        {
            d.i();
            d.b();
        }
        if (i != null)
        {
            i.b();
        }
        if (o != null)
        {
            o.a();
        }
        if (q != null)
        {
            q.a();
        }
    }

    public final void h()
    {
        if (o != null)
        {
            o.d();
        }
        if (q != null)
        {
            q.c();
        }
    }

    public final void i()
    {
        if (i != null)
        {
            i.b();
        }
        if (o != null)
        {
            o.b();
        }
        if (q != null)
        {
            q.d();
        }
    }

    public final void j()
    {
        if (d != null)
        {
            d.b(new AdError(AdError.ErrorType.UNSUPPORTED_VIDEO_FORMAT));
        }
    }

    public final void k()
    {
        if (d != null)
        {
            d.d();
        }
    }

    public final void l()
    {
        if (d != null)
        {
            d.e();
        }
    }

    public final void m()
    {
        if (d != null)
        {
            d.k();
        }
    }

    private class PlaybackClientManagerState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new ac();
        private final String adCpn;
        private final com.google.android.apps.youtube.core.client.AdStatsClient.AdStatsClientState adState;
        private final com.google.android.apps.youtube.core.client.HeartbeatClient.HeartbeatClientState heartbeatState;
        private final com.google.android.apps.youtube.core.client.PlaybackTrackingUrlPingClient.PlaybackTrackingUrlPingClientState playbackOffsetState;
        private final com.google.android.apps.youtube.core.client.QoeStatsClient.QoeStatsClientState qoeState;
        private final VastAd trueViewInDisplayAd;
        private final String videoCpn;
        private final String videoId;
        private final com.google.android.apps.youtube.core.client.VideoStats2Client.VideoStats2ClientState vss2State;

        public final int describeContents()
        {
            return 0;
        }

        public final String toString()
        {
            return String.format(Locale.US, "PlaybackClientManagerState { adCpn=%s videoCpn=%s videoId=%s }", new Object[] {
                adCpn, videoCpn, videoId
            });
        }

        public final void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeString(adCpn);
            parcel.writeString(videoCpn);
            parcel.writeString(videoId);
            parcel.writeParcelable(adState, 0);
            parcel.writeParcelable(heartbeatState, 0);
            parcel.writeParcelable(playbackOffsetState, 0);
            parcel.writeParcelable(qoeState, 0);
            parcel.writeParcelable(vss2State, 0);
            parcel.writeParcelable(trueViewInDisplayAd, 0);
        }











        public PlaybackClientManagerState(Parcel parcel)
        {
            ClassLoader classloader = getClass().getClassLoader();
            adCpn = parcel.readString();
            videoCpn = parcel.readString();
            videoId = parcel.readString();
            adState = (com.google.android.apps.youtube.core.client.AdStatsClient.AdStatsClientState)parcel.readParcelable(classloader);
            heartbeatState = (com.google.android.apps.youtube.core.client.HeartbeatClient.HeartbeatClientState)parcel.readParcelable(classloader);
            playbackOffsetState = (com.google.android.apps.youtube.core.client.PlaybackTrackingUrlPingClient.PlaybackTrackingUrlPingClientState)parcel.readParcelable(classloader);
            qoeState = (com.google.android.apps.youtube.core.client.QoeStatsClient.QoeStatsClientState)parcel.readParcelable(classloader);
            vss2State = (com.google.android.apps.youtube.core.client.VideoStats2Client.VideoStats2ClientState)parcel.readParcelable(classloader);
            trueViewInDisplayAd = (VastAd)parcel.readParcelable(classloader);
        }

        public PlaybackClientManagerState(String s1, String s2, String s3, com.google.android.apps.youtube.core.client.AdStatsClient.AdStatsClientState adstatsclientstate, com.google.android.apps.youtube.core.client.HeartbeatClient.HeartbeatClientState heartbeatclientstate, com.google.android.apps.youtube.core.client.PlaybackTrackingUrlPingClient.PlaybackTrackingUrlPingClientState playbacktrackingurlpingclientstate, com.google.android.apps.youtube.core.client.QoeStatsClient.QoeStatsClientState qoestatsclientstate, 
                com.google.android.apps.youtube.core.client.VideoStats2Client.VideoStats2ClientState videostats2clientstate, VastAd vastad)
        {
            adCpn = s1;
            videoCpn = s2;
            videoId = s3;
            adState = adstatsclientstate;
            heartbeatState = heartbeatclientstate;
            playbackOffsetState = playbacktrackingurlpingclientstate;
            qoeState = qoestatsclientstate;
            vss2State = videostats2clientstate;
            trueViewInDisplayAd = vastad;
        }
    }

}
