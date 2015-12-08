// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class zzre
{

    private final byte zzaVH[] = new byte[256];
    private int zzaVI;
    private int zzaVJ;

    public zzre(byte abyte0[])
    {
        for (int i = 0; i < 256; i++)
        {
            zzaVH[i] = (byte)i;
        }

        int k = 0;
        for (int j = 0; j < 256; j++)
        {
            k = k + zzaVH[j] + abyte0[j % abyte0.length] & 0xff;
            byte byte0 = zzaVH[j];
            zzaVH[j] = zzaVH[k];
            zzaVH[k] = byte0;
        }

        zzaVI = 0;
        zzaVJ = 0;
    }

    public void zzy(byte abyte0[])
    {
        int k = zzaVI;
        int j = zzaVJ;
        for (int i = 0; i < abyte0.length; i++)
        {
            k = k + 1 & 0xff;
            j = j + zzaVH[k] & 0xff;
            byte byte0 = zzaVH[k];
            zzaVH[k] = zzaVH[j];
            zzaVH[j] = byte0;
            abyte0[i] = (byte)(abyte0[i] ^ zzaVH[zzaVH[k] + zzaVH[j] & 0xff]);
        }

        zzaVI = k;
        zzaVJ = j;
    }
}
