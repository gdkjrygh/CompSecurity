// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.os.Handler;
import com.google.a.a.a.a.gt;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;
import com.google.android.apps.youtube.datalib.innertube.InnerTubeServiceException;
import com.google.android.apps.youtube.datalib.innertube.m;
import com.google.android.apps.youtube.datalib.innertube.model.w;
import com.google.android.apps.youtube.datalib.innertube.o;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            bi, bh, be

public final class HeartbeatClient
{

    private final b a;
    private final Executor b;
    private final Handler c;
    private final m d;
    private final bi e;
    private final String f;
    private final long g;
    private final long h;
    private final String i;
    private final Runnable j = new bh(this, (byte)0);
    private volatile long k;
    private volatile int l;
    private volatile boolean m;

    HeartbeatClient(b b1, Executor executor, Handler handler, m m1, bi bi1, String s, long l1, long l2, String s1)
    {
        a = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        b = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        c = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler);
        d = (m)com.google.android.apps.youtube.common.fromguava.c.a(m1);
        e = (bi)com.google.android.apps.youtube.common.fromguava.c.a(bi1);
        f = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        g = l1;
        h = l2;
        i = (String)com.google.android.apps.youtube.common.fromguava.c.a(s1);
        k = 0L;
        l = 0;
        m = false;
    }

    static long a(HeartbeatClient heartbeatclient, long l1)
    {
        heartbeatclient.k = l1;
        return l1;
    }

    static bi a(HeartbeatClient heartbeatclient)
    {
        return heartbeatclient.e;
    }

    private void a(Exception exception)
    {
        c.post(new be(this, exception));
    }

    public final void a()
    {
        if (k != 0L && !m && k <= a.b())
        {
            m = true;
            b.execute(j);
        }
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            k = 0L;
        } else
        if (!flag && k == 0L)
        {
            k = a.b() + g;
            return;
        }
    }

    public final HeartbeatClientState b()
    {
        return new HeartbeatClientState(f, g, h, i, k);
    }

    final void c()
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        Object obj = d.a();
        ((o) (obj)).b(f);
        ((o) (obj)).a(i);
        try
        {
            obj = d.a(((o) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            l = l + 1;
            if ((long)l > h)
            {
                a(((Exception) (obj)));
                return;
            } else
            {
                m = false;
                k = a.b() + 2000L * (long)l;
                return;
            }
        }
        if (((gt) (obj)).c != null)
        {
            obj = new w(((gt) (obj)).c, false);
            if (((w) (obj)).c())
            {
                l = 0;
                m = false;
                k = a.b() + g;
                return;
            } else
            {
                a(com.google.android.apps.youtube.core.player.w.b(((w) (obj))));
                return;
            }
        } else
        {
            e.a(new PlaybackServiceException(com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.UNKNOWN, false, null));
            return;
        }
    }

    private class HeartbeatClientState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new bg();
        private final String heartbeatToken;
        private final long intervalMsec;
        private final long maxRetries;
        private final long nextHeartbeatTimestamp;
        private final String videoId;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeString(heartbeatToken);
            parcel.writeLong(intervalMsec);
            parcel.writeLong(maxRetries);
            parcel.writeString(videoId);
            parcel.writeLong(nextHeartbeatTimestamp);
        }







        public HeartbeatClientState(Parcel parcel)
        {
            heartbeatToken = parcel.readString();
            intervalMsec = parcel.readLong();
            maxRetries = parcel.readLong();
            videoId = parcel.readString();
            nextHeartbeatTimestamp = parcel.readLong();
        }

        public HeartbeatClientState(String s, long l1, long l2, String s1, long l3)
        {
            heartbeatToken = s;
            intervalMsec = l1;
            maxRetries = l2;
            videoId = s1;
            nextHeartbeatTimestamp = l3;
        }
    }

}
