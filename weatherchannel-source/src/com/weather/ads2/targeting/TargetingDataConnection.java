// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import android.net.TrafficStats;
import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import com.google.common.cache.CacheLoader;
import com.weather.dal2.cache.MemCache;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.system.TwcBus;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.net.HttpRequest;
import java.util.EnumSet;
import java.util.Map;

// Referenced classes of package com.weather.ads2.targeting:
//            AdTargetingChange

public abstract class TargetingDataConnection
{

    private static final int CACHE_SIZE = 1;
    protected final TwcBus bus;
    protected final MemCache cache;
    private Object lock;
    private volatile boolean running;
    protected final String tag;

    protected TargetingDataConnection(int i, Ticker ticker, TwcBus twcbus, String s)
    {
        lock = new Object();
        bus = (TwcBus)Preconditions.checkNotNull(twcbus);
        tag = (String)Preconditions.checkNotNull(s);
        cache = new MemCache(new CacheLoader() {

            final TargetingDataConnection this$0;

            public volatile Object load(Object obj)
                throws Exception
            {
                return load((String)obj);
            }

            public Map load(String s1)
            {
                return loadData();
            }

            
            {
                this$0 = TargetingDataConnection.this;
                super();
            }
        }, 1, i, EnumSet.noneOf(com/weather/dal2/cache/BaseCache$Policy), ticker);
    }

    protected TargetingDataConnection(TwcBus twcbus, String s, MemCache memcache)
    {
        lock = new Object();
        bus = (TwcBus)Preconditions.checkNotNull(twcbus);
        cache = (MemCache)Preconditions.checkNotNull(memcache);
        tag = (String)Preconditions.checkNotNull(s);
    }

    protected abstract String getUrl();

    protected Map loadData()
    {
        Object obj;
        try
        {
            obj = requestData();
            LogUtil.d(tag, LoggingMetaTags.TWC_AD, "response from server is %s", new Object[] {
                obj
            });
        }
        catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception)
        {
            EventLog.w(tag, "Unable to retrieve ad targeting parameters", httprequestexception);
            return loadPersistedValues();
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        return loadPersistedValues();
        obj = parseResponse(((String) (obj)));
        LogUtil.d(tag, LoggingMetaTags.TWC_AD, "Parameter update %s", new Object[] {
            obj
        });
        return ((Map) (obj));
    }

    protected abstract Map loadPersistedValues();

    protected abstract Map parseResponse(String s);

    public void refresh(boolean flag)
    {
        cache.asyncFetch("key", flag, new Receiver() {

            final TargetingDataConnection this$0;

            public volatile void onCompletion(Object obj, Object obj1)
            {
                onCompletion((Map)obj, (Void)obj1);
            }

            public void onCompletion(Map map, Void void1)
            {
                bus.post(new AdTargetingChange(map));
            }

            public volatile void onError(Throwable throwable, Object obj)
            {
                onError(throwable, (Void)obj);
            }

            public void onError(Throwable throwable, Void void1)
            {
                EventLog.e(tag, "Error updating ad targeting parameters", throwable);
            }

            
            {
                this$0 = TargetingDataConnection.this;
                super();
            }
        }, null);
    }

    protected String requestData()
        throws com.weather.util.net.HttpRequest.HttpRequestException
    {
        HttpRequest httprequest;
        Object obj;
        obj = getUrl();
        if (obj == null)
        {
            return null;
        }
        LogUtil.d(tag, LoggingMetaTags.TWC_AD, "url for targeting data is %s", new Object[] {
            obj
        });
        httprequest = null;
        TrafficStats.setThreadStatsTag(40960);
        obj = HttpRequest.get(((CharSequence) (obj))).acceptJson().acceptGzipEncoding().uncompress(true);
        httprequest = ((HttpRequest) (obj));
        String s = ((HttpRequest) (obj)).body();
        httprequest = ((HttpRequest) (obj));
        if (((HttpRequest) (obj)).success())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        httprequest = ((HttpRequest) (obj));
        LogUtil.d(tag, LoggingMetaTags.TWC_AD, "Failed to make request: statusCode=%s, error=%s", new Object[] {
            Integer.valueOf(((HttpRequest) (obj)).code()), s
        });
        if (obj != null)
        {
            ((HttpRequest) (obj)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return null;
        if (obj != null)
        {
            ((HttpRequest) (obj)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return s;
        Exception exception;
        exception;
        if (httprequest != null)
        {
            httprequest.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw exception;
    }

    public void start()
    {
        synchronized (lock)
        {
            if (!running)
            {
                bus.register(this);
                running = true;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void stop()
    {
        synchronized (lock)
        {
            bus.unregister(this);
            running = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
