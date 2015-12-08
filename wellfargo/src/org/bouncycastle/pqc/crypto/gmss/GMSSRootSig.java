// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.gmss;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.encoders.Hex;

public class GMSSRootSig
{

    private long big8;
    private int checksum;
    private int counter;
    private GMSSRandom gmssRandom;
    private byte hash[];
    private int height;
    private int ii;
    private int k;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte privateKeyOTS[];
    private int r;
    private byte seed[];
    private byte sign[];
    private int steps;
    private int test;
    private long test8;
    private int w;

    public GMSSRootSig(Digest digest, int i, int j)
    {
        messDigestOTS = digest;
        gmssRandom = new GMSSRandom(messDigestOTS);
        mdsize = messDigestOTS.getDigestSize();
        w = i;
        height = j;
        k = (1 << i) - 1;
        messagesize = (int)Math.ceil((double)(mdsize << 3) / (double)i);
    }

    public GMSSRootSig(Digest digest, byte abyte0[][], int ai[])
    {
        messDigestOTS = digest;
        gmssRandom = new GMSSRandom(messDigestOTS);
        counter = ai[0];
        test = ai[1];
        ii = ai[2];
        r = ai[3];
        steps = ai[4];
        keysize = ai[5];
        height = ai[6];
        w = ai[7];
        checksum = ai[8];
        mdsize = messDigestOTS.getDigestSize();
        k = (1 << w) - 1;
        messagesize = (int)Math.ceil((double)(mdsize << 3) / (double)w);
        privateKeyOTS = abyte0[0];
        seed = abyte0[1];
        hash = abyte0[2];
        sign = abyte0[3];
        test8 = (long)(abyte0[4][0] & 0xff) | (long)(abyte0[4][1] & 0xff) << 8 | (long)(abyte0[4][2] & 0xff) << 16 | (long)(abyte0[4][3] & 0xff) << 24 | (long)(abyte0[4][4] & 0xff) << 32 | (long)(abyte0[4][5] & 0xff) << 40 | (long)(abyte0[4][6] & 0xff) << 48 | (long)(abyte0[4][7] & 0xff) << 56;
        big8 = (long)(abyte0[4][8] & 0xff) | (long)(abyte0[4][9] & 0xff) << 8 | (long)(abyte0[4][10] & 0xff) << 16 | (long)(abyte0[4][11] & 0xff) << 24 | (long)(abyte0[4][12] & 0xff) << 32 | (long)(abyte0[4][13] & 0xff) << 40 | (long)(abyte0[4][14] & 0xff) << 48 | (long)(abyte0[4][15] & 0xff) << 56;
    }

    private void oneStep()
    {
        if (8 % w != 0) goto _L2; else goto _L1
_L1:
        if (test == 0)
        {
            privateKeyOTS = gmssRandom.nextSeed(seed);
            if (ii < mdsize)
            {
                test = hash[ii] & k;
                hash[ii] = (byte)(hash[ii] >>> w);
            } else
            {
                test = checksum & k;
                checksum = checksum >>> w;
            }
        } else
        if (test > 0)
        {
            messDigestOTS.update(privateKeyOTS, 0, privateKeyOTS.length);
            privateKeyOTS = new byte[messDigestOTS.getDigestSize()];
            messDigestOTS.doFinal(privateKeyOTS, 0);
            test = test - 1;
        }
        if (test == 0)
        {
            System.arraycopy(privateKeyOTS, 0, sign, counter * mdsize, mdsize);
            counter = counter + 1;
            if (counter % (8 / w) == 0)
            {
                ii = ii + 1;
            }
        }
_L4:
        return;
_L2:
        if (w >= 8)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (test == 0)
        {
            if (counter % 8 == 0 && ii < mdsize)
            {
                big8 = 0L;
                if (counter < mdsize / w << 3)
                {
                    for (int i = 0; i < w; i++)
                    {
                        big8 = big8 ^ (long)((hash[ii] & 0xff) << (i << 3));
                        ii = ii + 1;
                    }

                } else
                {
                    for (int j = 0; j < mdsize % w; j++)
                    {
                        big8 = big8 ^ (long)((hash[ii] & 0xff) << (j << 3));
                        ii = ii + 1;
                    }

                }
            }
            if (counter == messagesize)
            {
                big8 = checksum;
            }
            test = (int)(big8 & (long)k);
            privateKeyOTS = gmssRandom.nextSeed(seed);
        } else
        if (test > 0)
        {
            messDigestOTS.update(privateKeyOTS, 0, privateKeyOTS.length);
            privateKeyOTS = new byte[messDigestOTS.getDigestSize()];
            messDigestOTS.doFinal(privateKeyOTS, 0);
            test = test - 1;
        }
        if (test == 0)
        {
            System.arraycopy(privateKeyOTS, 0, sign, counter * mdsize, mdsize);
            big8 = big8 >>> w;
            counter = counter + 1;
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (w >= 57) goto _L4; else goto _L3
_L3:
        if (test8 == 0L)
        {
            big8 = 0L;
            ii = 0;
            int j1 = r;
            int i1 = r >>> 3;
            if (i1 < mdsize)
            {
                int l;
                if (r <= (mdsize << 3) - w)
                {
                    r = r + w;
                    l = r + 7 >>> 3;
                } else
                {
                    l = mdsize;
                    r = r + w;
                }
                for (; i1 < l; i1++)
                {
                    big8 = big8 ^ (long)((hash[i1] & 0xff) << (ii << 3));
                    ii = ii + 1;
                }

                big8 = big8 >>> j1 % 8;
                test8 = big8 & (long)k;
            } else
            {
                test8 = checksum & k;
                checksum = checksum >>> w;
            }
            privateKeyOTS = gmssRandom.nextSeed(seed);
        } else
        if (test8 > 0L)
        {
            messDigestOTS.update(privateKeyOTS, 0, privateKeyOTS.length);
            privateKeyOTS = new byte[messDigestOTS.getDigestSize()];
            messDigestOTS.doFinal(privateKeyOTS, 0);
            test8 = test8 - 1L;
        }
        if (test8 == 0L)
        {
            System.arraycopy(privateKeyOTS, 0, sign, counter * mdsize, mdsize);
            counter = counter + 1;
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public int getLog(int i)
    {
        int j = 1;
        for (int l = 2; l < i;)
        {
            l <<= 1;
            j++;
        }

        return j;
    }

    public byte[] getSig()
    {
        return sign;
    }

    public byte[][] getStatByte()
    {
        int i = mdsize;
        byte abyte0[][] = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            5, i
        });
        abyte0[0] = privateKeyOTS;
        abyte0[1] = seed;
        abyte0[2] = hash;
        abyte0[3] = sign;
        abyte0[4] = getStatLong();
        return abyte0;
    }

    public int[] getStatInt()
    {
        return (new int[] {
            counter, test, ii, r, steps, keysize, height, w, checksum
        });
    }

    public byte[] getStatLong()
    {
        return (new byte[] {
            (byte)(int)(test8 & 255L), (byte)(int)(test8 >> 8 & 255L), (byte)(int)(test8 >> 16 & 255L), (byte)(int)(test8 >> 24 & 255L), (byte)(int)(test8 >> 32 & 255L), (byte)(int)(test8 >> 40 & 255L), (byte)(int)(test8 >> 48 & 255L), (byte)(int)(test8 >> 56 & 255L), (byte)(int)(big8 & 255L), (byte)(int)(big8 >> 8 & 255L), 
            (byte)(int)(big8 >> 16 & 255L), (byte)(int)(big8 >> 24 & 255L), (byte)(int)(big8 >> 32 & 255L), (byte)(int)(big8 >> 40 & 255L), (byte)(int)(big8 >> 48 & 255L), (byte)(int)(big8 >> 56 & 255L)
        });
    }

    public void initSign(byte abyte0[], byte abyte1[])
    {
        hash = new byte[mdsize];
        messDigestOTS.update(abyte1, 0, abyte1.length);
        hash = new byte[messDigestOTS.getDigestSize()];
        messDigestOTS.doFinal(hash, 0);
        abyte1 = new byte[mdsize];
        System.arraycopy(hash, 0, abyte1, 0, mdsize);
        int j = 0;
        int l = 0;
        int i = 0;
        int i3 = getLog((messagesize << w) + 1);
        if (8 % w == 0)
        {
            int j1 = 8 / w;
            for (j = 0; j < mdsize; j++)
            {
                for (l = 0; l < j1;)
                {
                    byte byte0 = abyte1[j];
                    int j3 = k;
                    abyte1[j] = (byte)(abyte1[j] >>> w);
                    l++;
                    i = (byte0 & j3) + i;
                }

            }

            checksum = (messagesize << w) - i;
            l = checksum;
            j1 = 0;
            j = i;
            do
            {
                i = j;
                if (j1 >= i3)
                {
                    break;
                }
                j += k & l;
                l >>>= w;
                j1 += w;
            } while (true);
        } else
        if (w < 8)
        {
            int k2 = mdsize / w;
            l = 0;
            i = 0;
            j = 0;
            for (; l < k2; l++)
            {
                long l3 = 0L;
                for (int k1 = 0; k1 < w; k1++)
                {
                    l3 ^= (abyte1[j] & 0xff) << (k1 << 3);
                    j++;
                }

                for (int l1 = 0; l1 < 8; l1++)
                {
                    i += (int)((long)k & l3);
                    l3 >>>= w;
                }

            }

            k2 = mdsize % w;
            long l4 = 0L;
            int i2 = 0;
            l = j;
            for (j = i2; j < k2; j++)
            {
                l4 ^= (abyte1[l] & 0xff) << (j << 3);
                l++;
            }

            for (j = 0; j < k2 << 3; j += w)
            {
                i += (int)((long)k & l4);
                l4 >>>= w;
            }

            checksum = (messagesize << w) - i;
            l = checksum;
            i2 = 0;
            j = i;
            do
            {
                i = j;
                if (i2 >= i3)
                {
                    break;
                }
                j += k & l;
                l >>>= w;
                i2 += w;
            } while (true);
        } else
        {
            i = l;
            if (w < 57)
            {
                int i1 = 0;
                i = j;
                j = i1;
                int j2;
                do
                {
                    j2 = j;
                    if (j2 > (mdsize << 3) - w)
                    {
                        break;
                    }
                    j = j2 >>> 3;
                    int l2 = j2 + w;
                    long l5 = 0L;
                    i1 = 0;
                    for (; j < l2 + 7 >>> 3; j++)
                    {
                        l5 ^= (abyte1[j] & 0xff) << (i1 << 3);
                        i1++;
                    }

                    long l7 = i;
                    i = (int)((l5 >>> j2 % 8 & (long)k) + l7);
                    j = l2;
                } while (true);
                i1 = j2 >>> 3;
                j = i;
                if (i1 < mdsize)
                {
                    long l6 = 0L;
                    boolean flag = false;
                    j = i1;
                    i1 = ((flag) ? 1 : 0);
                    for (; j < mdsize; j++)
                    {
                        l6 ^= (abyte1[j] & 0xff) << (i1 << 3);
                        i1++;
                    }

                    j = (int)((long)i + (l6 >>> j2 % 8 & (long)k));
                }
                checksum = (messagesize << w) - j;
                i1 = checksum;
                j2 = 0;
                do
                {
                    i = j;
                    if (j2 >= i3)
                    {
                        break;
                    }
                    j += k & i1;
                    i1 >>>= w;
                    j2 += w;
                } while (true);
            }
        }
        keysize = messagesize + (int)Math.ceil((double)i3 / (double)w);
        steps = (int)Math.ceil((double)(keysize + i) / (double)(1 << height));
        sign = new byte[keysize * mdsize];
        counter = 0;
        test = 0;
        ii = 0;
        test8 = 0L;
        r = 0;
        privateKeyOTS = new byte[mdsize];
        seed = new byte[mdsize];
        System.arraycopy(abyte0, 0, seed, 0, mdsize);
    }

    public String toString()
    {
        String s = (new StringBuilder()).append("").append(big8).append("  ").toString();
        Object obj = new int[9];
        int ai[] = getStatInt();
        int i = mdsize;
        obj = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            5, i
        });
        byte abyte0[][] = getStatByte();
        for (int j = 0; j < 9; j++)
        {
            s = (new StringBuilder()).append(s).append(ai[j]).append(" ").toString();
        }

        for (int l = 0; l < 5; l++)
        {
            s = (new StringBuilder()).append(s).append(new String(Hex.encode(abyte0[l]))).append(" ").toString();
        }

        return s;
    }

    public boolean updateSign()
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < steps)
                {
                    if (counter < keysize)
                    {
                        oneStep();
                    }
                    if (counter != keysize)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }
}
