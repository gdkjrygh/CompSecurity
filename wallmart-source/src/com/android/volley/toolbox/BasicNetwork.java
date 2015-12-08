// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.Network;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

// Referenced classes of package com.android.volley.toolbox:
//            ByteArrayPool, PoolingByteArrayOutputStream, HttpStack

public class BasicNetwork
    implements Network
{

    protected static final boolean DEBUG;
    private static int DEFAULT_POOL_SIZE = 4096;
    private static int SLOW_REQUEST_THRESHOLD_MS = 3000;
    protected final HttpStack mHttpStack;
    protected final ByteArrayPool mPool;

    public BasicNetwork(HttpStack httpstack)
    {
        this(httpstack, new ByteArrayPool(DEFAULT_POOL_SIZE));
    }

    public BasicNetwork(HttpStack httpstack, ByteArrayPool bytearraypool)
    {
        mHttpStack = httpstack;
        mPool = bytearraypool;
    }

    private void addCacheHeaders(Map map, com.android.volley.Cache.Entry entry)
    {
        if (entry != null)
        {
            if (entry.etag != null)
            {
                map.put("If-None-Match", entry.etag);
            }
            if (entry.serverDate > 0L)
            {
                map.put("If-Modified-Since", DateUtils.formatDate(new Date(entry.serverDate)));
                return;
            }
        }
    }

    private static void attemptRetryOnException(String s, Request request, VolleyError volleyerror)
        throws VolleyError
    {
        RetryPolicy retrypolicy = request.getRetryPolicy();
        int i = request.getTimeoutMs();
        try
        {
            retrypolicy.retry(volleyerror);
        }
        // Misplaced declaration of an exception variable
        catch (VolleyError volleyerror)
        {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
                s, Integer.valueOf(i)
            }));
            throw volleyerror;
        }
        request.addMarker(String.format("%s-retry [timeout=%s]", new Object[] {
            s, Integer.valueOf(i)
        }));
    }

    protected static Map convertHeaders(Header aheader[])
    {
        TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < aheader.length; i++)
        {
            treemap.put(aheader[i].getName(), aheader[i].getValue());
        }

        return treemap;
    }

    private byte[] entityToBytes(HttpEntity httpentity)
        throws IOException, ServerError
    {
        Object obj;
        Exception exception;
        PoolingByteArrayOutputStream poolingbytearrayoutputstream;
        poolingbytearrayoutputstream = new PoolingByteArrayOutputStream(mPool, (int)httpentity.getContentLength());
        exception = null;
        obj = exception;
        InputStream inputstream = httpentity.getContent();
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj = exception;
        throw new ServerError();
        exception;
        byte abyte0[];
        byte abyte1[];
        int i;
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            VolleyLog.v("Error occured when calling consumingContent", new Object[0]);
        }
        mPool.returnBuf(((byte []) (obj)));
        poolingbytearrayoutputstream.close();
        throw exception;
        obj = exception;
        abyte0 = mPool.getBuf(1024);
_L2:
        obj = abyte0;
        i = inputstream.read(abyte0);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        poolingbytearrayoutputstream.write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
_L1:
        obj = abyte0;
        abyte1 = poolingbytearrayoutputstream.toByteArray();
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            VolleyLog.v("Error occured when calling consumingContent", new Object[0]);
        }
        mPool.returnBuf(abyte0);
        poolingbytearrayoutputstream.close();
        return abyte1;
    }

    private void logSlowRequests(long l, Request request, byte abyte0[], StatusLine statusline)
    {
        if (DEBUG || l > (long)SLOW_REQUEST_THRESHOLD_MS)
        {
            if (abyte0 != null)
            {
                abyte0 = Integer.valueOf(abyte0.length);
            } else
            {
                abyte0 = "null";
            }
            VolleyLog.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
                request, Long.valueOf(l), abyte0, Integer.valueOf(statusline.getStatusCode()), Integer.valueOf(request.getRetryPolicy().getCurrentRetryCount())
            });
        }
    }

    protected void logError(String s, String s1, long l)
    {
        VolleyLog.v("HTTP ERROR(%s) %d ms to fetch %s", new Object[] {
            s, Long.valueOf(SystemClock.elapsedRealtime() - l), s1
        });
    }

    public NetworkResponse performRequest(Request request)
        throws VolleyError
    {
        long l = SystemClock.elapsedRealtime();
_L7:
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        obj3 = null;
        obj4 = Collections.emptyMap();
        obj = obj4;
        obj2 = obj3;
        Object obj5 = new HashMap();
        obj = obj4;
        obj2 = obj3;
        addCacheHeaders(((Map) (obj5)), request.getCacheEntry());
        obj = obj4;
        obj2 = obj3;
        obj3 = mHttpStack.performRequest(request, ((Map) (obj5)));
        obj = obj4;
        obj2 = obj3;
        StatusLine statusline = ((HttpResponse) (obj3)).getStatusLine();
        obj = obj4;
        obj2 = obj3;
        int i = statusline.getStatusCode();
        obj = obj4;
        obj2 = obj3;
        obj4 = convertHeaders(((HttpResponse) (obj3)).getAllHeaders());
        if (i != 304) goto _L2; else goto _L1
_L1:
        obj = obj4;
        obj2 = obj3;
        obj5 = request.getCacheEntry();
        if (obj5 != null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        obj = obj4;
        obj2 = obj3;
        return new NetworkResponse(304, null, ((Map) (obj4)), true, SystemClock.elapsedRealtime() - l);
        obj = obj4;
        obj2 = obj3;
        ((com.android.volley.Cache.Entry) (obj5)).responseHeaders.putAll(((Map) (obj4)));
        obj = obj4;
        obj2 = obj3;
        return new NetworkResponse(304, ((com.android.volley.Cache.Entry) (obj5)).data, ((com.android.volley.Cache.Entry) (obj5)).responseHeaders, true, SystemClock.elapsedRealtime() - l);
_L13:
        obj = obj4;
        obj2 = obj3;
        request.setRedirectUrl((String)((Map) (obj4)).get("Location"));
_L14:
        obj = obj4;
        obj2 = obj3;
        if (((HttpResponse) (obj3)).getEntity() == null) goto _L4; else goto _L3
_L3:
        obj = obj4;
        obj2 = obj3;
        byte abyte0[] = entityToBytes(((HttpResponse) (obj3)).getEntity());
        obj = abyte0;
_L8:
        logSlowRequests(SystemClock.elapsedRealtime() - l, request, ((byte []) (obj)), statusline);
        if (i >= 200 && i <= 299) goto _L6; else goto _L5
_L5:
        throw new IOException();
        obj;
_L12:
        attemptRetryOnException("socket", request, new TimeoutError());
          goto _L7
_L4:
        obj = obj4;
        obj2 = obj3;
        abyte0 = new byte[0];
        obj = abyte0;
          goto _L8
_L6:
        obj2 = new NetworkResponse(i, ((byte []) (obj)), ((Map) (obj4)), false, SystemClock.elapsedRealtime() - l);
        return ((NetworkResponse) (obj2));
        obj;
_L11:
        attemptRetryOnException("connection", request, new TimeoutError());
          goto _L7
        obj;
_L10:
        throw new RuntimeException((new StringBuilder()).append("Bad URL ").append(request.getUrl()).toString(), ((Throwable) (obj)));
        IOException ioexception;
        ioexception;
        abyte0 = null;
        obj3 = obj2;
        obj4 = obj;
        obj2 = ioexception;
_L9:
        if (obj3 != null)
        {
            i = ((HttpResponse) (obj3)).getStatusLine().getStatusCode();
            if (i == 301 || i == 302)
            {
                VolleyLog.e("Request at %s has been redirected to %s", new Object[] {
                    request.getOriginUrl(), request.getUrl()
                });
            } else
            {
                VolleyLog.e("Unexpected response code %d for %s", new Object[] {
                    Integer.valueOf(i), request.getUrl()
                });
            }
            if (abyte0 != null)
            {
                obj = new NetworkResponse(i, abyte0, ((Map) (obj4)), false, SystemClock.elapsedRealtime() - l);
                if (i == 401 || i == 403)
                {
                    attemptRetryOnException("auth", request, new AuthFailureError(((NetworkResponse) (obj))));
                } else
                if (i == 301 || i == 302)
                {
                    attemptRetryOnException("redirect", request, new AuthFailureError(((NetworkResponse) (obj))));
                } else
                {
                    throw new ServerError(((NetworkResponse) (obj)));
                }
            } else
            {
                throw new NetworkError(null);
            }
        } else
        {
            throw new NoConnectionError(((Throwable) (obj2)));
        }
          goto _L7
        obj2;
        abyte0 = ((byte []) (obj));
          goto _L9
        obj;
          goto _L10
        Object obj1;
        obj1;
          goto _L11
        obj1;
          goto _L12
_L2:
        if (i != 301 && i != 302) goto _L14; else goto _L13
    }

    static 
    {
        DEBUG = VolleyLog.DEBUG;
    }
}
