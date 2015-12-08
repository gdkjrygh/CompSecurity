// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import android.net.TrafficStats;
import android.util.Log;
import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.dal2.cache.FileCache;
import com.weather.dal2.cache.FileCacheLoader;
import com.weather.dal2.cache.LanguageDependentCaches;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.net.SimpleHttpGetRequest;
import com.weather.util.config.ConfigException;
import java.io.File;

// Referenced classes of package com.weather.commons.video:
//            AdaptiveVideoFeedParser

public class VideoFeedConnection
{
    private static class FileNameReceiver
        implements Receiver
    {

        private final Receiver videoMessageReceiver;
        private final VideoMessage.VideoType videoType;

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((String)obj, obj1);
        }

        public void onCompletion(final String result, Object obj)
        {
            (new Thread(((_cls1) (obj)). new Runnable() {

                final FileNameReceiver this$0;
                final String val$result;
                final Object val$userData;

                public void run()
                {
                    try
                    {
                        AdaptiveVideoFeedParser adaptivevideofeedparser = new AdaptiveVideoFeedParser(Files.toString(new File(result), Charsets.UTF_8), videoType);
                        videoMessageReceiver.onCompletion(adaptivevideofeedparser.parseList(), userData);
                        return;
                    }
                    catch (Throwable throwable)
                    {
                        VideoFeedConnection.getInstance().cache.invalidate(videoType);
                        videoMessageReceiver.onError(throwable, userData);
                        return;
                    }
                }

            
            {
                this$0 = final_filenamereceiver;
                result = s;
                userData = Object.this;
                super();
            }
            })).start();
        }

        public void onError(Throwable throwable, Object obj)
        {
            videoMessageReceiver.onError(throwable, obj);
        }



        private FileNameReceiver(VideoMessage.VideoType videotype, Receiver receiver)
        {
            videoType = videotype;
            videoMessageReceiver = receiver;
        }

    }

    private static class VideoFeedCacheLoader extends FileCacheLoader
    {

        public byte[] getContentsBytes(VideoMessage.VideoType videotype)
            throws Exception
        {
            TrafficStats.setThreadStatsTag(61445);
            videotype = VideoFeedConnection.buildUrl(videotype);
            return (new SimpleHttpGetRequest()).fetchGoogleTWCUserAgentRequestBytes(videotype);
        }

        public volatile byte[] getContentsBytes(Object obj)
            throws Exception
        {
            return getContentsBytes((VideoMessage.VideoType)obj);
        }

        private VideoFeedCacheLoader()
        {
        }

    }


    private static final String CACHE_ID = "VIDEO_FEED_RESOURCE";
    public static final int EXPIRATION = 30;
    public static final String LOCAL_US_FEED_URL;
    private static final int MAX_SIZE = 10;
    private static final String MUST_SEE_INTL_VIDEO_FEED_URL;
    private static final String MUST_SEE_VIDEO_FEED_URL;
    public static final String NATIONAL_US_FEED_URL;
    private static final String ONTV_VIDEO_FEED_URL;
    public static final String REGIONAL_US_FEED_URL;
    private static final String TAG = "VideoFeedConnection";
    private static final String WORLD_VIDEO_FEED_URL;
    private static VideoFeedConnection instance;
    private final FileCache cache;

    private VideoFeedConnection()
    {
        cache = FileCache.create(new VideoFeedCacheLoader(), 10, 30, "VIDEO_FEED_RESOURCE", com.weather.dal2.cache.FileCache.FileCacheDirectory.CACHE_DIR);
        LanguageDependentCaches.getInstance().add(cache.getLoadingCache());
    }

    private static String buildUrl(VideoMessage.VideoType videotype)
    {
        static class _cls1
        {

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
                    $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[VideoMessage.VideoType.LOCAL.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[VideoMessage.VideoType.REGIONAL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[VideoMessage.VideoType.NATIONAL.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[VideoMessage.VideoType.WORLD.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[VideoMessage.VideoType.ONTV.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.weather.commons.video.VideoMessage.VideoType[videotype.ordinal()])
        {
        default:
            return MUST_SEE_VIDEO_FEED_URL;

        case 1: // '\001'
            return MUST_SEE_VIDEO_FEED_URL;

        case 2: // '\002'
            return MUST_SEE_INTL_VIDEO_FEED_URL;

        case 3: // '\003'
            return LOCAL_US_FEED_URL;

        case 4: // '\004'
            return REGIONAL_US_FEED_URL;

        case 5: // '\005'
            return NATIONAL_US_FEED_URL;

        case 6: // '\006'
            return WORLD_VIDEO_FEED_URL;

        case 7: // '\007'
            return ONTV_VIDEO_FEED_URL;
        }
    }

    public static VideoFeedConnection getInstance()
    {
        com/weather/commons/video/VideoFeedConnection;
        JVM INSTR monitorenter ;
        VideoFeedConnection videofeedconnection;
        if (instance == null)
        {
            instance = new VideoFeedConnection();
        }
        videofeedconnection = instance;
        com/weather/commons/video/VideoFeedConnection;
        JVM INSTR monitorexit ;
        return videofeedconnection;
        Exception exception;
        exception;
        throw exception;
    }

    public void asyncFetch(VideoMessage.VideoType videotype, boolean flag, Receiver receiver, Object obj)
    {
        cache.asyncFetch(videotype, flag, new FileNameReceiver(videotype, receiver, null), obj);
    }

    static 
    {
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        String s9;
        String s10;
        String s11;
        s4 = "http://i.imwx.com/multimedia/syndication/news/MRSSAdaptive.xml";
        s8 = "http://i.imwx.com/multimedia/syndication/vacationforecasts/MRSSAdaptive.xml";
        s7 = "http://i.imwx.com/multimedia/syndication/ontv/MRSSAdaptive.xml";
        s6 = "http://i.imwx.com/multimedia/syndication/top100locals/MRSSAdaptive.xml";
        s10 = "http://i.imwx.com/multimedia/syndication/regionals/MRSSAdaptive.xml";
        s9 = "http://i.imwx.com/multimedia/syndication/nationalforecasts/MRSSAdaptive.xml";
        s11 = "http://i.imwx.com/multimedia/syndication/international/MRSSAdaptive.xml";
        s5 = s6;
        s3 = s9;
        s2 = s7;
        s1 = s10;
        s = s8;
        Object obj = ConfigurationManagers.getInstance().getFlagshipConfig().mustSeeVideoFeedUrl;
        s5 = s6;
        s4 = ((String) (obj));
        s3 = s9;
        s2 = s7;
        s1 = s10;
        s = s8;
        s8 = ConfigurationManagers.getInstance().getFlagshipConfig().worldVideoFeedUrl;
        s5 = s6;
        s4 = ((String) (obj));
        s3 = s9;
        s2 = s7;
        s1 = s10;
        s = s8;
        s7 = ConfigurationManagers.getInstance().getFlagshipConfig().onTvVideoFeedUrl;
        s5 = s6;
        s4 = ((String) (obj));
        s3 = s9;
        s2 = s7;
        s1 = s10;
        s = s8;
        s6 = ConfigurationManagers.getInstance().getFlagshipConfig().localUsFeedUrl;
        s5 = s6;
        s4 = ((String) (obj));
        s3 = s9;
        s2 = s7;
        s1 = s10;
        s = s8;
        s10 = ConfigurationManagers.getInstance().getFlagshipConfig().regionalUsFeedUrl;
        s5 = s6;
        s4 = ((String) (obj));
        s3 = s9;
        s2 = s7;
        s1 = s10;
        s = s8;
        s9 = ConfigurationManagers.getInstance().getFlagshipConfig().nationalUsFeedUrl;
        s5 = s6;
        s4 = ((String) (obj));
        s3 = s9;
        s2 = s7;
        s1 = s10;
        s = s8;
        String s12 = ConfigurationManagers.getInstance().getFlagshipConfig().mustSeeIntlVideoFeedUrl;
        s = s8;
        s1 = s10;
        s2 = s7;
        s3 = s9;
        s4 = ((String) (obj));
        obj = s12;
        s5 = s6;
_L2:
        MUST_SEE_VIDEO_FEED_URL = s4;
        WORLD_VIDEO_FEED_URL = s;
        ONTV_VIDEO_FEED_URL = s2;
        LOCAL_US_FEED_URL = s5;
        REGIONAL_US_FEED_URL = s1;
        NATIONAL_US_FEED_URL = s3;
        MUST_SEE_INTL_VIDEO_FEED_URL = ((String) (obj));
        return;
        ConfigException configexception;
        configexception;
        Log.e("VideoFeedConnection", configexception.toString(), configexception);
        configexception = s11;
        if (true) goto _L2; else goto _L1
_L1:
    }


}
