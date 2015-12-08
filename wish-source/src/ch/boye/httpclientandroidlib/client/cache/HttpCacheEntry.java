// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.cache;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.ProtocolVersion;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.message.HeaderGroup;
import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package ch.boye.httpclientandroidlib.client.cache:
//            Resource

public class HttpCacheEntry
    implements Serializable
{

    private static final long serialVersionUID = 0xa89023e2a4a4d35bL;
    private final Date requestDate;
    private final Resource resource;
    private final Date responseDate;
    private final HeaderGroup responseHeaders;
    private final StatusLine statusLine;
    private final Map variantMap;

    public HttpCacheEntry(Date date, Date date1, StatusLine statusline, Header aheader[], Resource resource1)
    {
        this(date, date1, statusline, aheader, resource1, ((Map) (new HashMap())));
    }

    public HttpCacheEntry(Date date, Date date1, StatusLine statusline, Header aheader[], Resource resource1, Map map)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("Request date may not be null");
        }
        if (date1 == null)
        {
            throw new IllegalArgumentException("Response date may not be null");
        }
        if (statusline == null)
        {
            throw new IllegalArgumentException("Status line may not be null");
        }
        if (aheader == null)
        {
            throw new IllegalArgumentException("Response headers may not be null");
        }
        requestDate = date;
        responseDate = date1;
        statusLine = statusline;
        responseHeaders = new HeaderGroup();
        responseHeaders.setHeaders(aheader);
        resource = resource1;
        if (map != null)
        {
            date = new HashMap(map);
        } else
        {
            date = null;
        }
        variantMap = date;
    }

    public Header[] getAllHeaders()
    {
        return responseHeaders.getAllHeaders();
    }

    public Header getFirstHeader(String s)
    {
        return responseHeaders.getFirstHeader(s);
    }

    public Header[] getHeaders(String s)
    {
        return responseHeaders.getHeaders(s);
    }

    public ProtocolVersion getProtocolVersion()
    {
        return statusLine.getProtocolVersion();
    }

    public String getReasonPhrase()
    {
        return statusLine.getReasonPhrase();
    }

    public Date getRequestDate()
    {
        return requestDate;
    }

    public Resource getResource()
    {
        return resource;
    }

    public Date getResponseDate()
    {
        return responseDate;
    }

    public int getStatusCode()
    {
        return statusLine.getStatusCode();
    }

    public StatusLine getStatusLine()
    {
        return statusLine;
    }

    public Map getVariantMap()
    {
        return Collections.unmodifiableMap(variantMap);
    }

    public boolean hasVariants()
    {
        return getFirstHeader("Vary") != null;
    }

    public String toString()
    {
        return (new StringBuilder()).append("[request date=").append(requestDate).append("; response date=").append(responseDate).append("; statusLine=").append(statusLine).append("]").toString();
    }
}
