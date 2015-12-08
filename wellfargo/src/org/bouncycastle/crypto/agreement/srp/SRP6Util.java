// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.BigIntegers;

public class SRP6Util
{

    private static BigInteger ONE = BigInteger.valueOf(1L);
    private static BigInteger ZERO = BigInteger.valueOf(0L);

    public SRP6Util()
    {
    }

    public static BigInteger calculateK(Digest digest, BigInteger biginteger, BigInteger biginteger1)
    {
        return hashPaddedPair(digest, biginteger, biginteger, biginteger1);
    }

    public static BigInteger calculateU(Digest digest, BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        return hashPaddedPair(digest, biginteger, biginteger1, biginteger2);
    }

    public static BigInteger calculateX(Digest digest, BigInteger biginteger, byte abyte0[], byte abyte1[], byte abyte2[])
    {
        biginteger = new byte[digest.getDigestSize()];
        digest.update(abyte1, 0, abyte1.length);
        digest.update((byte)58);
        digest.update(abyte2, 0, abyte2.length);
        digest.doFinal(biginteger, 0);
        digest.update(abyte0, 0, abyte0.length);
        digest.update(biginteger, 0, biginteger.length);
        digest.doFinal(biginteger, 0);
        return new BigInteger(1, biginteger);
    }

    public static BigInteger generatePrivateValue(Digest digest, BigInteger biginteger, BigInteger biginteger1, SecureRandom securerandom)
    {
        int i = Math.min(256, biginteger.bitLength() / 2);
        return BigIntegers.createRandomInRange(ONE.shiftLeft(i - 1), biginteger.subtract(ONE), securerandom);
    }

    private static byte[] getPadded(BigInteger biginteger, int i)
    {
        biginteger = BigIntegers.asUnsignedByteArray(biginteger);
        if (biginteger.length < i)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(biginteger, 0, abyte0, i - biginteger.length, biginteger.length);
            return abyte0;
        } else
        {
            return biginteger;
        }
    }

    private static BigInteger hashPaddedPair(Digest digest, BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        int i = (biginteger.bitLength() + 7) / 8;
        biginteger = getPadded(biginteger1, i);
        biginteger1 = getPadded(biginteger2, i);
        digest.update(biginteger, 0, biginteger.length);
        digest.update(biginteger1, 0, biginteger1.length);
        biginteger = new byte[digest.getDigestSize()];
        digest.doFinal(biginteger, 0);
        return new BigInteger(1, biginteger);
    }

    public static BigInteger validatePublicValue(BigInteger biginteger, BigInteger biginteger1)
    {
        biginteger = biginteger1.mod(biginteger);
        if (biginteger.equals(ZERO))
        {
            throw new CryptoException("Invalid public value: 0");
        } else
        {
            return biginteger;
        }
    }

}
