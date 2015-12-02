// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

// Referenced classes of package org.spongycastle.crypto.modes.gcm:
//            GCMMultiplier, GCMUtil

public class Tables8kGCMMultiplier
    implements GCMMultiplier
{

    public static boolean a;
    private byte H[];
    private int M[][][];

    public Tables8kGCMMultiplier()
    {
    }

    public void init(byte abyte0[])
    {
        boolean flag = a;
        if (M != null) goto _L2; else goto _L1
_L1:
        M = (int[][][])Array.newInstance(Integer.TYPE, new int[] {
            32, 16, 4
        });
        if (!flag) goto _L3; else goto _L2
_L2:
        if (!Arrays.areEqual(H, abyte0)) goto _L3; else goto _L4
_L4:
        return;
_L3:
        int i;
        H = Arrays.clone(abyte0);
        GCMUtil.asInts(abyte0, M[1][8]);
        i = 4;
        do
        {
            if (i < 1)
            {
                break;
            }
            GCMUtil.multiplyP(M[1][i + i], M[1][i]);
            i >>= 1;
        } while (!flag);
        GCMUtil.multiplyP(M[1][1], M[0][8]);
        i = 4;
        do
        {
            if (i < 1)
            {
                break;
            }
            GCMUtil.multiplyP(M[0][i + i], M[0][i]);
            i >>= 1;
        } while (!flag);
        i = 0;
_L7:
        int j = 2;
_L11:
        int l;
        if (j < 16)
        {
            int k = 1;
            do
            {
                if (k >= j)
                {
                    break;
                }
                GCMUtil.xor(M[i][j], M[i][k], M[i][j + k]);
                k++;
            } while (!flag);
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_309;
            }
        }
        l = i + 1;
        if (l == 32) goto _L4; else goto _L5
_L5:
        i = l;
        if (l <= 1) goto _L7; else goto _L6
_L6:
        j = 8;
_L10:
        i = l;
        if (j <= 0) goto _L7; else goto _L8
_L8:
        GCMUtil.multiplyP8(M[l - 2][j], M[l][j]);
        j >>= 1;
        if (!flag) goto _L10; else goto _L9
_L9:
        i = l;
          goto _L7
        j += j;
          goto _L11
    }

    public void multiplyH(byte abyte0[])
    {
        boolean flag = a;
        int ai[] = new int[4];
        int i = 15;
        do
        {
            if (i < 0)
            {
                break;
            }
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
            i--;
        } while (!flag);
        Pack.intToBigEndian(ai, abyte0, 0);
    }
}
