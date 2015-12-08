// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.a;

import com.google.android.apps.youtube.common.L;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.impl.DefaultHttpServerConnection;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpService;

// Referenced classes of package com.google.android.apps.youtube.core.player.a:
//            b

final class d
    implements Runnable
{

    final b a;
    private final Socket b;

    public d(b b1, Socket socket)
    {
        a = b1;
        super();
        b = socket;
    }

    public final void run()
    {
        Object obj;
        L.e("New connection received");
        obj = new DefaultHttpServerConnection();
        ((DefaultHttpServerConnection) (obj)).bind(b, com.google.android.apps.youtube.core.player.a.b.b(a));
        BasicHttpContext basichttpcontext = new BasicHttpContext();
        for (; !Thread.interrupted() && ((DefaultHttpServerConnection) (obj)).isOpen(); com.google.android.apps.youtube.core.player.a.b.c(a).handleRequest(((org.apache.http.HttpServerConnection) (obj)), basichttpcontext)) { }
        break MISSING_BLOCK_LABEL_75;
        Object obj1;
        obj1;
        L.e("Connection closed");
        try
        {
            ((DefaultHttpServerConnection) (obj)).shutdown();
            return;
        }
        catch (IOException ioexception1)
        {
            return;
        }
        try
        {
            ((DefaultHttpServerConnection) (obj)).shutdown();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj1;
        if (!(obj1 instanceof SocketException) || !((IOException) (obj1)).getMessage().contains("Connection reset by peer") && !((IOException) (obj1)).getMessage().contains("Socket closed")) goto _L2; else goto _L1
_L1:
        L.e("Connection closed");
_L4:
        try
        {
            ((DefaultHttpServerConnection) (obj)).shutdown();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
_L2:
        L.a("IOException when handling a request", ((Throwable) (obj1)));
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        IOException ioexception;
        try
        {
            ((DefaultHttpServerConnection) (obj)).shutdown();
        }
        catch (IOException ioexception2) { }
        throw obj1;
        obj1;
        L.a("HTTP protocol violation", ((Throwable) (obj1)));
        try
        {
            ((DefaultHttpServerConnection) (obj)).shutdown();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            return;
        }
    }
}
