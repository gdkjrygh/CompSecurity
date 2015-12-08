// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import javax.net.ssl.SSLException;

public interface WrappedByteChannel
    extends ByteChannel
{

    public abstract boolean isBlocking();

    public abstract boolean isNeedRead();

    public abstract boolean isNeedWrite();

    public abstract int readMore(ByteBuffer bytebuffer)
        throws SSLException;

    public abstract void writeMore()
        throws IOException;
}
