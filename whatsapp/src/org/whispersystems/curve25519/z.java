// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            p, n, R, ak, 
//            C, L, U, aX, 
//            N, q, v, h, 
//            M

public class z
{

    public static int a(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        byte abyte3[];
        int ai[];
        int ai1[];
        int ai2[];
        int ai3[];
        int ai4[];
        int ai5[];
        int ai6[];
        int i;
        int j;
        boolean flag;
        flag = p.d;
        abyte3 = new byte[32];
        ai = new int[10];
        ai1 = new int[10];
        ai2 = new int[10];
        ai3 = new int[10];
        ai4 = new int[10];
        ai5 = new int[10];
        ai6 = new int[10];
        i = 0;
        do
        {
            if (i >= 32)
            {
                break;
            }
            abyte3[i] = abyte1[i];
            i++;
        } while (!flag);
        n.a(ai, abyte2);
        R.a(ai1);
        ak.a(ai2);
        C.a(ai3, ai);
        R.a(ai4);
        i = 0;
        j = 254;
_L3:
        int k;
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_376;
        }
        k = abyte3[j / 8] >>> (j & 7) & 1;
        i ^= k;
        L.a(ai1, ai3, i);
        L.a(ai2, ai4, i);
        U.a(ai5, ai3, ai4);
        U.a(ai6, ai1, ai2);
        aX.a(ai1, ai1, ai2);
        aX.a(ai2, ai3, ai4);
        N.a(ai4, ai5, ai1);
        N.a(ai2, ai2, ai6);
        q.a(ai5, ai6);
        q.a(ai6, ai1);
        aX.a(ai3, ai4, ai2);
        U.a(ai2, ai4, ai2);
        N.a(ai1, ai6, ai5);
        U.a(ai6, ai6, ai5);
        q.a(ai2, ai2);
        v.a(ai4, ai6);
        q.a(ai3, ai3);
        aX.a(ai5, ai5, ai4);
        N.a(ai4, ai, ai2);
        N.a(ai2, ai6, ai5);
        if (!flag) goto _L2; else goto _L1
_L1:
        L.a(ai1, ai3, k);
        L.a(ai2, ai4, k);
        h.a(ai2, ai2);
        N.a(ai1, ai1, ai2);
        M.a(abyte0, ai1);
        return 0;
_L2:
        j--;
        i = k;
          goto _L3
        k = i;
          goto _L1
    }
}
