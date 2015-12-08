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
//            SchemeSocketFactory, SocketFactory

class SchemeSocketFactoryAdaptor
    implements SchemeSocketFactory
{

    private final SocketFactory factory;

    SchemeSocketFactoryAdaptor(SocketFactory socketfactory)
    {
        factory = socketfactory;
    }

    public Socket connectSocket(Socket socket, InetSocketAddress inetsocketaddress, InetSocketAddress inetsocketaddress1, HttpParams httpparams)
        throws IOException, UnknownHostException, ConnectTimeoutException
    {
        String s = inetsocketaddress.getHostName();
        int j = inetsocketaddress.getPort();
        inetsocketaddress = null;
        int i = 0;
        if (inetsocketaddress1 != null)
        {
            inetsocketaddress = inetsocketaddress1.getAddress();
            i = inetsocketaddress1.getPort();
        }
        return factory.connectSocket(socket, s, j, inetsocketaddress, i, httpparams);
    }

    public Socket createSocket(HttpParams httpparams)
        throws IOException
    {
        return factory.createSocket();
    }

    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof SchemeSocketFactoryAdaptor)
        {
            return factory.equals(((SchemeSocketFactoryAdaptor)obj).factory);
        } else
        {
            return factory.equals(obj);
        }
    }

    public SocketFactory getFactory()
    {
        return factory;
    }

    public int hashCode()
    {
        return factory.hashCode();
    }

    public boolean isSecure(Socket socket)
        throws IllegalArgumentException
    {
        return factory.isSecure(socket);
    }
}
