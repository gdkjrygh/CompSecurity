// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.Consts;
import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheEntry;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class CacheKeyGenerator
{

    CacheKeyGenerator()
    {
    }

    private String canonicalizePath(String s)
    {
        String s1;
        try
        {
            s1 = (new URI(URLDecoder.decode(s, "UTF-8"))).getPath();
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return s;
        }
        catch (URISyntaxException urisyntaxexception)
        {
            return s;
        }
        return s1;
    }

    private int canonicalizePort(int i, String s)
    {
        int j;
        if (i == -1 && "http".equalsIgnoreCase(s))
        {
            j = 80;
        } else
        {
            j = i;
            if (i == -1)
            {
                j = i;
                if ("https".equalsIgnoreCase(s))
                {
                    return 443;
                }
            }
        }
        return j;
    }

    private boolean isRelativeRequest(HttpRequest httprequest)
    {
        httprequest = httprequest.getRequestLine().getUri();
        return "*".equals(httprequest) || httprequest.startsWith("/");
    }

    public String canonicalizeUri(String s)
    {
        String s1;
        String s2;
        String s3;
        String s4;
        URL url;
        int i;
        try
        {
            url = new URL(s);
            s3 = url.getProtocol().toLowerCase();
            s4 = url.getHost().toLowerCase();
            i = canonicalizePort(url.getPort(), s3);
            s2 = canonicalizePath(url.getPath());
        }
        catch (MalformedURLException malformedurlexception)
        {
            return s;
        }
        s1 = s2;
        if ("".equals(s2))
        {
            s1 = "/";
        }
        s2 = url.getQuery();
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        s1 = (new StringBuilder()).append(s1).append("?").append(s2).toString();
        s1 = (new URL(s3, s4, i, s1)).toString();
        return s1;
    }

    protected String getFullHeaderValue(Header aheader[])
    {
        if (aheader == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder("");
        boolean flag = true;
        int j = aheader.length;
        for (int i = 0; i < j; i++)
        {
            Header header = aheader[i];
            if (!flag)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(header.getValue().trim());
            flag = false;
        }

        return stringbuilder.toString();
    }

    public String getURI(HttpHost httphost, HttpRequest httprequest)
    {
        if (isRelativeRequest(httprequest))
        {
            return canonicalizeUri(String.format("%s%s", new Object[] {
                httphost.toString(), httprequest.getRequestLine().getUri()
            }));
        } else
        {
            return canonicalizeUri(httprequest.getRequestLine().getUri());
        }
    }

    public String getVariantKey(HttpRequest httprequest, HttpCacheEntry httpcacheentry)
    {
        Object obj = new ArrayList();
        httpcacheentry = httpcacheentry.getHeaders("Vary");
        int k = httpcacheentry.length;
        for (int i = 0; i < k; i++)
        {
            HeaderElement aheaderelement[] = httpcacheentry[i].getElements();
            int l = aheaderelement.length;
            for (int j = 0; j < l; j++)
            {
                ((List) (obj)).add(aheaderelement[j].getName());
            }

        }

        Collections.sort(((List) (obj)));
        String s;
        boolean flag;
        try
        {
            httpcacheentry = new StringBuilder("{");
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            throw new RuntimeException("couldn't encode to UTF-8", httprequest);
        }
        flag = true;
        obj = ((List) (obj)).iterator();
_L1:
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_201;
        }
        s = (String)((Iterator) (obj)).next();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        httpcacheentry.append("&");
        httpcacheentry.append(URLEncoder.encode(s, Consts.UTF_8.name()));
        httpcacheentry.append("=");
        httpcacheentry.append(URLEncoder.encode(getFullHeaderValue(httprequest.getHeaders(s)), Consts.UTF_8.name()));
        flag = false;
          goto _L1
        httpcacheentry.append("}");
        return httpcacheentry.toString();
    }

    public String getVariantURI(HttpHost httphost, HttpRequest httprequest, HttpCacheEntry httpcacheentry)
    {
        if (!httpcacheentry.hasVariants())
        {
            return getURI(httphost, httprequest);
        } else
        {
            return (new StringBuilder()).append(getVariantKey(httprequest, httpcacheentry)).append(getURI(httphost, httprequest)).toString();
        }
    }
}
