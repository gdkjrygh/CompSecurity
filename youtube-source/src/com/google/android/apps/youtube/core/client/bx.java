// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.utils.a;
import com.google.android.apps.youtube.datalib.e.b;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            DeviceClassification, PlaybackTrackingUrlPingClient

public final class bx
{

    private final b a;
    private final h b;
    private final DeviceClassification c;
    private final a d;

    public bx(b b1, h h1, DeviceClassification deviceclassification, a a1)
    {
        a = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        b = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        c = (DeviceClassification)com.google.android.apps.youtube.common.fromguava.c.a(deviceclassification);
        d = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
    }

    public final PlaybackTrackingUrlPingClient a(PlaybackTrackingUrlPingClient.PlaybackTrackingUrlPingClientState playbacktrackingurlpingclientstate)
    {
        return a(Arrays.asList(PlaybackTrackingUrlPingClient.PlaybackTrackingUrlPingClientState.access$000(playbacktrackingurlpingclientstate)), PlaybackTrackingUrlPingClient.PlaybackTrackingUrlPingClientState.access$100(playbacktrackingurlpingclientstate));
    }

    public final PlaybackTrackingUrlPingClient a(List list, String s)
    {
        return new PlaybackTrackingUrlPingClient(a, b, c, d, list, s);
    }
}
