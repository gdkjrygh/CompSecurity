// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.net.Uri;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.player.al;
import com.google.android.apps.youtube.datalib.innertube.model.TrackingUrl;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            DeviceClassification, VideoStats2Client, WatchFeature, cf

public final class ch
{

    private final b a;
    private final Analytics b;
    private final h c;
    private final a d;
    private final DeviceClassification e;
    private final cf f;
    private final com.google.android.apps.youtube.datalib.e.b g;

    public ch(com.google.android.apps.youtube.datalib.e.b b1, b b2, Analytics analytics, h h1, a a1, DeviceClassification deviceclassification)
    {
        this(b1, b2, analytics, h1, a1, deviceclassification, null);
    }

    public ch(com.google.android.apps.youtube.datalib.e.b b1, b b2, Analytics analytics, h h1, a a1, DeviceClassification deviceclassification, cf cf)
    {
        g = b1;
        a = (b)com.google.android.apps.youtube.common.fromguava.c.a(b2);
        b = (Analytics)com.google.android.apps.youtube.common.fromguava.c.a(analytics);
        c = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        d = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        e = (DeviceClassification)com.google.android.apps.youtube.common.fromguava.c.a(deviceclassification);
        f = cf;
    }

    private VideoStats2Client a(Uri uri, Uri uri1, Uri uri2, String s, String s1, String s2, int i, 
            int j, boolean flag, boolean flag1, String s3, WatchFeature watchfeature, al al1, List list)
    {
        uri = new VideoStats2Client(g, a, b, uri, uri1, uri2, s, String.valueOf(i), j, flag, flag1, s3, s1, s2, a.b(), watchfeature, "-", al1, c, d, e, list, f, (byte)0);
        com.google.android.apps.youtube.core.client.VideoStats2Client.a(uri);
        return uri;
    }

    public final VideoStats2Client a(al al1, VideoStats2Client.VideoStats2ClientState videostats2clientstate)
    {
        com.google.android.apps.youtube.datalib.e.b b1 = g;
        b b2 = a;
        Analytics analytics = b;
        VideoStats2Client.VideoStats2ClientState videostats2clientstate1 = (VideoStats2Client.VideoStats2ClientState)com.google.android.apps.youtube.common.fromguava.c.a(videostats2clientstate);
        al1 = (al)com.google.android.apps.youtube.common.fromguava.c.a(al1);
        h h1 = c;
        a a1 = d;
        DeviceClassification deviceclassification = e;
        videostats2clientstate = videostats2clientstate.videoId;
        al1 = new VideoStats2Client(b1, b2, analytics, videostats2clientstate1, al1, h1, a1, deviceclassification, new LinkedList(), f, (byte)0);
        com.google.android.apps.youtube.core.client.VideoStats2Client.a(al1);
        return al1;
    }

    public final VideoStats2Client a(TrackingUrl trackingurl, TrackingUrl trackingurl1, TrackingUrl trackingurl2, String s, String s1, int i, boolean flag, 
            String s2, WatchFeature watchfeature, al al1)
    {
        trackingurl = trackingurl.getBaseUri();
        Uri uri = trackingurl1.getBaseUri();
        trackingurl2 = trackingurl2.getBaseUri();
        s = com.google.android.apps.youtube.common.fromguava.c.a(s);
        s1 = com.google.android.apps.youtube.common.fromguava.c.a(s1);
        byte byte0;
        if (flag)
        {
            byte0 = 30;
        } else
        {
            byte0 = 0;
        }
        return a(((Uri) (trackingurl)), uri, ((Uri) (trackingurl2)), s, s1, null, i, trackingurl1.getElapsedMediaTimeSec(byte0), true, false, com.google.android.apps.youtube.common.fromguava.c.a(s2), (WatchFeature)com.google.android.apps.youtube.common.fromguava.c.a(watchfeature), (al)com.google.android.apps.youtube.common.fromguava.c.a(al1), ((List) (new LinkedList())));
    }

    public final VideoStats2Client a(TrackingUrl trackingurl, TrackingUrl trackingurl1, TrackingUrl trackingurl2, String s, String s1, String s2, int i, 
            boolean flag, boolean flag1, WatchFeature watchfeature, al al1)
    {
        trackingurl = trackingurl.getBaseUri();
        Uri uri = trackingurl1.getBaseUri();
        trackingurl2 = trackingurl2.getBaseUri();
        s = com.google.android.apps.youtube.common.fromguava.c.a(s);
        s1 = com.google.android.apps.youtube.common.fromguava.c.a(s1);
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        return a(((Uri) (trackingurl)), uri, ((Uri) (trackingurl2)), s, s1, s2, i, trackingurl1.getElapsedMediaTimeSec(byte0), flag, flag1, null, (WatchFeature)com.google.android.apps.youtube.common.fromguava.c.a(watchfeature), (al)com.google.android.apps.youtube.common.fromguava.c.a(al1), ((List) (new LinkedList())));
    }
}
