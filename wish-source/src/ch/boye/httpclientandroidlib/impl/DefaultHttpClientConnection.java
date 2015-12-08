// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl;

import ch.boye.httpclientandroidlib.params.HttpConnectionParams;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.io.IOException;
import java.net.Socket;

// Referenced classes of package ch.boye.httpclientandroidlib.impl:
//            SocketHttpClientConnection

public class DefaultHttpClientConnection extends SocketHttpClientConnection
{

    public DefaultHttpClientConnection()
    {
    }

    public void bind(Socket socket, HttpParams httpparams)
        throws IOException
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("Socket may not be null");
        }
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        assertNotOpen();
        socket.setTcpNoDelay(HttpConnectionParams.getTcpNoDelay(httpparams));
        socket.setSoTimeout(HttpConnectionParams.getSoTimeout(httpparams));
        socket.setKeepAlive(HttpConnectionParams.getSoKeepalive(httpparams));
        int i = HttpConnectionParams.getLinger(httpparams);
        if (i >= 0)
        {
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            socket.setSoLinger(flag, i);
        }
        super.bind(socket, httpparams);
    }
}
