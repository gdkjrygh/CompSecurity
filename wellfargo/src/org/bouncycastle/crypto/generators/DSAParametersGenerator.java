// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAValidationParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

public class DSAParametersGenerator
{

    private static final BigInteger ONE = BigInteger.valueOf(1L);
    private static final BigInteger TWO = BigInteger.valueOf(2L);
    private static final BigInteger ZERO = BigInteger.valueOf(0L);
    private int L;
    private int N;
    private int certainty;
    private SecureRandom random;

    public DSAParametersGenerator()
    {
    }

    private static BigInteger calculateGenerator_FIPS186_2(BigInteger biginteger, BigInteger biginteger1, SecureRandom securerandom)
    {
        biginteger1 = biginteger.subtract(ONE).divide(biginteger1);
        BigInteger biginteger2 = biginteger.subtract(TWO);
        BigInteger biginteger3;
        do
        {
            biginteger3 = BigIntegers.createRandomInRange(TWO, biginteger2, securerandom).modPow(biginteger1, biginteger);
        } while (biginteger3.bitLength() <= 1);
        return biginteger3;
    }

    private static BigInteger calculateGenerator_FIPS186_3_Unverifiable(BigInteger biginteger, BigInteger biginteger1, SecureRandom securerandom)
    {
        return calculateGenerator_FIPS186_2(biginteger, biginteger1, securerandom);
    }

    private DSAParameters generateParameters_FIPS186_2()
    {
        byte abyte0[] = new byte[20];
        byte abyte1[] = new byte[20];
        byte abyte2[] = new byte[20];
        byte abyte3[] = new byte[20];
        SHA1Digest sha1digest = new SHA1Digest();
        int l = (L - 1) / 160;
        byte abyte4[] = new byte[L / 8];
        do
        {
            BigInteger biginteger;
            do
            {
                random.nextBytes(abyte0);
                hash(sha1digest, abyte0, abyte1);
                System.arraycopy(abyte0, 0, abyte2, 0, abyte0.length);
                inc(abyte2);
                hash(sha1digest, abyte2, abyte2);
                for (int i = 0; i != abyte3.length; i++)
                {
                    abyte3[i] = (byte)(abyte1[i] ^ abyte2[i]);
                }

                abyte3[0] = (byte)(abyte3[0] | 0xffffff80);
                abyte3[19] = (byte)(abyte3[19] | 1);
                biginteger = new BigInteger(1, abyte3);
            } while (!biginteger.isProbablePrime(certainty));
            byte abyte5[] = Arrays.clone(abyte0);
            inc(abyte5);
            int j = 0;
            while (j < 4096) 
            {
                for (int k = 0; k < l; k++)
                {
                    inc(abyte5);
                    hash(sha1digest, abyte5, abyte1);
                    System.arraycopy(abyte1, 0, abyte4, abyte4.length - (k + 1) * abyte1.length, abyte1.length);
                }

                inc(abyte5);
                hash(sha1digest, abyte5, abyte1);
                System.arraycopy(abyte1, abyte1.length - (abyte4.length - abyte1.length * l), abyte4, 0, abyte4.length - abyte1.length * l);
                abyte4[0] = (byte)(abyte4[0] | 0xffffff80);
                BigInteger biginteger1 = new BigInteger(1, abyte4);
                biginteger1 = biginteger1.subtract(biginteger1.mod(biginteger.shiftLeft(1)).subtract(ONE));
                if (biginteger1.bitLength() != L || !biginteger1.isProbablePrime(certainty))
                {
                    j++;
                } else
                {
                    return new DSAParameters(biginteger1, biginteger, calculateGenerator_FIPS186_2(biginteger1, biginteger, random), new DSAValidationParameters(abyte0, j));
                }
            }
        } while (true);
    }

    private DSAParameters generateParameters_FIPS186_3()
    {
        SHA256Digest sha256digest = new SHA256Digest();
        int l = sha256digest.getDigestSize() * 8;
        byte abyte0[] = new byte[N / 8];
        int i1 = (L - 1) / l;
        int j1 = L;
        byte abyte1[] = new byte[sha256digest.getDigestSize()];
        do
        {
            BigInteger biginteger4;
            do
            {
                random.nextBytes(abyte0);
                hash(sha256digest, abyte0, abyte1);
                BigInteger biginteger = (new BigInteger(1, abyte1)).mod(ONE.shiftLeft(N - 1));
                biginteger4 = ONE.shiftLeft(N - 1).add(biginteger).add(ONE).subtract(biginteger.mod(TWO));
            } while (!biginteger4.isProbablePrime(certainty));
            byte abyte2[] = Arrays.clone(abyte0);
            int k1 = L;
            int i = 0;
            while (i < k1 * 4) 
            {
                BigInteger biginteger1 = ZERO;
                int k = 0;
                for (int j = 0; k <= i1; j += l)
                {
                    inc(abyte2);
                    hash(sha256digest, abyte2, abyte1);
                    BigInteger biginteger3 = new BigInteger(1, abyte1);
                    BigInteger biginteger2 = biginteger3;
                    if (k == i1)
                    {
                        biginteger2 = biginteger3.mod(ONE.shiftLeft((j1 - 1) % l));
                    }
                    biginteger1 = biginteger1.add(biginteger2.shiftLeft(j));
                    k++;
                }

                biginteger1 = biginteger1.add(ONE.shiftLeft(L - 1));
                biginteger1 = biginteger1.subtract(biginteger1.mod(biginteger4.shiftLeft(1)).subtract(ONE));
                if (biginteger1.bitLength() != L || !biginteger1.isProbablePrime(certainty))
                {
                    i++;
                } else
                {
                    return new DSAParameters(biginteger1, biginteger4, calculateGenerator_FIPS186_3_Unverifiable(biginteger1, biginteger4, random), new DSAValidationParameters(abyte0, i));
                }
            }
        } while (true);
    }

    private static int getDefaultN(int i)
    {
        return i <= 1024 ? 160 : 256;
    }

    private static void hash(Digest digest, byte abyte0[], byte abyte1[])
    {
        digest.update(abyte0, 0, abyte0.length);
        digest.doFinal(abyte1, 0);
    }

    private static void inc(byte abyte0[])
    {
        int i = abyte0.length - 1;
        do
        {
label0:
            {
                if (i >= 0)
                {
                    byte byte0 = (byte)(abyte0[i] + 1 & 0xff);
                    abyte0[i] = byte0;
                    if (byte0 == 0)
                    {
                        break label0;
                    }
                }
                return;
            }
            i--;
        } while (true);
    }

    private void init(int i, int j, int k, SecureRandom securerandom)
    {
        L = i;
        N = j;
        certainty = k;
        random = securerandom;
    }

    public DSAParameters generateParameters()
    {
        if (L > 1024)
        {
            return generateParameters_FIPS186_3();
        } else
        {
            return generateParameters_FIPS186_2();
        }
    }

    public void init(int i, int j, SecureRandom securerandom)
    {
        init(i, getDefaultN(i), j, securerandom);
    }

}
