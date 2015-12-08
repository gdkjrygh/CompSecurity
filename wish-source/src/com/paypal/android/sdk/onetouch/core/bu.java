// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Iterator;
import javax.net.ssl.SSLException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

final class bu
    implements HttpRequestRetryHandler
{

    private static HashSet a;
    private static HashSet b;
    private final int c = 5;

    public bu(int i)
    {
    }

    private static boolean a(HashSet hashset, Throwable throwable)
    {
        for (hashset = hashset.iterator(); hashset.hasNext();)
        {
            if (((Class)hashset.next()).isInstance(throwable))
            {
                return true;
            }
        }

        return false;
    }

    public final boolean retryRequest(IOException ioexception, int i, HttpContext httpcontext)
    {
        boolean flag2 = true;
        Boolean boolean1 = (Boolean)httpcontext.getAttribute("http.request_sent");
        boolean flag;
        boolean flag1;
        if (boolean1 != null && boolean1.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i > c)
        {
            flag1 = false;
        } else
        if (a(b, ioexception))
        {
            flag1 = false;
        } else
        if (a(a, ioexception))
        {
            flag1 = true;
        } else
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = true;
        }
        if (flag1)
        {
            if (!((HttpUriRequest)httpcontext.getAttribute("http.request")).getMethod().equals("POST"))
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            SystemClock.sleep(1500L);
            return flag1;
        } else
        {
            ioexception.printStackTrace();
            return flag1;
        }
    }

    static 
    {
        a = new HashSet();
        b = new HashSet();
        a.add(org/apache/http/NoHttpResponseException);
        a.add(java/net/UnknownHostException);
        a.add(java/net/SocketException);
        b.add(java/io/InterruptedIOException);
        b.add(javax/net/ssl/SSLException);
    }
}
