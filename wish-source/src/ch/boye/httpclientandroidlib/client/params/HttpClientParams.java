// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.params;

import ch.boye.httpclientandroidlib.params.HttpConnectionParams;
import ch.boye.httpclientandroidlib.params.HttpParams;

public class HttpClientParams
{

    private HttpClientParams()
    {
    }

    public static long getConnectionManagerTimeout(HttpParams httpparams)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        Long long1 = (Long)httpparams.getParameter("http.conn-manager.timeout");
        if (long1 != null)
        {
            return long1.longValue();
        } else
        {
            return (long)HttpConnectionParams.getConnectionTimeout(httpparams);
        }
    }

    public static String getCookiePolicy(HttpParams httpparams)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        String s = (String)httpparams.getParameter("http.protocol.cookie-policy");
        httpparams = s;
        if (s == null)
        {
            httpparams = "best-match";
        }
        return httpparams;
    }

    public static boolean isAuthenticating(HttpParams httpparams)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            return httpparams.getBooleanParameter("http.protocol.handle-authentication", true);
        }
    }

    public static boolean isRedirecting(HttpParams httpparams)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            return httpparams.getBooleanParameter("http.protocol.handle-redirects", true);
        }
    }

    public static void setAuthenticating(HttpParams httpparams, boolean flag)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            httpparams.setBooleanParameter("http.protocol.handle-authentication", flag);
            return;
        }
    }

    public static void setConnectionManagerTimeout(HttpParams httpparams, long l)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            httpparams.setLongParameter("http.conn-manager.timeout", l);
            return;
        }
    }

    public static void setCookiePolicy(HttpParams httpparams, String s)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            httpparams.setParameter("http.protocol.cookie-policy", s);
            return;
        }
    }

    public static void setRedirecting(HttpParams httpparams, boolean flag)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            httpparams.setBooleanParameter("http.protocol.handle-redirects", flag);
            return;
        }
    }
}
