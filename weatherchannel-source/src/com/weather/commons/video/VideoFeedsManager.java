// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import android.util.Log;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.net.Receiver;
import com.weather.util.ExceptionUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.commons.video:
//            FeedType, VideoFeedConnection, VideoMessage

public class VideoFeedsManager
{
    private final class LocalReceiver
        implements Receiver
    {

        private Throwable exception;
        private final Receiver receiver;
        private final Object receiverUserData;
        private final EnumSet remainingTypes;
        private boolean somethingLoaded;
        final VideoFeedsManager this$0;
        private final Stopwatch watch;

        private void markTypeReceived(VideoMessage.VideoType videotype)
        {
            Object obj;
            boolean flag;
            boolean flag1;
            flag1 = false;
            flag = false;
            obj = null;
            Object obj1 = lock;
            obj1;
            JVM INSTR monitorenter ;
            remainingTypes.remove(videotype);
            videotype = obj;
            if (!remainingTypes.isEmpty())
            {
                break MISSING_BLOCK_LABEL_60;
            }
            flag1 = somethingLoaded;
            if (!somethingLoaded)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            videotype = exception;
            obj1;
            JVM INSTR monitorexit ;
            if (flag1)
            {
                receiver.onCompletion(FeedType.LOCAL, receiverUserData);
            }
            if (flag)
            {
                receiver.onError(videotype, receiverUserData);
            }
            return;
            videotype;
            obj1;
            JVM INSTR monitorexit ;
            throw videotype;
        }

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((List)obj, (VideoMessage.VideoType)obj1);
        }

        public void onCompletion(List list, VideoMessage.VideoType videotype)
        {
            if (videotype == null)
            {
                Log.e("VideoFeedsManager", "VideoMessage receiver used on request without videoType");
                return;
            }
            LogUtil.d("VideoFeedsManager", LoggingMetaTags.TWC_VIDEOS, "in VideoFragment.onCompletion with result size: %d for video type: %s", new Object[] {
                Integer.valueOf(list.size()), videotype
            });
            Object obj = lock;
            obj;
            JVM INSTR monitorenter ;
            static class _cls1
            {

                static final int $SwitchMap$com$weather$commons$video$FeedType[];
                static final int $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[];

                static 
                {
                    $SwitchMap$com$weather$commons$video$VideoMessage$VideoType = new int[VideoMessage.VideoType.values().length];
                    try
                    {
                        $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[VideoMessage.VideoType.MUST_SEE.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[VideoMessage.VideoType.MUST_SEE_INTL.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[VideoMessage.VideoType.ONTV.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[VideoMessage.VideoType.LOCAL.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[VideoMessage.VideoType.REGIONAL.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[VideoMessage.VideoType.NATIONAL.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    $SwitchMap$com$weather$commons$video$FeedType = new int[FeedType.values().length];
                    try
                    {
                        $SwitchMap$com$weather$commons$video$FeedType[FeedType.LOCAL.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls1..SwitchMap.com.weather.commons.video.VideoMessage.VideoType[videotype.ordinal()];
            JVM INSTR tableswitch 4 6: default 243
        //                       4 104
        //                       5 161
        //                       6 181;
               goto _L1 _L2 _L3 _L4
_L4:
            break MISSING_BLOCK_LABEL_181;
_L1:
            Log.e("VideoFeedsManager", "Incorrect id in VideoFragment Receiver onCompletion. Investigate");
_L5:
            markTypeReceived(videotype);
            return;
_L2:
            somethingLoaded = true;
            localVideosMap = VideoMessage.partitionByDMA(list);
            LogUtil.d("VideoFeedsManager", LoggingMetaTags.TWC_VIDEOS, "localVideosMap size is: %d", new Object[] {
                Integer.valueOf(localVideosMap.size())
            });
              goto _L5
            list;
            obj;
            JVM INSTR monitorexit ;
            throw list;
_L3:
            somethingLoaded = true;
            regionalVideosMap = VideoMessage.partitionByRegion(list);
              goto _L5
            somethingLoaded = true;
            Log.w("FileCache", (new StringBuilder()).append("*** VideoFragment.AsyncFetch(NATIONAL):").append(watch).append(" count=").append(list.size()).toString());
            nationalVideos = ImmutableList.copyOf(list);
              goto _L5
        }

        public void onError(Throwable throwable, VideoMessage.VideoType videotype)
        {
            ExceptionUtil.logExceptionError("VideoFeedsManager", (new StringBuilder()).append("videoReceiver.onError: ").append(throwable).append(" for TextView id: ").append(videotype).toString(), throwable);
            synchronized (lock)
            {
                exception = throwable;
            }
            markTypeReceived(videotype);
            return;
            throwable;
            obj;
            JVM INSTR monitorexit ;
            throw throwable;
        }

        public volatile void onError(Throwable throwable, Object obj)
        {
            onError(throwable, (VideoMessage.VideoType)obj);
        }

        private LocalReceiver(Receiver receiver1, Object obj)
        {
            this$0 = VideoFeedsManager.this;
            super();
            remainingTypes = EnumSet.of(VideoMessage.VideoType.LOCAL, VideoMessage.VideoType.REGIONAL, VideoMessage.VideoType.NATIONAL);
            watch = Stopwatch.createStarted();
            receiverUserData = obj;
            receiver = (Receiver)Preconditions.checkNotNull(receiver1);
        }

    }

    private final class SimpleVideoReceiver
        implements Receiver
    {

        private final Object callersUserData;
        private final FeedType feedType;
        private final Receiver receiver;
        final VideoFeedsManager this$0;
        private final Stopwatch watch;

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((List)obj, (VideoMessage.VideoType)obj1);
        }

        public void onCompletion(List list, VideoMessage.VideoType videotype)
        {
            if (videotype == null)
            {
                Log.e("VideoFeedsManager", "VideoMessage receiver used on request without videoType");
                return;
            }
            LogUtil.d("VideoFeedsManager", LoggingMetaTags.TWC_VIDEOS, "in VideoFragment.onCompletion with result size: %d for video type: %s", new Object[] {
                Integer.valueOf(list.size()), videotype
            });
            Object obj = lock;
            obj;
            JVM INSTR monitorenter ;
            _cls1..SwitchMap.com.weather.commons.video.VideoMessage.VideoType[videotype.ordinal()];
            JVM INSTR tableswitch 1 3: default 221
        //                       1 104
        //                       2 104
        //                       3 164;
               goto _L1 _L2 _L2 _L3
_L1:
            Log.e("VideoFeedsManager", "Incorrect id in VideoFragment Receiver onCompletion. Investigate");
            return;
            list;
            obj;
            JVM INSTR monitorexit ;
            throw list;
_L2:
            Log.w("FileCache", (new StringBuilder()).append("*** VideoFragment.AsyncFetch(MUST_SEE):").append(watch).toString());
            mustSeeVideos = ImmutableList.copyOf(list);
_L4:
            obj;
            JVM INSTR monitorexit ;
            receiver.onCompletion(feedType, callersUserData);
            return;
_L3:
            Log.w("FileCache", (new StringBuilder()).append("*** VideoFragment.AsyncFetch(ONTV):").append(watch).append(" count=").append(list.size()).toString());
            onTvVideos = ImmutableList.copyOf(list);
              goto _L4
        }

        public void onError(Throwable throwable, VideoMessage.VideoType videotype)
        {
            ExceptionUtil.logExceptionError("VideoFeedsManager", (new StringBuilder()).append("videoReceiver.onError: ").append(throwable).append(" for TextView id: ").append(videotype).toString(), throwable);
            receiver.onError(throwable, callersUserData);
        }

        public volatile void onError(Throwable throwable, Object obj)
        {
            onError(throwable, (VideoMessage.VideoType)obj);
        }

        private SimpleVideoReceiver(FeedType feedtype, Receiver receiver1, Object obj)
        {
            this$0 = VideoFeedsManager.this;
            super();
            watch = Stopwatch.createStarted();
            feedType = (FeedType)Preconditions.checkNotNull(feedtype);
            callersUserData = obj;
            receiver = (Receiver)Preconditions.checkNotNull(receiver1);
        }

    }


    private static final String TAG = "VideoFeedsManager";
    private final VideoFeedConnection feedConnection;
    private Multimap localVideosMap;
    private final Object lock = new Object();
    private List mustSeeVideos;
    private List nationalVideos;
    private List onTvVideos;
    private Multimap regionalVideosMap;

    public VideoFeedsManager(VideoFeedConnection videofeedconnection)
    {
        localVideosMap = ImmutableMultimap.of();
        regionalVideosMap = ImmutableMultimap.of();
        nationalVideos = ImmutableList.of();
        mustSeeVideos = ImmutableList.of();
        onTvVideos = ImmutableList.of();
        feedConnection = videofeedconnection;
    }

    public List getLocalVideos(SavedLocation savedlocation)
    {
        ArrayList arraylist = null;
        Object obj1 = lock;
        obj1;
        JVM INSTR monitorenter ;
        if (savedlocation != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L7:
        if (savedlocation != null) goto _L4; else goto _L3
_L3:
        savedlocation = arraylist;
_L5:
        arraylist = new ArrayList();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        Collection collection = localVideosMap.get(((Integer) (obj)).toString());
        LogUtil.d("VideoFeedsManager", LoggingMetaTags.TWC_VIDEOS, "video DMA is: %s", new Object[] {
            obj
        });
        arraylist.addAll(collection);
        if (!Strings.isNullOrEmpty(savedlocation))
        {
            obj = regionalVideosMap.get(savedlocation);
            LogUtil.d("VideoFeedsManager", LoggingMetaTags.TWC_VIDEOS, "video region is: %s", new Object[] {
                savedlocation
            });
            arraylist.addAll(((Collection) (obj)));
        }
        arraylist.addAll(nationalVideos);
        obj1;
        JVM INSTR monitorexit ;
        return arraylist;
_L2:
        obj = savedlocation.getDma();
        continue; /* Loop/switch isn't completed */
_L4:
        savedlocation = savedlocation.getSsRad();
          goto _L5
        savedlocation;
        obj1;
        JVM INSTR monitorexit ;
        throw savedlocation;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public List getMustSeeVideos()
    {
        ImmutableList immutablelist;
        synchronized (lock)
        {
            immutablelist = ImmutableList.copyOf(mustSeeVideos);
        }
        return immutablelist;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public List getOnTvVideos()
    {
        ImmutableList immutablelist;
        synchronized (lock)
        {
            immutablelist = ImmutableList.copyOf(onTvVideos);
        }
        return immutablelist;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public transient void requestVideos(Receiver receiver, Object obj, FeedType afeedtype[])
    {
        int i;
        int j;
        j = afeedtype.length;
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L1
_L1:
        Object obj2 = afeedtype[i];
        _cls1..SwitchMap.com.weather.commons.video.FeedType[((FeedType) (obj2)).ordinal()];
        JVM INSTR tableswitch 1 1: default 48
    //                   1 114;
           goto _L3 _L4
_L3:
        Object obj1 = new SimpleVideoReceiver(((FeedType) (obj2)), receiver, obj, null);
_L6:
        VideoMessage.VideoType videotype;
        for (obj2 = ((FeedType) (obj2)).getVideoTypes().iterator(); ((Iterator) (obj2)).hasNext(); feedConnection.asyncFetch(videotype, false, ((Receiver) (obj1)), videotype))
        {
            videotype = (VideoMessage.VideoType)((Iterator) (obj2)).next();
        }

        continue; /* Loop/switch isn't completed */
_L4:
        obj1 = new LocalReceiver(receiver, obj, null);
        if (true) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L2:
    }



/*
    static List access$302(VideoFeedsManager videofeedsmanager, List list)
    {
        videofeedsmanager.mustSeeVideos = list;
        return list;
    }

*/


/*
    static List access$402(VideoFeedsManager videofeedsmanager, List list)
    {
        videofeedsmanager.onTvVideos = list;
        return list;
    }

*/



/*
    static Multimap access$502(VideoFeedsManager videofeedsmanager, Multimap multimap)
    {
        videofeedsmanager.localVideosMap = multimap;
        return multimap;
    }

*/


/*
    static Multimap access$602(VideoFeedsManager videofeedsmanager, Multimap multimap)
    {
        videofeedsmanager.regionalVideosMap = multimap;
        return multimap;
    }

*/


/*
    static List access$702(VideoFeedsManager videofeedsmanager, List list)
    {
        videofeedsmanager.nationalVideos = list;
        return list;
    }

*/
}
