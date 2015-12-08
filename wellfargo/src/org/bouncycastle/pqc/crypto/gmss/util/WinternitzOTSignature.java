// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.gmss.util;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.Digest;

// Referenced classes of package org.bouncycastle.pqc.crypto.gmss.util:
//            GMSSRandom

public class WinternitzOTSignature
{

    private int checksumsize;
    private GMSSRandom gmssRandom;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte privateKeyOTS[][];
    private int w;

    public WinternitzOTSignature(byte abyte0[], Digest digest, int i)
    {
        w = i;
        messDigestOTS = digest;
        gmssRandom = new GMSSRandom(messDigestOTS);
        mdsize = messDigestOTS.getDigestSize();
        messagesize = (int)Math.ceil((double)(mdsize << 3) / (double)i);
        checksumsize = getLog((messagesize << i) + 1);
        keysize = messagesize + (int)Math.ceil((double)checksumsize / (double)i);
        i = keysize;
        int j = mdsize;
        privateKeyOTS = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            i, j
        });
        digest = new byte[mdsize];
        System.arraycopy(abyte0, 0, digest, 0, digest.length);
        for (i = 0; i < keysize; i++)
        {
            privateKeyOTS[i] = gmssRandom.nextSeed(digest);
        }

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

    public byte[][] getPrivateKey()
    {
        return privateKeyOTS;
    }

    public byte[] getPublicKey()
    {
        byte abyte1[] = new byte[keysize * mdsize];
        byte abyte0[] = new byte[mdsize];
        int k = w;
        for (int i = 0; i < keysize; i++)
        {
            messDigestOTS.update(privateKeyOTS[i], 0, privateKeyOTS[i].length);
            abyte0 = new byte[messDigestOTS.getDigestSize()];
            messDigestOTS.doFinal(abyte0, 0);
            for (int j = 2; j < 1 << k; j++)
            {
                messDigestOTS.update(abyte0, 0, abyte0.length);
                abyte0 = new byte[messDigestOTS.getDigestSize()];
                messDigestOTS.doFinal(abyte0, 0);
            }

            System.arraycopy(abyte0, 0, abyte1, mdsize * i, mdsize);
        }

        messDigestOTS.update(abyte1, 0, abyte1.length);
        abyte0 = new byte[messDigestOTS.getDigestSize()];
        messDigestOTS.doFinal(abyte0, 0);
        return abyte0;
    }

    public byte[] getSignature(byte abyte0[])
    {
        byte abyte1[] = new byte[keysize * mdsize];
        byte abyte2[] = new byte[mdsize];
        int i = 0;
        int j5 = 0;
        messDigestOTS.update(abyte0, 0, abyte0.length);
        abyte2 = new byte[messDigestOTS.getDigestSize()];
        messDigestOTS.doFinal(abyte2, 0);
        if (8 % w == 0)
        {
            int l8 = 8 / w;
            int i8 = (1 << w) - 1;
            abyte0 = new byte[mdsize];
            for (int l = 0; l < abyte2.length;)
            {
                int k3 = 0;
                int k2 = i;
                int i7;
                for (i = j5; k3 < l8; i += i7)
                {
                    i7 = abyte2[l] & i8;
                    System.arraycopy(privateKeyOTS[k2], 0, abyte0, 0, mdsize);
                    for (j5 = i7; j5 > 0; j5--)
                    {
                        messDigestOTS.update(abyte0, 0, abyte0.length);
                        abyte0 = new byte[messDigestOTS.getDigestSize()];
                        messDigestOTS.doFinal(abyte0, 0);
                    }

                    System.arraycopy(abyte0, 0, abyte1, mdsize * k2, mdsize);
                    abyte2[l] = (byte)(abyte2[l] >>> w);
                    k2++;
                    k3++;
                }

                l++;
                j5 = i;
                i = k2;
            }

            int l2 = (messagesize << w) - j5;
            for (int i1 = 0; i1 < checksumsize; i1 += w)
            {
                int l3 = l2 & i8;
                System.arraycopy(privateKeyOTS[i], 0, abyte0, 0, mdsize);
                for (; l3 > 0; l3--)
                {
                    messDigestOTS.update(abyte0, 0, abyte0.length);
                    abyte0 = new byte[messDigestOTS.getDigestSize()];
                    messDigestOTS.doFinal(abyte0, 0);
                }

                System.arraycopy(abyte0, 0, abyte1, mdsize * i, mdsize);
                l2 >>>= w;
                i++;
            }

        } else
        if (w < 8)
        {
            int k9 = mdsize / w;
            int i9 = (1 << w) - 1;
            abyte0 = new byte[mdsize];
            int i3 = 0;
            int i4 = 0;
            int j = 0;
            int j1 = 0;
            int l5;
            for (; i4 < k9; i4 = l5)
            {
                long l10 = 0L;
                for (int k5 = 0; k5 < w; k5++)
                {
                    l10 ^= (abyte2[i3] & 0xff) << (k5 << 3);
                    i3++;
                }

                l5 = j;
                boolean flag1 = false;
                j = j1;
                j1 = l5;
                for (l5 = ((flag1) ? 1 : 0); l5 < 8;)
                {
                    int j8 = (int)((long)i9 & l10);
                    int j7 = j1 + j8;
                    System.arraycopy(privateKeyOTS[j], 0, abyte0, 0, mdsize);
                    for (j1 = j8; j1 > 0; j1--)
                    {
                        messDigestOTS.update(abyte0, 0, abyte0.length);
                        abyte0 = new byte[messDigestOTS.getDigestSize()];
                        messDigestOTS.doFinal(abyte0, 0);
                    }

                    System.arraycopy(abyte0, 0, abyte1, mdsize * j, mdsize);
                    l10 >>>= w;
                    j++;
                    l5++;
                    j1 = j7;
                }

                l5 = i4 + 1;
                i4 = j;
                j = j1;
                j1 = i4;
            }

            int k7 = mdsize % w;
            long l11 = 0L;
            boolean flag = false;
            i4 = i3;
            for (i3 = ((flag) ? 1 : 0); i3 < k7; i3++)
            {
                l11 ^= (abyte2[i4] & 0xff) << (i3 << 3);
                i4++;
            }

            i4 = 0;
            i3 = j;
            j = j1;
            for (int k1 = i4; k1 < k7 << 3;)
            {
                int i6 = (int)((long)i9 & l11);
                int j4 = i3 + i6;
                System.arraycopy(privateKeyOTS[j], 0, abyte0, 0, mdsize);
                for (i3 = i6; i3 > 0; i3--)
                {
                    messDigestOTS.update(abyte0, 0, abyte0.length);
                    abyte0 = new byte[messDigestOTS.getDigestSize()];
                    messDigestOTS.doFinal(abyte0, 0);
                }

                System.arraycopy(abyte0, 0, abyte1, mdsize * j, mdsize);
                l11 >>>= w;
                j++;
                k1 = w + k1;
                i3 = j4;
            }

            i3 = (messagesize << w) - i3;
            for (int l1 = 0; l1 < checksumsize; l1 += w)
            {
                int k4 = i3 & i9;
                System.arraycopy(privateKeyOTS[j], 0, abyte0, 0, mdsize);
                for (; k4 > 0; k4--)
                {
                    messDigestOTS.update(abyte0, 0, abyte0.length);
                    abyte0 = new byte[messDigestOTS.getDigestSize()];
                    messDigestOTS.doFinal(abyte0, 0);
                }

                System.arraycopy(abyte0, 0, abyte1, mdsize * j, mdsize);
                i3 >>>= w;
                j++;
            }

        } else
        if (w < 57)
        {
            int j9 = mdsize;
            int l9 = w;
            int k8 = (1 << w) - 1;
            abyte0 = new byte[mdsize];
            int j3 = 0;
            int i2 = 0;
            int k = 0;
            int l7;
            for (; j3 <= (j9 << 3) - l9; j3 = l7)
            {
                int l4 = j3 >>> 3;
                l7 = j3 + w;
                long l12 = 0L;
                int j6 = 0;
                for (; l4 < l7 + 7 >>> 3; l4++)
                {
                    l12 ^= (abyte2[l4] & 0xff) << (j6 << 3);
                    j6++;
                }

                l12 = l12 >>> j3 % 8 & (long)k8;
                i2 = (int)((long)i2 + l12);
                System.arraycopy(privateKeyOTS[k], 0, abyte0, 0, mdsize);
                for (; l12 > 0L; l12--)
                {
                    messDigestOTS.update(abyte0, 0, abyte0.length);
                    abyte0 = new byte[messDigestOTS.getDigestSize()];
                    messDigestOTS.doFinal(abyte0, 0);
                }

                System.arraycopy(abyte0, 0, abyte1, mdsize * k, mdsize);
                k++;
            }

            int i5 = j3 >>> 3;
            if (i5 < mdsize)
            {
                long l13 = 0L;
                int k6 = 0;
                for (; i5 < mdsize; i5++)
                {
                    l13 ^= (abyte2[i5] & 0xff) << (k6 << 3);
                    k6++;
                }

                l13 = (long)k8 & l13 >>> j3 % 8;
                i2 = (int)((long)i2 + l13);
                System.arraycopy(privateKeyOTS[k], 0, abyte0, 0, mdsize);
                for (; l13 > 0L; l13--)
                {
                    messDigestOTS.update(abyte0, 0, abyte0.length);
                    abyte0 = new byte[messDigestOTS.getDigestSize()];
                    messDigestOTS.doFinal(abyte0, 0);
                }

                System.arraycopy(abyte0, 0, abyte1, mdsize * k, mdsize);
                k++;
            }
            j3 = messagesize;
            int l6 = w;
            i5 = 0;
            j3 = (j3 << l6) - i2;
            for (int j2 = i5; j2 < checksumsize; j2 += w)
            {
                long l14 = j3 & k8;
                System.arraycopy(privateKeyOTS[k], 0, abyte0, 0, mdsize);
                for (; l14 > 0L; l14--)
                {
                    messDigestOTS.update(abyte0, 0, abyte0.length);
                    abyte0 = new byte[messDigestOTS.getDigestSize()];
                    messDigestOTS.doFinal(abyte0, 0);
                }

                System.arraycopy(abyte0, 0, abyte1, mdsize * k, mdsize);
                j3 >>>= w;
                k++;
            }

        }
        return abyte1;
    }
}
