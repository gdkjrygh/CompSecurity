// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;

public class SHA3Digest
    implements ExtendedDigest
{

    private static int KeccakRhoOffsets[] = keccakInitializeRhoOffsets();
    private static long KeccakRoundConstants[] = keccakInitializeRoundConstants();
    long C[];
    private int bitsAvailableForSqueezing;
    private int bitsInQueue;
    long chiC[];
    private byte chunk[];
    private byte dataQueue[];
    private int fixedOutputLength;
    private byte oneByte[];
    private int rate;
    private boolean squeezing;
    private byte state[];
    long tempA[];

    public SHA3Digest()
    {
        state = new byte[200];
        dataQueue = new byte[192];
        C = new long[5];
        tempA = new long[25];
        chiC = new long[5];
        init(0);
    }

    public SHA3Digest(int i)
    {
        state = new byte[200];
        dataQueue = new byte[192];
        C = new long[5];
        tempA = new long[25];
        chiC = new long[5];
        init(i);
    }

    public SHA3Digest(SHA3Digest sha3digest)
    {
        state = new byte[200];
        dataQueue = new byte[192];
        C = new long[5];
        tempA = new long[25];
        chiC = new long[5];
        System.arraycopy(sha3digest.state, 0, state, 0, sha3digest.state.length);
        System.arraycopy(sha3digest.dataQueue, 0, dataQueue, 0, sha3digest.dataQueue.length);
        rate = sha3digest.rate;
        bitsInQueue = sha3digest.bitsInQueue;
        fixedOutputLength = sha3digest.fixedOutputLength;
        squeezing = sha3digest.squeezing;
        bitsAvailableForSqueezing = sha3digest.bitsAvailableForSqueezing;
        chunk = Arrays.clone(sha3digest.chunk);
        oneByte = Arrays.clone(sha3digest.oneByte);
    }

    private void KeccakAbsorb(byte abyte0[], byte abyte1[], int i)
    {
        keccakPermutationAfterXor(abyte0, abyte1, i);
    }

    private void KeccakExtract(byte abyte0[], byte abyte1[], int i)
    {
        System.arraycopy(abyte0, 0, abyte1, 0, i * 8);
    }

    private void KeccakExtract1024bits(byte abyte0[], byte abyte1[])
    {
        System.arraycopy(abyte0, 0, abyte1, 0, 128);
    }

    private static boolean LFSR86540(byte abyte0[])
    {
        boolean flag;
        if ((abyte0[0] & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((abyte0[0] & 0x80) != 0)
        {
            abyte0[0] = (byte)(abyte0[0] << 1 ^ 0x71);
            return flag;
        } else
        {
            abyte0[0] = (byte)(abyte0[0] << 1);
            return flag;
        }
    }

    private void absorb(byte abyte0[], int i, long l)
    {
        if (bitsInQueue % 8 != 0)
        {
            throw new IllegalStateException("attempt to absorb with odd length queue.");
        }
        if (squeezing)
        {
            throw new IllegalStateException("attempt to absorb while squeezing.");
        }
        long l1 = 0L;
        do
        {
            if (l1 >= l)
            {
                break;
            }
            if (bitsInQueue == 0 && l >= (long)rate && l1 <= l - (long)rate)
            {
                long l4 = (l - l1) / (long)rate;
                for (long l2 = 0L; l2 < l4; l2++)
                {
                    System.arraycopy(abyte0, (int)((long)i + l1 / 8L + (long)chunk.length * l2), chunk, 0, chunk.length);
                    KeccakAbsorb(state, chunk, chunk.length);
                }

                l1 = (long)rate * l4 + l1;
            } else
            {
                int k = (int)(l - l1);
                int j = k;
                if (bitsInQueue + k > rate)
                {
                    j = rate - bitsInQueue;
                }
                k = j % 8;
                j -= k;
                System.arraycopy(abyte0, (int)(l1 / 8L) + i, dataQueue, bitsInQueue / 8, j / 8);
                bitsInQueue = bitsInQueue + j;
                long l3 = (long)j + l1;
                if (bitsInQueue == rate)
                {
                    absorbQueue();
                }
                l1 = l3;
                if (k > 0)
                {
                    dataQueue[bitsInQueue / 8] = (byte)((1 << k) - 1 & abyte0[(int)(l3 / 8L) + i]);
                    bitsInQueue = bitsInQueue + k;
                    l1 = l3 + (long)k;
                }
            }
        } while (true);
    }

    private void absorbQueue()
    {
        KeccakAbsorb(state, dataQueue, rate / 8);
        bitsInQueue = 0;
    }

    private void chi(long al[])
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                chiC[j] = al[i * 5 + j] ^ ~al[(j + 1) % 5 + i * 5] & al[(j + 2) % 5 + i * 5];
            }

            for (int k = 0; k < 5; k++)
            {
                al[i * 5 + k] = chiC[k];
            }

        }

    }

    private void clearDataQueueSection(int i, int j)
    {
        for (int k = i; k != i + j; k++)
        {
            dataQueue[k] = 0;
        }

    }

    private void doUpdate(byte abyte0[], int i, long l)
    {
        if (l % 8L == 0L)
        {
            absorb(abyte0, i, l);
            return;
        } else
        {
            absorb(abyte0, i, l - l % 8L);
            absorb(new byte[] {
                (byte)(abyte0[(int)(l / 8L) + i] >> (int)(8L - l % 8L))
            }, i, l % 8L);
            return;
        }
    }

    private void fromBytesToWords(long al[], byte abyte0[])
    {
        for (int i = 0; i < 25; i++)
        {
            al[i] = 0L;
            for (int j = 0; j < 8; j++)
            {
                al[i] = al[i] | ((long)abyte0[i * 8 + j] & 255L) << j * 8;
            }

        }

    }

    private void fromWordsToBytes(byte abyte0[], long al[])
    {
        for (int i = 0; i < 25; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                abyte0[i * 8 + j] = (byte)(int)(al[i] >>> j * 8 & 255L);
            }

        }

    }

    private void init(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException("bitLength must be one of 224, 256, 384, or 512.");

        case 0: // '\0'
        case 288: 
            initSponge(1024, 576);
            return;

        case 224: 
            initSponge(1152, 448);
            return;

        case 256: 
            initSponge(1088, 512);
            return;

        case 384: 
            initSponge(832, 768);
            return;

        case 512: 
            initSponge(576, 1024);
            break;
        }
    }

    private void initSponge(int i, int j)
    {
        if (i + j != 1600)
        {
            throw new IllegalStateException("rate + capacity != 1600");
        }
        if (i <= 0 || i >= 1600 || i % 64 != 0)
        {
            throw new IllegalStateException("invalid rate value");
        } else
        {
            rate = i;
            fixedOutputLength = 0;
            Arrays.fill(state, (byte)0);
            Arrays.fill(dataQueue, (byte)0);
            bitsInQueue = 0;
            squeezing = false;
            bitsAvailableForSqueezing = 0;
            fixedOutputLength = j / 2;
            chunk = new byte[i / 8];
            oneByte = new byte[1];
            return;
        }
    }

    private void iota(long al[], int i)
    {
        al[0] = al[0] ^ KeccakRoundConstants[i];
    }

    private static int[] keccakInitializeRhoOffsets()
    {
        int k = 0;
        int ai[] = new int[25];
        ai[0] = 0;
        int j = 1;
        int i = 0;
        do
        {
            int l = i;
            if (k < 24)
            {
                ai[j % 5 + (l % 5) * 5] = (((k + 1) * (k + 2)) / 2) % 64;
                i = (l * 3 + j * 2) % 5;
                k++;
                j = (j * 0 + l * 1) % 5;
            } else
            {
                return ai;
            }
        } while (true);
    }

    private static long[] keccakInitializeRoundConstants()
    {
        long al[] = new long[24];
        for (int i = 0; i < 24; i++)
        {
            al[i] = 0L;
            for (int j = 0; j < 7; j++)
            {
                if (LFSR86540(new byte[] {
    1
}))
                {
                    al[i] = al[i] ^ 1L << (1 << j) - 1;
                }
            }

        }

        return al;
    }

    private void keccakPermutation(byte abyte0[])
    {
        long al[] = new long[abyte0.length / 8];
        fromBytesToWords(al, abyte0);
        keccakPermutationOnWords(al);
        fromWordsToBytes(abyte0, al);
    }

    private void keccakPermutationAfterXor(byte abyte0[], byte abyte1[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            abyte0[j] = (byte)(abyte0[j] ^ abyte1[j]);
        }

        keccakPermutation(abyte0);
    }

    private void keccakPermutationOnWords(long al[])
    {
        for (int i = 0; i < 24; i++)
        {
            theta(al);
            rho(al);
            pi(al);
            chi(al);
            iota(al, i);
        }

    }

    private void padAndSwitchToSqueezingPhase()
    {
        byte abyte1[];
        int j;
        if (bitsInQueue + 1 == rate)
        {
            byte abyte0[] = dataQueue;
            int i = bitsInQueue / 8;
            abyte0[i] = (byte)(abyte0[i] | 1 << bitsInQueue % 8);
            absorbQueue();
            clearDataQueueSection(0, rate / 8);
        } else
        {
            clearDataQueueSection((bitsInQueue + 7) / 8, rate / 8 - (bitsInQueue + 7) / 8);
            byte abyte2[] = dataQueue;
            int k = bitsInQueue / 8;
            abyte2[k] = (byte)(abyte2[k] | 1 << bitsInQueue % 8);
        }
        abyte1 = dataQueue;
        j = (rate - 1) / 8;
        abyte1[j] = (byte)(abyte1[j] | 1 << (rate - 1) % 8);
        absorbQueue();
        if (rate == 1024)
        {
            KeccakExtract1024bits(state, dataQueue);
            bitsAvailableForSqueezing = 1024;
        } else
        {
            KeccakExtract(state, dataQueue, rate / 64);
            bitsAvailableForSqueezing = rate;
        }
        squeezing = true;
    }

    private void pi(long al[])
    {
        System.arraycopy(al, 0, tempA, 0, tempA.length);
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                al[((i * 2 + j * 3) % 5) * 5 + j] = tempA[j * 5 + i];
            }

        }

    }

    private void rho(long al[])
    {
        for (int i = 0; i < 5; i++)
        {
            int j = 0;
            while (j < 5) 
            {
                int k = i + j * 5;
                long l;
                if (KeccakRhoOffsets[k] != 0)
                {
                    l = al[k] << KeccakRhoOffsets[k] ^ al[k] >>> 64 - KeccakRhoOffsets[k];
                } else
                {
                    l = al[k];
                }
                al[k] = l;
                j++;
            }
        }

    }

    private void squeeze(byte abyte0[], int i, long l)
    {
        if (!squeezing)
        {
            padAndSwitchToSqueezingPhase();
        }
        if (l % 8L != 0L)
        {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        long l1 = 0L;
        while (l1 < l) 
        {
            if (bitsAvailableForSqueezing == 0)
            {
                keccakPermutation(state);
                int j;
                int k;
                if (rate == 1024)
                {
                    KeccakExtract1024bits(state, dataQueue);
                    bitsAvailableForSqueezing = 1024;
                } else
                {
                    KeccakExtract(state, dataQueue, rate / 64);
                    bitsAvailableForSqueezing = rate;
                }
            }
            k = bitsAvailableForSqueezing;
            j = k;
            if ((long)k > l - l1)
            {
                j = (int)(l - l1);
            }
            System.arraycopy(dataQueue, (rate - bitsAvailableForSqueezing) / 8, abyte0, (int)(l1 / 8L) + i, j / 8);
            bitsAvailableForSqueezing = bitsAvailableForSqueezing - j;
            l1 = (long)j + l1;
        }
    }

    private void theta(long al[])
    {
        for (int i = 0; i < 5; i++)
        {
            C[i] = 0L;
            for (int k = 0; k < 5; k++)
            {
                long al1[] = C;
                al1[i] = al1[i] ^ al[k * 5 + i];
            }

        }

        for (int j = 0; j < 5; j++)
        {
            long l1 = C[(j + 1) % 5];
            long l2 = C[(j + 1) % 5];
            long l3 = C[(j + 4) % 5];
            for (int l = 0; l < 5; l++)
            {
                int i1 = l * 5 + j;
                al[i1] = al[i1] ^ (l1 << 1 ^ l2 >>> 63 ^ l3);
            }

        }

    }

    public int doFinal(byte abyte0[], int i)
    {
        squeeze(abyte0, i, fixedOutputLength);
        reset();
        return getDigestSize();
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append("SHA3-").append(fixedOutputLength).toString();
    }

    public int getByteLength()
    {
        return rate / 8;
    }

    public int getDigestSize()
    {
        return fixedOutputLength / 8;
    }

    public void reset()
    {
        init(fixedOutputLength);
    }

    public void update(byte byte0)
    {
        oneByte[0] = byte0;
        doUpdate(oneByte, 0, 8L);
    }

    public void update(byte abyte0[], int i, int j)
    {
        doUpdate(abyte0, i, (long)j * 8L);
    }

}
