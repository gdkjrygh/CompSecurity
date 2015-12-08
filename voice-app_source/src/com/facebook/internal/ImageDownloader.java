// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.internal:
//            WorkQueue, ImageRequest, ImageResponseCache, UrlRedirectCache, 
//            Utility, ImageResponse

public class ImageDownloader
{
    private static class CacheReadWorkItem
        implements Runnable
    {

        private boolean allowCachedRedirects;
        private Context context;
        private RequestKey key;

        public void run()
        {
            ImageDownloader.readFromCache(key, context, allowCachedRedirects);
        }

        CacheReadWorkItem(Context context1, RequestKey requestkey, boolean flag)
        {
            context = context1;
            key = requestkey;
            allowCachedRedirects = flag;
        }
    }

    private static class DownloadImageWorkItem
        implements Runnable
    {

        private Context context;
        private RequestKey key;

        public void run()
        {
            ImageDownloader.download(key, context);
        }

        DownloadImageWorkItem(Context context1, RequestKey requestkey)
        {
            context = context1;
            key = requestkey;
        }
    }

    private static class DownloaderContext
    {

        boolean isCancelled;
        ImageRequest request;
        WorkQueue.WorkItem workItem;

        private DownloaderContext()
        {
        }

        DownloaderContext(DownloaderContext downloadercontext)
        {
            this();
        }
    }

    private static class RequestKey
    {

        private static final int HASH_MULTIPLIER = 37;
        private static final int HASH_SEED = 29;
        Object tag;
        Uri uri;

        public boolean equals(Object obj)
        {
label0:
            {
                boolean flag1 = false;
                boolean flag = flag1;
                if (obj != null)
                {
                    flag = flag1;
                    if (obj instanceof RequestKey)
                    {
                        obj = (RequestKey)obj;
                        if (((RequestKey) (obj)).uri != uri || ((RequestKey) (obj)).tag != tag)
                        {
                            break label0;
                        }
                        flag = true;
                    }
                }
                return flag;
            }
            return false;
        }

        public int hashCode()
        {
            return (uri.hashCode() + 1073) * 37 + tag.hashCode();
        }

        RequestKey(Uri uri1, Object obj)
        {
            uri = uri1;
            tag = obj;
        }
    }


    private static final int CACHE_READ_QUEUE_MAX_CONCURRENT = 2;
    private static final int DOWNLOAD_QUEUE_MAX_CONCURRENT = 8;
    private static WorkQueue cacheReadQueue = new WorkQueue(2);
    private static WorkQueue downloadQueue = new WorkQueue(8);
    private static Handler handler;
    private static final Map pendingRequests = new HashMap();

    public ImageDownloader()
    {
    }

    public static boolean cancelRequest(ImageRequest imagerequest)
    {
        RequestKey requestkey;
        boolean flag;
        flag = false;
        requestkey = new RequestKey(imagerequest.getImageUri(), imagerequest.getCallerTag());
        imagerequest = pendingRequests;
        imagerequest;
        JVM INSTR monitorenter ;
        DownloaderContext downloadercontext = (DownloaderContext)pendingRequests.get(requestkey);
        if (downloadercontext == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        flag = true;
        if (!downloadercontext.workItem.cancel())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        pendingRequests.remove(requestkey);
_L1:
        imagerequest;
        JVM INSTR monitorexit ;
        return flag;
        downloadercontext.isCancelled = true;
          goto _L1
        Exception exception;
        exception;
        imagerequest;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void clearCache(Context context)
    {
        ImageResponseCache.clearCache(context);
        UrlRedirectCache.clearCache();
    }

    private static void download(RequestKey requestkey, Context context)
    {
        Object obj;
        java.io.InputStream inputstream;
        HttpURLConnection httpurlconnection;
        HttpURLConnection httpurlconnection1;
        Object obj2;
        Object obj3;
        char ac[];
        Object obj4;
        Object obj5;
        Object obj6;
        boolean flag;
        boolean flag1;
        boolean flag2;
        httpurlconnection1 = null;
        httpurlconnection = null;
        obj5 = null;
        obj6 = null;
        obj4 = null;
        ac = null;
        obj2 = null;
        obj3 = null;
        flag2 = true;
        flag1 = true;
        flag = flag2;
        obj = obj5;
        inputstream = obj6;
        HttpURLConnection httpurlconnection2 = (HttpURLConnection)(new URL(requestkey.uri.toString())).openConnection();
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = obj5;
        httpurlconnection1 = httpurlconnection2;
        inputstream = obj6;
        httpurlconnection2.setInstanceFollowRedirects(false);
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = obj5;
        httpurlconnection1 = httpurlconnection2;
        inputstream = obj6;
        httpurlconnection2.getResponseCode();
        JVM INSTR lookupswitch 3: default 799
    //                   200: 664
    //                   301: 376
    //                   302: 376;
           goto _L1 _L2 _L3 _L3
_L1:
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = obj5;
        httpurlconnection1 = httpurlconnection2;
        inputstream = obj6;
        java.io.InputStream inputstream1 = httpurlconnection2.getErrorStream();
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = inputstream1;
        httpurlconnection1 = httpurlconnection2;
        inputstream = inputstream1;
        Object obj1 = new StringBuilder();
        if (inputstream1 == null) goto _L5; else goto _L4
_L4:
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = inputstream1;
        httpurlconnection1 = httpurlconnection2;
        inputstream = inputstream1;
        context = new InputStreamReader(inputstream1);
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = inputstream1;
        httpurlconnection1 = httpurlconnection2;
        inputstream = inputstream1;
        ac = new char[128];
_L10:
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = inputstream1;
        httpurlconnection1 = httpurlconnection2;
        inputstream = inputstream1;
        int i = context.read(ac, 0, ac.length);
        if (i > 0) goto _L7; else goto _L6
_L6:
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = inputstream1;
        httpurlconnection1 = httpurlconnection2;
        inputstream = inputstream1;
        Utility.closeQuietly(context);
_L11:
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = inputstream1;
        httpurlconnection1 = httpurlconnection2;
        inputstream = inputstream1;
        obj1 = new FacebookException(((StringBuilder) (obj1)).toString());
        context = obj3;
_L9:
        Utility.closeQuietly(inputstream1);
        Utility.disconnectQuietly(httpurlconnection2);
        flag = flag1;
        obj = context;
_L8:
        if (flag)
        {
            issueResponse(requestkey, ((Exception) (obj1)), ((Bitmap) (obj)), false);
        }
        return;
_L3:
        i = 0;
        flag2 = false;
        httpurlconnection = httpurlconnection2;
        flag = i;
        obj = obj5;
        httpurlconnection1 = httpurlconnection2;
        inputstream = obj6;
        Object obj7 = httpurlconnection2.getHeaderField("location");
        context = obj3;
        obj1 = ac;
        flag1 = flag2;
        inputstream1 = obj4;
        httpurlconnection = httpurlconnection2;
        flag = i;
        obj = obj5;
        httpurlconnection1 = httpurlconnection2;
        inputstream = obj6;
        if (Utility.isNullOrEmpty(((String) (obj7))))
        {
            continue; /* Loop/switch isn't completed */
        }
        httpurlconnection = httpurlconnection2;
        flag = i;
        obj = obj5;
        httpurlconnection1 = httpurlconnection2;
        inputstream = obj6;
        obj7 = Uri.parse(((String) (obj7)));
        httpurlconnection = httpurlconnection2;
        flag = i;
        obj = obj5;
        httpurlconnection1 = httpurlconnection2;
        inputstream = obj6;
        UrlRedirectCache.cacheUriRedirect(requestkey.uri, ((Uri) (obj7)));
        httpurlconnection = httpurlconnection2;
        flag = i;
        obj = obj5;
        httpurlconnection1 = httpurlconnection2;
        inputstream = obj6;
        DownloaderContext downloadercontext = removePendingRequest(requestkey);
        context = obj3;
        obj1 = ac;
        flag1 = flag2;
        inputstream1 = obj4;
        if (downloadercontext == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        context = obj3;
        obj1 = ac;
        flag1 = flag2;
        inputstream1 = obj4;
        httpurlconnection = httpurlconnection2;
        flag = i;
        obj = obj5;
        httpurlconnection1 = httpurlconnection2;
        inputstream = obj6;
        if (downloadercontext.isCancelled)
        {
            continue; /* Loop/switch isn't completed */
        }
        httpurlconnection = httpurlconnection2;
        flag = i;
        obj = obj5;
        httpurlconnection1 = httpurlconnection2;
        inputstream = obj6;
        enqueueCacheRead(downloadercontext.request, new RequestKey(((Uri) (obj7)), requestkey.tag), false);
        context = obj3;
        obj1 = ac;
        flag1 = flag2;
        inputstream1 = obj4;
        continue; /* Loop/switch isn't completed */
        context;
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        Utility.disconnectQuietly(httpurlconnection);
        obj = obj2;
        obj1 = context;
          goto _L8
_L2:
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = obj5;
        httpurlconnection1 = httpurlconnection2;
        inputstream = obj6;
        inputstream1 = ImageResponseCache.interceptAndCacheImageStream(context, httpurlconnection2);
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = inputstream1;
        httpurlconnection1 = httpurlconnection2;
        inputstream = inputstream1;
        context = BitmapFactory.decodeStream(inputstream1);
        obj1 = ac;
        if (true) goto _L9; else goto _L7
_L7:
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = inputstream1;
        httpurlconnection1 = httpurlconnection2;
        inputstream = inputstream1;
        ((StringBuilder) (obj1)).append(ac, 0, i);
          goto _L10
        requestkey;
        Utility.closeQuietly(inputstream);
        Utility.disconnectQuietly(httpurlconnection1);
        throw requestkey;
_L5:
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = inputstream1;
        httpurlconnection1 = httpurlconnection2;
        inputstream = inputstream1;
        ((StringBuilder) (obj1)).append(context.getString(com.facebook.R.string.com_facebook_image_download_unknown_error));
          goto _L11
    }

    public static void downloadAsync(ImageRequest imagerequest)
    {
        RequestKey requestkey;
        if (imagerequest == null)
        {
            return;
        }
        requestkey = new RequestKey(imagerequest.getImageUri(), imagerequest.getCallerTag());
        Map map = pendingRequests;
        map;
        JVM INSTR monitorenter ;
        DownloaderContext downloadercontext = (DownloaderContext)pendingRequests.get(requestkey);
        if (downloadercontext == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        downloadercontext.request = imagerequest;
        downloadercontext.isCancelled = false;
        downloadercontext.workItem.moveToFront();
_L1:
        map;
        JVM INSTR monitorexit ;
        return;
        imagerequest;
        map;
        JVM INSTR monitorexit ;
        throw imagerequest;
        enqueueCacheRead(imagerequest, requestkey, imagerequest.isCachedRedirectAllowed());
          goto _L1
    }

    private static void enqueueCacheRead(ImageRequest imagerequest, RequestKey requestkey, boolean flag)
    {
        enqueueRequest(imagerequest, requestkey, cacheReadQueue, new CacheReadWorkItem(imagerequest.getContext(), requestkey, flag));
    }

    private static void enqueueDownload(ImageRequest imagerequest, RequestKey requestkey)
    {
        enqueueRequest(imagerequest, requestkey, downloadQueue, new DownloadImageWorkItem(imagerequest.getContext(), requestkey));
    }

    private static void enqueueRequest(ImageRequest imagerequest, RequestKey requestkey, WorkQueue workqueue, Runnable runnable)
    {
        synchronized (pendingRequests)
        {
            DownloaderContext downloadercontext = new DownloaderContext(null);
            downloadercontext.request = imagerequest;
            pendingRequests.put(requestkey, downloadercontext);
            downloadercontext.workItem = workqueue.addActiveWorkItem(runnable);
        }
        return;
        imagerequest;
        map;
        JVM INSTR monitorexit ;
        throw imagerequest;
    }

    private static Handler getHandler()
    {
        com/facebook/internal/ImageDownloader;
        JVM INSTR monitorenter ;
        Handler handler1;
        if (handler == null)
        {
            handler = new Handler(Looper.getMainLooper());
        }
        handler1 = handler;
        com/facebook/internal/ImageDownloader;
        JVM INSTR monitorexit ;
        return handler1;
        Exception exception;
        exception;
        throw exception;
    }

    private static void issueResponse(final RequestKey request, final Exception error, final Bitmap bitmap, final boolean isCachedRedirect)
    {
        request = removePendingRequest(request);
        if (request != null && !((DownloaderContext) (request)).isCancelled)
        {
            request = ((DownloaderContext) (request)).request;
            final ImageRequest.Callback callback = request.getCallback();
            if (callback != null)
            {
                getHandler().post(new Runnable() {

                    private final Bitmap val$bitmap;
                    private final ImageRequest.Callback val$callback;
                    private final Exception val$error;
                    private final boolean val$isCachedRedirect;
                    private final ImageRequest val$request;

                    public void run()
                    {
                        ImageResponse imageresponse = new ImageResponse(request, error, isCachedRedirect, bitmap);
                        callback.onCompleted(imageresponse);
                    }

            
            {
                request = imagerequest;
                error = exception;
                isCachedRedirect = flag;
                bitmap = bitmap1;
                callback = callback1;
                super();
            }
                });
            }
        }
    }

    public static void prioritizeRequest(ImageRequest imagerequest)
    {
        Object obj = new RequestKey(imagerequest.getImageUri(), imagerequest.getCallerTag());
        imagerequest = pendingRequests;
        imagerequest;
        JVM INSTR monitorenter ;
        obj = (DownloaderContext)pendingRequests.get(obj);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        ((DownloaderContext) (obj)).workItem.moveToFront();
        imagerequest;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        imagerequest;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static void readFromCache(RequestKey requestkey, Context context, boolean flag)
    {
        Object obj = null;
        boolean flag2 = false;
        java.io.InputStream inputstream = obj;
        boolean flag1 = flag2;
        if (flag)
        {
            Uri uri = UrlRedirectCache.getRedirectedUri(requestkey.uri);
            inputstream = obj;
            flag1 = flag2;
            if (uri != null)
            {
                inputstream = ImageResponseCache.getCachedImageStream(uri, context);
                if (inputstream != null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            }
        }
        if (!flag1)
        {
            inputstream = ImageResponseCache.getCachedImageStream(requestkey.uri, context);
        }
        if (inputstream != null)
        {
            context = BitmapFactory.decodeStream(inputstream);
            Utility.closeQuietly(inputstream);
            issueResponse(requestkey, null, context, flag1);
        } else
        {
            context = removePendingRequest(requestkey);
            if (context != null && !((DownloaderContext) (context)).isCancelled)
            {
                enqueueDownload(((DownloaderContext) (context)).request, requestkey);
                return;
            }
        }
    }

    private static DownloaderContext removePendingRequest(RequestKey requestkey)
    {
        synchronized (pendingRequests)
        {
            requestkey = (DownloaderContext)pendingRequests.remove(requestkey);
        }
        return requestkey;
        requestkey;
        map;
        JVM INSTR monitorexit ;
        throw requestkey;
    }



}
