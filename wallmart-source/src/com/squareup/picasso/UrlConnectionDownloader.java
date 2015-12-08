// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.squareup.picasso:
//            Downloader, NetworkPolicy, Utils

public class UrlConnectionDownloader
    implements Downloader
{
    private static class ResponseCacheIcs
    {

        static void close(Object obj)
        {
            try
            {
                ((HttpResponseCache)obj).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
        }

        static Object install(Context context1)
            throws IOException
        {
            java.io.File file = Utils.createDefaultCacheDir(context1);
            HttpResponseCache httpresponsecache = HttpResponseCache.getInstalled();
            context1 = httpresponsecache;
            if (httpresponsecache == null)
            {
                context1 = HttpResponseCache.install(file, Utils.calculateDiskCacheSize(file));
            }
            return context1;
        }

        private ResponseCacheIcs()
        {
        }
    }


    private static final ThreadLocal CACHE_HEADER_BUILDER = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected StringBuilder initialValue()
        {
            return new StringBuilder();
        }

    };
    private static final String FORCE_CACHE = "only-if-cached,max-age=2147483647";
    static final String RESPONSE_SOURCE = "X-Android-Response-Source";
    static volatile Object cache;
    private static final Object lock = new Object();
    private final Context context;

    public UrlConnectionDownloader(Context context1)
    {
        context = context1.getApplicationContext();
    }

    private static void installCacheIfNeeded(Context context1)
    {
        if (cache != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        synchronized (lock)
        {
            if (cache == null)
            {
                cache = ResponseCacheIcs.install(context1);
            }
        }
        return;
        context1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw context1;
        }
        // Misplaced declaration of an exception variable
        catch (Context context1) { }
    }

    public Downloader.Response load(Uri uri, int i)
        throws IOException
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            installCacheIfNeeded(context);
        }
        HttpURLConnection httpurlconnection = openConnection(uri);
        httpurlconnection.setUseCaches(true);
        if (i != 0)
        {
            int j;
            if (NetworkPolicy.isOfflineOnly(i))
            {
                uri = "only-if-cached,max-age=2147483647";
            } else
            {
                uri = (StringBuilder)CACHE_HEADER_BUILDER.get();
                uri.setLength(0);
                if (!NetworkPolicy.shouldReadFromDiskCache(i))
                {
                    uri.append("no-cache");
                }
                if (!NetworkPolicy.shouldWriteToDiskCache(i))
                {
                    if (uri.length() > 0)
                    {
                        uri.append(',');
                    }
                    uri.append("no-store");
                }
                uri = uri.toString();
            }
            httpurlconnection.setRequestProperty("Cache-Control", uri);
        }
        j = httpurlconnection.getResponseCode();
        if (j >= 300)
        {
            httpurlconnection.disconnect();
            throw new Downloader.ResponseException((new StringBuilder()).append(j).append(" ").append(httpurlconnection.getResponseMessage()).toString(), i, j);
        } else
        {
            long l = httpurlconnection.getHeaderFieldInt("Content-Length", -1);
            boolean flag = Utils.parseResponseSourceHeader(httpurlconnection.getHeaderField("X-Android-Response-Source"));
            return new Downloader.Response(httpurlconnection.getInputStream(), flag, l);
        }
    }

    protected HttpURLConnection openConnection(Uri uri)
        throws IOException
    {
        uri = (HttpURLConnection)(new URL(uri.toString())).openConnection();
        uri.setConnectTimeout(15000);
        uri.setReadTimeout(20000);
        return uri;
    }

    public void shutdown()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && cache != null)
        {
            ResponseCacheIcs.close(cache);
        }
    }

}
