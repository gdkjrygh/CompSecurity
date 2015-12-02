// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.Closeable;

public class OpusPlayer
    implements Closeable
{

    private long a;

    public OpusPlayer(String s)
    {
        allocateNative(s);
    }

    private native void allocateNative(String s);

    private native void freeNative();

    public void close()
    {
        freeNative();
    }

    protected void finalize()
    {
        super.finalize();
        if (a != 0L)
        {
            freeNative();
        }
    }

    public native long getCurrentPosition();

    public native long getLength();

    public native boolean isPlaying();

    public native void pause();

    public native void prepare();

    public native void resume();

    public native void seek(long l);

    public native void start();

    public native void stop();
}
