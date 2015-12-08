// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.e.o;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.player.al;
import com.google.android.apps.youtube.core.player.event.x;
import com.google.android.apps.youtube.datalib.e.b;
import com.google.android.apps.youtube.datalib.e.f;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            cg, WatchFeature, DeviceClassification, cf

public final class VideoStats2Client
{

    private al A;
    private long B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private volatile boolean H;
    private int I;
    private String J;
    private final com.google.android.apps.youtube.common.e.b a;
    private final Analytics b;
    private final Uri c;
    private final Uri d;
    private final Uri e;
    private final long f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final int l;
    private final LinkedList m;
    private final LinkedList n;
    private final LinkedList o;
    private final LinkedList p;
    private final LinkedList q;
    private final WatchFeature r;
    private final List s;
    private final boolean t;
    private final boolean u;
    private final DeviceClassification v;
    private final cf w;
    private final h x;
    private final a y;
    private final b z;

    private VideoStats2Client(b b1, com.google.android.apps.youtube.common.e.b b2, Analytics analytics, Uri uri, Uri uri1, Uri uri2, String s1, 
            String s2, int i1, boolean flag, boolean flag1, String s3, String s4, String s5, 
            long l1, WatchFeature watchfeature, String s6, al al1, h h1, a a1, 
            DeviceClassification deviceclassification, List list, cf cf1)
    {
        z = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        a = b2;
        b = analytics;
        c = (Uri)com.google.android.apps.youtube.common.fromguava.c.a(uri);
        d = (Uri)com.google.android.apps.youtube.common.fromguava.c.a(uri1);
        e = (Uri)com.google.android.apps.youtube.common.fromguava.c.a(uri2);
        i = s1;
        h = s2;
        l = i1;
        t = flag;
        u = flag1;
        g = s3;
        j = s4;
        f = l1;
        r = watchfeature;
        J = s6;
        A = al1;
        x = h1;
        y = a1;
        v = deviceclassification;
        s = list;
        k = s5;
        m = new LinkedList();
        n = new LinkedList();
        o = new LinkedList();
        p = new LinkedList();
        q = new LinkedList();
        w = cf1;
    }

    VideoStats2Client(b b1, com.google.android.apps.youtube.common.e.b b2, Analytics analytics, Uri uri, Uri uri1, Uri uri2, String s1, 
            String s2, int i1, boolean flag, boolean flag1, String s3, String s4, String s5, 
            long l1, WatchFeature watchfeature, String s6, al al1, h h1, a a1, 
            DeviceClassification deviceclassification, List list, cf cf1, byte byte0)
    {
        this(b1, b2, analytics, uri, uri1, uri2, s1, s2, i1, flag, flag1, s3, s4, s5, l1, watchfeature, s6, al1, h1, a1, deviceclassification, list, cf1);
    }

    private VideoStats2Client(b b1, com.google.android.apps.youtube.common.e.b b2, Analytics analytics, VideoStats2ClientState videostats2clientstate, al al1, h h1, a a1, 
            DeviceClassification deviceclassification, List list, cf cf1)
    {
        this(b1, b2, analytics, videostats2clientstate.basePlaybackUri, videostats2clientstate.baseDelayplayUri, videostats2clientstate.baseWatchtimeUri, videostats2clientstate.videoId, videostats2clientstate.length, videostats2clientstate.delaySeconds, videostats2clientstate.autoplay, videostats2clientstate.scriptedPlayback, videostats2clientstate.adformat, videostats2clientstate.cpn, videostats2clientstate.playlistId, videostats2clientstate.sessionStartTimestamp, videostats2clientstate.feature, videostats2clientstate.subtitleTrackId, al1, h1, a1, deviceclassification, list, cf1);
        B = videostats2clientstate.currentPlaybackPosition;
        C = videostats2clientstate.delayedPingSent;
        D = videostats2clientstate.finalPingSent;
        E = videostats2clientstate.initialPingSent;
        H = videostats2clientstate.throttled;
        I = videostats2clientstate.videoItag;
    }

    VideoStats2Client(b b1, com.google.android.apps.youtube.common.e.b b2, Analytics analytics, VideoStats2ClientState videostats2clientstate, al al1, h h1, a a1, 
            DeviceClassification deviceclassification, List list, cf cf1, byte byte0)
    {
        this(b1, b2, analytics, videostats2clientstate, al1, h1, a1, deviceclassification, list, cf1);
    }

    private static String a(LinkedList linkedlist)
    {
        String s1 = TextUtils.join(",", linkedlist);
        linkedlist.clear();
        return s1;
    }

    private void a(Uri uri)
    {
        if (D)
        {
            L.c((new StringBuilder("Final ping for playback ")).append(j).append(" has already been sent - Ignoring request").toString());
            return;
        }
        if (!H)
        {
            L.e((new StringBuilder("Pinging ")).append(uri).toString());
            Object obj = z;
            obj = com.google.android.apps.youtube.datalib.e.b.a("vss", 0x323467f);
            ((f) (obj)).a(uri);
            z.a(((f) (obj)), new cg(this));
            return;
        } else
        {
            L.e((new StringBuilder("Playback ")).append(j).append(" is throttled - Ignoring request").toString());
            return;
        }
    }

    private void a(o o1)
    {
        b(o1);
        o1.a("cmt", d(B)).a("conn", x.i()).a("vis", A.b());
        if (l > 0)
        {
            o1.a("delay", l);
        }
        if (t)
        {
            o1.a("autoplay", "1");
        }
        if (u)
        {
            o1.a("splay", "1");
        }
        if (r != WatchFeature.NO_FEATURE)
        {
            o1.a("feature", r.getFeatureString());
        }
        if (!TextUtils.equals(J, "-"))
        {
            o1.a("cc", J);
        }
        Pair pair;
        for (Iterator iterator = s.iterator(); iterator.hasNext(); o1.a((String)pair.first, (String)pair.second))
        {
            pair = (Pair)iterator.next();
        }

        a(o1.a());
    }

    static void a(VideoStats2Client videostats2client)
    {
        videostats2client.y.a(videostats2client);
    }

    private void a(boolean flag)
    {
        o o1;
        o1 = com.google.android.apps.youtube.common.e.o.a(e);
        b(o1);
        String s1;
        if (F)
        {
            s1 = "playing";
        } else
        {
            s1 = "paused";
        }
        o1.a("state", s1);
        if (!n.isEmpty()) goto _L2; else goto _L1
_L1:
        o1.a("st", d(B)).a("et", d(B)).a("conn", x.i()).a("vis", A.b());
        if (!TextUtils.equals("-", J))
        {
            o1.a("cc", J);
        }
_L7:
        if (flag)
        {
            o1.a("final", "1");
        }
        a(o1.a());
        D = D | flag;
        return;
_L2:
        Iterator iterator;
        o1.a("st", a(m), ",:").a("et", a(n), ",:").a("conn", a(o), ",:").a("vis", a(p), ",:");
        iterator = q.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (TextUtils.equals((String)iterator.next(), "-")) goto _L6; else goto _L5
_L5:
        boolean flag1 = true;
_L8:
        if (flag1)
        {
            o1.a("cc", a(q), ",:");
        } else
        {
            q.clear();
        }
        if (true) goto _L7; else goto _L4
_L4:
        flag1 = false;
          goto _L8
    }

    static boolean a(VideoStats2Client videostats2client, boolean flag)
    {
        videostats2client.H = true;
        return true;
    }

    private void b(o o1)
    {
        String s1 = d(a.b() - f);
        o1.a("cpn", j).a("rt", s1).a("ns", "yt").a("docid", i).a("ver", "2").a("len", h);
        v.a(o1);
        if (g != null)
        {
            o1.a("el", "adunit");
            o1.a("adformat", g);
        } else
        {
            o1.a("el", "detailpage");
        }
        if (w != null)
        {
            o1.a("lact", String.valueOf(w.b()));
        }
        if (I > 0)
        {
            o1.a("fmt", I);
        }
        if (!TextUtils.isEmpty(k))
        {
            o1.a("list", k);
        }
    }

    private static String d(long l1)
    {
        return String.format(Locale.US, "%.1f", new Object[] {
            Double.valueOf((double)l1 / 1000D)
        });
    }

    private void g()
    {
        if (F && !G)
        {
            G = true;
            m.add(d(B));
            o.add(String.valueOf(x.i()));
            p.add(A.b());
            q.add(J);
        }
    }

    private void h()
    {
        if (G)
        {
            G = false;
            n.add(d(B));
        }
    }

    private void i()
    {
        C = true;
        a(com.google.android.apps.youtube.common.e.o.a(d));
    }

    public final void a()
    {
        F = false;
        if (!C && l > 0)
        {
            i();
        }
        h();
        a(false);
    }

    public final void a(int i1)
    {
        I = i1;
    }

    public final void a(long l1)
    {
        B = l1;
        if (!E)
        {
            E = true;
            a(com.google.android.apps.youtube.common.e.o.a(c));
        }
        if (!C && l > 0 && l1 >= (long)(l * 1000))
        {
            i();
        }
        g();
    }

    public final void a(al al1)
    {
        h();
        A = al1;
        g();
    }

    public final void b()
    {
        F = false;
        h();
    }

    public final void b(long l1)
    {
        F = true;
        B = l1;
        g();
    }

    public final void c()
    {
        F = false;
        h();
        if (E)
        {
            a(false);
        }
    }

    public final void c(long l1)
    {
        h();
        B = l1;
        g();
    }

    public final void d()
    {
        F = false;
        h();
        if (E)
        {
            a(true);
        }
    }

    public final VideoStats2ClientState e()
    {
        return new VideoStats2ClientState(c, d, e, f, B, g, h, i, j, k, l, t, u, C, D, E, H, I, r, J);
    }

    public final void f()
    {
        y.b(this);
        if (G)
        {
            L.b("VSS2 client released unexpectedly", new Exception());
            b.b("Vss2UnexpectedRelease");
            c();
        }
    }

    public final void handleConnectivityChangedEvent(com.google.android.apps.youtube.common.network.a a1)
    {
        h();
        g();
    }

    public final void handleSubtitleTrackChangedEvent(x x1)
    {
        if (!TextUtils.equals(J, x1.a()))
        {
            J = x1.a();
            h();
            g();
        }
    }

    private class VideoStats2ClientState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new ci();
        public final String adformat;
        public final boolean autoplay;
        public final Uri baseDelayplayUri;
        public final Uri basePlaybackUri;
        public final Uri baseWatchtimeUri;
        public final String cpn;
        public final long currentPlaybackPosition;
        public final int delaySeconds;
        public final boolean delayedPingSent;
        public final WatchFeature feature;
        public final boolean finalPingSent;
        public final boolean initialPingSent;
        public final String length;
        public final String playlistId;
        public final boolean scriptedPlayback;
        public final long sessionStartTimestamp;
        public final String subtitleTrackId;
        public final boolean throttled;
        public final String videoId;
        public final int videoItag;

        public final int describeContents()
        {
            return 0;
        }

        public final String toString()
        {
            return (new StringBuilder("VideoStats2Client.VideoStats2ClientState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" basePlaybackUri=").append(basePlaybackUri).append(" baseDelayplayUri=").append(baseDelayplayUri).append(" baseWatchtimeUri=").append(baseWatchtimeUri).append(" sessionStartTimestamp=").append(sessionStartTimestamp).append(" currentPlaybackPosition=").append(currentPlaybackPosition).append(" adformat=").append(adformat).append(" length=").append(length).append(" videoId=").append(videoId).append(" cpn=").append(cpn).append(" delay=").append(delaySeconds).append(" autoplay=").append(autoplay).append(" scriptedPlayback=").append(scriptedPlayback).append(" delayedPingSent=").append(delayedPingSent).append(" finalPingSent=").append(finalPingSent).append(" initialPingSent=").append(initialPingSent).append(" throttled=").append(throttled).append(" videoItag=").append(videoItag).append(" feature=").append(feature).append(" subtitleTrackId=").append(subtitleTrackId).append("}").toString();
        }

        public final void writeToParcel(Parcel parcel, int i1)
        {
            boolean flag = true;
            parcel.writeParcelable(basePlaybackUri, 0);
            parcel.writeParcelable(baseDelayplayUri, 0);
            parcel.writeParcelable(baseWatchtimeUri, 0);
            parcel.writeLong(sessionStartTimestamp);
            parcel.writeLong(currentPlaybackPosition);
            parcel.writeString(adformat);
            parcel.writeString(length);
            parcel.writeString(videoId);
            parcel.writeString(cpn);
            parcel.writeInt(feature.ordinal());
            parcel.writeInt(delaySeconds);
            if (autoplay)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (scriptedPlayback)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (delayedPingSent)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (finalPingSent)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (initialPingSent)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (throttled)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            parcel.writeInt(videoItag);
            parcel.writeString(subtitleTrackId);
            parcel.writeString(playlistId);
        }


        public VideoStats2ClientState(Uri uri, Uri uri1, Uri uri2, long l1, long l2, 
                String s1, String s2, String s3, String s4, String s5, int i1, boolean flag, 
                boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5, int j1, WatchFeature watchfeature, 
                String s6)
        {
            basePlaybackUri = uri;
            baseDelayplayUri = uri1;
            baseWatchtimeUri = uri2;
            sessionStartTimestamp = l1;
            currentPlaybackPosition = l2;
            adformat = s1;
            length = s2;
            videoId = s3;
            cpn = s4;
            playlistId = s5;
            delaySeconds = i1;
            autoplay = flag;
            scriptedPlayback = flag1;
            delayedPingSent = flag2;
            finalPingSent = flag3;
            initialPingSent = flag4;
            throttled = flag5;
            videoItag = j1;
            feature = watchfeature;
            subtitleTrackId = s6;
        }

        public VideoStats2ClientState(Parcel parcel)
        {
            boolean flag1 = true;
            super();
            basePlaybackUri = (Uri)parcel.readParcelable(null);
            baseDelayplayUri = (Uri)parcel.readParcelable(null);
            baseWatchtimeUri = (Uri)parcel.readParcelable(null);
            sessionStartTimestamp = parcel.readLong();
            currentPlaybackPosition = parcel.readLong();
            adformat = parcel.readString();
            length = parcel.readString();
            videoId = parcel.readString();
            cpn = parcel.readString();
            feature = WatchFeature.fromOrdinal(parcel.readInt());
            delaySeconds = parcel.readInt();
            boolean flag;
            if (parcel.readInt() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            autoplay = flag;
            if (parcel.readInt() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            scriptedPlayback = flag;
            if (parcel.readInt() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            delayedPingSent = flag;
            if (parcel.readInt() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            finalPingSent = flag;
            if (parcel.readInt() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            initialPingSent = flag;
            if (parcel.readInt() == 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            throttled = flag;
            videoItag = parcel.readInt();
            subtitleTrackId = parcel.readString();
            playlistId = parcel.readString();
        }
    }

}
