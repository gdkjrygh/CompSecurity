// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.RequestLine;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            DefaultHttpRequestRetryHandler

public class StandardHttpRequestRetryHandler extends DefaultHttpRequestRetryHandler
{

    private final Map idempotentMethods;

    public StandardHttpRequestRetryHandler()
    {
        this(3, false);
    }

    public StandardHttpRequestRetryHandler(int i, boolean flag)
    {
        super(i, flag);
        idempotentMethods = new ConcurrentHashMap();
        idempotentMethods.put("GET", Boolean.TRUE);
        idempotentMethods.put("HEAD", Boolean.TRUE);
        idempotentMethods.put("PUT", Boolean.TRUE);
        idempotentMethods.put("DELETE", Boolean.TRUE);
        idempotentMethods.put("OPTIONS", Boolean.TRUE);
        idempotentMethods.put("TRACE", Boolean.TRUE);
    }

    protected boolean handleAsIdempotent(HttpRequest httprequest)
    {
        httprequest = httprequest.getRequestLine().getMethod().toUpperCase(Locale.US);
        httprequest = (Boolean)idempotentMethods.get(httprequest);
        return httprequest != null && httprequest.booleanValue();
    }
}
