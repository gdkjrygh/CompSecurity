// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn.scheme;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

// Referenced classes of package ch.boye.httpclientandroidlib.conn.scheme:
//            SocketFactoryAdaptor, LayeredSocketFactory, LayeredSchemeSocketFactory

class LayeredSocketFactoryAdaptor extends SocketFactoryAdaptor
    implements LayeredSocketFactory
{

    private final LayeredSchemeSocketFactory factory;

    LayeredSocketFactoryAdaptor(LayeredSchemeSocketFactory layeredschemesocketfactory)
    {
        super(layeredschemesocketfactory);
        factory = layeredschemesocketfactory;
    }

    public Socket createSocket(Socket socket, String s, int i, boolean flag)
        throws IOException, UnknownHostException
    {
        return factory.createLayeredSocket(socket, s, i, flag);
    }
}
