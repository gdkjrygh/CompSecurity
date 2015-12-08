// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.o;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.datalib.e.f;
import com.google.android.apps.youtube.medialib.a.a;
import com.google.android.apps.youtube.medialib.a.b;
import com.google.android.apps.youtube.medialib.player.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            DeviceClassification, cb

public final class QoeStatsClient
    implements b
{

    private static final SparseIntArray a;
    private static final SparseArray b;
    private final Uri c;
    private final com.google.android.apps.youtube.datalib.e.b d;
    private final long e;
    private final String f;
    private final String g;
    private boolean h;
    private final LiveState i;
    private final com.google.android.apps.youtube.common.e.b j;
    private final h k;
    private final DeviceClassification l;
    private final a m;
    private final Map n = new HashMap(1);
    private PlayerState o;
    private int p;
    private long q;
    private long r;
    private int s;
    private int t;

    QoeStatsClient(com.google.android.apps.youtube.common.e.b b1, com.google.android.apps.youtube.datalib.e.b b2, h h1, DeviceClassification deviceclassification, a a1, Uri uri, String s1, 
            String s2, LiveState livestate, long l1, boolean flag)
    {
        j = b1;
        d = b2;
        k = h1;
        l = deviceclassification;
        m = a1;
        c = (Uri)com.google.android.apps.youtube.common.fromguava.c.a(uri);
        f = s1;
        g = (String)com.google.android.apps.youtube.common.fromguava.c.a(s2);
        i = livestate;
        n.put("vps", new ArrayList());
        n.put("vfs", new ArrayList());
        n.put("error", new ArrayList());
        n.put("error_info", new ArrayList());
        n.put("bwm", new ArrayList());
        n.put("df", new ArrayList());
        if (l1 < 0L)
        {
            e = b1.b();
            ((ArrayList)n.get("vps")).add((new StringBuilder("0.000:")).append(PlayerState.NOT_PLAYING).toString());
            o = PlayerState.NOT_PLAYING;
        } else
        {
            e = l1;
            o = PlayerState.PAUSED;
        }
        h = flag;
        q = b1.b() + 30000L;
    }

    static int a(QoeStatsClient qoestatsclient, int i1)
    {
        qoestatsclient.p = i1;
        return i1;
    }

    private void a(PlayerState playerstate)
    {
        if (o.equals(playerstate))
        {
            return;
        } else
        {
            ((ArrayList)n.get("vps")).add((new StringBuilder()).append(i()).append(":").append(playerstate).toString());
            o = playerstate;
            return;
        }
    }

    private void c(boolean flag)
    {
        long l1 = j.b();
        if (flag || l1 > q)
        {
            if (r > 0L)
            {
                String s1 = (new StringBuilder()).append(i()).append(":").append(r).append(":").append((float)s / 1000F).toString();
                ((ArrayList)n.get("bwm")).add(s1);
                r = 0L;
                s = 0;
            }
            if (t > 0)
            {
                String s2 = (new StringBuilder()).append(i()).append(":").append(t).toString();
                ((ArrayList)n.get("df")).add(s2);
                t = 0;
            }
            q = l1 + 30000L;
        }
    }

    private String i()
    {
        return String.format(Locale.US, "%.3f", new Object[] {
            Double.valueOf((double)(j.b() - e) / 1000D)
        });
    }

    private void j()
    {
        Iterator iterator = n.values().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (((ArrayList)iterator.next()).size() <= 0) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L6:
        if (flag)
        {
            L.e("No ping as there is nothing new to report");
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
        Object obj = com.google.android.apps.youtube.common.e.o.a(c);
        ((o) (obj)).a("event", "streamingstats").a("cpn", f).a("ns", "yt").a("docid", g).a("conn", k.i());
        if (p > 0)
        {
            ((o) (obj)).a("fmt", p);
        }
        if (i.isLive())
        {
            ((o) (obj)).a("live", i.toString());
        }
        l.a(((o) (obj)));
        Object obj1 = n.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            Object obj2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
            String s1 = (String)((java.util.Map.Entry) (obj2)).getKey();
            obj2 = (ArrayList)((java.util.Map.Entry) (obj2)).getValue();
            if (!((ArrayList) (obj2)).isEmpty())
            {
                ((o) (obj)).a(s1, TextUtils.join(",", ((Iterable) (obj2))), ",:");
                ((ArrayList) (obj2)).clear();
            }
        } while (true);
        obj = ((o) (obj)).a();
        L.e((new StringBuilder("Pinging ")).append(obj).toString());
        obj1 = d;
        obj1 = com.google.android.apps.youtube.datalib.e.b.a("qoe", 0x323467f);
        ((f) (obj1)).a(((Uri) (obj)));
        d.a(((f) (obj1)), com.google.android.apps.youtube.datalib.a.b.a);
        return;
    }

    public final void a()
    {
        a(PlayerState.ENDED);
        c(true);
        j();
        h = true;
    }

    public final void a(int i1)
    {
        t = t + i1;
        c(false);
    }

    public final void a(int i1, int j1, int k1)
    {
        if (p == i1 || i1 < 0)
        {
            return;
        }
        StringBuilder stringbuilder = (new StringBuilder()).append(i()).append(":").append(i1).append(":");
        Object obj;
        if (j1 > 0)
        {
            obj = Integer.valueOf(j1);
        } else
        {
            obj = "";
        }
        stringbuilder = stringbuilder.append(obj).append(":");
        if (p > 0)
        {
            obj = Integer.valueOf(p);
        } else
        {
            obj = "";
        }
        obj = stringbuilder.append(obj).append(":").append((String)b.get(k1)).toString();
        ((ArrayList)n.get("vfs")).add(obj);
        p = i1;
    }

    public final void a(int i1, int j1, int k1, Object obj)
    {
        a(PlayerState.ERROR);
        String s1;
        if (i1 == 1 && a.indexOfKey(j1) >= 0)
        {
            i1 = a.get(j1);
        } else
        {
            i1 = 107;
        }
        s1 = (new StringBuilder()).append(i()).append(":").append(i1).append(":").append(k1 / 1000).toString();
        ((ArrayList)n.get("error")).add(s1);
        obj = (new StringBuilder()).append(i1).append(":").append(com.google.android.apps.youtube.core.client.cb.a(obj)).toString();
        ((ArrayList)n.get("error_info")).add(obj);
        j();
    }

    public final void a(int i1, long l1)
    {
        r = r + l1;
        s = s + i1;
        c(false);
    }

    public final void a(boolean flag)
    {
        PlayerState playerstate;
        if (flag)
        {
            if (o == PlayerState.PAUSED)
            {
                playerstate = PlayerState.PAUSED_BUFFERING;
            } else
            {
                playerstate = PlayerState.BUFFERING;
            }
        } else
        if (o == PlayerState.PAUSED_BUFFERING)
        {
            playerstate = PlayerState.PAUSED;
        } else
        {
            playerstate = PlayerState.PLAYING;
        }
        a(playerstate);
    }

    public final void b()
    {
        a(PlayerState.NOT_PLAYING);
        c(true);
        j();
    }

    public final void b(boolean flag)
    {
        if (flag)
        {
            a(PlayerState.SEEKING);
        }
    }

    public final void c()
    {
        a(PlayerState.PAUSED);
    }

    public final void d()
    {
        a(PlayerState.NOT_PLAYING);
        if (!h)
        {
            j();
        }
    }

    public final void e()
    {
        h = false;
        a(PlayerState.PLAYING);
    }

    public final QoeStatsClientState f()
    {
        return new QoeStatsClientState(c, f, g, i, p, e, h);
    }

    final void g()
    {
        m.a(this);
    }

    public final void h()
    {
        m.b(this);
        c(true);
        if (o != PlayerState.NOT_PLAYING)
        {
            L.b("QoE client released unexpectedly", new Exception());
            a(PlayerState.NOT_PLAYING);
        }
        j();
    }

    static 
    {
        Object obj = new SparseIntArray();
        a = ((SparseIntArray) (obj));
        ((SparseIntArray) (obj)).put(-1002, 300);
        a.put(-1003, 310);
        a.put(-1004, 120);
        a.put(-1005, 311);
        a.put(-1010, 301);
        a.put(33, 302);
        a.put(p.a, 312);
        a.put(p.b, 303);
        a.put(p.c, 304);
        a.put(p.d, 305);
        a.put(p.e, 306);
        a.put(p.f, 307);
        a.put(p.g, 308);
        a.put(p.h, 309);
        obj = new SparseArray();
        b = ((SparseArray) (obj));
        ((SparseArray) (obj)).put(0, "i");
        b.put(1, "m");
        b.put(2, "a");
    }

    private class PlayerState extends Enum
    {

        private static final PlayerState $VALUES[];
        public static final PlayerState BUFFERING;
        public static final PlayerState ENDED;
        public static final PlayerState ERROR;
        public static final PlayerState NOT_PLAYING;
        public static final PlayerState NOT_VALID;
        public static final PlayerState PAUSED;
        public static final PlayerState PAUSED_BUFFERING;
        public static final PlayerState PLAYING;
        public static final PlayerState SEEKING;
        private final String value;

        public static PlayerState valueOf(String s1)
        {
            return (PlayerState)Enum.valueOf(com/google/android/apps/youtube/core/client/QoeStatsClient$PlayerState, s1);
        }

        public static PlayerState[] values()
        {
            return (PlayerState[])$VALUES.clone();
        }

        public final String toString()
        {
            return value;
        }

        static 
        {
            BUFFERING = new PlayerState("BUFFERING", 0, "B");
            ERROR = new PlayerState("ERROR", 1, "ER");
            ENDED = new PlayerState("ENDED", 2, "EN");
            NOT_PLAYING = new PlayerState("NOT_PLAYING", 3, "N");
            PAUSED = new PlayerState("PAUSED", 4, "PA");
            PLAYING = new PlayerState("PLAYING", 5, "PL");
            SEEKING = new PlayerState("SEEKING", 6, "S");
            NOT_VALID = new PlayerState("NOT_VALID", 7, "X");
            PAUSED_BUFFERING = new PlayerState("PAUSED_BUFFERING", 8, "PB");
            $VALUES = (new PlayerState[] {
                BUFFERING, ERROR, ENDED, NOT_PLAYING, PAUSED, PLAYING, SEEKING, NOT_VALID, PAUSED_BUFFERING
            });
        }

        private PlayerState(String s1, int i1, String s2)
        {
            super(s1, i1);
            value = s2;
        }
    }


    private class LiveState extends Enum
    {

        private static final LiveState $VALUES[];
        public static final LiveState DVR;
        public static final LiveState LIVE;
        public static final LiveState VOD;
        private final String value;

        public static LiveState fromOrdinal(int i1)
        {
            if (i1 < 0 || i1 >= values().length)
            {
                return VOD;
            } else
            {
                return values()[i1];
            }
        }

        public static LiveState valueOf(String s1)
        {
            return (LiveState)Enum.valueOf(com/google/android/apps/youtube/core/client/QoeStatsClient$LiveState, s1);
        }

        public static LiveState[] values()
        {
            return (LiveState[])$VALUES.clone();
        }

        public final boolean isLive()
        {
            return this != VOD;
        }

        public final String toString()
        {
            return value;
        }

        static 
        {
            VOD = new LiveState("VOD", 0, null);
            LIVE = new LiveState("LIVE", 1, "live");
            DVR = new LiveState("DVR", 2, "dvr");
            $VALUES = (new LiveState[] {
                VOD, LIVE, DVR
            });
        }

        private LiveState(String s1, int i1, String s2)
        {
            super(s1, i1);
            value = s2;
        }
    }


    private class QoeStatsClientState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new cd();
        public final Uri baseQoeUri;
        public final String cpn;
        public final LiveState liveState;
        public final long startPlaybackTime;
        public final String videoId;
        public final int videoItag;
        public final boolean wasEnded;

        public final int describeContents()
        {
            return 0;
        }

        public final String toString()
        {
            return (new StringBuilder("QoeStatsClient.QoeStatsClientState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" baseQoeUri=").append(baseQoeUri).append(" cpn=").append(cpn).append(" videoId=").append(videoId).append(" liveState=").append(liveState).append(" videoItag=").append(videoItag).append(" startPlaybackTime=").append(startPlaybackTime).append(" wasEnded=").append(wasEnded).append("}").toString();
        }

        public final void writeToParcel(Parcel parcel, int i1)
        {
            i1 = 0;
            parcel.writeParcelable(baseQoeUri, 0);
            parcel.writeString(cpn);
            parcel.writeString(videoId);
            parcel.writeInt(liveState.ordinal());
            parcel.writeInt(videoItag);
            parcel.writeLong(startPlaybackTime);
            if (wasEnded)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
        }


        public QoeStatsClientState(Uri uri, String s1, String s2, LiveState livestate, int i1, long l1, 
                boolean flag)
        {
            baseQoeUri = uri;
            videoId = s2;
            cpn = s1;
            liveState = livestate;
            videoItag = i1;
            startPlaybackTime = l1;
            wasEnded = flag;
        }

        public QoeStatsClientState(Parcel parcel)
        {
            baseQoeUri = (Uri)parcel.readParcelable(null);
            cpn = parcel.readString();
            videoId = parcel.readString();
            liveState = LiveState.fromOrdinal(parcel.readInt());
            videoItag = parcel.readInt();
            startPlaybackTime = parcel.readLong();
            boolean flag;
            if (parcel.readInt() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            wasEnded = flag;
        }
    }

}
