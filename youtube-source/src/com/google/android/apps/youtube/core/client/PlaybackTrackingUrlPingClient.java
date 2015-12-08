// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.o;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.utils.a;
import com.google.android.apps.youtube.datalib.e.b;
import com.google.android.apps.youtube.datalib.e.f;
import com.google.android.apps.youtube.datalib.innertube.model.TrackingUrl;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            DeviceClassification, bw

public final class PlaybackTrackingUrlPingClient
{

    private final b a;
    private final h b;
    private final DeviceClassification c;
    private final a d;
    private final PriorityQueue e;
    private final String f;
    private long g;

    PlaybackTrackingUrlPingClient(b b1, h h1, DeviceClassification deviceclassification, a a1, List list, String s)
    {
        a = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        b = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        c = (DeviceClassification)com.google.android.apps.youtube.common.fromguava.c.a(deviceclassification);
        d = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        e = new PriorityQueue((Collection)com.google.android.apps.youtube.common.fromguava.c.a(list));
        f = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
    }

    public final PlaybackTrackingUrlPingClientState a()
    {
        this;
        JVM INSTR monitorenter ;
        PlaybackTrackingUrlPingClientState playbacktrackingurlpingclientstate = new PlaybackTrackingUrlPingClientState(e, f);
        this;
        JVM INSTR monitorexit ;
        return playbacktrackingurlpingclientstate;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        g = l;
_L14:
        if (e.size() <= 0) goto _L2; else goto _L1
_L1:
        Object obj1 = (TrackingUrl)e.peek();
        if (!((TrackingUrl) (obj1)).shouldPingNow(l)) goto _L2; else goto _L3
_L3:
        Object obj;
        obj = o.a(((TrackingUrl) (obj1)).getBaseUri());
        obj1 = ((TrackingUrl) (obj1)).getClientParams().iterator();
_L13:
        if (!((Iterator) (obj1)).hasNext()) goto _L5; else goto _L4
_L4:
        com.google.android.apps.youtube.datalib.innertube.model.TrackingUrl.ClientParam clientparam = (com.google.android.apps.youtube.datalib.innertube.model.TrackingUrl.ClientParam)((Iterator) (obj1)).next();
        com.google.android.apps.youtube.core.client.bw.a[clientparam.ordinal()];
        JVM INSTR tableswitch 1 5: default 336
    //                   1 124
    //                   2 141
    //                   3 155
    //                   4 174
    //                   5 195;
           goto _L6 _L7 _L8 _L9 _L10 _L11
_L7:
        c.a(((o) (obj)));
_L6:
        if (true) goto _L13; else goto _L12
_L12:
        obj;
        throw obj;
_L8:
        ((o) (obj)).a("cpn", f);
          goto _L13
_L9:
        ((o) (obj)).a("conn", b.i());
          goto _L13
_L10:
        ((o) (obj)).a("cmt", String.valueOf(g / 1000L));
          goto _L13
_L11:
        Iterator iterator = d.a().entrySet().iterator();
        while (iterator.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            ((o) (obj)).a((String)entry.getKey(), (String)entry.getValue());
        }
          goto _L13
_L5:
        obj = ((o) (obj)).a();
        L.e((new StringBuilder("Pinging ")).append(obj).toString());
        Object obj2 = a;
        obj2 = com.google.android.apps.youtube.datalib.e.b.a("remarketing", 0x323467f);
        ((f) (obj2)).a(((android.net.Uri) (obj)));
        a.a(((f) (obj2)), com.google.android.apps.youtube.datalib.a.b.a);
        e.remove();
          goto _L14
_L2:
        this;
        JVM INSTR monitorexit ;
    }

    private class PlaybackTrackingUrlPingClientState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new by();
        private final String cpn;
        private final TrackingUrl trackingUrls[];

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeTypedArray(trackingUrls, i);
            parcel.writeString(cpn);
        }




        public PlaybackTrackingUrlPingClientState(Parcel parcel)
        {
            trackingUrls = (TrackingUrl[])parcel.createTypedArray(TrackingUrl.CREATOR);
            cpn = parcel.readString();
        }

        public PlaybackTrackingUrlPingClientState(PriorityQueue priorityqueue, String s)
        {
            trackingUrls = (TrackingUrl[])priorityqueue.toArray(new TrackingUrl[priorityqueue.size()]);
            cpn = s;
        }
    }

}
