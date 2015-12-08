// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

// Referenced classes of package com.facebook.internal:
//            FileLruCache, Utility, Logger

class UrlRedirectCache
{

    private static final String REDIRECT_CONTENT_TAG = (new StringBuilder(String.valueOf(TAG))).append("_Redirect").toString();
    static final String TAG = com/facebook/internal/UrlRedirectCache.getSimpleName();
    private static volatile FileLruCache urlRedirectCache;

    UrlRedirectCache()
    {
    }

    static void cacheUriRedirect(Uri uri, Uri uri1)
    {
        if (uri == null || uri1 == null)
        {
            return;
        }
        Uri uri3 = null;
        Uri uri2 = null;
        try
        {
            uri = getCache().openPutStream(uri.toString(), REDIRECT_CONTENT_TAG);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Utility.closeQuietly(uri2);
            return;
        }
        finally
        {
            Utility.closeQuietly(uri3);
        }
        uri2 = uri;
        uri3 = uri;
        uri.write(uri1.toString().getBytes());
        Utility.closeQuietly(uri);
        return;
        throw uri;
    }

    static void clearCache()
    {
        try
        {
            getCache().clearCache();
            return;
        }
        catch (IOException ioexception)
        {
            Logger.log(LoggingBehavior.CACHE, 5, TAG, (new StringBuilder("clearCache failed ")).append(ioexception.getMessage()).toString());
        }
    }

    static FileLruCache getCache()
        throws IOException
    {
        com/facebook/internal/UrlRedirectCache;
        JVM INSTR monitorenter ;
        FileLruCache filelrucache;
        if (urlRedirectCache == null)
        {
            urlRedirectCache = new FileLruCache(TAG, new FileLruCache.Limits());
        }
        filelrucache = urlRedirectCache;
        com/facebook/internal/UrlRedirectCache;
        JVM INSTR monitorexit ;
        return filelrucache;
        Exception exception;
        exception;
        throw exception;
    }

    static Uri getRedirectedUri(Uri uri)
    {
        Object obj;
        Object obj1;
        if (uri == null)
        {
            return null;
        }
        obj1 = uri.toString();
        obj = null;
        uri = null;
        FileLruCache filelrucache = getCache();
        boolean flag;
        flag = false;
        uri = null;
        obj = obj1;
_L12:
        obj1 = filelrucache.get(((String) (obj)), REDIRECT_CONTENT_TAG);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        obj = Uri.parse(((String) (obj)));
        Utility.closeQuietly(uri);
        return ((Uri) (obj));
_L2:
        flag = true;
        obj1 = new InputStreamReader(((java.io.InputStream) (obj1)));
        uri = ((Uri) (obj1));
        obj = obj1;
        char ac[] = new char[128];
        uri = ((Uri) (obj1));
        obj = obj1;
        StringBuilder stringbuilder = new StringBuilder();
_L6:
        uri = ((Uri) (obj1));
        obj = obj1;
        int i = ((InputStreamReader) (obj1)).read(ac, 0, ac.length);
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        uri = ((Uri) (obj1));
        obj = obj1;
        Utility.closeQuietly(((java.io.Closeable) (obj1)));
        uri = ((Uri) (obj1));
        obj = obj1;
        ac = stringbuilder.toString();
        uri = ((Uri) (obj1));
        obj = ac;
        continue; /* Loop/switch isn't completed */
        uri = ((Uri) (obj1));
        obj = obj1;
        stringbuilder.append(ac, 0, i);
        if (true) goto _L6; else goto _L5
_L5:
        obj;
_L10:
        Utility.closeQuietly(uri);
        return null;
        uri;
_L8:
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        throw uri;
_L4:
        Utility.closeQuietly(uri);
        return null;
        Exception exception;
        exception;
        obj = uri;
        uri = exception;
        if (true) goto _L8; else goto _L7
_L7:
        IOException ioexception;
        ioexception;
        if (true) goto _L10; else goto _L9
_L9:
        if (true) goto _L12; else goto _L11
_L11:
    }

}
