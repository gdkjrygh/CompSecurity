// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import com.google.android.exoplayer.e.k;

public final class b
{

    public byte a[];
    public byte b[];
    public int c;
    public int d[];
    public int e[];
    public int f;
    private final android.media.MediaCodec.CryptoInfo g;

    public b()
    {
        android.media.MediaCodec.CryptoInfo cryptoinfo;
        if (k.a >= 16)
        {
            cryptoinfo = new android.media.MediaCodec.CryptoInfo();
        } else
        {
            cryptoinfo = null;
        }
        g = cryptoinfo;
    }

    public final android.media.MediaCodec.CryptoInfo a()
    {
        return g;
    }

    public final void a(int i, int ai[], int ai1[], byte abyte0[], byte abyte1[], int j)
    {
        f = i;
        d = ai;
        e = ai1;
        b = abyte0;
        a = abyte1;
        c = j;
        if (k.a >= 16)
        {
            g.set(f, d, e, b, a, c);
        }
    }
}
