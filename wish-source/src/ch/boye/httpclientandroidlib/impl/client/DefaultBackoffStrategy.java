// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.client.ConnectionBackoffStrategy;
import java.net.ConnectException;
import java.net.SocketTimeoutException;

public class DefaultBackoffStrategy
    implements ConnectionBackoffStrategy
{

    public DefaultBackoffStrategy()
    {
    }

    public boolean shouldBackoff(HttpResponse httpresponse)
    {
        return httpresponse.getStatusLine().getStatusCode() == 503;
    }

    public boolean shouldBackoff(Throwable throwable)
    {
        return (throwable instanceof SocketTimeoutException) || (throwable instanceof ConnectException);
    }
}
