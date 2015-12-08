// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib;

import java.io.IOException;

// Referenced classes of package ch.boye.httpclientandroidlib:
//            HttpConnection, HttpException, HttpResponse, HttpEntityEnclosingRequest, 
//            HttpRequest

public interface HttpClientConnection
    extends HttpConnection
{

    public abstract void flush()
        throws IOException;

    public abstract boolean isResponseAvailable(int i)
        throws IOException;

    public abstract void receiveResponseEntity(HttpResponse httpresponse)
        throws HttpException, IOException;

    public abstract HttpResponse receiveResponseHeader()
        throws HttpException, IOException;

    public abstract void sendRequestEntity(HttpEntityEnclosingRequest httpentityenclosingrequest)
        throws HttpException, IOException;

    public abstract void sendRequestHeader(HttpRequest httprequest)
        throws HttpException, IOException;
}
