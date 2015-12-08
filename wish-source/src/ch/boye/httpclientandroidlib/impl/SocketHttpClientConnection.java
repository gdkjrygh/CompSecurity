// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl;

import ch.boye.httpclientandroidlib.HttpInetConnection;
import ch.boye.httpclientandroidlib.impl.io.SocketInputBuffer;
import ch.boye.httpclientandroidlib.impl.io.SocketOutputBuffer;
import ch.boye.httpclientandroidlib.io.SessionInputBuffer;
import ch.boye.httpclientandroidlib.io.SessionOutputBuffer;
import ch.boye.httpclientandroidlib.params.HttpConnectionParams;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;

// Referenced classes of package ch.boye.httpclientandroidlib.impl:
//            AbstractHttpClientConnection

public class SocketHttpClientConnection extends AbstractHttpClientConnection
    implements HttpInetConnection
{

    private volatile boolean open;
    private volatile Socket socket;
    private volatile boolean socketShutdown;

    public SocketHttpClientConnection()
    {
        socket = null;
    }

    private static void formatAddress(StringBuilder stringbuilder, SocketAddress socketaddress)
    {
        if (socketaddress instanceof InetSocketAddress)
        {
            InetSocketAddress inetsocketaddress = (InetSocketAddress)socketaddress;
            if (inetsocketaddress.getAddress() != null)
            {
                socketaddress = inetsocketaddress.getAddress().getHostAddress();
            } else
            {
                socketaddress = inetsocketaddress.getAddress();
            }
            stringbuilder.append(socketaddress).append(':').append(inetsocketaddress.getPort());
            return;
        } else
        {
            stringbuilder.append(socketaddress);
            return;
        }
    }

    protected void assertNotOpen()
    {
        if (open)
        {
            throw new IllegalStateException("Connection is already open");
        } else
        {
            return;
        }
    }

    protected void assertOpen()
    {
        if (!open)
        {
            throw new IllegalStateException("Connection is not open");
        } else
        {
            return;
        }
    }

    protected void bind(Socket socket1, HttpParams httpparams)
        throws IOException
    {
        if (!socketShutdown) goto _L2; else goto _L1
_L1:
        if (socket1 == null) goto _L4; else goto _L3
_L3:
        int i;
        try
        {
            socket1.shutdownOutput();
        }
        // Misplaced declaration of an exception variable
        catch (HttpParams httpparams) { }
        try
        {
            socket1.shutdownInput();
        }
        // Misplaced declaration of an exception variable
        catch (HttpParams httpparams) { }
_L6:
        socket1.close();
_L4:
        throw new InterruptedIOException("Connection already shutdown");
        httpparams;
        socket1.close();
        throw httpparams;
_L2:
        if (socket1 == null)
        {
            throw new IllegalArgumentException("Socket may not be null");
        }
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            socket = socket1;
            i = HttpConnectionParams.getSocketBufferSize(httpparams);
            init(createSessionInputBuffer(socket1, i, httpparams), createSessionOutputBuffer(socket1, i, httpparams), httpparams);
            open = true;
            return;
        }
        httpparams;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void close()
        throws IOException
    {
        if (open) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Socket socket1;
        socketShutdown = true;
        open = false;
        socket1 = socket;
        if (socket1 == null) goto _L1; else goto _L3
_L3:
        doFlush();
        Exception exception;
        try
        {
            socket1.shutdownOutput();
        }
        catch (IOException ioexception) { }
        try
        {
            socket1.shutdownInput();
        }
        catch (IOException ioexception1) { }
_L5:
        socket1.close();
        return;
        exception;
        socket1.close();
        throw exception;
        UnsupportedOperationException unsupportedoperationexception;
        unsupportedoperationexception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected SessionInputBuffer createSessionInputBuffer(Socket socket1, int i, HttpParams httpparams)
        throws IOException
    {
        return new SocketInputBuffer(socket1, i, httpparams);
    }

    protected SessionOutputBuffer createSessionOutputBuffer(Socket socket1, int i, HttpParams httpparams)
        throws IOException
    {
        return new SocketOutputBuffer(socket1, i, httpparams);
    }

    public InetAddress getLocalAddress()
    {
        if (socket != null)
        {
            return socket.getLocalAddress();
        } else
        {
            return null;
        }
    }

    public int getLocalPort()
    {
        if (socket != null)
        {
            return socket.getLocalPort();
        } else
        {
            return -1;
        }
    }

    public InetAddress getRemoteAddress()
    {
        if (socket != null)
        {
            return socket.getInetAddress();
        } else
        {
            return null;
        }
    }

    public int getRemotePort()
    {
        if (socket != null)
        {
            return socket.getPort();
        } else
        {
            return -1;
        }
    }

    protected Socket getSocket()
    {
        return socket;
    }

    public int getSocketTimeout()
    {
        int i = -1;
        if (socket != null)
        {
            try
            {
                i = socket.getSoTimeout();
            }
            catch (SocketException socketexception)
            {
                return -1;
            }
        }
        return i;
    }

    public boolean isOpen()
    {
        return open;
    }

    public void setSocketTimeout(int i)
    {
        assertOpen();
        if (socket == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        socket.setSoTimeout(i);
        return;
        SocketException socketexception;
        socketexception;
    }

    public void shutdown()
        throws IOException
    {
        Socket socket1;
        open = false;
        socketShutdown = true;
        socket1 = socket;
        if (socket1 == null) goto _L2; else goto _L1
_L1:
        Exception exception;
        try
        {
            socket1.shutdownOutput();
        }
        catch (IOException ioexception) { }
        try
        {
            socket1.shutdownInput();
        }
        catch (IOException ioexception1) { }
_L4:
        socket1.close();
_L2:
        return;
        exception;
        socket1.close();
        throw exception;
        UnsupportedOperationException unsupportedoperationexception;
        unsupportedoperationexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String toString()
    {
        if (socket != null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            SocketAddress socketaddress = socket.getRemoteSocketAddress();
            SocketAddress socketaddress1 = socket.getLocalSocketAddress();
            if (socketaddress != null && socketaddress1 != null)
            {
                formatAddress(stringbuilder, socketaddress1);
                stringbuilder.append("<->");
                formatAddress(stringbuilder, socketaddress);
            }
            return stringbuilder.toString();
        } else
        {
            return super.toString();
        }
    }
}
