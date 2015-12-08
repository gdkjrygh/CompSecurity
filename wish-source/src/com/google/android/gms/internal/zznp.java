// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class zznp
{

    private final byte zzaNG[] = new byte[256];
    private int zzaNH;
    private int zzaNI;

    public zznp(byte abyte0[])
    {
        for (int i = 0; i < 256; i++)
        {
            zzaNG[i] = (byte)i;
        }

        int k = 0;
        for (int j = 0; j < 256; j++)
        {
            k = k + zzaNG[j] + abyte0[j % abyte0.length] & 0xff;
            byte byte0 = zzaNG[j];
            zzaNG[j] = zzaNG[k];
            zzaNG[k] = byte0;
        }

        zzaNH = 0;
        zzaNI = 0;
    }

    public void zzu(byte abyte0[])
    {
        int k = zzaNH;
        int j = zzaNI;
        for (int i = 0; i < abyte0.length; i++)
        {
            k = k + 1 & 0xff;
            j = j + zzaNG[k] & 0xff;
            byte byte0 = zzaNG[k];
            zzaNG[k] = zzaNG[j];
            zzaNG[j] = byte0;
            abyte0[i] = (byte)(abyte0[i] ^ zzaNG[zzaNG[k] + zzaNG[j] & 0xff]);
        }

        zzaNH = k;
        zzaNI = j;
    }
}
