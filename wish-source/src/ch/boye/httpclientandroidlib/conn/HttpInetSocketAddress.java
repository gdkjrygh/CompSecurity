// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn;

import ch.boye.httpclientandroidlib.HttpHost;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class HttpInetSocketAddress extends InetSocketAddress
{

    private static final long serialVersionUID = 0xa3b3f5ec8d72910bL;
    private final HttpHost httphost;

    public HttpInetSocketAddress(HttpHost httphost1, InetAddress inetaddress, int i)
    {
        super(inetaddress, i);
        if (httphost1 == null)
        {
            throw new IllegalArgumentException("HTTP host may not be null");
        } else
        {
            httphost = httphost1;
            return;
        }
    }

    public HttpHost getHttpHost()
    {
        return httphost;
    }

    public String toString()
    {
        return (new StringBuilder()).append(httphost.getHostName()).append(":").append(getPort()).toString();
    }
}
