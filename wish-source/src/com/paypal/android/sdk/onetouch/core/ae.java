// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            af

public class ae
    implements LayeredSocketFactory
{

    private SSLContext a;

    public ae()
    {
        a = null;
    }

    private static SSLContext a()
    {
        SSLContext sslcontext;
        try
        {
            sslcontext = SSLContext.getInstance("TLS");
            sslcontext.init(null, new TrustManager[] {
                new af(null)
            }, null);
        }
        catch (Exception exception)
        {
            throw new IOException(exception.getLocalizedMessage());
        }
        return sslcontext;
    }

    private SSLContext b()
    {
        if (a == null)
        {
            a = a();
        }
        return a;
    }

    public Socket connectSocket(Socket socket, String s, int i, InetAddress inetaddress, int j, HttpParams httpparams)
    {
        int k = HttpConnectionParams.getConnectionTimeout(httpparams);
        int l = HttpConnectionParams.getSoTimeout(httpparams);
        s = new InetSocketAddress(s, i);
        if (socket == null)
        {
            socket = createSocket();
        }
        socket = (SSLSocket)socket;
        if (inetaddress != null || j > 0)
        {
            i = j;
            if (j < 0)
            {
                i = 0;
            }
            socket.bind(new InetSocketAddress(inetaddress, i));
        }
        socket.connect(s, k);
        socket.setSoTimeout(l);
        return socket;
    }

    public Socket createSocket()
    {
        return b().getSocketFactory().createSocket();
    }

    public Socket createSocket(Socket socket, String s, int i, boolean flag)
    {
        return b().getSocketFactory().createSocket(socket, s, i, flag);
    }

    public boolean equals(Object obj)
    {
        return obj != null && getClass() == obj.getClass();
    }

    public int hashCode()
    {
        return com/paypal/android/sdk/onetouch/core/ae.hashCode();
    }

    public boolean isSecure(Socket socket)
    {
        return true;
    }
}
