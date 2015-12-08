// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

public class WinternitzOTSVerify
{

    private Digest messDigestOTS;
    private int w;

    public WinternitzOTSVerify(Digest digest, int i)
    {
        w = i;
        messDigestOTS = digest;
    }

    public byte[] Verify(byte abyte0[], byte abyte1[])
    {
        int j8 = messDigestOTS.getDigestSize();
        byte abyte2[] = new byte[j8];
        messDigestOTS.update(abyte0, 0, abyte0.length);
        byte abyte5[] = new byte[messDigestOTS.getDigestSize()];
        messDigestOTS.doFinal(abyte5, 0);
        int l8 = ((j8 << 3) + (w - 1)) / w;
        int k8 = getLog((l8 << w) + 1);
        int i = (((w + k8) - 1) / w + l8) * j8;
        if (i != abyte1.length)
        {
            return null;
        }
        byte abyte4[] = new byte[i];
        int k2 = 0;
        i = 0;
        if (8 % w == 0)
        {
            int i9 = 8 / w;
            int k7 = (1 << w) - 1;
            abyte0 = new byte[j8];
            for (int k1 = 0; k1 < abyte5.length; k1++)
            {
                for (int k3 = 0; k3 < i9;)
                {
                    int j6 = abyte5[k1] & k7;
                    System.arraycopy(abyte1, i * j8, abyte0, 0, j8);
                    for (int l4 = j6; l4 < k7; l4++)
                    {
                        messDigestOTS.update(abyte0, 0, abyte0.length);
                        abyte0 = new byte[messDigestOTS.getDigestSize()];
                        messDigestOTS.doFinal(abyte0, 0);
                    }

                    System.arraycopy(abyte0, 0, abyte4, i * j8, j8);
                    abyte5[k1] = (byte)(abyte5[k1] >>> w);
                    k3++;
                    i++;
                    k2 += j6;
                }

            }

            k2 = (l8 << w) - k2;
            boolean flag = false;
            int l1 = i;
            for (int j = ((flag) ? 1 : 0); j < k8; j = w + j)
            {
                int l3 = k2 & k7;
                System.arraycopy(abyte1, l1 * j8, abyte0, 0, j8);
                for (; l3 < k7; l3++)
                {
                    messDigestOTS.update(abyte0, 0, abyte0.length);
                    abyte0 = new byte[messDigestOTS.getDigestSize()];
                    messDigestOTS.doFinal(abyte0, 0);
                }

                System.arraycopy(abyte0, 0, abyte4, l1 * j8, j8);
                k2 >>>= w;
                l1++;
            }

        } else
        if (w < 8)
        {
            int l9 = j8 / w;
            int j9 = (1 << w) - 1;
            abyte0 = new byte[j8];
            int l2 = 0;
            int i4 = 0;
            int k = 0;
            int i2 = 0;
            for (; i4 < l9; i4++)
            {
                long l10 = 0L;
                for (int i5 = 0; i5 < w; i5++)
                {
                    l10 ^= (abyte5[l2] & 0xff) << (i5 << 3);
                    l2++;
                }

                for (int j5 = 0; j5 < 8;)
                {
                    int l7 = (int)((long)j9 & l10);
                    int k6 = i2 + l7;
                    System.arraycopy(abyte1, k * j8, abyte0, 0, j8);
                    for (i2 = l7; i2 < j9; i2++)
                    {
                        messDigestOTS.update(abyte0, 0, abyte0.length);
                        abyte0 = new byte[messDigestOTS.getDigestSize()];
                        messDigestOTS.doFinal(abyte0, 0);
                    }

                    System.arraycopy(abyte0, 0, abyte4, k * j8, j8);
                    l10 >>>= w;
                    k++;
                    j5++;
                    i2 = k6;
                }

            }

            int l6 = j8 % w;
            long l11 = 0L;
            boolean flag1 = false;
            i4 = l2;
            for (l2 = ((flag1) ? 1 : 0); l2 < l6; l2++)
            {
                l11 ^= (abyte5[i4] & 0xff) << (l2 << 3);
                i4++;
            }

            i4 = 0;
            l2 = i2;
            for (i2 = i4; i2 < l6 << 3;)
            {
                int k5 = (int)((long)j9 & l11);
                i4 = l2 + k5;
                System.arraycopy(abyte1, k * j8, abyte0, 0, j8);
                for (l2 = k5; l2 < j9; l2++)
                {
                    messDigestOTS.update(abyte0, 0, abyte0.length);
                    abyte0 = new byte[messDigestOTS.getDigestSize()];
                    messDigestOTS.doFinal(abyte0, 0);
                }

                System.arraycopy(abyte0, 0, abyte4, k * j8, j8);
                l11 >>>= w;
                k++;
                i2 = w + i2;
                l2 = i4;
            }

            l2 = (l8 << w) - l2;
            i4 = 0;
            i2 = k;
            for (int l = i4; l < k8; l = w + l)
            {
                int j4 = l2 & j9;
                System.arraycopy(abyte1, i2 * j8, abyte0, 0, j8);
                for (; j4 < j9; j4++)
                {
                    messDigestOTS.update(abyte0, 0, abyte0.length);
                    abyte0 = new byte[messDigestOTS.getDigestSize()];
                    messDigestOTS.doFinal(abyte0, 0);
                }

                System.arraycopy(abyte0, 0, abyte4, i2 * j8, j8);
                l2 >>>= w;
                i2++;
            }

        } else
        if (w < 57)
        {
            int k9 = w;
            int i8 = (1 << w) - 1;
            abyte0 = new byte[j8];
            int k4 = 0;
            int i1 = 0;
            int j2 = 0;
            int i7;
            for (; k4 <= (j8 << 3) - k9; k4 = i7)
            {
                int i3 = k4 >>> 3;
                i7 = k4 + w;
                long l12 = 0L;
                int l5 = 0;
                for (; i3 < i7 + 7 >>> 3; i3++)
                {
                    l12 ^= (abyte5[i3] & 0xff) << (l5 << 3);
                    l5++;
                }

                l12 = l12 >>> k4 % 8 & (long)i8;
                j2 = (int)((long)j2 + l12);
                System.arraycopy(abyte1, i1 * j8, abyte0, 0, j8);
                for (; l12 < (long)i8; l12++)
                {
                    messDigestOTS.update(abyte0, 0, abyte0.length);
                    abyte0 = new byte[messDigestOTS.getDigestSize()];
                    messDigestOTS.doFinal(abyte0, 0);
                }

                System.arraycopy(abyte0, 0, abyte4, i1 * j8, j8);
                i1++;
            }

            int j7 = k4 >>> 3;
            byte abyte3[] = abyte0;
            int j3 = i1;
            int i6 = j2;
            if (j7 < j8)
            {
                long l13 = 0L;
                i6 = 0;
                for (j3 = j7; j3 < j8; j3++)
                {
                    l13 ^= (abyte5[j3] & 0xff) << (i6 << 3);
                    i6++;
                }

                l13 = l13 >>> k4 % 8 & (long)i8;
                i6 = (int)((long)j2 + l13);
                System.arraycopy(abyte1, i1 * j8, abyte0, 0, j8);
                for (; l13 < (long)i8; l13++)
                {
                    messDigestOTS.update(abyte0, 0, abyte0.length);
                    abyte0 = new byte[messDigestOTS.getDigestSize()];
                    messDigestOTS.doFinal(abyte0, 0);
                }

                System.arraycopy(abyte0, 0, abyte4, i1 * j8, j8);
                j3 = i1 + 1;
                abyte3 = abyte0;
            }
            i1 = w;
            j2 = (l8 << i1) - i6;
            for (int j1 = 0; j1 < k8;)
            {
                long l14 = j2 & i8;
                System.arraycopy(abyte1, j3 * j8, abyte3, 0, j8);
                for (; l14 < (long)i8; l14++)
                {
                    messDigestOTS.update(abyte3, 0, abyte3.length);
                    abyte3 = new byte[messDigestOTS.getDigestSize()];
                    messDigestOTS.doFinal(abyte3, 0);
                }

                System.arraycopy(abyte3, 0, abyte4, j3 * j8, j8);
                j2 >>>= w;
                j1 = w + j1;
                j3++;
            }

        }
        abyte0 = new byte[j8];
        messDigestOTS.update(abyte4, 0, abyte4.length);
        abyte0 = new byte[messDigestOTS.getDigestSize()];
        messDigestOTS.doFinal(abyte0, 0);
        return abyte0;
    }

    public int getLog(int i)
    {
        int j = 1;
        for (int k = 2; k < i;)
        {
            k <<= 1;
            j++;
        }

        return j;
    }

    public int getSignatureLength()
    {
        int i = messDigestOTS.getDigestSize();
        int j = ((i << 3) + (w - 1)) / w;
        return i * (j + ((getLog((j << w) + 1) + w) - 1) / w);
    }
}
