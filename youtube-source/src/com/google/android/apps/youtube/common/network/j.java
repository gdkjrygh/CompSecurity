// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.network;

import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSocketFactory;

// Referenced classes of package com.google.android.apps.youtube.common.network:
//            k, YouTubeHttpClient

final class j extends k
    implements LayeredSocketFactory
{

    final YouTubeHttpClient a;
    private LayeredSocketFactory c;

    private j(YouTubeHttpClient youtubehttpclient, LayeredSocketFactory layeredsocketfactory)
    {
        a = youtubehttpclient;
        super(youtubehttpclient, layeredsocketfactory, (byte)0);
        c = layeredsocketfactory;
    }

    j(YouTubeHttpClient youtubehttpclient, LayeredSocketFactory layeredsocketfactory, byte byte0)
    {
        this(youtubehttpclient, layeredsocketfactory);
    }

    public final Socket createSocket(Socket socket, String s, int i, boolean flag)
    {
        return c.createSocket(socket, s, i, flag);
    }
}
