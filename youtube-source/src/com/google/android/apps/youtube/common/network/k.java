// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.network;

import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.google.android.apps.youtube.common.network:
//            YouTubeHttpClient

class k
    implements SocketFactory
{

    private SocketFactory a;
    final YouTubeHttpClient b;

    private k(YouTubeHttpClient youtubehttpclient, SocketFactory socketfactory)
    {
        b = youtubehttpclient;
        super();
        a = socketfactory;
    }

    k(YouTubeHttpClient youtubehttpclient, SocketFactory socketfactory, byte byte0)
    {
        this(youtubehttpclient, socketfactory);
    }

    public final Socket connectSocket(Socket socket, String s, int i, InetAddress inetaddress, int j, HttpParams httpparams)
    {
        YouTubeHttpClient.a(b).set(Boolean.TRUE);
        return a.connectSocket(socket, s, i, inetaddress, j, httpparams);
    }

    public final Socket createSocket()
    {
        return a.createSocket();
    }

    public final boolean isSecure(Socket socket)
    {
        return a.isSecure(socket);
    }
}
