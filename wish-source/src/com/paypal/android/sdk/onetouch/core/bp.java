// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.util.Log;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            bs, bq

final class bp
    implements Runnable
{

    private final AbstractHttpClient a;
    private final HttpContext b;
    private final HttpUriRequest c;
    private final bq d;
    private boolean e;
    private int f;

    public bp(AbstractHttpClient abstracthttpclient, HttpContext httpcontext, HttpUriRequest httpurirequest, bq bq1)
    {
        a = abstracthttpclient;
        b = httpcontext;
        c = httpurirequest;
        d = bq1;
        if (bq1 instanceof bs)
        {
            e = true;
        }
    }

    private void a()
    {
        if (Thread.currentThread().isInterrupted())
        {
            break MISSING_BLOCK_LABEL_49;
        }
        org.apache.http.HttpResponse httpresponse = a.execute(c, b);
        if (!Thread.currentThread().isInterrupted() && d != null)
        {
            d.a(httpresponse);
        }
_L1:
        return;
        IOException ioexception;
        ioexception;
        if (!Thread.currentThread().isInterrupted())
        {
            throw ioexception;
        }
          goto _L1
    }

    public final void run()
    {
        Object obj = null;
        if (d != null)
        {
            d.a();
        }
        boolean flag = true;
        HttpRequestRetryHandler httprequestretryhandler = a.getHttpRequestRetryHandler();
_L9:
        if (!flag) goto _L2; else goto _L1
_L1:
        a();
_L4:
        if (d != null)
        {
            d.b();
            return;
        }
        break MISSING_BLOCK_LABEL_297;
        obj;
        if (d == null) goto _L4; else goto _L3
_L3:
        d.b(((Throwable) (obj)), "can't resolve host", null);
          goto _L4
_L10:
        try
        {
            if (d == null)
            {
                break MISSING_BLOCK_LABEL_297;
            }
            d.b();
            if (e)
            {
                d.a(((Throwable) (obj)), null, null);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("paypal.sdk", "exception in thread", ((Throwable) (obj)));
            throw obj;
        }
          goto _L5
        obj;
        if (d == null) goto _L4; else goto _L6
_L6:
        d.b(((Throwable) (obj)), "can't resolve host", null);
          goto _L4
        obj;
        if (d == null) goto _L4; else goto _L7
_L7:
        d.b(((Throwable) (obj)), "socket time out", null);
          goto _L4
        obj;
        if (d == null) goto _L4; else goto _L8
_L8:
        d.b(((Throwable) (obj)), "Android 2.x closed connection re-use bug", null);
          goto _L4
        obj;
        int i = f + 1;
        f = i;
        flag = httprequestretryhandler.retryRequest(((IOException) (obj)), i, b);
          goto _L9
        obj;
        obj = new IOException((new StringBuilder("NPE in HttpClient")).append(((NullPointerException) (obj)).getMessage()).toString());
        int j = f + 1;
        f = j;
        flag = httprequestretryhandler.retryRequest(((IOException) (obj)), j, b);
          goto _L9
_L2:
        try
        {
            ConnectException connectexception = new ConnectException();
            connectexception.initCause(((Throwable) (obj)));
            throw connectexception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L10
_L5:
        d.b(((Throwable) (obj)), null, null);
          goto _L4
    }
}
