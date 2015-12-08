// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn;

import ch.boye.httpclientandroidlib.HttpHost;
import java.net.ConnectException;

public class HttpHostConnectException extends ConnectException
{

    private static final long serialVersionUID = 0xd3aaeae66ceb1d00L;
    private final HttpHost host;

    public HttpHostConnectException(HttpHost httphost, ConnectException connectexception)
    {
        super((new StringBuilder()).append("Connection to ").append(httphost).append(" refused").toString());
        host = httphost;
        initCause(connectexception);
    }

    public HttpHost getHost()
    {
        return host;
    }
}
