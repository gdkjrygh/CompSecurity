// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.util.Pack;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.modes.gcm:
//            GCMMultiplier, GCMUtil

public class Tables8kGCMMultiplier
    implements GCMMultiplier
{

    private byte H[];
    private int M[][][];

    public Tables8kGCMMultiplier()
    {
    }

    public void init(byte abyte0[])
    {
        if (M == null)
        {
            M = (int[][][])Array.newInstance(Integer.TYPE, new int[] {
                32, 16, 4
            });
            break MISSING_BLOCK_LABEL_37;
        }
        if (!Arrays.areEqual(H, abyte0)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k;
        H = Arrays.clone(abyte0);
        GCMUtil.asInts(abyte0, M[1][8]);
        for (int i = 4; i >= 1; i >>= 1)
        {
            GCMUtil.multiplyP(M[1][i + i], M[1][i]);
        }

        GCMUtil.multiplyP(M[1][1], M[0][8]);
        for (int j = 4; j >= 1; j >>= 1)
        {
            GCMUtil.multiplyP(M[0][j + j], M[0][j]);
        }

        k = 0;
_L5:
        int k1;
        for (int l = 2; l < 16; l += l)
        {
            for (int j1 = 1; j1 < l; j1++)
            {
                GCMUtil.xor(M[k][l], M[k][j1], M[k][l + j1]);
            }

        }

        k1 = k + 1;
        if (k1 == 32) goto _L1; else goto _L3
_L3:
        k = k1;
        if (k1 <= 1) goto _L5; else goto _L4
_L4:
        int i1 = 8;
_L7:
        k = k1;
        if (i1 <= 0) goto _L5; else goto _L6
_L6:
        GCMUtil.multiplyP8(M[k1 - 2][i1], M[k1][i1]);
        i1 >>= 1;
          goto _L7
    }

    public void multiplyH(byte abyte0[])
    {
        int ai[] = new int[4];
        for (int i = 15; i >= 0; i--)
        {
            int ai1[] = M[i + i][abyte0[i] & 0xf];
            ai[0] = ai[0] ^ ai1[0];
            ai[1] = ai[1] ^ ai1[1];
            ai[2] = ai[2] ^ ai1[2];
            int j = ai[3];
            ai[3] = ai1[3] ^ j;
            ai1 = M[i + i + 1][(abyte0[i] & 0xf0) >>> 4];
            ai[0] = ai[0] ^ ai1[0];
            ai[1] = ai[1] ^ ai1[1];
            ai[2] = ai[2] ^ ai1[2];
            j = ai[3];
            ai[3] = ai1[3] ^ j;
        }

        Pack.intToBigEndian(ai, abyte0, 0);
    }
}
