// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.ProtocolException;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheEntry;
import ch.boye.httpclientandroidlib.impl.client.RequestWrapper;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class ConditionalRequestBuilder
{

    private static final HttpClientAndroidLog log = new HttpClientAndroidLog(ch/boye/httpclientandroidlib/impl/client/cache/ConditionalRequestBuilder);

    ConditionalRequestBuilder()
    {
    }

    public HttpRequest buildConditionalRequest(HttpRequest httprequest, HttpCacheEntry httpcacheentry)
        throws ProtocolException
    {
        httprequest = new RequestWrapper(httprequest);
        httprequest.resetHeaders();
        Header header = httpcacheentry.getFirstHeader("ETag");
        if (header != null)
        {
            httprequest.setHeader("If-None-Match", header.getValue());
        }
        header = httpcacheentry.getFirstHeader("Last-Modified");
        if (header != null)
        {
            httprequest.setHeader("If-Modified-Since", header.getValue());
        }
        boolean flag = false;
        httpcacheentry = httpcacheentry.getHeaders("Cache-Control");
        int k = httpcacheentry.length;
        int i = 0;
label0:
        do
        {
            if (i < k)
            {
                HeaderElement aheaderelement[] = httpcacheentry[i].getElements();
                int l = aheaderelement.length;
                int j = 0;
                do
                {
label1:
                    {
                        boolean flag1 = flag;
                        if (j < l)
                        {
                            HeaderElement headerelement = aheaderelement[j];
                            if (!"must-revalidate".equalsIgnoreCase(headerelement.getName()) && !"proxy-revalidate".equalsIgnoreCase(headerelement.getName()))
                            {
                                break label1;
                            }
                            flag1 = true;
                        }
                        i++;
                        flag = flag1;
                        continue label0;
                    }
                    j++;
                } while (true);
            }
            if (flag)
            {
                httprequest.addHeader("Cache-Control", "max-age=0");
            }
            return httprequest;
        } while (true);
    }

    public HttpRequest buildConditionalRequestFromVariants(HttpRequest httprequest, Map map)
    {
        RequestWrapper requestwrapper;
        boolean flag;
        try
        {
            requestwrapper = new RequestWrapper(httprequest);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            log.warn("unable to build conditional request", map);
            return httprequest;
        }
        requestwrapper.resetHeaders();
        httprequest = new StringBuilder();
        flag = true;
        String s;
        for (map = map.keySet().iterator(); map.hasNext(); httprequest.append(s))
        {
            s = (String)map.next();
            if (!flag)
            {
                httprequest.append(",");
            }
            flag = false;
        }

        requestwrapper.setHeader("If-None-Match", httprequest.toString());
        return requestwrapper;
    }

    public HttpRequest buildUnconditionalRequest(HttpRequest httprequest, HttpCacheEntry httpcacheentry)
    {
        try
        {
            httpcacheentry = new RequestWrapper(httprequest);
        }
        // Misplaced declaration of an exception variable
        catch (HttpCacheEntry httpcacheentry)
        {
            log.warn("unable to build proper unconditional request", httpcacheentry);
            return httprequest;
        }
        httpcacheentry.resetHeaders();
        httpcacheentry.addHeader("Cache-Control", "no-cache");
        httpcacheentry.addHeader("Pragma", "no-cache");
        httpcacheentry.removeHeaders("If-Range");
        httpcacheentry.removeHeaders("If-Match");
        httpcacheentry.removeHeaders("If-None-Match");
        httpcacheentry.removeHeaders("If-Unmodified-Since");
        httpcacheentry.removeHeaders("If-Modified-Since");
        return httpcacheentry;
    }

}
