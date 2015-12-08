// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video.vast;

import android.util.Log;
import android.util.Xml;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.dal2.net.MetricsHttpGetRequest;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.net.SimpleHttpGetRequest;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.regex.Pattern;

// Referenced classes of package com.weather.commons.video.vast:
//            VastContentHandler, Vast

public final class UncachedVastConnection
{
    private static class HttpResponseReceiver
        implements Receiver
    {

        private final Receiver vastReceiver;

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((String)obj, obj1);
        }

        public void onCompletion(String s, Object obj)
        {
            VastContentHandler vastcontenthandler = new VastContentHandler();
            try
            {
                Xml.parse(s, vastcontenthandler);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                vastReceiver.onError(s, obj);
            }
            vastReceiver.onCompletion(vastcontenthandler.getVast(), obj);
        }

        public void onError(Throwable throwable, Object obj)
        {
            vastReceiver.onError(throwable, obj);
        }

        private HttpResponseReceiver(Receiver receiver)
        {
            vastReceiver = receiver;
        }

    }


    private static final String PROFILE_GUID;
    private static final Pattern SPLIT_PATTERN;
    private static final String TAG = "VastConnection";
    private static final String URL_PREFIX = "http://onceux.unicornmedia.com/now/ads/vmap/stitched/mp4/";
    private static UncachedVastConnection instance;

    private UncachedVastConnection()
    {
    }

    private static String buildUrl(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String as[] = SPLIT_PATTERN.split(s);
        stringbuilder.append("http://onceux.unicornmedia.com/now/ads/vmap/stitched/mp4/");
        stringbuilder.append(as[6]).append('/').append(as[7]);
        stringbuilder.append(PROFILE_GUID);
        stringbuilder.append(as[8]);
        stringbuilder.append("/content.mp4");
        int i = s.indexOf('?');
        if (i != -1)
        {
            stringbuilder.append(s.substring(i));
        }
        return stringbuilder.toString();
    }

    public static UncachedVastConnection getInstance()
    {
        com/weather/commons/video/vast/UncachedVastConnection;
        JVM INSTR monitorenter ;
        UncachedVastConnection uncachedvastconnection;
        if (instance == null)
        {
            instance = new UncachedVastConnection();
        }
        uncachedvastconnection = instance;
        com/weather/commons/video/vast/UncachedVastConnection;
        JVM INSTR monitorexit ;
        return uncachedvastconnection;
        Exception exception;
        exception;
        throw exception;
    }

    public void asyncFetch(String s, Receiver receiver, Object obj)
    {
        String s1 = buildUrl(s);
        LogUtil.v("VastConnection", LoggingMetaTags.TWC_AD, "Making vast request to %s", new Object[] {
            s
        });
        (new SimpleHttpGetRequest()).asyncFetch(s1, true, obj, new HttpResponseReceiver(receiver));
    }

    public Vast fetch(String s)
        throws Exception
    {
        Object obj = buildUrl(s);
        LogUtil.v("VastConnection", LoggingMetaTags.TWC_AD, "Making vast request to %s", new Object[] {
            s
        });
        s = (new MetricsHttpGetRequest(new SimpleHttpGetRequest(), com.weather.util.metric.Metric.MetricTag.TIMER_VAST_VIDEO_DATA_FEED_REQUEST)).fetch(((String) (obj)), true);
        obj = new VastContentHandler();
        Xml.parse(s, ((org.xml.sax.ContentHandler) (obj)));
        return ((VastContentHandler) (obj)).getVast();
    }

    static 
    {
        String s = "/681f29c5-81eb-4229-9801-ebe21531a57c/";
        String s1 = ConfigurationManagers.getInstance().getFlagshipConfig().videoGUID;
        s = s1;
_L2:
        PROFILE_GUID = s;
        SPLIT_PATTERN = Pattern.compile("/");
        return;
        ConfigException configexception;
        configexception;
        Log.e("VastConnection", configexception.toString(), configexception);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
