// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn.scheme;

import ch.boye.httpclientandroidlib.conn.ConnectTimeoutException;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

// Referenced classes of package ch.boye.httpclientandroidlib.conn.scheme:
//            SchemeLayeredSocketFactory, LayeredSchemeSocketFactory

class SchemeLayeredSocketFactoryAdaptor2
    implements SchemeLayeredSocketFactory
{

    private final LayeredSchemeSocketFactory factory;

    SchemeLayeredSocketFactoryAdaptor2(LayeredSchemeSocketFactory layeredschemesocketfactory)
    {
        factory = layeredschemesocketfactory;
    }

    public Socket connectSocket(Socket socket, InetSocketAddress inetsocketaddress, InetSocketAddress inetsocketaddress1, HttpParams httpparams)
        throws IOException, UnknownHostException, ConnectTimeoutException
    {
        return factory.connectSocket(socket, inetsocketaddress, inetsocketaddress1, httpparams);
    }

    public Socket createLayeredSocket(Socket socket, String s, int i, HttpParams httpparams)
        throws IOException, UnknownHostException
    {
        return factory.createLayeredSocket(socket, s, i, true);
    }

    public Socket createSocket(HttpParams httpparams)
        throws IOException
    {
        return factory.createSocket(httpparams);
    }

    public boolean isSecure(Socket socket)
        throws IllegalArgumentException
    {
        return factory.isSecure(socket);
    }
}
