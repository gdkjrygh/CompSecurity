// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.client.HttpResponseException;
import ch.boye.httpclientandroidlib.client.methods.HttpUriRequest;
import com.contextlogic.wish.cache.PersistedCache;
import java.net.URI;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;

// Referenced classes of package com.contextlogic.wish.http:
//            HttpResponseHandler

public class StringHttpResponseHandler extends HttpResponseHandler
{

    private long cacheExpiry;
    private boolean canUseCachedResponse;
    private boolean shouldCacheResponse;

    public StringHttpResponseHandler()
    {
        canUseCachedResponse = false;
        shouldCacheResponse = false;
        cacheExpiry = -1L;
    }

    public void handleCachedResponse(Object obj)
    {
        onSuccess((String)obj);
    }

    public void handleFailure(HttpUriRequest httpurirequest, Throwable throwable, Object obj)
    {
        onFailure(throwable, (String)obj);
    }

    public void handleStart(HttpUriRequest httpurirequest)
    {
        onStart();
    }

    public void handleSuccess(HttpUriRequest httpurirequest, Object obj)
    {
        obj = (String)obj;
        if (shouldCacheResponse)
        {
            PersistedCache.getInstance().cacheString(httpurirequest.getURI().toString(), ((String) (obj)), false);
        }
        onSuccess(((String) (obj)));
    }

    public boolean loadResponseFromCache(String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (canUseCachedResponse)
        {
            if (cacheExpiry == -1L)
            {
                s = PersistedCache.getInstance().getCachedString(s, false);
            } else
            {
                s = PersistedCache.getInstance().getCachedString(s, cacheExpiry, false);
            }
            flag = flag1;
            if (s != null)
            {
                responseLoadedFromCache(s);
                flag = true;
            }
        }
        return flag;
    }

    public void onFailure(Throwable throwable, String s)
    {
    }

    public void onStart()
    {
    }

    public void onSuccess(String s)
    {
    }

    public Object preprocessFailure(Throwable throwable, Object obj)
    {
        return obj;
    }

    public Object preprocessSuccess(Object obj)
    {
        return obj;
    }

    public void receiveResponse(HttpUriRequest httpurirequest, HttpResponse httpresponse)
    {
        Object obj;
        StatusLine statusline = httpresponse.getStatusLine();
        Object obj1 = null;
        Object obj2;
        try
        {
            obj2 = httpresponse.getEntity();
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            requestFailed(httpurirequest, null, null);
            return;
        }
        obj = obj1;
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        obj = ((HttpEntity) (obj2)).getContent();
        obj2 = httpresponse.getFirstHeader("Content-Encoding");
        httpresponse = ((HttpResponse) (obj));
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        httpresponse = ((HttpResponse) (obj));
        if (((Header) (obj2)).getValue().equalsIgnoreCase("gzip"))
        {
            httpresponse = new GZIPInputStream(((java.io.InputStream) (obj)));
        }
        httpresponse = (new Scanner(httpresponse, "UTF-8")).useDelimiter("\\A");
        if (!httpresponse.hasNext()) goto _L4; else goto _L3
_L3:
        obj = httpresponse.next();
_L2:
        if (statusline.getStatusCode() != 200)
        {
            requestFailed(httpurirequest, new HttpResponseException(statusline.getStatusCode(), statusline.getReasonPhrase()), obj);
            return;
        } else
        {
            requestSucceeded(httpurirequest, obj);
            return;
        }
_L4:
        requestFailed(httpurirequest, null, null);
        obj = obj1;
          goto _L2
    }

    public void setCacheExpiry(long l)
    {
        cacheExpiry = l;
    }

    public void setCanUseCachedResponse(boolean flag)
    {
        canUseCachedResponse = flag;
    }

    public void setShouldCacheResponse(boolean flag)
    {
        shouldCacheResponse = flag;
    }
}
