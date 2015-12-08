// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class zzro
{

    private final byte zzbbN[] = new byte[256];
    private int zzbbO;
    private int zzbbP;

    public zzro(byte abyte0[])
    {
        for (int i = 0; i < 256; i++)
        {
            zzbbN[i] = (byte)i;
        }

        int k = 0;
        for (int j = 0; j < 256; j++)
        {
            k = k + zzbbN[j] + abyte0[j % abyte0.length] & 0xff;
            byte byte0 = zzbbN[j];
            zzbbN[j] = zzbbN[k];
            zzbbN[k] = byte0;
        }

        zzbbO = 0;
        zzbbP = 0;
    }

    public void zzy(byte abyte0[])
    {
        int k = zzbbO;
        int j = zzbbP;
        for (int i = 0; i < abyte0.length; i++)
        {
            k = k + 1 & 0xff;
            j = j + zzbbN[k] & 0xff;
            byte byte0 = zzbbN[k];
            zzbbN[k] = zzbbN[j];
            zzbbN[j] = byte0;
            abyte0[i] = (byte)(abyte0[i] ^ zzbbN[zzbbN[k] + zzbbN[j] & 0xff]);
        }

        zzbbO = k;
        zzbbP = j;
    }
}
