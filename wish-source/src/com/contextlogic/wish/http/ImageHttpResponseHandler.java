// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;

import android.graphics.Bitmap;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.client.HttpResponseException;
import ch.boye.httpclientandroidlib.client.methods.HttpUriRequest;
import ch.boye.httpclientandroidlib.util.EntityUtils;
import com.contextlogic.wish.cache.PersistedCache;
import com.contextlogic.wish.util.BitmapUtil;
import java.io.IOException;
import java.net.URI;

// Referenced classes of package com.contextlogic.wish.http:
//            HttpResponseHandler

public class ImageHttpResponseHandler extends HttpResponseHandler
{

    private boolean allowDensityScaleUp;
    private long cacheExpiry;
    private boolean cacheOnly;
    private boolean canUseCachedResponse;
    private int requestedHeight;
    private int requestedWidth;
    private boolean shouldCacheResponse;

    public ImageHttpResponseHandler()
    {
        canUseCachedResponse = false;
        shouldCacheResponse = false;
        cacheExpiry = -1L;
        requestedWidth = -1;
        requestedHeight = -1;
        cacheOnly = false;
    }

    private Bitmap preprocessResponse(byte abyte0[])
    {
        if (abyte0 != null && !cacheOnly)
        {
            return BitmapUtil.decodeBitmap(abyte0, requestedWidth, requestedHeight, allowDensityScaleUp);
        } else
        {
            return null;
        }
    }

    public void handleCachedResponse(Object obj)
    {
        onSuccess((Bitmap)obj);
    }

    public void handleFailure(HttpUriRequest httpurirequest, Throwable throwable, Object obj)
    {
        onFailure(throwable, (Bitmap)obj);
    }

    public void handleStart(HttpUriRequest httpurirequest)
    {
        onStart();
    }

    public void handleSuccess(HttpUriRequest httpurirequest, Object obj)
    {
        if (cacheOnly)
        {
            onSuccess(null);
            return;
        }
        if (obj == null)
        {
            onFailure(null, (Bitmap)obj);
            return;
        } else
        {
            onSuccess((Bitmap)obj);
            return;
        }
    }

    public boolean hasCachedResponse(String s)
    {
        boolean flag = false;
        if (canUseCachedResponse)
        {
            flag = PersistedCache.getInstance().hasCachedBitmap(s, cacheExpiry, false);
        }
        return flag;
    }

    public boolean loadResponseFromCache(String s)
    {
        if (cacheOnly)
        {
            if (cacheExpiry == -1L)
            {
                return PersistedCache.getInstance().getCachedBitmap(s, false, false, requestedWidth, requestedHeight, allowDensityScaleUp) != null;
            }
            return PersistedCache.getInstance().getCachedBitmap(s, cacheExpiry, false, false, requestedWidth, requestedHeight, allowDensityScaleUp) != null;
        }
        if (canUseCachedResponse)
        {
            if (cacheExpiry == -1L)
            {
                s = PersistedCache.getInstance().getCachedBitmap(s, false, true, requestedWidth, requestedHeight, allowDensityScaleUp);
            } else
            {
                s = PersistedCache.getInstance().getCachedBitmap(s, cacheExpiry, false, true, requestedWidth, requestedHeight, allowDensityScaleUp);
            }
            if (s != null)
            {
                responseLoadedFromCache(s);
                return true;
            } else
            {
                return false;
            }
        } else
        {
            return false;
        }
    }

    public void onFailure(Throwable throwable, Bitmap bitmap)
    {
    }

    public void onStart()
    {
    }

    public void onSuccess(Bitmap bitmap)
    {
    }

    public Object preprocessFailure(Throwable throwable, Object obj)
    {
        return preprocessResponse((byte[])(byte[])obj);
    }

    public Object preprocessSuccess(Object obj)
    {
        return preprocessResponse((byte[])(byte[])obj);
    }

    public void receiveResponse(HttpUriRequest httpurirequest, HttpResponse httpresponse)
    {
        StatusLine statusline = httpresponse.getStatusLine();
        Object obj = null;
        ch.boye.httpclientandroidlib.HttpEntity httpentity;
        try
        {
            httpentity = httpresponse.getEntity();
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            requestFailed(httpurirequest, httpresponse, null);
            return;
        }
        httpresponse = obj;
        if (httpentity == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        httpresponse = EntityUtils.toByteArray(httpentity);
        if (httpresponse == null || statusline.getStatusCode() != 200)
        {
            requestFailed(httpurirequest, new HttpResponseException(statusline.getStatusCode(), statusline.getReasonPhrase()), httpresponse);
            return;
        }
        if (shouldCacheResponse)
        {
            PersistedCache.getInstance().cacheBitmap(httpurirequest.getURI().toString(), httpresponse, false);
        }
        requestSucceeded(httpurirequest, httpresponse);
        return;
    }

    public void setAllowDensityScaleUp(boolean flag)
    {
        allowDensityScaleUp = flag;
    }

    public void setCacheExpiry(long l)
    {
        cacheExpiry = l;
    }

    public void setCacheOnly(boolean flag)
    {
        cacheOnly = flag;
    }

    public void setCanUseCachedResponse(boolean flag)
    {
        canUseCachedResponse = flag;
    }

    public void setRequestedHeight(int i)
    {
        requestedHeight = i;
    }

    public void setRequestedWidth(int i)
    {
        requestedWidth = i;
    }

    public void setShouldCacheResponse(boolean flag)
    {
        shouldCacheResponse = flag;
    }
}
