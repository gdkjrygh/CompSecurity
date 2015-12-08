// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.client.protocol.RequestAcceptEncoding;
import ch.boye.httpclientandroidlib.client.protocol.ResponseContentEncoding;
import ch.boye.httpclientandroidlib.conn.ClientConnectionManager;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.protocol.BasicHttpProcessor;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            DefaultHttpClient

public class ContentEncodingHttpClient extends DefaultHttpClient
{

    public ContentEncodingHttpClient()
    {
        this(null);
    }

    public ContentEncodingHttpClient(ClientConnectionManager clientconnectionmanager, HttpParams httpparams)
    {
        super(clientconnectionmanager, httpparams);
    }

    public ContentEncodingHttpClient(HttpParams httpparams)
    {
        this(null, httpparams);
    }

    protected BasicHttpProcessor createHttpProcessor()
    {
        BasicHttpProcessor basichttpprocessor = super.createHttpProcessor();
        basichttpprocessor.addRequestInterceptor(new RequestAcceptEncoding());
        basichttpprocessor.addResponseInterceptor(new ResponseContentEncoding());
        return basichttpprocessor;
    }
}
