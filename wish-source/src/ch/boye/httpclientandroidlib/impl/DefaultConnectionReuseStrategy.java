// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl;

import ch.boye.httpclientandroidlib.ConnectionReuseStrategy;
import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderIterator;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpVersion;
import ch.boye.httpclientandroidlib.ParseException;
import ch.boye.httpclientandroidlib.ProtocolVersion;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.TokenIterator;
import ch.boye.httpclientandroidlib.message.BasicTokenIterator;
import ch.boye.httpclientandroidlib.protocol.HttpContext;

public class DefaultConnectionReuseStrategy
    implements ConnectionReuseStrategy
{

    public DefaultConnectionReuseStrategy()
    {
    }

    protected TokenIterator createTokenIterator(HeaderIterator headeriterator)
    {
        return new BasicTokenIterator(headeriterator);
    }

    public boolean keepAlive(HttpResponse httpresponse, HttpContext httpcontext)
    {
        ProtocolVersion protocolversion;
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null.");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null.");
        }
        protocolversion = httpresponse.getStatusLine().getProtocolVersion();
        httpcontext = httpresponse.getFirstHeader("Transfer-Encoding");
        if (httpcontext != null)
        {
            if (!"chunked".equalsIgnoreCase(httpcontext.getValue()))
            {
                return false;
            }
        } else
        {
            httpcontext = httpresponse.getHeaders("Content-Length");
            if (httpcontext == null || httpcontext.length != 1)
            {
                return false;
            }
            httpcontext = httpcontext[0];
            int i;
            try
            {
                i = Integer.parseInt(httpcontext.getValue());
            }
            // Misplaced declaration of an exception variable
            catch (HttpResponse httpresponse)
            {
                return false;
            }
            if (i < 0)
            {
                return false;
            }
        }
        HeaderIterator headeriterator = httpresponse.headerIterator("Connection");
        httpcontext = headeriterator;
        if (!headeriterator.hasNext())
        {
            httpcontext = httpresponse.headerIterator("Proxy-Connection");
        }
        if (!httpcontext.hasNext())
        {
            break MISSING_BLOCK_LABEL_219;
        }
        boolean flag;
        boolean flag1;
        try
        {
            httpresponse = createTokenIterator(httpcontext);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            return false;
        }
        flag = false;
        if (!httpresponse.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        httpcontext = httpresponse.nextToken();
        if ("Close".equalsIgnoreCase(httpcontext))
        {
            return false;
        }
        flag1 = "Keep-Alive".equalsIgnoreCase(httpcontext);
        if (flag1)
        {
            flag = true;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_163;
_L1:
        if (flag)
        {
            return true;
        }
        return !protocolversion.lessEquals(HttpVersion.HTTP_1_0);
    }
}
