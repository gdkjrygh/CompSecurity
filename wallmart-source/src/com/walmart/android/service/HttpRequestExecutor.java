// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.walmart.android.service:
//            CacheManager, ServiceData, MockComponentResolver, Utils

public class HttpRequestExecutor
{
    public static interface CacheFilePrefixGenerator
    {

        public abstract String getCacheFileNamePrefix(HttpUriRequest httpurirequest);
    }

    private class ServiceDataResponseHandler
        implements ResponseHandler
    {

        final HttpRequestExecutor this$0;

        public ServiceData handleResponse(HttpResponse httpresponse)
            throws IOException
        {
            Object obj;
            Object obj1;
            obj = null;
            obj1 = httpresponse.getFirstHeader("Content-Encoding");
            if (obj1 == null || !((Header) (obj1)).getValue().equalsIgnoreCase("gzip")) goto _L2; else goto _L1
_L1:
            obj = httpresponse.getEntity();
            GZIPInputStream gzipinputstream = new GZIPInputStream(((HttpEntity) (obj)).getContent());
            obj1 = EntityUtils.getContentCharSet(((HttpEntity) (obj)));
            obj = obj1;
            if (obj1 == null)
            {
                obj = "ISO-8859-1";
            }
            obj = Utils.inputStreamToString(gzipinputstream, ((String) (obj)));
            gzipinputstream.close();
_L4:
            httpresponse = new ServiceData(httpresponse, ((String) (obj)));
            mLastResponseDate = httpresponse.getResponseDate();
            return httpresponse;
_L2:
            obj1 = httpresponse.getEntity();
            if (obj1 == null)
            {
                obj = null;
                continue; /* Loop/switch isn't completed */
            }
            obj1 = EntityUtils.toString(((HttpEntity) (obj1)));
            obj = obj1;
            continue; /* Loop/switch isn't completed */
            Object obj2;
            obj2;
            Log.w(HttpRequestExecutor.TAG, "Found ParseException when handling the response", ((Throwable) (obj2)));
            continue; /* Loop/switch isn't completed */
            obj2;
            Log.w(HttpRequestExecutor.TAG, "Found IOException when handling the response", ((Throwable) (obj2)));
            if (true) goto _L4; else goto _L3
_L3:
        }

        public volatile Object handleResponse(HttpResponse httpresponse)
            throws ClientProtocolException, IOException
        {
            return handleResponse(httpresponse);
        }

        private ServiceDataResponseHandler()
        {
            this$0 = HttpRequestExecutor.this;
            super();
        }

    }


    private static final boolean PRINT_HEADERS = false;
    private static final String TAG = com/walmart/android/service/HttpRequestExecutor.getSimpleName();
    private CacheFilePrefixGenerator mCacheFilePrefixGenerator;
    private CacheManager mCacheManager;
    private final Context mContext;
    private final HttpClient mHttpClient;
    private Date mLastResponseDate;
    private int mMaxHttpRequestRetries;
    private final List mMockComponentResolvers = new CopyOnWriteArrayList();

    public HttpRequestExecutor(Context context, HttpClient httpclient)
    {
        mMaxHttpRequestRetries = 1;
        mContext = context;
        mHttpClient = httpclient;
    }

    private void printHeaders(HttpResponse httpresponse)
    {
        httpresponse = httpresponse.getAllHeaders();
        int j = httpresponse.length;
        for (int i = 0; i < j; i++)
        {
            Header header = httpresponse[i];
            Log.e(TAG, (new StringBuilder()).append("header: ").append(header.getName()).append(": ").append(header.getValue()).toString());
        }

    }

    public void addMockComponentResolver(MockComponentResolver mockcomponentresolver)
    {
        mMockComponentResolvers.add(mockcomponentresolver);
    }

    public void deleteCache(HttpUriRequest httpurirequest)
    {
        if (mCacheManager != null)
        {
            String s = mCacheFilePrefixGenerator.getCacheFileNamePrefix(httpurirequest);
            httpurirequest = (new StringBuilder()).append(s).append(".cached").toString();
            s = (new StringBuilder()).append(s).append(".expiry").toString();
            mCacheManager.deleteCachedFile(httpurirequest, s);
        }
    }

    public ServiceData execute(HttpUriRequest httpurirequest, boolean flag, long l)
    {
        return execute(httpurirequest, flag, false, l, false);
    }

    public ServiceData execute(HttpUriRequest httpurirequest, boolean flag, boolean flag1, long l, boolean flag2)
    {
        Object obj;
        Object obj2;
        Object obj3;
        obj = null;
        obj2 = null;
        obj3 = null;
        if (flag) goto _L2; else goto _L1
_L1:
        Object obj1;
        String s;
        String s1;
        s = ((String) (obj2));
        s1 = ((String) (obj3));
        obj1 = obj;
        if (!flag1) goto _L3; else goto _L2
_L2:
        if (mCacheManager == null) goto _L5; else goto _L4
_L4:
        obj1 = mCacheFilePrefixGenerator.getCacheFileNamePrefix(httpurirequest);
        obj2 = (new StringBuilder()).append(((String) (obj1))).append(".cached").toString();
        obj3 = (new StringBuilder()).append(((String) (obj1))).append(".expiry").toString();
        if (!flag1) goto _L7; else goto _L6
_L6:
        mCacheManager.deleteCachedFile(((String) (obj2)), ((String) (obj3)));
        obj1 = obj;
        s1 = ((String) (obj3));
        s = ((String) (obj2));
_L3:
        if (obj1 != null)
        {
            return ((ServiceData) (obj1));
        }
        break; /* Loop/switch isn't completed */
_L7:
        String s2 = mCacheManager.getCachedData(((String) (obj2)), ((String) (obj3)));
        s = ((String) (obj2));
        s1 = ((String) (obj3));
        obj1 = obj;
        if (s2 != null)
        {
            obj1 = new ServiceData("application/json", s2);
            s = ((String) (obj2));
            s1 = ((String) (obj3));
        }
        continue; /* Loop/switch isn't completed */
_L5:
        Log.e(TAG, "Couldn't read from cache. No CacheManager set!");
        s = ((String) (obj2));
        s1 = ((String) (obj3));
        obj1 = obj;
        if (true) goto _L3; else goto _L8
_L8:
        HttpClient httpclient;
        ServiceDataResponseHandler servicedataresponsehandler;
        int i;
        httpclient = mHttpClient;
        httpurirequest.addHeader("Accept-Encoding", "gzip");
        servicedataresponsehandler = new ServiceDataResponseHandler();
        i = 0;
_L23:
        if (obj1 != null || i >= mMaxHttpRequestRetries || httpurirequest.isAborted()) goto _L10; else goto _L9
_L9:
        int j = i + 1;
        obj2 = obj1;
        obj3 = obj1;
        Date date;
        long l1;
        try
        {
            System.currentTimeMillis();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w(TAG, (new StringBuilder()).append("Caught ClientProtocolException while executing:").append(httpurirequest.getURI()).toString());
            ((ClientProtocolException) (obj)).printStackTrace();
            obj = obj2;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.w(TAG, (new StringBuilder()).append("Caught IOException while executing:").append(httpurirequest.getURI()).toString());
            obj = obj3;
            if (!httpurirequest.isAborted())
            {
                ((IOException) (obj1)).printStackTrace();
                obj = obj3;
            }
            continue; /* Loop/switch isn't completed */
        }
        obj2 = obj1;
        obj3 = obj1;
        obj1 = (ServiceData)httpclient.execute(httpurirequest, servicedataresponsehandler);
        obj = obj1;
        if (!flag) goto _L12; else goto _L11
_L11:
        obj = obj1;
        if (obj1 == null) goto _L12; else goto _L13
_L13:
        obj = obj1;
        obj2 = obj1;
        obj3 = obj1;
        if (((ServiceData) (obj1)).hasHttpError()) goto _L12; else goto _L14
_L14:
        obj2 = obj1;
        obj3 = obj1;
        if (mCacheManager == null) goto _L16; else goto _L15
_L15:
        if (!flag2) goto _L18; else goto _L17
_L17:
        obj = obj1;
        obj2 = obj1;
        obj3 = obj1;
        if (!((ServiceData) (obj1)).isCacheHeaderEnabled()) goto _L12; else goto _L19
_L19:
        obj2 = obj1;
        obj3 = obj1;
        l1 = ((ServiceData) (obj1)).getCacheMaxAgeInSeconds();
        obj2 = obj1;
        obj3 = obj1;
        date = ((ServiceData) (obj1)).getExpirationDate();
        if (l1 <= 0L) goto _L21; else goto _L20
_L20:
        obj2 = obj1;
        obj3 = obj1;
        mCacheManager.cacheData(((ServiceData) (obj1)).getContent(), s, s1, l1 * 1000L);
        obj = obj1;
_L12:
        obj1 = obj;
        i = j;
        if (obj == null)
        {
            obj1 = obj;
            i = j;
            if (j < mMaxHttpRequestRetries)
            {
                obj1 = obj;
                i = j;
                if (!httpurirequest.isAborted())
                {
                    Log.w(TAG, (new StringBuilder()).append("Failed to get result. Retrying: ").append(j).toString());
                    obj1 = obj;
                    i = j;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L21:
        obj = obj1;
        if (date == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = obj1;
        obj3 = obj1;
        l1 = date.getTime();
        obj = obj1;
        obj2 = obj1;
        obj3 = obj1;
        if (l1 <= System.currentTimeMillis())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = obj1;
        obj3 = obj1;
        mCacheManager.cacheDataUntil(((ServiceData) (obj1)).getContent(), s, s1, l1);
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L18:
        obj2 = obj1;
        obj3 = obj1;
        mCacheManager.cacheData(((ServiceData) (obj1)).getContent(), s, s1, l);
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L16:
        obj2 = obj1;
        obj3 = obj1;
        Log.e(TAG, "Couldn't cache data. No CacheManager set!");
        obj = obj1;
        if (true) goto _L12; else goto _L10
_L10:
        return ((ServiceData) (obj1));
        if (true) goto _L23; else goto _L22
_L22:
    }

    public HttpClient getHttpClient()
    {
        return mHttpClient;
    }

    public Date getLastResponseDate()
    {
        return mLastResponseDate;
    }

    public void removeMockComponentResolver(MockComponentResolver mockcomponentresolver)
    {
        mMockComponentResolvers.remove(mockcomponentresolver);
    }

    public void setCacheManager(CacheManager cachemanager, CacheFilePrefixGenerator cachefileprefixgenerator)
    {
        mCacheManager = cachemanager;
        mCacheFilePrefixGenerator = cachefileprefixgenerator;
    }

    public void setMaxHttpRequestRetries(int i)
    {
        mMaxHttpRequestRetries = i;
    }

    public void setMockComponentResolver(MockComponentResolver mockcomponentresolver)
    {
        addMockComponentResolver(mockcomponentresolver);
    }




/*
    static Date access$202(HttpRequestExecutor httprequestexecutor, Date date)
    {
        httprequestexecutor.mLastResponseDate = date;
        return date;
    }

*/
}
