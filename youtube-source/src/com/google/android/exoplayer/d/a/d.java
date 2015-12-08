// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.d.a;

import android.util.Pair;
import com.google.android.exoplayer.e.a;

public final class d
{

    private static final byte a[] = {
        0, 0, 0, 1
    };
    private static final int b[] = {
        0x17700, 0x15888, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 
        11025, 8000, 7350
    };

    public static Pair a(byte abyte0[])
    {
        boolean flag = true;
        int i = abyte0[0] >> 3 & 0x1f;
        int j;
        if (i == 5 || i == 29)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j = (abyte0[i] & 7) << 1 | abyte0[i + 1] >> 7 & 1;
        if (j >= 13)
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        return Pair.create(Integer.valueOf(b[j]), Integer.valueOf(abyte0[i + 1] >> 3 & 0xf));
    }

    public static byte[] a(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[a.length + j];
        System.arraycopy(a, 0, abyte1, 0, a.length);
        System.arraycopy(abyte0, i, abyte1, a.length, j);
        return abyte1;
    }

}
