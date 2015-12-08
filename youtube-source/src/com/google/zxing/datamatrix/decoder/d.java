// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.common.b;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.common.reedsolomon.a;
import com.google.zxing.common.reedsolomon.c;

// Referenced classes of package com.google.zxing.datamatrix.decoder:
//            a, b, DecodedBitStreamParser

public final class d
{

    private final c a;

    public d()
    {
        a = new c(a.f);
    }

    public final com.google.zxing.common.d a(b b1)
    {
        b1 = new com.google.zxing.datamatrix.decoder.a(b1);
        e e = b1.a();
        b1 = com.google.zxing.datamatrix.decoder.b.a(b1.b(), e);
        int k1 = b1.length;
        int l1 = b1.length;
        int i = 0;
        int k = 0;
        for (; i < l1; i++)
        {
            k += b1[i].a();
        }

        byte abyte0[] = new byte[k];
        for (int j = 0; j < k1; j++)
        {
            com.google.zxing.datamatrix.decoder.b b2 = b1[j];
            byte abyte1[] = b2.b();
            int i2 = b2.a();
            int j2 = abyte1.length;
            int ai[] = new int[j2];
            for (int l = 0; l < j2; l++)
            {
                ai[l] = abyte1[l] & 0xff;
            }

            int i1 = abyte1.length;
            try
            {
                a.a(ai, i1 - i2);
            }
            // Misplaced declaration of an exception variable
            catch (b b1)
            {
                throw ChecksumException.getChecksumInstance();
            }
            for (i1 = 0; i1 < i2; i1++)
            {
                abyte1[i1] = (byte)ai[i1];
            }

            for (int j1 = 0; j1 < i2; j1++)
            {
                abyte0[j1 * k1 + j] = abyte1[j1];
            }

        }

        return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.a(abyte0);
    }
}
