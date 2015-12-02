// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.nio.ByteBuffer;

public class VideoFrameConverter
{

    private int a;

    public VideoFrameConverter()
    {
        a = create();
    }

    private static native void configure(int i, int j, int k, int l, int i1, int j1, int k1, int l1, 
            int i2, int j2, int k2);

    private static native void convertFrame(int i, ByteBuffer bytebuffer, ByteBuffer bytebuffer1);

    private static native int create();

    private static native void release(int i);

    public static native void setLogFilePath(String s);

    public void a()
    {
        release(a);
    }

    public void a(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2)
    {
        configure(a, i, j, k, l, i1, j1, k1, l1, i2, j2);
    }

    public void a(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
    {
        convertFrame(a, bytebuffer, bytebuffer1);
    }
}
