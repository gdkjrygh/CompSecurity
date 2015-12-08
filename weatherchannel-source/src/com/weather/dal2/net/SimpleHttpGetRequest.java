// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.net;

import android.net.TrafficStats;
import com.google.common.io.ByteStreams;
import com.weather.dal2.exceptions.DalException;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.device.DeviceUtils;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.net.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.weather.dal2.net:
//            HttpGetRequest, Receiver

public class SimpleHttpGetRequest
    implements HttpGetRequest
{

    private static final int CONNECT_TIMEOUT = 15000;
    private static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() + 1);
    private static final int READ_TIMEOUT = 15000;
    private int contentLength;
    private volatile boolean ran;
    private final String tag;

    public SimpleHttpGetRequest()
    {
        contentLength = -1;
        tag = "SimpleHttpGetRequest";
    }

    public SimpleHttpGetRequest(String s)
    {
        contentLength = -1;
        tag = (new StringBuilder()).append("SimpleHttpGetRequest:").append(s).toString();
    }

    private HttpRequest doGetRequestForGoogleTWCUserAgent(String s)
        throws DalException, com.weather.util.net.HttpRequest.HttpRequestException
    {
        ranCheck();
        LogUtil.method(tag, LoggingMetaTags.TWC_DAL_NET, "doGetRequestForGoogleTWCUserAgent", new Object[] {
            s
        });
        if (!DeviceUtils.isNetworkAvailable(AbstractTwcApplication.getRootContext()))
        {
            throw new DalException("Network not available");
        }
        s = HttpRequest.get(s).readTimeout(15000).connectTimeout(15000).userAgent("Google/TWC").followRedirects(true).acceptGzipEncoding().uncompress(true);
        int i = s.code();
        if (i >= 400)
        {
            throw new DalException((new StringBuilder()).append(tag).append(" Failure Code:").append(i).toString());
        } else
        {
            contentLength = s.contentLength();
            LogUtil.d(tag, LoggingMetaTags.TWC_DAL_NET, "Response Source: %s", new Object[] {
                s.header("OkHttp-Response-Source")
            });
            return s;
        }
    }

    private void ranCheck()
    {
        if (ran)
        {
            throw new IllegalStateException("fetch method can only run once!");
        } else
        {
            ran = true;
            return;
        }
    }

    public void asyncFetch(String s, boolean flag, Object obj, Receiver receiver)
    {
        EXECUTOR_SERVICE.execute(new _cls1(s, flag, receiver, obj));
    }

    public String fetch(String s, boolean flag)
        throws DalException
    {
        Object obj;
        Object obj1;
        HttpRequest httprequest;
        Object obj2;
        boolean flag1;
        flag1 = true;
        ranCheck();
        LogUtil.method(tag, LoggingMetaTags.TWC_DAL_NET, "fetch", new Object[] {
            s
        });
        if (flag && !DeviceUtils.isNetworkAvailable(AbstractTwcApplication.getRootContext()))
        {
            throw new DalException("Network not available");
        }
        TrafficStats.setThreadStatsTag(53248);
        obj2 = null;
        httprequest = null;
        obj1 = httprequest;
        obj = obj2;
        s = HttpRequest.get(s);
        int i;
        if (flag)
        {
            flag1 = false;
        }
        obj1 = httprequest;
        obj = obj2;
        httprequest = s.useCaches(flag1);
        s = httprequest;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        obj1 = httprequest;
        obj = httprequest;
        s = httprequest.header("Cache-Control", "no-cache");
        obj1 = s;
        obj = s;
        s = s.acceptJson().acceptGzipEncoding().readTimeout(15000).connectTimeout(15000).uncompress(true);
        obj1 = s;
        obj = s;
        i = s.code();
        if (i < 400)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        obj1 = s;
        obj = s;
        try
        {
            throw new DalException((new StringBuilder()).append(tag).append(" Failure Code:").append(i).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            obj = obj1;
        }
        finally
        {
            if (obj == null) goto _L0; else goto _L0
        }
        throw new DalException((new StringBuilder()).append(tag).append(": ").append(s).toString());
        String s1;
        try
        {
            ((HttpRequest) (obj)).disconnect();
        }
        catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception) { }
        TrafficStats.clearThreadStatsTag();
        throw s;
        if (i != 204) goto _L2; else goto _L1
_L1:
        s1 = "";
_L3:
        obj1 = s;
        obj = s;
        LogUtil.d(tag, LoggingMetaTags.TWC_DAL_NET, "Response Source: %s", new Object[] {
            s.header("OkHttp-Response-Source")
        });
        if (s != null)
        {
            try
            {
                s.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        TrafficStats.clearThreadStatsTag();
        return s1;
_L2:
        obj1 = s;
        obj = s;
        s1 = s.body();
        obj1 = s;
        obj = s;
        contentLength = s.contentLength();
          goto _L3
    }

    public String fetchGoogleTWCUserAgentRequest(String s)
        throws DalException
    {
        String s1;
        String s2;
        s2 = null;
        s1 = null;
        s = doGetRequestForGoogleTWCUserAgent(s);
        s1 = s;
        s2 = s;
        String s3 = s.body();
        if (s != null)
        {
            try
            {
                s.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        TrafficStats.clearThreadStatsTag();
        return s3;
        s;
        s2 = s1;
        throw new DalException((new StringBuilder()).append(tag).append(": ").append(s).toString());
        s;
        if (s2 != null)
        {
            try
            {
                s2.disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception) { }
        }
        TrafficStats.clearThreadStatsTag();
        throw s;
    }

    public byte[] fetchGoogleTWCUserAgentRequestBytes(String s)
        throws DalException
    {
        InputStream inputstream;
        InputStream inputstream1;
        String s1;
        String s2;
        InputStream inputstream2;
        byte abyte0[];
        s1 = null;
        s2 = null;
        abyte0 = null;
        inputstream2 = null;
        inputstream = inputstream2;
        inputstream1 = abyte0;
        s = doGetRequestForGoogleTWCUserAgent(s);
        inputstream = inputstream2;
        s2 = s;
        inputstream1 = abyte0;
        s1 = s;
        inputstream2 = s.stream();
        inputstream = inputstream2;
        s2 = s;
        inputstream1 = inputstream2;
        s1 = s;
        abyte0 = ByteStreams.toByteArray(inputstream2);
        if (inputstream2 != null)
        {
            try
            {
                inputstream2.close();
            }
            catch (IOException ioexception) { }
        }
        if (s != null)
        {
            try
            {
                s.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        TrafficStats.clearThreadStatsTag();
        return abyte0;
        s;
        inputstream1 = inputstream;
        s1 = s2;
        throw new DalException((new StringBuilder()).append(tag).append(": ").append(s).toString());
        s;
        if (inputstream1 != null)
        {
            try
            {
                inputstream1.close();
            }
            catch (IOException ioexception1) { }
        }
        if (s1 != null)
        {
            try
            {
                s1.disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception) { }
        }
        TrafficStats.clearThreadStatsTag();
        throw s;
    }

    public int getContentLength()
    {
        return contentLength;
    }


    /* member class not found */
    class _cls1 {}

}
