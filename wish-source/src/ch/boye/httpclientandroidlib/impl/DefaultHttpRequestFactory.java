// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl;

import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpRequestFactory;
import ch.boye.httpclientandroidlib.MethodNotSupportedException;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.message.BasicHttpEntityEnclosingRequest;
import ch.boye.httpclientandroidlib.message.BasicHttpRequest;

public class DefaultHttpRequestFactory
    implements HttpRequestFactory
{

    private static final String RFC2616_COMMON_METHODS[] = {
        "GET"
    };
    private static final String RFC2616_ENTITY_ENC_METHODS[] = {
        "POST", "PUT"
    };
    private static final String RFC2616_SPECIAL_METHODS[] = {
        "HEAD", "OPTIONS", "DELETE", "TRACE", "CONNECT"
    };

    public DefaultHttpRequestFactory()
    {
    }

    private static boolean isOneOf(String as[], String s)
    {
        for (int i = 0; i < as.length; i++)
        {
            if (as[i].equalsIgnoreCase(s))
            {
                return true;
            }
        }

        return false;
    }

    public HttpRequest newHttpRequest(RequestLine requestline)
        throws MethodNotSupportedException
    {
        if (requestline == null)
        {
            throw new IllegalArgumentException("Request line may not be null");
        }
        String s = requestline.getMethod();
        if (isOneOf(RFC2616_COMMON_METHODS, s))
        {
            return new BasicHttpRequest(requestline);
        }
        if (isOneOf(RFC2616_ENTITY_ENC_METHODS, s))
        {
            return new BasicHttpEntityEnclosingRequest(requestline);
        }
        if (isOneOf(RFC2616_SPECIAL_METHODS, s))
        {
            return new BasicHttpRequest(requestline);
        } else
        {
            throw new MethodNotSupportedException((new StringBuilder()).append(s).append(" method not supported").toString());
        }
    }

    public HttpRequest newHttpRequest(String s, String s1)
        throws MethodNotSupportedException
    {
        if (isOneOf(RFC2616_COMMON_METHODS, s))
        {
            return new BasicHttpRequest(s, s1);
        }
        if (isOneOf(RFC2616_ENTITY_ENC_METHODS, s))
        {
            return new BasicHttpEntityEnclosingRequest(s, s1);
        }
        if (isOneOf(RFC2616_SPECIAL_METHODS, s))
        {
            return new BasicHttpRequest(s, s1);
        } else
        {
            throw new MethodNotSupportedException((new StringBuilder()).append(s).append(" method not supported").toString());
        }
    }

}
