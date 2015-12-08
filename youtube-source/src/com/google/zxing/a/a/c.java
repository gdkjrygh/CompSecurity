// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.a.a;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.b;
import com.google.zxing.common.d;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.common.reedsolomon.a;

// Referenced classes of package com.google.zxing.a.a:
//            a, b

public final class c
{

    private final com.google.zxing.common.reedsolomon.c a;

    public c()
    {
        a = new com.google.zxing.common.reedsolomon.c(a.h);
    }

    private void a(byte abyte0[], int i, int j, int k, int l)
    {
        boolean flag = false;
        int k1 = j + k;
        int ai[];
        int i1;
        if (l == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        ai = new int[k1 / i1];
        for (int j1 = 0; j1 < k1; j1++)
        {
            if (l == 0 || j1 % 2 == l - 1)
            {
                ai[j1 / i1] = abyte0[j1 + i] & 0xff;
            }
        }

        try
        {
            a.a(ai, k / i1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw ChecksumException.getChecksumInstance();
        }
        for (k = ((flag) ? 1 : 0); k < j; k++)
        {
            if (l == 0 || k % 2 == l - 1)
            {
                abyte0[k + i] = (byte)ai[k / i1];
            }
        }

    }

    public final d a(b b1)
    {
        byte abyte0[];
        int i;
        abyte0 = (new com.google.zxing.a.a.a(b1)).a();
        a(abyte0, 0, 10, 10, 0);
        i = abyte0[0] & 0xf;
        i;
        JVM INSTR tableswitch 2 5: default 60
    //                   2 64
    //                   3 64
    //                   4 64
    //                   5 122;
           goto _L1 _L2 _L2 _L2 _L3
_L1:
        throw FormatException.getFormatInstance();
_L2:
        a(abyte0, 20, 84, 40, 1);
        a(abyte0, 20, 84, 40, 2);
        b1 = new byte[94];
_L5:
        System.arraycopy(abyte0, 0, b1, 0, 10);
        System.arraycopy(abyte0, 20, b1, 10, b1.length - 10);
        return com.google.zxing.a.a.b.a(b1, i);
_L3:
        a(abyte0, 20, 68, 56, 1);
        a(abyte0, 20, 68, 56, 2);
        b1 = new byte[78];
        if (true) goto _L5; else goto _L4
_L4:
    }
}
