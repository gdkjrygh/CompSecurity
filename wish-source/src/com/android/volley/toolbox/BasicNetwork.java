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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
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

    private static Map convertHeaders(Header aheader[])
    {
        HashMap hashmap = new HashMap();
        for (int i = 0; i < aheader.length; i++)
        {
            hashmap.put(aheader[i].getName(), aheader[i].getValue());
        }

        return hashmap;
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
_L5:
        HashMap hashmap;
        byte abyte1[];
        HttpResponse httpresponse;
        Object obj2;
        HttpResponse httpresponse1;
        Object obj3;
        httpresponse1 = null;
        obj3 = null;
        hashmap = new HashMap();
        abyte1 = obj3;
        httpresponse = httpresponse1;
        obj2 = hashmap;
        Object obj4 = new HashMap();
        abyte1 = obj3;
        httpresponse = httpresponse1;
        obj2 = hashmap;
        addCacheHeaders(((Map) (obj4)), request.getCacheEntry());
        abyte1 = obj3;
        httpresponse = httpresponse1;
        obj2 = hashmap;
        httpresponse1 = mHttpStack.performRequest(request, ((Map) (obj4)));
        abyte1 = obj3;
        httpresponse = httpresponse1;
        obj2 = hashmap;
        StatusLine statusline = httpresponse1.getStatusLine();
        abyte1 = obj3;
        httpresponse = httpresponse1;
        obj2 = hashmap;
        int i = statusline.getStatusCode();
        abyte1 = obj3;
        httpresponse = httpresponse1;
        obj2 = hashmap;
        obj4 = convertHeaders(httpresponse1.getAllHeaders());
        if (i != 304) goto _L2; else goto _L1
_L1:
        abyte1 = obj3;
        httpresponse = httpresponse1;
        obj2 = obj4;
        if (request.getCacheEntry() != null) goto _L4; else goto _L3
_L3:
        byte abyte0[] = null;
_L6:
        abyte1 = obj3;
        httpresponse = httpresponse1;
        obj2 = obj4;
        Object obj;
        try
        {
            return new NetworkResponse(304, abyte0, ((Map) (obj4)), true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            attemptRetryOnException("socket", request, new TimeoutError());
        }
        catch (ConnectTimeoutException connecttimeoutexception)
        {
            attemptRetryOnException("connection", request, new TimeoutError());
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new RuntimeException((new StringBuilder()).append("Bad URL ").append(request.getUrl()).toString(), malformedurlexception);
        }
        catch (Object obj1)
        {
            if (httpresponse != null)
            {
                int j = httpresponse.getStatusLine().getStatusCode();
                VolleyLog.e("Unexpected response code %d for %s", new Object[] {
                    Integer.valueOf(j), request.getUrl()
                });
                if (abyte1 != null)
                {
                    obj1 = new NetworkResponse(j, abyte1, ((Map) (obj2)), false);
                    if (j == 401 || j == 403)
                    {
                        attemptRetryOnException("auth", request, new AuthFailureError(((NetworkResponse) (obj1))));
                    } else
                    {
                        throw new ServerError(((NetworkResponse) (obj1)));
                    }
                } else
                {
                    throw new NetworkError(null);
                }
            } else
            {
                throw new NoConnectionError(((Throwable) (obj1)));
            }
        }
          goto _L5
_L4:
        abyte1 = obj3;
        httpresponse = httpresponse1;
        obj2 = obj4;
        abyte0 = request.getCacheEntry().data;
        if (true) goto _L6; else goto _L2
_L2:
        abyte1 = obj3;
        httpresponse = httpresponse1;
        obj2 = obj4;
        if (httpresponse1.getEntity() == null) goto _L8; else goto _L7
_L7:
        abyte1 = obj3;
        httpresponse = httpresponse1;
        obj2 = obj4;
        obj = entityToBytes(httpresponse1.getEntity());
_L10:
        abyte1 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj2 = obj4;
        logSlowRequests(SystemClock.elapsedRealtime() - l, request, ((byte []) (obj)), statusline);
        if (i >= 200 && i <= 299)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte1 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj2 = obj4;
        throw new IOException();
_L8:
        abyte1 = obj3;
        httpresponse = httpresponse1;
        obj2 = obj4;
        obj = new byte[0];
        if (true) goto _L10; else goto _L9
_L9:
        abyte1 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj2 = obj4;
        obj = new NetworkResponse(i, ((byte []) (obj)), ((Map) (obj4)), false);
        return ((NetworkResponse) (obj));
    }

    static 
    {
        DEBUG = VolleyLog.DEBUG;
    }
}
