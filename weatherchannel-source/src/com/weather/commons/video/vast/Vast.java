// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video.vast;

import com.google.common.base.Preconditions;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ListMultimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.commons.video.vast:
//            ContentContainer, ContentParameter, TrackingEvent, TrackingEventType

public class Vast
{

    private final String clickThroughUrl;
    private final List clickTracking;
    private final ContentContainer content;
    private final int duration;
    private final String fullVideoUrl;
    private final List impressionUrls;
    private final ListMultimap trackingEventMap;

    public Vast(ContentContainer contentcontainer, List list, Iterable iterable, String s, Collection collection, Iterable iterable1)
    {
        Preconditions.checkNotNull(contentcontainer);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(iterable1);
        content = contentcontainer;
        impressionUrls = list;
        trackingEventMap = buildTrackingEventMap(iterable);
        clickThroughUrl = s;
        clickTracking = ImmutableList.copyOf(collection);
        fullVideoUrl = buildFullVideoUrl(iterable1);
        duration = videoDuration(iterable);
    }

    private String buildFullVideoUrl(Iterable iterable)
    {
        StringBuilder stringbuilder = new StringBuilder(content.getContentUri());
        char c;
        if (content.getContentUri().contains("?"))
        {
            c = '&';
        } else
        {
            c = '?';
        }
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            ContentParameter contentparameter = (ContentParameter)iterable.next();
            stringbuilder.append(c);
            stringbuilder.append(contentparameter.getKey());
            stringbuilder.append('=');
            stringbuilder.append(contentparameter.getValue());
            c = '&';
        }

        return stringbuilder.toString();
    }

    private static ListMultimap buildTrackingEventMap(Iterable iterable)
    {
        ArrayListMultimap arraylistmultimap = ArrayListMultimap.create();
        TrackingEvent trackingevent;
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylistmultimap.put(trackingevent.getType(), trackingevent.getUrl()))
        {
            trackingevent = (TrackingEvent)iterable.next();
        }

        return ImmutableListMultimap.copyOf(arraylistmultimap);
    }

    private static int videoDuration(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            TrackingEvent trackingevent = (TrackingEvent)iterable.next();
            if (trackingevent.getType() == TrackingEventType.complete)
            {
                return trackingevent.getOffset();
            }
        }

        return 0;
    }

    public String getClickThroughUrl()
    {
        return clickThroughUrl;
    }

    public List getClickTracking()
    {
        return clickTracking;
    }

    public ContentContainer getContent()
    {
        return content;
    }

    public int getDuration()
    {
        return duration;
    }

    public String getFullVideoUrl()
    {
        return fullVideoUrl;
    }

    public List getImpressionUrls()
    {
        return impressionUrls;
    }

    public List getTrackingEventUrls(TrackingEventType trackingeventtype)
    {
        return ImmutableList.copyOf(trackingEventMap.get(trackingeventtype));
    }

    public boolean hasCreative()
    {
        return !clickThroughUrl.isEmpty();
    }

    public String toString()
    {
        boolean flag1 = true;
        StringBuilder stringbuilder = (new StringBuilder()).append("Vast [impressionUrls.size():").append(impressionUrls.size()).append(", trackingEventMap.size():").append(trackingEventMap.size()).append(", clickThroughUrl=");
        boolean flag;
        if (!clickThroughUrl.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder = stringbuilder.append(flag).append(", clickTracking=");
        if (!clickTracking.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder = stringbuilder.append(flag).append(", fullVideoUrl=");
        if (!fullVideoUrl.isEmpty())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return stringbuilder.append(flag).append(", duration=").append(duration).append(']').toString();
    }
}
