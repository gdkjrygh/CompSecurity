// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.jpake;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Strings;

public class JPAKEUtil
{

    static final BigInteger ONE = BigInteger.valueOf(1L);
    static final BigInteger ZERO = BigInteger.valueOf(0L);

    public JPAKEUtil()
    {
    }

    public static BigInteger calculateA(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3)
    {
        return biginteger2.modPow(biginteger3, biginteger);
    }

    public static BigInteger calculateGA(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3)
    {
        return biginteger1.multiply(biginteger2).multiply(biginteger3).mod(biginteger);
    }

    public static BigInteger calculateGx(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        return biginteger1.modPow(biginteger2, biginteger);
    }

    private static BigInteger calculateHashForZeroKnowledgeProof(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, String s, Digest digest)
    {
        digest.reset();
        updateDigestIncludingSize(digest, biginteger);
        updateDigestIncludingSize(digest, biginteger1);
        updateDigestIncludingSize(digest, biginteger2);
        updateDigestIncludingSize(digest, s);
        biginteger = new byte[digest.getDigestSize()];
        digest.doFinal(biginteger, 0);
        return new BigInteger(biginteger);
    }

    public static BigInteger calculateKeyingMaterial(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3, BigInteger biginteger4, BigInteger biginteger5)
    {
        return biginteger2.modPow(biginteger3.multiply(biginteger4).negate().mod(biginteger1), biginteger).multiply(biginteger5).modPow(biginteger3, biginteger);
    }

    private static byte[] calculateMacKey(BigInteger biginteger, Digest digest)
    {
        digest.reset();
        updateDigest(digest, biginteger);
        updateDigest(digest, "JPAKE_KC");
        biginteger = new byte[digest.getDigestSize()];
        digest.doFinal(biginteger, 0);
        return biginteger;
    }

    public static BigInteger calculateMacTag(String s, String s1, BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3, BigInteger biginteger4, Digest digest)
    {
        biginteger4 = calculateMacKey(biginteger4, digest);
        digest = new HMac(digest);
        byte abyte0[] = new byte[digest.getMacSize()];
        digest.init(new KeyParameter(biginteger4));
        updateMac(digest, "KC_1_U");
        updateMac(digest, s);
        updateMac(digest, s1);
        updateMac(digest, biginteger);
        updateMac(digest, biginteger1);
        updateMac(digest, biginteger2);
        updateMac(digest, biginteger3);
        digest.doFinal(abyte0, 0);
        Arrays.fill(biginteger4, (byte)0);
        return new BigInteger(abyte0);
    }

    public static BigInteger calculateS(char ac[])
    {
        return new BigInteger(Strings.toUTF8ByteArray(ac));
    }

    public static BigInteger calculateX2s(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        return biginteger1.multiply(biginteger2).mod(biginteger);
    }

    public static BigInteger[] calculateZeroKnowledgeProof(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3, BigInteger biginteger4, String s, Digest digest, SecureRandom securerandom)
    {
        securerandom = BigIntegers.createRandomInRange(ZERO, biginteger1.subtract(ONE), securerandom);
        biginteger = biginteger2.modPow(securerandom, biginteger);
        return (new BigInteger[] {
            biginteger, securerandom.subtract(biginteger4.multiply(calculateHashForZeroKnowledgeProof(biginteger2, biginteger, biginteger3, s, digest))).mod(biginteger1)
        });
    }

    public static BigInteger generateX1(BigInteger biginteger, SecureRandom securerandom)
    {
        return BigIntegers.createRandomInRange(ZERO, biginteger.subtract(ONE), securerandom);
    }

    public static BigInteger generateX2(BigInteger biginteger, SecureRandom securerandom)
    {
        return BigIntegers.createRandomInRange(ONE, biginteger.subtract(ONE), securerandom);
    }

    private static byte[] intToByteArray(int i)
    {
        return (new byte[] {
            (byte)(i >>> 24), (byte)(i >>> 16), (byte)(i >>> 8), (byte)i
        });
    }

    private static void updateDigest(Digest digest, String s)
    {
        s = Strings.toUTF8ByteArray(s);
        digest.update(s, 0, s.length);
        Arrays.fill(s, (byte)0);
    }

    private static void updateDigest(Digest digest, BigInteger biginteger)
    {
        biginteger = BigIntegers.asUnsignedByteArray(biginteger);
        digest.update(biginteger, 0, biginteger.length);
        Arrays.fill(biginteger, (byte)0);
    }

    private static void updateDigestIncludingSize(Digest digest, String s)
    {
        s = Strings.toUTF8ByteArray(s);
        digest.update(intToByteArray(s.length), 0, 4);
        digest.update(s, 0, s.length);
        Arrays.fill(s, (byte)0);
    }

    private static void updateDigestIncludingSize(Digest digest, BigInteger biginteger)
    {
        biginteger = BigIntegers.asUnsignedByteArray(biginteger);
        digest.update(intToByteArray(biginteger.length), 0, 4);
        digest.update(biginteger, 0, biginteger.length);
        Arrays.fill(biginteger, (byte)0);
    }

    private static void updateMac(Mac mac, String s)
    {
        s = Strings.toUTF8ByteArray(s);
        mac.update(s, 0, s.length);
        Arrays.fill(s, (byte)0);
    }

    private static void updateMac(Mac mac, BigInteger biginteger)
    {
        biginteger = BigIntegers.asUnsignedByteArray(biginteger);
        mac.update(biginteger, 0, biginteger.length);
        Arrays.fill(biginteger, (byte)0);
    }

    public static void validateGa(BigInteger biginteger)
    {
        if (biginteger.equals(ONE))
        {
            throw new CryptoException("ga is equal to 1.  It should not be.  The chances of this happening are on the order of 2^160 for a 160-bit q.  Try again.");
        } else
        {
            return;
        }
    }

    public static void validateGx4(BigInteger biginteger)
    {
        if (biginteger.equals(ONE))
        {
            throw new CryptoException("g^x validation failed.  g^x should not be 1.");
        } else
        {
            return;
        }
    }

    public static void validateMacTag(String s, String s1, BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3, BigInteger biginteger4, Digest digest, 
            BigInteger biginteger5)
    {
        if (!calculateMacTag(s1, s, biginteger2, biginteger3, biginteger, biginteger1, biginteger4, digest).equals(biginteger5))
        {
            throw new CryptoException("Partner MacTag validation failed. Therefore, the password, MAC, or digest algorithm of each participant does not match.");
        } else
        {
            return;
        }
    }

    public static void validateNotNull(Object obj, String s)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder()).append(s).append(" must not be null").toString());
        } else
        {
            return;
        }
    }

    public static void validateParticipantIdsDiffer(String s, String s1)
    {
        if (s.equals(s1))
        {
            throw new CryptoException((new StringBuilder()).append("Both participants are using the same participantId (").append(s).append("). This is not allowed. ").append("Each participant must use a unique participantId.").toString());
        } else
        {
            return;
        }
    }

    public static void validateParticipantIdsEqual(String s, String s1)
    {
        if (!s.equals(s1))
        {
            throw new CryptoException((new StringBuilder()).append("Received payload from incorrect partner (").append(s1).append("). Expected to receive payload from ").append(s).append(".").toString());
        } else
        {
            return;
        }
    }

    public static void validateZeroKnowledgeProof(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3, BigInteger abiginteger[], String s, Digest digest)
    {
        BigInteger biginteger4 = abiginteger[0];
        abiginteger = abiginteger[1];
        s = calculateHashForZeroKnowledgeProof(biginteger2, biginteger4, biginteger3, s, digest);
        if (biginteger3.compareTo(ZERO) != 1 || biginteger3.compareTo(biginteger) != -1 || biginteger3.modPow(biginteger1, biginteger).compareTo(ONE) != 0 || biginteger2.modPow(abiginteger, biginteger).multiply(biginteger3.modPow(s, biginteger)).mod(biginteger).compareTo(biginteger4) != 0)
        {
            throw new CryptoException("Zero-knowledge proof validation failed");
        } else
        {
            return;
        }
    }

}
