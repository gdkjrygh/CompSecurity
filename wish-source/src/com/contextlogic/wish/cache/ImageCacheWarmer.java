// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.cache;

import android.graphics.Bitmap;
import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.contextlogic.wish.cache:
//            CachedImageFetcherCallback, CachedImageFetcher

public class ImageCacheWarmer
    implements CachedImageFetcherCallback
{

    private HashMap pausedRequests;
    private ConcurrentHashMap requestTagUrlMap;
    private ConcurrentHashMap urlFetcherMap;
    private ConcurrentHashMap urlRequestTagMap;

    public ImageCacheWarmer()
    {
        urlRequestTagMap = new ConcurrentHashMap();
        requestTagUrlMap = new ConcurrentHashMap();
        urlFetcherMap = new ConcurrentHashMap();
        pausedRequests = new HashMap();
    }

    public void cancel(String s)
    {
        Object obj = urlRequestTagMap.get(s);
        if (obj != null)
        {
            requestTagUrlMap.remove(obj);
            urlRequestTagMap.remove(s);
        }
        obj = (CachedImageFetcher)urlFetcherMap.get(s);
        if (obj != null)
        {
            ((CachedImageFetcher) (obj)).cancel();
            urlFetcherMap.remove(s);
        }
    }

    public void cancelAll()
    {
        String s;
        for (Iterator iterator = urlFetcherMap.entrySet().iterator(); iterator.hasNext(); urlRequestTagMap.remove(s))
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            s = (String)entry.getKey();
            ((CachedImageFetcher)entry.getValue()).cancel();
        }

        urlFetcherMap.clear();
        requestTagUrlMap.clear();
    }

    public void onImageLoadFailed(Object obj)
    {
        String s = (String)requestTagUrlMap.get(obj);
        if (s != null)
        {
            requestTagUrlMap.remove(obj);
            urlRequestTagMap.remove(s);
            urlFetcherMap.remove(s);
        }
    }

    public void onImageLoaded(Object obj, Bitmap bitmap)
    {
        bitmap = (String)requestTagUrlMap.get(obj);
        if (bitmap != null)
        {
            requestTagUrlMap.remove(obj);
            urlFetcherMap.remove(bitmap);
        }
    }

    public void pause()
    {
        String s;
        for (Iterator iterator = urlFetcherMap.entrySet().iterator(); iterator.hasNext(); urlRequestTagMap.remove(s))
        {
            Object obj = (java.util.Map.Entry)iterator.next();
            s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (CachedImageFetcher)((java.util.Map.Entry) (obj)).getValue();
            ((CachedImageFetcher) (obj)).cancel();
            obj = new Pair(Integer.valueOf(((CachedImageFetcher) (obj)).getRequestedImageWidth()), Integer.valueOf(((CachedImageFetcher) (obj)).getRequestedImageHeight()));
            pausedRequests.put(s, obj);
        }

        urlFetcherMap.clear();
        requestTagUrlMap.clear();
    }

    public void resume()
    {
        java.util.Map.Entry entry;
        Pair pair;
        for (Iterator iterator = pausedRequests.entrySet().iterator(); iterator.hasNext(); warmCache((String)entry.getKey(), ((Integer)pair.first).intValue(), ((Integer)pair.second).intValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            pair = (Pair)entry.getValue();
        }

        pausedRequests.clear();
    }

    public void warmCache(String s, int i, int j)
    {
        warmCache(s, i, j, -1);
    }

    public void warmCache(String s, int i, int j, int k)
    {
        while (s == null || urlFetcherMap.size() > 30 || urlRequestTagMap.get(s) != null) 
        {
            return;
        }
        Object obj = new Object();
        urlRequestTagMap.put(s, obj);
        requestTagUrlMap.put(obj, s);
        CachedImageFetcher cachedimagefetcher = new CachedImageFetcher(this);
        cachedimagefetcher.setCacheOnly(true);
        cachedimagefetcher.setRequestedImageHeight(j);
        cachedimagefetcher.setRequestedImageWidth(i);
        if (k != -1)
        {
            cachedimagefetcher.setMode(k);
        }
        cachedimagefetcher.fetchImage(s, obj, com.contextlogic.wish.http.WishHttpClient.RequestPool.ImagePrefetch);
        urlFetcherMap.put(s, cachedimagefetcher);
    }
}
