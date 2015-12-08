// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.b;
import com.android.volley.h;
import com.android.volley.j;
import com.android.volley.q;
import com.android.volley.r;
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
//            b, u, f

public class a
    implements h
{

    protected static final boolean a;
    private static int d = 3000;
    private static int e = 4096;
    protected final f b;
    protected final com.android.volley.toolbox.b c;

    public a(f f1)
    {
        this(f1, new com.android.volley.toolbox.b(e));
    }

    private a(f f1, com.android.volley.toolbox.b b1)
    {
        b = f1;
        c = b1;
    }

    private static Map a(Header aheader[])
    {
        HashMap hashmap = new HashMap();
        for (int i = 0; i < aheader.length; i++)
        {
            hashmap.put(aheader[i].getName(), aheader[i].getValue());
        }

        return hashmap;
    }

    private static void a(String s, Request request, VolleyError volleyerror)
    {
        q q1 = request.p();
        int i = request.o();
        try
        {
            q1.a(volleyerror);
        }
        // Misplaced declaration of an exception variable
        catch (VolleyError volleyerror)
        {
            request.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
                s, Integer.valueOf(i)
            }));
            throw volleyerror;
        }
        request.a(String.format("%s-retry [timeout=%s]", new Object[] {
            s, Integer.valueOf(i)
        }));
    }

    private byte[] a(HttpEntity httpentity)
    {
        Object obj;
        Exception exception;
        u u1;
        u1 = new u(c, (int)httpentity.getContentLength());
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
            r.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(((byte []) (obj)));
        u1.close();
        throw exception;
        obj = exception;
        abyte0 = c.a(1024);
_L2:
        obj = abyte0;
        i = inputstream.read(abyte0);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        u1.write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
_L1:
        obj = abyte0;
        abyte1 = u1.toByteArray();
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            r.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(abyte0);
        u1.close();
        return abyte1;
    }

    public j a(Request request)
    {
        long l = SystemClock.elapsedRealtime();
_L3:
        Object obj;
        Object obj2;
        byte abyte0[];
        HttpResponse httpresponse;
        Object obj3;
        HttpResponse httpresponse1;
        httpresponse1 = null;
        obj = null;
        obj3 = new HashMap();
        obj2 = obj3;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        Object obj4 = new HashMap();
        obj2 = obj3;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        Object obj5 = request.e();
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        obj2 = obj3;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        if (((b) (obj5)).b == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        obj2 = obj3;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        ((Map) (obj4)).put("If-None-Match", ((b) (obj5)).b);
        obj2 = obj3;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        if (((b) (obj5)).c <= 0L)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        obj2 = obj3;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        ((Map) (obj4)).put("If-Modified-Since", DateUtils.formatDate(new Date(((b) (obj5)).c)));
        obj2 = obj3;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        httpresponse1 = b.a(request, ((Map) (obj4)));
        obj2 = obj3;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj5 = httpresponse1.getStatusLine();
        obj2 = obj3;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        int i = ((StatusLine) (obj5)).getStatusCode();
        obj2 = obj3;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj4 = a(httpresponse1.getAllHeaders());
        if (i != 304) goto _L2; else goto _L1
_L1:
        obj2 = obj4;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        long l1;
        try
        {
            return new j(304, request.e().a, ((Map) (obj4)), true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("socket", request, ((VolleyError) (new TimeoutError())));
        }
        catch (ConnectTimeoutException connecttimeoutexception)
        {
            a("connection", request, ((VolleyError) (new TimeoutError())));
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new RuntimeException((new StringBuilder("Bad URL ")).append(request.c()).toString(), malformedurlexception);
        }
        catch (Object obj1)
        {
            if (httpresponse != null)
            {
                int k = httpresponse.getStatusLine().getStatusCode();
                r.c("Unexpected response code %d for %s", new Object[] {
                    Integer.valueOf(k), request.c()
                });
                if (abyte0 != null)
                {
                    obj1 = new j(k, abyte0, ((Map) (obj2)), false);
                    if (k == 401 || k == 403)
                    {
                        a("auth", request, ((VolleyError) (new AuthFailureError(((j) (obj1))))));
                    } else
                    {
                        throw new ServerError(((j) (obj1)));
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
        if (true) goto _L3; else goto _L2
_L2:
        obj2 = obj4;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        if (httpresponse1.getEntity() == null) goto _L5; else goto _L4
_L4:
        obj2 = obj4;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj = a(httpresponse1.getEntity());
_L11:
        obj2 = obj4;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        l1 = SystemClock.elapsedRealtime() - l;
        obj2 = obj4;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        if (a) goto _L7; else goto _L6
_L6:
        obj2 = obj4;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        if (l1 <= (long)d) goto _L8; else goto _L7
_L7:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_726;
        }
        obj2 = obj4;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj3 = Integer.valueOf(obj.length);
_L12:
        obj2 = obj4;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        r.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
            request, Long.valueOf(l1), obj3, Integer.valueOf(((StatusLine) (obj5)).getStatusCode()), Integer.valueOf(request.p().b())
        });
_L8:
        if (i == 200 || i == 204) goto _L10; else goto _L9
_L9:
        obj2 = obj4;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        throw new IOException();
_L5:
        obj2 = obj4;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj = new byte[0];
          goto _L11
_L10:
        obj2 = obj4;
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj = new j(i, ((byte []) (obj)), ((Map) (obj4)), false);
        return ((j) (obj));
        obj3 = "null";
          goto _L12
    }

    static 
    {
        a = r.b;
    }
}
