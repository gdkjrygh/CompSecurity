// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;
import javax.net.ssl.SSLException;

// Referenced classes of package com.mixpanel.android.java_websocket:
//            WrappedByteChannel

public class AbstractWrappedByteChannel
    implements WrappedByteChannel
{

    private final ByteChannel channel;

    public AbstractWrappedByteChannel(WrappedByteChannel wrappedbytechannel)
    {
        channel = wrappedbytechannel;
    }

    public AbstractWrappedByteChannel(ByteChannel bytechannel)
    {
        channel = bytechannel;
    }

    public void close()
        throws IOException
    {
        channel.close();
    }

    public boolean isBlocking()
    {
        if (channel instanceof SocketChannel)
        {
            return ((SocketChannel)channel).isBlocking();
        }
        if (channel instanceof WrappedByteChannel)
        {
            return ((WrappedByteChannel)channel).isBlocking();
        } else
        {
            return false;
        }
    }

    public boolean isNeedRead()
    {
        if (channel instanceof WrappedByteChannel)
        {
            return ((WrappedByteChannel)channel).isNeedRead();
        } else
        {
            return false;
        }
    }

    public boolean isNeedWrite()
    {
        if (channel instanceof WrappedByteChannel)
        {
            return ((WrappedByteChannel)channel).isNeedWrite();
        } else
        {
            return false;
        }
    }

    public boolean isOpen()
    {
        return channel.isOpen();
    }

    public int read(ByteBuffer bytebuffer)
        throws IOException
    {
        return channel.read(bytebuffer);
    }

    public int readMore(ByteBuffer bytebuffer)
        throws SSLException
    {
        if (channel instanceof WrappedByteChannel)
        {
            return ((WrappedByteChannel)channel).readMore(bytebuffer);
        } else
        {
            return 0;
        }
    }

    public int write(ByteBuffer bytebuffer)
        throws IOException
    {
        return channel.write(bytebuffer);
    }

    public void writeMore()
        throws IOException
    {
        if (channel instanceof WrappedByteChannel)
        {
            ((WrappedByteChannel)channel).writeMore();
        }
    }
}
