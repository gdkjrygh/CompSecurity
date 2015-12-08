// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.m2ts;

import android.util.SparseIntArray;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.exoplayer.ag;
import com.google.android.exoplayer.ah;
import java.nio.ByteBuffer;

final class a
{

    private static final SparseIntArray a;

    public static byte[] a(ah ah1, ag ag1)
    {
        int i = a.get(ag1.f, -1);
        byte abyte0[];
        int j;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        j = ah1.d + 7;
        abyte0 = new byte[j];
        abyte0[0] = -1;
        abyte0[1] = -15;
        abyte0[2] = (byte)(i << 2 | 0x40 | ag1.e >> 2);
        abyte0[3] = (byte)((ag1.e & 3) << 6 | j >> 11);
        abyte0[4] = (byte)(j >> 3 & 0xff);
        abyte0[5] = (byte)((j & 7) << 5 | 0x1f);
        abyte0[6] = -4;
        System.arraycopy(ah1.c.array(), 0, abyte0, 7, ah1.d);
        return abyte0;
    }

    static 
    {
        int ai[] = new int[13];
        int[] _tmp = ai;
        ai[0] = 0x17700;
        ai[1] = 0x15888;
        ai[2] = 64000;
        ai[3] = 48000;
        ai[4] = 44100;
        ai[5] = 32000;
        ai[6] = 24000;
        ai[7] = 22050;
        ai[8] = 16000;
        ai[9] = 12000;
        ai[10] = 11025;
        ai[11] = 8000;
        ai[12] = 7350;
        a = new SparseIntArray(ai.length);
        for (int i = 0; i < ai.length; i++)
        {
            a.append(ai[i], i);
        }

    }
}
