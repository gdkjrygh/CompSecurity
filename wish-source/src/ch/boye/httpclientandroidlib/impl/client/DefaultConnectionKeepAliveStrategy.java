// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.HeaderElementIterator;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.conn.ConnectionKeepAliveStrategy;
import ch.boye.httpclientandroidlib.message.BasicHeaderElementIterator;
import ch.boye.httpclientandroidlib.protocol.HttpContext;

public class DefaultConnectionKeepAliveStrategy
    implements ConnectionKeepAliveStrategy
{

    public DefaultConnectionKeepAliveStrategy()
    {
    }

    public long getKeepAliveDuration(HttpResponse httpresponse, HttpContext httpcontext)
    {
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        httpresponse = new BasicHeaderElementIterator(httpresponse.headerIterator("Keep-Alive"));
_L2:
        Object obj;
        if (!httpresponse.hasNext())
        {
            break MISSING_BLOCK_LABEL_86;
        }
        obj = httpresponse.nextElement();
        httpcontext = ((HeaderElement) (obj)).getName();
        obj = ((HeaderElement) (obj)).getValue();
        if (obj == null || !httpcontext.equalsIgnoreCase("timeout"))
        {
            continue; /* Loop/switch isn't completed */
        }
        long l = Long.parseLong(((String) (obj)));
        return l * 1000L;
        return -1L;
        httpcontext;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
