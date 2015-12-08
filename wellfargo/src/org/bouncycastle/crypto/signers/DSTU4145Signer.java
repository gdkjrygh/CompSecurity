// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

public class DSTU4145Signer
    implements DSA
{

    private static final BigInteger ONE = BigInteger.valueOf(1L);
    private ECKeyParameters key;
    private SecureRandom random;

    public DSTU4145Signer()
    {
    }

    private static BigInteger fieldElement2Integer(BigInteger biginteger, ECFieldElement ecfieldelement)
    {
        for (ecfieldelement = ecfieldelement.toBigInteger(); ecfieldelement.bitLength() >= biginteger.bitLength(); ecfieldelement = ecfieldelement.clearBit(ecfieldelement.bitLength() - 1)) { }
        return ecfieldelement;
    }

    private static BigInteger generateRandomInteger(BigInteger biginteger, SecureRandom securerandom)
    {
        return new BigInteger(biginteger.bitLength() - 1, securerandom);
    }

    private static ECFieldElement hash2FieldElement(ECCurve eccurve, byte abyte0[])
    {
        abyte0 = Arrays.clone(abyte0);
        reverseBytes(abyte0);
        for (abyte0 = new BigInteger(1, abyte0); abyte0.bitLength() >= eccurve.getFieldSize(); abyte0 = abyte0.clearBit(abyte0.bitLength() - 1)) { }
        return eccurve.fromBigInteger(abyte0);
    }

    private static void reverseBytes(byte abyte0[])
    {
        for (int i = 0; i < abyte0.length / 2; i++)
        {
            byte byte0 = abyte0[i];
            abyte0[i] = abyte0[abyte0.length - 1 - i];
            abyte0[abyte0.length - 1 - i] = byte0;
        }

    }

    public BigInteger[] generateSignature(byte abyte0[])
    {
        abyte0 = hash2FieldElement(key.getParameters().getCurve(), abyte0);
        if (abyte0.toBigInteger().signum() == 0)
        {
            abyte0 = key.getParameters().getCurve().fromBigInteger(ONE);
        }
        BigInteger biginteger;
        Object obj;
        do
        {
            do
            {
                do
                {
                    biginteger = generateRandomInteger(key.getParameters().getN(), random);
                    obj = key.getParameters().getG().multiply(biginteger).getX();
                } while (((ECFieldElement) (obj)).toBigInteger().signum() == 0);
                obj = abyte0.multiply(((ECFieldElement) (obj)));
                obj = fieldElement2Integer(key.getParameters().getN(), ((ECFieldElement) (obj)));
            } while (((BigInteger) (obj)).signum() == 0);
            biginteger = ((BigInteger) (obj)).multiply(((ECPrivateKeyParameters)key).getD()).add(biginteger).mod(key.getParameters().getN());
        } while (biginteger.signum() == 0);
        return (new BigInteger[] {
            obj, biginteger
        });
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (flag)
        {
            if (cipherparameters instanceof ParametersWithRandom)
            {
                cipherparameters = (ParametersWithRandom)cipherparameters;
                random = cipherparameters.getRandom();
                cipherparameters = cipherparameters.getParameters();
            } else
            {
                random = new SecureRandom();
            }
            key = (ECPrivateKeyParameters)cipherparameters;
            return;
        } else
        {
            key = (ECPublicKeyParameters)cipherparameters;
            return;
        }
    }

    public boolean verifySignature(byte abyte0[], BigInteger biginteger, BigInteger biginteger1)
    {
        while (biginteger.signum() == 0 || biginteger1.signum() == 0 || biginteger.compareTo(key.getParameters().getN()) >= 0 || biginteger1.compareTo(key.getParameters().getN()) >= 0) 
        {
            return false;
        }
        abyte0 = hash2FieldElement(key.getParameters().getCurve(), abyte0);
        if (abyte0.toBigInteger().signum() == 0)
        {
            abyte0 = key.getParameters().getCurve().fromBigInteger(ONE);
        }
        abyte0 = abyte0.multiply(ECAlgorithms.sumOfTwoMultiplies(key.getParameters().getG(), biginteger1, ((ECPublicKeyParameters)key).getQ(), biginteger).getX());
        boolean flag;
        if (fieldElement2Integer(key.getParameters().getN(), abyte0).compareTo(biginteger) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

}
