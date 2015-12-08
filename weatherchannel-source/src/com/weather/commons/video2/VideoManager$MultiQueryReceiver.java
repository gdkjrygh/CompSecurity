// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.weather.commons.video2.dsx.VideoAssetList;
import com.weather.dal2.net.Receiver;
import com.weather.util.ExceptionUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.weather.commons.video2:
//            VideoManager, VideoAssetQuery, VideoMessage

private final class <init>
    implements Receiver
{

    private final Object lock;
    private final Receiver notificationReceiver;
    private final List queries;
    private final Set queriesLeft;
    private final Map resultMap;
    private final Collection successfulQueries;
    final VideoManager this$0;
    private final Stopwatch watch;

    private void sendResultsIfAllQueriesCompleted(VideoAssetQuery videoassetquery, Throwable throwable)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        HashSet hashset;
        Iterator iterator;
        Object obj1;
        boolean flag;
        if (queriesLeft.remove(videoassetquery) && queriesLeft.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        videoassetquery = Ordering.explicit(queries).sortedCopy(successfulQueries);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        hashset = new HashSet();
        iterator = resultMap.values().iterator();
_L2:
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_188;
            }
            obj1 = (List)iterator.next();
        } while (obj1 == null);
        obj1 = ((List) (obj1)).iterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            VideoMessage videomessage = (VideoMessage)((Iterator) (obj1)).next();
            if (hashset.add(videomessage.getId()))
            {
                arraylist.add(videomessage);
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        videoassetquery;
        obj;
        JVM INSTR monitorexit ;
        throw videoassetquery;
        obj;
        JVM INSTR monitorexit ;
label0:
        {
            if (flag)
            {
                if (throwable == null || !videoassetquery.isEmpty())
                {
                    break label0;
                }
                notificationReceiver.onError(throwable, queries);
            }
            return;
        }
        notificationReceiver.onCompletion(arraylist, videoassetquery);
        return;
    }

    public void onCompletion(VideoAssetList videoassetlist, VideoAssetQuery videoassetquery)
    {
        Preconditions.checkNotNull(videoassetquery);
        videoassetlist = videoassetlist.getVideos();
        LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "QueryReceiver.onCompletion with result size=%d, query=%s, watch=%s", new Object[] {
            Integer.valueOf(videoassetlist.size()), videoassetquery, watch
        });
        VideoMessage videomessage;
        for (Iterator iterator = videoassetlist.iterator(); iterator.hasNext(); addVideo(videomessage))
        {
            videomessage = (VideoMessage)iterator.next();
        }

        synchronized (lock)
        {
            resultMap.put(videoassetquery, videoassetlist);
            successfulQueries.add(videoassetquery);
        }
        sendResultsIfAllQueriesCompleted(videoassetquery, null);
        return;
        videoassetlist;
        obj;
        JVM INSTR monitorexit ;
        throw videoassetlist;
    }

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((VideoAssetList)obj, (VideoAssetQuery)obj1);
    }

    public void onError(Throwable throwable, VideoAssetQuery videoassetquery)
    {
        Preconditions.checkNotNull(videoassetquery);
        ExceptionUtil.logExceptionError("VideoManager", (new StringBuilder()).append("QueryReceiver.onError: failed while trying to get feed. editorialFeed=").append(videoassetquery).toString(), throwable);
        sendResultsIfAllQueriesCompleted(videoassetquery, throwable);
    }

    public volatile void onError(Throwable throwable, Object obj)
    {
        onError(throwable, (VideoAssetQuery)obj);
    }

    private (Receiver receiver, Set set)
    {
        this$0 = VideoManager.this;
        super();
        lock = new Object();
        watch = Stopwatch.createStarted();
        notificationReceiver = (Receiver)Preconditions.checkNotNull(receiver);
        queries = ImmutableList.copyOf(set);
        queriesLeft = new HashSet(set);
        successfulQueries = new ArrayList(set.size());
        resultMap = new LinkedHashMap(set.size());
        for (videomanager = set.iterator(); hasNext(); resultMap.put(receiver, null))
        {
            receiver = (VideoAssetQuery)next();
        }

    }

    resultMap(Receiver receiver, Set set, resultMap resultmap)
    {
        this(receiver, set);
    }
}
