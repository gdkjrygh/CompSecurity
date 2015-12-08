// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;

import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;

public final class aj extends SelectableChannel
    implements ReadableByteChannel
{

    protected SocketChannel a;

    private aj(SocketChannel socketchannel)
    {
        a = socketchannel;
    }

    public static aj a()
    {
        return new aj(SocketChannel.open());
    }

    public final int a(ByteBuffer bytebuffer)
    {
        return a.write(bytebuffer);
    }

    public final boolean a(SocketAddress socketaddress)
    {
        return a.connect(socketaddress);
    }

    public final Socket b()
    {
        return a.socket();
    }

    public final Object blockingLock()
    {
        return a.blockingLock();
    }

    public final boolean c()
    {
        return a.isConnected();
    }

    public final SelectableChannel configureBlocking(boolean flag)
    {
        return a.configureBlocking(flag);
    }

    public final boolean d()
    {
        return a.finishConnect();
    }

    protected final void implCloseChannel()
    {
        a.close();
    }

    public final boolean isBlocking()
    {
        return a.isBlocking();
    }

    public final boolean isRegistered()
    {
        return a.isRegistered();
    }

    public final SelectionKey keyFor(Selector selector)
    {
        return a.keyFor(selector);
    }

    public final SelectorProvider provider()
    {
        return a.provider();
    }

    public final int read(ByteBuffer bytebuffer)
    {
        return a.read(bytebuffer);
    }

    public final SelectionKey register(Selector selector, int i, Object obj)
    {
        return a.register(selector, i, obj);
    }

    public final int validOps()
    {
        return a.validOps();
    }
}
