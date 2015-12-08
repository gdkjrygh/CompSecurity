// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.util.Pack;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.modes.gcm:
//            GCMMultiplier, GCMUtil

public class Tables64kGCMMultiplier
    implements GCMMultiplier
{

    private byte H[];
    private int M[][][];

    public Tables64kGCMMultiplier()
    {
    }

    public void init(byte abyte0[])
    {
        if (M == null)
        {
            M = (int[][][])Array.newInstance(Integer.TYPE, new int[] {
                16, 256, 4
            });
            break MISSING_BLOCK_LABEL_38;
        }
        if (!Arrays.areEqual(H, abyte0)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j;
        H = Arrays.clone(abyte0);
        GCMUtil.asInts(abyte0, M[0][128]);
        for (int i = 64; i >= 1; i >>= 1)
        {
            GCMUtil.multiplyP(M[0][i + i], M[0][i]);
        }

        j = 0;
_L5:
        int j1;
        for (int k = 2; k < 256; k += k)
        {
            for (int i1 = 1; i1 < k; i1++)
            {
                GCMUtil.xor(M[j][k], M[j][i1], M[j][k + i1]);
            }

        }

        j1 = j + 1;
        if (j1 == 16) goto _L1; else goto _L3
_L3:
        int l = 128;
_L6:
        j = j1;
        if (l <= 0) goto _L5; else goto _L4
_L4:
        GCMUtil.multiplyP8(M[j1 - 1][l], M[j1][l]);
        l >>= 1;
          goto _L6
    }

    public void multiplyH(byte abyte0[])
    {
        int ai[] = new int[4];
        for (int i = 15; i >= 0; i--)
        {
            int ai1[] = M[i][abyte0[i] & 0xff];
            ai[0] = ai[0] ^ ai1[0];
            ai[1] = ai[1] ^ ai1[1];
            ai[2] = ai[2] ^ ai1[2];
            int j = ai[3];
            ai[3] = ai1[3] ^ j;
        }

        Pack.intToBigEndian(ai, abyte0, 0);
    }
}
