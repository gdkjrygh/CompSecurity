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
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            bz, by

public final class bx extends SSLSocketFactory
{

    private final javax.net.ssl.SSLSocketFactory a;

    public bx()
    {
        super(null);
        bz bz1 = bz.a();
        SSLContext sslcontext = SSLContext.getInstance("TLS");
        sslcontext.init(null, new TrustManager[] {
            new by(bz1)
        }, null);
        a = sslcontext.getSocketFactory();
    }

    public final Socket connectSocket(Socket socket, String s, int i, InetAddress inetaddress, int j, HttpParams httpparams)
    {
        int l;
        if (socket == null)
        {
            socket = createSocket();
        }
        socket = (SSLSocket)socket;
        if (inetaddress != null || j > 0)
        {
            int k = j;
            if (j < 0)
            {
                k = 0;
            }
            socket.bind(new InetSocketAddress(inetaddress, k));
        }
        j = HttpConnectionParams.getConnectionTimeout(httpparams);
        l = HttpConnectionParams.getSoTimeout(httpparams);
        socket.connect(new InetSocketAddress(s, i), j);
        socket.setSoTimeout(l);
        try
        {
            SSLSocketFactory.STRICT_HOSTNAME_VERIFIER.verify(s, socket);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                socket.close();
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket) { }
            throw s;
        }
        return socket;
    }

    public final Socket createSocket()
    {
        return a.createSocket();
    }

    public final Socket createSocket(Socket socket, String s, int i, boolean flag)
    {
        int j = i;
        if (i == -1)
        {
            j = 443;
        }
        socket = (SSLSocket)a.createSocket(socket, s, j, flag);
        SSLSocketFactory.STRICT_HOSTNAME_VERIFIER.verify(s, socket);
        return socket;
    }

    public final X509HostnameVerifier getHostnameVerifier()
    {
        return SSLSocketFactory.STRICT_HOSTNAME_VERIFIER;
    }

    public final void setHostnameVerifier(X509HostnameVerifier x509hostnameverifier)
    {
        throw new IllegalArgumentException("Only strict hostname verification is supported!");
    }
}
