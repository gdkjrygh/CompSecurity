// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.Closeable;

public class OpusRecorder
    implements Closeable
{

    private long a;

    public OpusRecorder(String s)
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

    public native void prepare();

    public native void start();

    public native void stop();
}
