// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl;

import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpResponseFactory;
import ch.boye.httpclientandroidlib.ProtocolVersion;
import ch.boye.httpclientandroidlib.ReasonPhraseCatalog;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.message.BasicHttpResponse;
import ch.boye.httpclientandroidlib.message.BasicStatusLine;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.util.Locale;

// Referenced classes of package ch.boye.httpclientandroidlib.impl:
//            EnglishReasonPhraseCatalog

public class DefaultHttpResponseFactory
    implements HttpResponseFactory
{

    protected final ReasonPhraseCatalog reasonCatalog;

    public DefaultHttpResponseFactory()
    {
        this(((ReasonPhraseCatalog) (EnglishReasonPhraseCatalog.INSTANCE)));
    }

    public DefaultHttpResponseFactory(ReasonPhraseCatalog reasonphrasecatalog)
    {
        if (reasonphrasecatalog == null)
        {
            throw new IllegalArgumentException("Reason phrase catalog must not be null.");
        } else
        {
            reasonCatalog = reasonphrasecatalog;
            return;
        }
    }

    protected Locale determineLocale(HttpContext httpcontext)
    {
        return Locale.getDefault();
    }

    public HttpResponse newHttpResponse(ProtocolVersion protocolversion, int i, HttpContext httpcontext)
    {
        if (protocolversion == null)
        {
            throw new IllegalArgumentException("HTTP version may not be null");
        } else
        {
            httpcontext = determineLocale(httpcontext);
            return new BasicHttpResponse(new BasicStatusLine(protocolversion, i, reasonCatalog.getReason(i, httpcontext)), reasonCatalog, httpcontext);
        }
    }

    public HttpResponse newHttpResponse(StatusLine statusline, HttpContext httpcontext)
    {
        if (statusline == null)
        {
            throw new IllegalArgumentException("Status line may not be null");
        } else
        {
            httpcontext = determineLocale(httpcontext);
            return new BasicHttpResponse(statusline, reasonCatalog, httpcontext);
        }
    }
}
