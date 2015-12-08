// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video.vast;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.weather.commons.video.VideoViewWithPositionCallbacks;
import com.weather.dal2.net.EmptyReceiver;
import com.weather.dal2.net.SimpleHttpGetRequest;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.commons.video.vast:
//            Vast, TrackingEventType

public class VastBeaconSender
{
    private static final class PlaybackListener
        implements com.weather.commons.video.VideoViewWithPositionCallbacks.PositionListener
    {

        private final VastBeaconSender sender;

        public void onPositionChange()
        {
            sender.sendBeacons();
        }

        private PlaybackListener(VastBeaconSender vastbeaconsender)
        {
            sender = vastbeaconsender;
        }

    }


    private final List beacons;
    private final String tag;

    private VastBeaconSender(String s, String s1)
    {
        beacons = ImmutableList.of(s);
        tag = s1;
    }

    private VastBeaconSender(Collection collection, String s)
    {
        beacons = ImmutableList.copyOf(collection);
        tag = s;
    }

    private static void registerBeacon(Vast vast, VideoViewWithPositionCallbacks videoviewwithpositioncallbacks, int i, int j, TrackingEventType trackingeventtype, String s)
    {
        if (i < j)
        {
            videoviewwithpositioncallbacks.addPositionListener(new PlaybackListener(new VastBeaconSender(vast.getTrackingEventUrls(trackingeventtype), s)), j);
        }
    }

    public static void registerBeaconSenders(Vast vast, VideoViewWithPositionCallbacks videoviewwithpositioncallbacks, int i)
    {
        int j = (vast.getDuration() * 1000) / 4;
        registerBeacon(vast, videoviewwithpositioncallbacks, i, j, TrackingEventType.firstQuartile, "firstQuartile");
        registerBeacon(vast, videoviewwithpositioncallbacks, i, j * 2, TrackingEventType.midpoint, "secondQuartile");
        registerBeacon(vast, videoviewwithpositioncallbacks, i, j * 3, TrackingEventType.thirdQuartile, "thirdQuartile");
        registerBeacon(vast, videoviewwithpositioncallbacks, i, j * 4, TrackingEventType.complete, "complete");
        if (i == 0)
        {
            (new VastBeaconSender(vast.getImpressionUrls(), "impression")).sendBeacons();
            (new VastBeaconSender(vast.getTrackingEventUrls(TrackingEventType.start), "start")).sendBeacons();
        }
    }

    private void sendBeacons()
    {
        LogUtil.d(tag, LoggingMetaTags.TWC_UI, "Firing vast beacon", new Object[0]);
        String s;
        for (Iterator iterator = beacons.iterator(); iterator.hasNext(); (new SimpleHttpGetRequest()).asyncFetch(s, true, null, new EmptyReceiver()))
        {
            s = (String)iterator.next();
        }

    }

    public static void sendClickThrough(Vast vast)
    {
        vast = vast.getClickTracking().iterator();
        do
        {
            if (!vast.hasNext())
            {
                break;
            }
            String s = (String)vast.next();
            if (!Strings.isNullOrEmpty(s))
            {
                (new VastBeaconSender(s, "clickTracking")).sendBeacons();
            }
        } while (true);
    }

}
