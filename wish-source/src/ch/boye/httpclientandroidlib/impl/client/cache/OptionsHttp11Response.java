// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderIterator;
import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpVersion;
import ch.boye.httpclientandroidlib.ProtocolVersion;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.message.AbstractHttpMessage;
import ch.boye.httpclientandroidlib.message.BasicStatusLine;
import ch.boye.httpclientandroidlib.message.HeaderGroup;
import ch.boye.httpclientandroidlib.params.BasicHttpParams;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.util.Locale;

final class OptionsHttp11Response extends AbstractHttpMessage
    implements HttpResponse
{

    private final StatusLine statusLine;
    private final ProtocolVersion version;

    OptionsHttp11Response()
    {
        statusLine = new BasicStatusLine(HttpVersion.HTTP_1_1, 501, "");
        version = HttpVersion.HTTP_1_1;
    }

    public void addHeader(Header header)
    {
    }

    public void addHeader(String s, String s1)
    {
    }

    public boolean containsHeader(String s)
    {
        return headergroup.containsHeader(s);
    }

    public Header[] getAllHeaders()
    {
        return headergroup.getAllHeaders();
    }

    public HttpEntity getEntity()
    {
        return null;
    }

    public Header getFirstHeader(String s)
    {
        return headergroup.getFirstHeader(s);
    }

    public Header[] getHeaders(String s)
    {
        return headergroup.getHeaders(s);
    }

    public Header getLastHeader(String s)
    {
        return headergroup.getLastHeader(s);
    }

    public Locale getLocale()
    {
        return null;
    }

    public HttpParams getParams()
    {
        if (params == null)
        {
            params = new BasicHttpParams();
        }
        return params;
    }

    public ProtocolVersion getProtocolVersion()
    {
        return version;
    }

    public StatusLine getStatusLine()
    {
        return statusLine;
    }

    public HeaderIterator headerIterator()
    {
        return headergroup.iterator();
    }

    public HeaderIterator headerIterator(String s)
    {
        return headergroup.iterator(s);
    }

    public void removeHeader(Header header)
    {
    }

    public void removeHeaders(String s)
    {
    }

    public void setEntity(HttpEntity httpentity)
    {
    }

    public void setHeader(Header header)
    {
    }

    public void setHeader(String s, String s1)
    {
    }

    public void setHeaders(Header aheader[])
    {
    }

    public void setLocale(Locale locale)
    {
    }

    public void setParams(HttpParams httpparams)
    {
    }

    public void setReasonPhrase(String s)
        throws IllegalStateException
    {
    }

    public void setStatusCode(int i)
        throws IllegalStateException
    {
    }

    public void setStatusLine(ProtocolVersion protocolversion, int i)
    {
    }

    public void setStatusLine(ProtocolVersion protocolversion, int i, String s)
    {
    }

    public void setStatusLine(StatusLine statusline)
    {
    }
}
