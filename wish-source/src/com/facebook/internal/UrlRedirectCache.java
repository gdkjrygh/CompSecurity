// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.facebook.internal:
//            FileLruCache, Utility, Logger

class UrlRedirectCache
{

    private static final String REDIRECT_CONTENT_TAG = (new StringBuilder()).append(TAG).append("_Redirect").toString();
    static final String TAG = com/facebook/internal/UrlRedirectCache.getSimpleName();
    private static volatile FileLruCache urlRedirectCache;

    UrlRedirectCache()
    {
    }

    static void cacheUriRedirect(Context context, URI uri, URI uri1)
    {
        if (uri == null || uri1 == null)
        {
            return;
        }
        Context context2 = null;
        Context context1 = null;
        try
        {
            context = getCache(context).openPutStream(uri.toString(), REDIRECT_CONTENT_TAG);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Utility.closeQuietly(context1);
            return;
        }
        finally
        {
            Utility.closeQuietly(context2);
        }
        context1 = context;
        context2 = context;
        context.write(uri1.toString().getBytes());
        Utility.closeQuietly(context);
        return;
        throw context;
    }

    static void clearCache(Context context)
    {
        try
        {
            getCache(context).clearCache();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.log(LoggingBehavior.CACHE, 5, TAG, (new StringBuilder()).append("clearCache failed ").append(context.getMessage()).toString());
        }
    }

    static FileLruCache getCache(Context context)
        throws IOException
    {
        com/facebook/internal/UrlRedirectCache;
        JVM INSTR monitorenter ;
        if (urlRedirectCache == null)
        {
            urlRedirectCache = new FileLruCache(context.getApplicationContext(), TAG, new FileLruCache.Limits());
        }
        context = urlRedirectCache;
        com/facebook/internal/UrlRedirectCache;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static URI getRedirectedUri(Context context, URI uri)
    {
        Object obj;
        Object obj1;
        Object obj2;
        if (uri == null)
        {
            return null;
        }
        uri = uri.toString();
        obj1 = null;
        obj2 = null;
        obj = null;
        FileLruCache filelrucache = getCache(context);
        boolean flag;
        flag = false;
        context = null;
_L5:
        obj = filelrucache.get(uri, REDIRECT_CONTENT_TAG);
        if (obj == null) goto _L2; else goto _L1
_L1:
        flag = true;
        uri = new InputStreamReader(((java.io.InputStream) (obj)));
        obj = uri;
        obj1 = uri;
        obj2 = uri;
        context = new char[128];
        obj = uri;
        obj1 = uri;
        obj2 = uri;
        StringBuilder stringbuilder = new StringBuilder();
_L4:
        obj = uri;
        obj1 = uri;
        obj2 = uri;
        int i = uri.read(context, 0, context.length);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = uri;
        obj1 = uri;
        obj2 = uri;
        stringbuilder.append(context, 0, i);
        if (true) goto _L4; else goto _L3
        context;
_L10:
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        return null;
_L3:
        obj = uri;
        obj1 = uri;
        obj2 = uri;
        Utility.closeQuietly(uri);
        obj = uri;
        obj1 = uri;
        obj2 = uri;
        context = stringbuilder.toString();
        obj = context;
        context = uri;
        uri = ((URI) (obj));
          goto _L5
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        uri = new URI(uri);
        Utility.closeQuietly(context);
        return uri;
        Utility.closeQuietly(context);
        return null;
        context;
_L9:
        Utility.closeQuietly(((java.io.Closeable) (obj1)));
        return null;
        context;
_L7:
        Utility.closeQuietly(((java.io.Closeable) (obj2)));
        throw context;
        uri;
        obj2 = context;
        context = uri;
        if (true) goto _L7; else goto _L6
_L6:
        uri;
        obj1 = context;
        if (true) goto _L9; else goto _L8
_L8:
        uri;
        obj = context;
          goto _L10
    }

}
