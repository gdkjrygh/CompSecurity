// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn;

import ch.boye.httpclientandroidlib.conn.scheme.SocketFactory;
import ch.boye.httpclientandroidlib.params.HttpConnectionParams;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package ch.boye.httpclientandroidlib.conn:
//            ConnectTimeoutException

public final class MultihomePlainSocketFactory
    implements SocketFactory
{

    private static final MultihomePlainSocketFactory DEFAULT_FACTORY = new MultihomePlainSocketFactory();

    private MultihomePlainSocketFactory()
    {
    }

    public static MultihomePlainSocketFactory getSocketFactory()
    {
        return DEFAULT_FACTORY;
    }

    public Socket connectSocket(Socket socket, String s, int i, InetAddress inetaddress, int j, HttpParams httpparams)
        throws IOException
    {
        Socket socket1;
        if (s == null)
        {
            throw new IllegalArgumentException("Target host may not be null.");
        }
        if (httpparams == null)
        {
            throw new IllegalArgumentException("Parameters may not be null.");
        }
        socket1 = socket;
        if (socket == null)
        {
            socket1 = createSocket();
        }
        if (inetaddress != null || j > 0)
        {
            int k = j;
            if (j < 0)
            {
                k = 0;
            }
            socket1.bind(new InetSocketAddress(inetaddress, k));
        }
        j = HttpConnectionParams.getConnectionTimeout(httpparams);
        socket = InetAddress.getAllByName(s);
        s = new ArrayList(socket.length);
        s.addAll(Arrays.asList(socket));
        Collections.shuffle(s);
        socket = null;
        s = s.iterator();
_L2:
        if (!s.hasNext())
        {
            break MISSING_BLOCK_LABEL_163;
        }
        inetaddress = (InetAddress)s.next();
        socket1.connect(new InetSocketAddress(inetaddress, i), j);
        if (socket != null)
        {
            throw socket;
        } else
        {
            return socket1;
        }
        socket;
        throw new ConnectTimeoutException((new StringBuilder()).append("Connect to ").append(inetaddress).append(" timed out").toString());
        socket;
        socket1 = new Socket();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Socket createSocket()
    {
        return new Socket();
    }

    public final boolean isSecure(Socket socket)
        throws IllegalArgumentException
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("Socket may not be null.");
        }
        if (socket.getClass() != java/net/Socket)
        {
            throw new IllegalArgumentException("Socket not created by this factory.");
        }
        if (socket.isClosed())
        {
            throw new IllegalArgumentException("Socket is closed.");
        } else
        {
            return false;
        }
    }

}
