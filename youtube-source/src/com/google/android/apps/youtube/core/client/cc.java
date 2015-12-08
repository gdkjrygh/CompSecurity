// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.datalib.innertube.model.TrackingUrl;
import com.google.android.apps.youtube.medialib.a.a;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            QoeStatsClient, DeviceClassification

public final class cc
{

    private final b a;
    private final com.google.android.apps.youtube.datalib.e.b b;
    private final h c;
    private final DeviceClassification d;
    private final a e;

    public cc(com.google.android.apps.youtube.datalib.e.b b1, b b2, h h, DeviceClassification deviceclassification, a a1)
    {
        b = b1;
        a = b2;
        c = h;
        d = deviceclassification;
        e = a1;
    }

    public final QoeStatsClient a(QoeStatsClient.QoeStatsClientState qoestatsclientstate)
    {
        QoeStatsClient qoestatsclient = new QoeStatsClient(a, b, c, d, e, qoestatsclientstate.baseQoeUri, qoestatsclientstate.cpn, qoestatsclientstate.videoId, qoestatsclientstate.liveState, qoestatsclientstate.startPlaybackTime, qoestatsclientstate.wasEnded);
        com.google.android.apps.youtube.core.client.QoeStatsClient.a(qoestatsclient, qoestatsclientstate.videoItag);
        qoestatsclient.g();
        return qoestatsclient;
    }

    public final QoeStatsClient a(TrackingUrl trackingurl, String s, String s1, boolean flag)
    {
        b b1 = a;
        com.google.android.apps.youtube.datalib.e.b b2 = b;
        h h = c;
        DeviceClassification deviceclassification = d;
        a a1 = e;
        android.net.Uri uri = trackingurl.getBaseUri();
        if (flag)
        {
            trackingurl = QoeStatsClient.LiveState.LIVE;
        } else
        {
            trackingurl = QoeStatsClient.LiveState.VOD;
        }
        trackingurl = new QoeStatsClient(b1, b2, h, deviceclassification, a1, uri, s, s1, trackingurl, -1L, false);
        trackingurl.g();
        return trackingurl;
    }
}
