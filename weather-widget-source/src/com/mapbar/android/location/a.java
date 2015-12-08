// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import java.io.UnsupportedEncodingException;

public final class a
{

    private static final byte a[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };

    public a()
    {
    }

    public static String a(byte abyte0[], String s)
        throws UnsupportedEncodingException
    {
        byte abyte1[];
        int i;
        int l1;
        i = (abyte0.length << 2) / 3;
        abyte1 = new byte[i + (i / 76 + 3)];
        l1 = abyte0.length - abyte0.length % 3;
        int i1 = 0;
        int j = 0;
        i = 0;
        for (; j < l1; j += 3)
        {
            int j1 = i + 1;
            abyte1[i] = a[(abyte0[j] & 0xff) >> 2];
            i = j1 + 1;
            abyte1[j1] = a[(abyte0[j] & 3) << 4 | (abyte0[j + 1] & 0xff) >> 4];
            j1 = i + 1;
            abyte1[i] = a[(abyte0[j + 1] & 0xf) << 2 | (abyte0[j + 2] & 0xff) >> 6];
            i = j1 + 1;
            abyte1[j1] = a[abyte0[j + 2] & 0x3f];
            if ((i - i1) % 76 == 0 && i != 0)
            {
                int k1 = i + 1;
                abyte1[i] = 10;
                i1++;
                i = k1;
            }
        }

        abyte0.length % 3;
        JVM INSTR tableswitch 1 2: default 224
    //                   1 236
    //                   2 303;
           goto _L1 _L2 _L3
_L1:
        return new String(abyte1, 0, i, s);
_L2:
        int k = i + 1;
        abyte1[i] = a[(abyte0[l1] & 0xff) >> 2];
        i = k + 1;
        abyte1[k] = a[(abyte0[l1] & 3) << 4];
        k = i + 1;
        abyte1[i] = 61;
        i = k + 1;
        abyte1[k] = 61;
        continue; /* Loop/switch isn't completed */
_L3:
        int l = i + 1;
        abyte1[i] = a[(abyte0[l1] & 0xff) >> 2];
        i = l + 1;
        abyte1[l] = a[(abyte0[l1] & 3) << 4 | (abyte0[l1 + 1] & 0xff) >> 4];
        l = i + 1;
        abyte1[i] = a[(abyte0[l1 + 1] & 0xf) << 2];
        i = l + 1;
        abyte1[l] = 61;
        if (true) goto _L1; else goto _L4
_L4:
    }

}
