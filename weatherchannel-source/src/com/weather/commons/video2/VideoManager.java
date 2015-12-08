// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.video2.dsx.VideoAsset;
import com.weather.commons.video2.dsx.VideoAssetList;
import com.weather.commons.video2.dsx.VideoProgrammingEndpoint;
import com.weather.dal2.net.Receiver;
import com.weather.util.ExceptionUtil;
import com.weather.util.TwcPreconditions;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.weather.commons.video2:
//            VideoPlaylistConnection, VideoProgrammingConnection, VideoAssetListRangedQueryConnection, VideoAssetConnection, 
//            VideoDmaConnection, VideoMessage, PrependVideosToListReceiver, VideoCollectionChunkQuery, 
//            VideoAssetQuery, RangedQuery, Dma, ChunkedMessage, 
//            RangedQueryUrlBuilder

public class VideoManager
{
    private final class AddToCacheVideoListReceiver
        implements Receiver
    {

        final VideoManager this$0;
        private final Stopwatch watch;
        private final Receiver wrappedReceiver;

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((List)obj, obj1);
        }

        public void onCompletion(List list, Object obj)
        {
            Preconditions.checkNotNull(obj);
            LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "VideoListReceiver.onCompletion with result size=%d, userData=%s, watch=%s", new Object[] {
                Integer.valueOf(list.size()), obj, watch
            });
            VideoMessage videomessage;
            for (Iterator iterator = list.iterator(); iterator.hasNext(); LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "videoId=%s title=%s", new Object[] {
        videomessage.getId(), videomessage.getTeaserTitle()
    }))
            {
                videomessage = (VideoMessage)iterator.next();
                addVideo(videomessage);
            }

            wrappedReceiver.onCompletion(list, obj);
        }

        public void onError(Throwable throwable, Object obj)
        {
            Preconditions.checkNotNull(obj);
            ExceptionUtil.logExceptionError("VideoManager", (new StringBuilder()).append("VideoListReceiver.onError: failed while trying to get videos. userData=").append(obj).toString(), throwable);
            wrappedReceiver.onError(throwable, obj);
        }

        private AddToCacheVideoListReceiver(Receiver receiver)
        {
            this$0 = VideoManager.this;
            super();
            watch = Stopwatch.createStarted();
            wrappedReceiver = (Receiver)Preconditions.checkNotNull(receiver);
        }

    }

    private final class ChunkReceiver
        implements Receiver
    {

        private final ResultAdaptor adaptor;
        final VideoManager this$0;
        private final Stopwatch watch;
        private final Receiver wrappedReceiver;

        public void onCompletion(VideoAssetList videoassetlist, RangedQuery rangedquery)
        {
            Preconditions.checkNotNull(rangedquery);
            videoassetlist = videoassetlist.getVideos();
            LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "ChunkReceiver.onCompletion with result size=%d, query=%s, watch=%s", new Object[] {
                Integer.valueOf(videoassetlist.size()), rangedquery, watch
            });
            VideoMessage videomessage;
            for (com.google.common.collect.UnmodifiableIterator unmodifiableiterator = videoassetlist.iterator(); unmodifiableiterator.hasNext(); addVideo(videomessage))
            {
                videomessage = (VideoMessage)unmodifiableiterator.next();
            }

            com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
            for (videoassetlist = videoassetlist.iterator(); videoassetlist.hasNext(); builder.add(new ChunkedMessage(rangedquery, (VideoMessage)videoassetlist.next()))) { }
            videoassetlist = builder.build();
            wrappedReceiver.onCompletion(adaptor.adapt(videoassetlist), rangedquery);
        }

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((VideoAssetList)obj, (RangedQuery)obj1);
        }

        public void onError(Throwable throwable, RangedQuery rangedquery)
        {
            Preconditions.checkNotNull(rangedquery);
            ExceptionUtil.logExceptionError("VideoManager", (new StringBuilder()).append("CollectionChunkReceiver.onError: failed while trying to get videos. query=").append(rangedquery).toString(), throwable);
            wrappedReceiver.onError(throwable, rangedquery);
        }

        public volatile void onError(Throwable throwable, Object obj)
        {
            onError(throwable, (RangedQuery)obj);
        }

        private ChunkReceiver(Receiver receiver, ResultAdaptor resultadaptor)
        {
            this$0 = VideoManager.this;
            super();
            watch = Stopwatch.createStarted();
            wrappedReceiver = (Receiver)Preconditions.checkNotNull(receiver);
            adaptor = resultadaptor;
        }

    }

    public static final class EditorialFeed extends Enum
    {

        private static final EditorialFeed $VALUES[];
        public static final EditorialFeed MAIN;
        public static final EditorialFeed RIGHT_NOW;
        public static final EditorialFeed WIDGET;

        public static EditorialFeed valueOf(String s)
        {
            return (EditorialFeed)Enum.valueOf(com/weather/commons/video2/VideoManager$EditorialFeed, s);
        }

        public static EditorialFeed[] values()
        {
            return (EditorialFeed[])$VALUES.clone();
        }

        static 
        {
            MAIN = new EditorialFeed("MAIN", 0);
            RIGHT_NOW = new EditorialFeed("RIGHT_NOW", 1);
            WIDGET = new EditorialFeed("WIDGET", 2);
            $VALUES = (new EditorialFeed[] {
                MAIN, RIGHT_NOW, WIDGET
            });
        }

        private EditorialFeed(String s, int i)
        {
            super(s, i);
        }
    }

    private static class ListOfVideoMessageAdaptor
        implements ResultAdaptor
    {

        public volatile Object adapt(List list)
        {
            return adapt(list);
        }

        public List adapt(List list)
        {
            return list;
        }

        private ListOfVideoMessageAdaptor()
        {
        }

    }

    private final class MultiQueryReceiver
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

        private MultiQueryReceiver(Receiver receiver, Set set)
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

    }

    private final class ProgrammingReceiver
        implements Receiver
    {

        private final Receiver notificationReceiver;
        final VideoManager this$0;
        private final Stopwatch watch;

        public void onCompletion(VideoProgrammingEndpoint videoprogrammingendpoint, EditorialFeed editorialfeed)
        {
            Object obj;
            List list;
            Object obj1;
            Preconditions.checkNotNull(editorialfeed);
            list = videoprogrammingendpoint.getModuleVideos();
            obj1 = videoprogrammingendpoint.getRightNowVideo();
            VideoMessage videomessage;
            if (obj1 == null)
            {
                obj = Collections.emptyList();
            } else
            {
                obj = ImmutableList.of(obj1);
            }
            videomessage = videoprogrammingendpoint.getWidgetVideo();
            if (videomessage == null)
            {
                videoprogrammingendpoint = Collections.emptyList();
            } else
            {
                videoprogrammingendpoint = ImmutableList.of(videomessage);
            }
            LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "ProgrammingReceiver.onCompletion for video editorialFeed=%s, main count=%s, rightNowVideo=%s, widgetVideo=%s, watch=%s", new Object[] {
                editorialfeed, Integer.valueOf(list.size()), obj1, videomessage, watch
            });
            editorialFeeds.put(EditorialFeed.MAIN, list);
            for (obj1 = list.iterator(); ((Iterator) (obj1)).hasNext(); addVideo(videomessage))
            {
                videomessage = (VideoMessage)((Iterator) (obj1)).next();
            }

            editorialFeeds.put(EditorialFeed.RIGHT_NOW, obj);
            VideoMessage videomessage1;
            for (obj1 = ((List) (obj)).iterator(); ((Iterator) (obj1)).hasNext(); addVideo(videomessage1))
            {
                videomessage1 = (VideoMessage)((Iterator) (obj1)).next();
            }

            editorialFeeds.put(EditorialFeed.WIDGET, videoprogrammingendpoint);
            VideoMessage videomessage2;
            for (obj1 = videoprogrammingendpoint.iterator(); ((Iterator) (obj1)).hasNext(); addVideo(videomessage2))
            {
                videomessage2 = (VideoMessage)((Iterator) (obj1)).next();
            }

            obj1 = Collections.emptyList();
            static class _cls3
            {

                static final int $SwitchMap$com$weather$commons$video2$VideoManager$EditorialFeed[];

                static 
                {
                    $SwitchMap$com$weather$commons$video2$VideoManager$EditorialFeed = new int[EditorialFeed.values().length];
                    try
                    {
                        $SwitchMap$com$weather$commons$video2$VideoManager$EditorialFeed[EditorialFeed.MAIN.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$video2$VideoManager$EditorialFeed[EditorialFeed.RIGHT_NOW.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$video2$VideoManager$EditorialFeed[EditorialFeed.WIDGET.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls3..SwitchMap.com.weather.commons.video2.VideoManager.EditorialFeed[editorialfeed.ordinal()];
            JVM INSTR tableswitch 1 3: default 324
        //                       1 339
        //                       2 345
        //                       3 350;
               goto _L1 _L2 _L3 _L4
_L4:
            break; /* Loop/switch isn't completed */
_L1:
            videoprogrammingendpoint = ((VideoProgrammingEndpoint) (obj1));
_L6:
            notificationReceiver.onCompletion(videoprogrammingendpoint, editorialfeed);
            return;
_L2:
            videoprogrammingendpoint = list;
            continue; /* Loop/switch isn't completed */
_L3:
            videoprogrammingendpoint = ((VideoProgrammingEndpoint) (obj));
            if (true) goto _L6; else goto _L5
_L5:
        }

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((VideoProgrammingEndpoint)obj, (EditorialFeed)obj1);
        }

        public void onError(Throwable throwable, EditorialFeed editorialfeed)
        {
            Preconditions.checkNotNull(editorialfeed);
            ExceptionUtil.logExceptionError("VideoManager", (new StringBuilder()).append("ProgrammingReceiver.onError: failed while trying to get feed. editorialFeed=").append(editorialfeed).toString(), throwable);
            notificationReceiver.onError(throwable, editorialfeed);
        }

        public volatile void onError(Throwable throwable, Object obj)
        {
            onError(throwable, (EditorialFeed)obj);
        }

        private ProgrammingReceiver(Receiver receiver)
        {
            this$0 = VideoManager.this;
            super();
            watch = Stopwatch.createStarted();
            notificationReceiver = (Receiver)Preconditions.checkNotNull(receiver);
        }

    }

    private static interface ResultAdaptor
    {

        public abstract Object adapt(List list);
    }

    private static class VideoAssetListAdaptor
        implements ResultAdaptor
    {

        public VideoAssetList adapt(List list)
        {
            return new VideoAssetList(ImmutableList.copyOf(list));
        }

        public volatile Object adapt(List list)
        {
            return adapt(list);
        }

        private VideoAssetListAdaptor()
        {
        }

    }

    static class VideoAssetQueryUrlBuilder
        implements RangedQueryUrlBuilder
    {

        public volatile String getUrl(RangedQuery rangedquery, ConfigurationManagers configurationmanagers)
            throws ConfigException
        {
            return getUrl((VideoAssetQuery)rangedquery, configurationmanagers);
        }

        public String getUrl(VideoAssetQuery videoassetquery, ConfigurationManagers configurationmanagers)
            throws ConfigException
        {
            return configurationmanagers.getFlagshipConfig().getVideoQueryUrl(videoassetquery.getQueryString(), videoassetquery.getQueryRange());
        }

        VideoAssetQueryUrlBuilder()
        {
        }
    }

    static class VideoCollectionChunkQueryUrlBuilder
        implements RangedQueryUrlBuilder
    {

        public volatile String getUrl(RangedQuery rangedquery, ConfigurationManagers configurationmanagers)
            throws ConfigException
        {
            return getUrl((VideoCollectionChunkQuery)rangedquery, configurationmanagers);
        }

        public String getUrl(VideoCollectionChunkQuery videocollectionchunkquery, ConfigurationManagers configurationmanagers)
            throws ConfigException
        {
            return configurationmanagers.getFlagshipConfig().getVideoDedupedCollectionUrl(videocollectionchunkquery.getCollectionName(), videocollectionchunkquery.getQueryRange());
        }

        VideoCollectionChunkQueryUrlBuilder()
        {
        }
    }


    public static final String DEFAULT_DMA_ADDON_PLAYLIST = "news/weather";
    public static final String DEFAULT_VIDEO_PLAYLIST = "pl-editor-picks";
    private static final int FILE_CACHE_MINUTES = 5;
    private static final String TAG = "VideoManager";
    private static final int VIDEO_ASSET_QUERY_CACHE_SIZE = 200;
    private static final int VIDEO_CACHE_SIZE = 750;
    private static final int VIDEO_COLLECTION_CHUNK_CACHE_SIZE = 75;
    private final VideoAssetConnection assetConnection;
    private final VideoAssetListRangedQueryConnection dedupedCollectionsConnection;
    private final VideoDmaConnection dmaConnection;
    private final Cache editorialFeeds;
    private final VideoPlaylistConnection playlistConnection;
    private final VideoProgrammingConnection programmingConnection;
    private final VideoAssetListRangedQueryConnection queryConnection;
    private final Cache videos;

    public VideoManager()
    {
        this(new VideoPlaylistConnection("VIDEO_PLAYLIST", ConfigurationManagers.getInstance(), 5), new VideoProgrammingConnection("VIDEO_PROGRAMMING", ConfigurationManagers.getInstance(), 5), new VideoAssetListRangedQueryConnection("VIDEO_ASSET_QUERY", ConfigurationManagers.getInstance(), new VideoAssetQueryUrlBuilder(), 5, 200), new VideoAssetListRangedQueryConnection("VIDEO_DEDUPED_COLLECTION", ConfigurationManagers.getInstance(), new VideoCollectionChunkQueryUrlBuilder(), 5, 75), new VideoAssetConnection("VIDEO_ASSET", ConfigurationManagers.getInstance(), 5), new VideoDmaConnection("VIDEO_DMA", ConfigurationManagers.getInstance(), 5));
    }

    VideoManager(VideoPlaylistConnection videoplaylistconnection, VideoProgrammingConnection videoprogrammingconnection, VideoAssetListRangedQueryConnection videoassetlistrangedqueryconnection, VideoAssetListRangedQueryConnection videoassetlistrangedqueryconnection1, VideoAssetConnection videoassetconnection, VideoDmaConnection videodmaconnection)
    {
        editorialFeeds = CacheBuilder.newBuilder().build();
        videos = CacheBuilder.newBuilder().maximumSize(750L).build();
        playlistConnection = videoplaylistconnection;
        programmingConnection = videoprogrammingconnection;
        queryConnection = videoassetlistrangedqueryconnection;
        dedupedCollectionsConnection = videoassetlistrangedqueryconnection1;
        assetConnection = videoassetconnection;
        dmaConnection = videodmaconnection;
    }

    private void requestPlaylistOrAssetCollection(VideoMessage videomessage, String s, Receiver receiver, boolean flag)
    {
        if (s == null)
        {
            requestPlaylistVideos(receiver, flag, videomessage.getCollectionId());
            return;
        } else
        {
            requestPlaylistVideos(new PrependVideosToListReceiver(receiver, videomessage), flag, s);
            return;
        }
    }

    public void addVideo(VideoMessage videomessage)
    {
        videos.put(videomessage.getId(), videomessage);
    }

    public VideoMessage getVideo(String s)
    {
        return (VideoMessage)videos.getIfPresent(s);
    }

    public List getVideos(EditorialFeed editorialfeed)
    {
        editorialfeed = (List)editorialFeeds.getIfPresent(editorialfeed);
        if (editorialfeed == null)
        {
            return Collections.emptyList();
        } else
        {
            return ImmutableList.copyOf(editorialfeed);
        }
    }

    public void invalidateAll()
    {
        playlistConnection.invalidateAll();
        programmingConnection.invalidateAll();
        queryConnection.invalidateAll();
        dedupedCollectionsConnection.invalidateAll();
        assetConnection.invalidateAll();
        dmaConnection.invalidateAll();
        editorialFeeds.invalidateAll();
        videos.invalidateAll();
    }

    public void requestChunkOfVideos(Receiver receiver, boolean flag, RangedQuery rangedquery)
    {
        LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "requestChunkOfVideos: query=%s", new Object[] {
            rangedquery
        });
        Preconditions.checkNotNull(rangedquery);
        receiver = new ChunkReceiver(receiver, new ListOfVideoMessageAdaptor());
        if (rangedquery instanceof VideoCollectionChunkQuery)
        {
            dedupedCollectionsConnection.asyncFetch((VideoCollectionChunkQuery)rangedquery, flag, receiver, rangedquery);
            return;
        }
        if (rangedquery instanceof VideoAssetQuery)
        {
            queryConnection.asyncFetch((VideoAssetQuery)rangedquery, flag, receiver, rangedquery);
            return;
        } else
        {
            LogUtil.w("VideoManager", LoggingMetaTags.TWC_VIDEOS, "requestChunkOfVideos: Can't fetch videos, no connection available for query type. query=%s", new Object[] {
                rangedquery
            });
            return;
        }
    }

    public void requestDmaVideos(Receiver receiver, boolean flag, Dma dma, String s)
    {
        LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "requestDmaVideos: dma=%s, addOnPlaylist=%s", new Object[] {
            dma, s
        });
        Preconditions.checkNotNull(receiver);
        Preconditions.checkNotNull(dma);
        Preconditions.checkNotNull(s);
        receiver = new Receiver() {

            final VideoManager this$0;
            final String val$addOnPlaylistOrCollection;
            final Receiver val$addToCacheVideoListReceiver;

            public volatile void onCompletion(Object obj, Object obj1)
            {
                onCompletion((List)obj, (String)obj1);
            }

            public void onCompletion(List list, String s1)
            {
                list = new PrependVideosToListReceiver(addToCacheVideoListReceiver, list);
                playlistConnection.asyncFetch(addOnPlaylistOrCollection, false, list, addOnPlaylistOrCollection);
            }

            public volatile void onError(Throwable throwable, Object obj)
            {
                onError(throwable, (String)obj);
            }

            public void onError(Throwable throwable, String s1)
            {
                addToCacheVideoListReceiver.onError(throwable, s1);
            }

            
            {
                this$0 = VideoManager.this;
                addToCacheVideoListReceiver = receiver;
                addOnPlaylistOrCollection = s;
                super();
            }
        };
        dmaConnection.asyncFetch(dma, flag, receiver, s);
    }

    public void requestPlaylistVideos(Receiver receiver, boolean flag, String s)
    {
        LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "requestPlaylistVideos: playlist=%s", new Object[] {
            s
        });
        Preconditions.checkNotNull(s);
        receiver = new AddToCacheVideoListReceiver(receiver);
        playlistConnection.asyncFetch(s, flag, receiver, s);
    }

    public void requestProgrammedVideos(Receiver receiver, boolean flag, EditorialFeed editorialfeed)
    {
        LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "requestProgrammedVideos: editorialFeed=%s", new Object[] {
            editorialfeed
        });
        Preconditions.checkNotNull(editorialfeed);
        receiver = new ProgrammingReceiver(receiver);
        programmingConnection.asyncFetch("en_US", flag, receiver, editorialfeed);
    }

    public void requestQueryVideos(Receiver receiver, boolean flag, Set set)
    {
        LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "requestQueryVideos: queries=%s", new Object[] {
            set
        });
        Preconditions.checkNotNull(set);
        TwcPreconditions.checkNotEmpty(set);
        TwcPreconditions.checkContainsNoNullElements(set);
        receiver = new ChunkReceiver(new MultiQueryReceiver(receiver, set), new VideoAssetListAdaptor());
        VideoAssetQuery videoassetquery;
        for (set = set.iterator(); set.hasNext(); queryConnection.asyncFetch(videoassetquery, flag, receiver, videoassetquery))
        {
            videoassetquery = (VideoAssetQuery)set.next();
        }

    }

    public void requestVideoAndPlaylist(final Receiver resultReceiver, final boolean force, String s, final String playlist)
    {
        LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "requestVideoAndPlaylist: for videoId=%s playlist=%s", new Object[] {
            s, playlist
        });
        Preconditions.checkNotNull(s);
        VideoMessage videomessage = (VideoMessage)videos.getIfPresent(s);
        if (videomessage != null)
        {
            LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, " CACHE: In cache: id=%s", new Object[] {
                videomessage.getId()
            });
            requestPlaylistOrAssetCollection(videomessage, playlist, resultReceiver, force);
            return;
        } else
        {
            LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, " CACHE: not cached: videoId=%s", new Object[] {
                s
            });
            resultReceiver = new Receiver() {

                final VideoManager this$0;
                final boolean val$force;
                final String val$playlist;
                final Receiver val$resultReceiver;

                public void onCompletion(VideoAsset videoasset, String s1)
                {
                    LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "retrieved video: id=%s", new Object[] {
                        videoasset.getId()
                    });
                    addVideo(videoasset);
                    requestPlaylistOrAssetCollection(videoasset, playlist, resultReceiver, force);
                }

                public volatile void onCompletion(Object obj, Object obj1)
                {
                    onCompletion((VideoAsset)obj, (String)obj1);
                }

                public volatile void onError(Throwable throwable, Object obj)
                {
                    onError(throwable, (String)obj);
                }

                public void onError(Throwable throwable, String s1)
                {
                    s1 = VideoManager.this;
                    Receiver receiver = resultReceiver;
                    boolean flag = force;
                    if (playlist == null)
                    {
                        throwable = "pl-editor-picks";
                    } else
                    {
                        throwable = playlist;
                    }
                    s1.requestPlaylistVideos(receiver, flag, throwable);
                }

            
            {
                this$0 = VideoManager.this;
                resultReceiver = receiver;
                force = flag;
                playlist = s;
                super();
            }
            };
            assetConnection.asyncFetch(s, force, resultReceiver, s);
            return;
        }
    }



}
