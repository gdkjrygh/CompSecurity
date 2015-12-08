// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.cache;

import android.graphics.Bitmap;
import com.contextlogic.wish.http.ImageHttpResponseHandler;
import com.contextlogic.wish.http.WishHttpClient;
import com.contextlogic.wish.user.UserStatusManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.contextlogic.wish.cache:
//            CachedImageFetcherCallback

public class CachedImageFetcher
{
    class ImageResponseHandler extends ImageHttpResponseHandler
    {

        private boolean cancelled;
        final CachedImageFetcher this$0;

        public void markCancelled()
        {
            cancelled = true;
        }

        public void onFailure(Throwable throwable, Bitmap bitmap)
        {
            if (!cancelled)
            {
                failedLoadImage();
            }
        }

        public void onSuccess(Bitmap bitmap)
        {
            if (!cancelled)
            {
                loadedImage(bitmap);
            }
        }

        ImageResponseHandler()
        {
            this$0 = CachedImageFetcher.this;
            super();
            cancelled = false;
        }
    }


    private static final Pattern CONTEST_ID_REGEX = Pattern.compile("/[0-9,a-f]{24}(-[0-9]+)?");
    public static final long DEFAULT_CACHE_EXPIRY = 0x240c8400L;
    private static final long DEFAULT_FACEBOOK_CACHE_EXPIRY = 0x5265c00L;
    public static final int MODE_CENTER_CROP = 1;
    public static final int MODE_CENTER_FIT = 0;
    public static final int MODE_DEFAULT = -1;
    private boolean cacheOnly;
    private CachedImageFetcherCallback callback;
    private boolean cancelled;
    private boolean forceNoImageResize;
    private Object imageTag;
    private int mode;
    private Object requestTag;
    private int requestedImageHeight;
    private int requestedImageWidth;
    private ImageResponseHandler responseHandler;
    private boolean useDynamicScaling;

    public CachedImageFetcher(CachedImageFetcherCallback cachedimagefetchercallback)
    {
        callback = cachedimagefetchercallback;
        cacheOnly = false;
        requestedImageWidth = -1;
        requestedImageHeight = -1;
        cancelled = false;
        useDynamicScaling = false;
        mode = -1;
    }

    private void failedLoadImage()
    {
        requestTag = null;
        responseHandler = null;
        if (callback != null)
        {
            callback.onImageLoadFailed(imageTag);
        }
    }

    private void loadedImage(Bitmap bitmap)
    {
        requestTag = null;
        responseHandler = null;
        if (callback != null)
        {
            callback.onImageLoaded(imageTag, bitmap);
        }
    }

    public void cancel()
    {
        cancelled = true;
        if (requestTag != null)
        {
            WishHttpClient.getInstance().cancelRequests(requestTag);
            requestTag = null;
            if (responseHandler != null)
            {
                responseHandler.markCancelled();
            }
            responseHandler = null;
        }
    }

    public void fetchImage(String s, Object obj)
    {
        fetchImage(s, obj, com.contextlogic.wish.http.WishHttpClient.RequestPool.Image);
    }

    public void fetchImage(String s, Object obj, com.contextlogic.wish.http.WishHttpClient.RequestPool requestpool)
    {
        fetchImage(s, obj, requestpool, -1L);
    }

    public void fetchImage(String s, Object obj, com.contextlogic.wish.http.WishHttpClient.RequestPool requestpool, long l)
    {
        if (requestTag != null || cancelled)
        {
            return;
        }
        imageTag = obj;
        requestTag = new Object();
        responseHandler = new ImageResponseHandler();
        String s2;
        String s3;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (l > 0L)
        {
            responseHandler.setCacheExpiry(l);
        } else
        if (s.contains("graph.facebook.com"))
        {
            responseHandler.setCacheExpiry(0x5265c00L);
        } else
        {
            responseHandler.setCacheExpiry(0x240c8400L);
        }
        responseHandler.setCanUseCachedResponse(true);
        responseHandler.setShouldCacheResponse(true);
        responseHandler.setCacheOnly(cacheOnly);
        responseHandler.setRequestedWidth(requestedImageWidth);
        responseHandler.setRequestedHeight(requestedImageHeight);
        flag1 = useDynamicScaling;
        s3 = UserStatusManager.getInstance().getLemmingsUrl();
        flag2 = UserStatusManager.getInstance().inResizeUrls(s);
        flag = flag1;
        s2 = s;
        if (!useDynamicScaling)
        {
            flag = flag1;
            s2 = s;
            if (s3 != null)
            {
                flag = flag1;
                s2 = s;
                if (flag2)
                {
                    Object obj1 = CONTEST_ID_REGEX.matcher(s);
                    obj = null;
                    s2 = null;
                    String s1 = s2;
                    if (((Matcher) (obj1)).find())
                    {
                        obj1 = ((Matcher) (obj1)).group(0).substring(1);
                        int i = ((String) (obj1)).indexOf('-');
                        obj = obj1;
                        s1 = s2;
                        if (i != -1)
                        {
                            s1 = ((String) (obj1)).substring(i + 1);
                            obj = ((String) (obj1)).substring(0, i);
                        }
                    }
                    flag = flag1;
                    s2 = s;
                    if (obj != null)
                    {
                        s = new StringBuilder();
                        s.append(s3);
                        s.append("?contest_id=");
                        s.append(((String) (obj)));
                        s.append("&w=");
                        s.append(String.valueOf(requestedImageWidth));
                        s.append("&h=");
                        s.append(String.valueOf(requestedImageHeight));
                        s.append("&m=");
                        s.append(String.valueOf(mode));
                        if (s1 != null)
                        {
                            s.append("&s=");
                            s.append(s1);
                        }
                        s2 = s.toString();
                        flag = false;
                    }
                }
            }
        }
        responseHandler.setAllowDensityScaleUp(flag);
        WishHttpClient.getInstance().get(requestpool, requestTag, s2, null, responseHandler);
    }

    public int getRequestedImageHeight()
    {
        return requestedImageHeight;
    }

    public int getRequestedImageWidth()
    {
        return requestedImageWidth;
    }

    public boolean getUseDynamicScaling()
    {
        return useDynamicScaling;
    }

    public void setCacheOnly(boolean flag)
    {
        cacheOnly = flag;
    }

    public void setMode(int i)
    {
        mode = i;
    }

    public void setRequestedImageHeight(int i)
    {
        requestedImageHeight = i;
    }

    public void setRequestedImageWidth(int i)
    {
        requestedImageWidth = i;
    }

    public void setUseDynamicScaling(boolean flag)
    {
        useDynamicScaling = flag;
    }



}
