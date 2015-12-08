// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//            Request, ResponseDelivery, VolleyError, Network, 
//            NetworkResponse, VolleyLog, Response, Cache

public class NetworkDispatcher extends Thread
{

    private final Cache mCache;
    private final ResponseDelivery mDelivery;
    private final Network mNetwork;
    private final BlockingQueue mQueue;
    private volatile boolean mQuit;

    public NetworkDispatcher(BlockingQueue blockingqueue, Network network, Cache cache, ResponseDelivery responsedelivery)
    {
        mQuit = false;
        mQueue = blockingqueue;
        mNetwork = network;
        mCache = cache;
        mDelivery = responsedelivery;
    }

    private void addTrafficStatsTag(Request request)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(request.getTrafficStatsTag());
        }
    }

    private void parseAndDeliverNetworkError(Request request, VolleyError volleyerror)
    {
        volleyerror = request.parseNetworkError(volleyerror);
        mDelivery.postError(request, volleyerror);
    }

    public void quit()
    {
        mQuit = true;
        interrupt();
    }

    public void run()
    {
        Process.setThreadPriority(10);
_L2:
        Object obj;
        long l;
        l = SystemClock.elapsedRealtime();
        VolleyError volleyerror;
        try
        {
            obj = (Request)mQueue.take();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (mQuit)
            {
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        ((Request) (obj)).addMarker("network-queue-take");
        if (((Request) (obj)).isCanceled())
        {
            ((Request) (obj)).finish("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        addTrafficStatsTag(((Request) (obj)));
        Object obj1 = mNetwork.performRequest(((Request) (obj)));
        ((Request) (obj)).addMarker("network-http-complete");
        if (((NetworkResponse) (obj1)).notModified && ((Request) (obj)).hasHadResponseDelivered())
        {
            ((Request) (obj)).finish("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((Request) (obj)).parseNetworkResponse(((NetworkResponse) (obj1)));
            ((Request) (obj)).addMarker("network-parse-complete");
            if (((Request) (obj)).shouldCache() && ((Response) (obj1)).cacheEntry != null)
            {
                mCache.put(((Request) (obj)).getCacheKey(), ((Response) (obj1)).cacheEntry);
                ((Request) (obj)).addMarker("network-cache-written");
            }
            ((Request) (obj)).markDelivered();
            mDelivery.postResponse(((Request) (obj)), ((Response) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (VolleyError volleyerror)
        {
            volleyerror.setNetworkTimeMs(SystemClock.elapsedRealtime() - l);
            parseAndDeliverNetworkError(((Request) (obj)), volleyerror);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            VolleyLog.e(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            obj1 = new VolleyError(((Throwable) (obj1)));
            ((VolleyError) (obj1)).setNetworkTimeMs(SystemClock.elapsedRealtime() - l);
            mDelivery.postError(((Request) (obj)), ((VolleyError) (obj1)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
