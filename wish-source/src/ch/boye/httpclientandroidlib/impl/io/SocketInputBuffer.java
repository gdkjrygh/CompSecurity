// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.io;

import ch.boye.httpclientandroidlib.io.EofSensor;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.io:
//            AbstractSessionInputBuffer

public class SocketInputBuffer extends AbstractSessionInputBuffer
    implements EofSensor
{

    private boolean eof;
    private final Socket socket;

    public SocketInputBuffer(Socket socket1, int i, HttpParams httpparams)
        throws IOException
    {
        if (socket1 == null)
        {
            throw new IllegalArgumentException("Socket may not be null");
        }
        socket = socket1;
        eof = false;
        int j = i;
        if (i < 0)
        {
            j = socket1.getReceiveBufferSize();
        }
        i = j;
        if (j < 1024)
        {
            i = 1024;
        }
        init(socket1.getInputStream(), i, httpparams);
    }

    protected int fillBuffer()
        throws IOException
    {
        int i = super.fillBuffer();
        boolean flag;
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        eof = flag;
        return i;
    }

    public boolean isDataAvailable(int i)
        throws IOException
    {
        int j;
        boolean flag;
        boolean flag1 = hasBufferedData();
        flag = flag1;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        j = socket.getSoTimeout();
        socket.setSoTimeout(i);
        fillBuffer();
        flag = hasBufferedData();
        socket.setSoTimeout(j);
        return flag;
        Object obj;
        obj;
        throw obj;
        obj;
        socket.setSoTimeout(j);
        throw obj;
    }

    public boolean isEof()
    {
        return eof;
    }
}
