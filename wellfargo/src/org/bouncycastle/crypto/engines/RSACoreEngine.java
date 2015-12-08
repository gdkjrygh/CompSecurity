// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;

class RSACoreEngine
{

    private boolean forEncryption;
    private RSAKeyParameters key;

    RSACoreEngine()
    {
    }

    public BigInteger convertInput(byte abyte0[], int i, int j)
    {
        byte abyte1[];
label0:
        {
            if (j > getInputBlockSize() + 1)
            {
                throw new DataLengthException("input too large for RSA cipher.");
            }
            if (j == getInputBlockSize() + 1 && !forEncryption)
            {
                throw new DataLengthException("input too large for RSA cipher.");
            }
            if (i == 0)
            {
                abyte1 = abyte0;
                if (j == abyte0.length)
                {
                    break label0;
                }
            }
            abyte1 = new byte[j];
            System.arraycopy(abyte0, i, abyte1, 0, j);
        }
        abyte0 = new BigInteger(1, abyte1);
        if (abyte0.compareTo(key.getModulus()) >= 0)
        {
            throw new DataLengthException("input too large for RSA cipher.");
        } else
        {
            return abyte0;
        }
    }

    public byte[] convertOutput(BigInteger biginteger)
    {
        biginteger = biginteger.toByteArray();
        if (forEncryption)
        {
            if (biginteger[0] == 0 && biginteger.length > getOutputBlockSize())
            {
                byte abyte0[] = new byte[biginteger.length - 1];
                System.arraycopy(biginteger, 1, abyte0, 0, abyte0.length);
                return abyte0;
            }
            if (biginteger.length < getOutputBlockSize())
            {
                byte abyte1[] = new byte[getOutputBlockSize()];
                System.arraycopy(biginteger, 0, abyte1, abyte1.length - biginteger.length, biginteger.length);
                return abyte1;
            }
        } else
        if (biginteger[0] == 0)
        {
            byte abyte2[] = new byte[biginteger.length - 1];
            System.arraycopy(biginteger, 1, abyte2, 0, abyte2.length);
            return abyte2;
        }
        return biginteger;
    }

    public int getInputBlockSize()
    {
        int i = key.getModulus().bitLength();
        if (forEncryption)
        {
            return (i + 7) / 8 - 1;
        } else
        {
            return (i + 7) / 8;
        }
    }

    public int getOutputBlockSize()
    {
        int i = key.getModulus().bitLength();
        if (forEncryption)
        {
            return (i + 7) / 8;
        } else
        {
            return (i + 7) / 8 - 1;
        }
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            key = (RSAKeyParameters)((ParametersWithRandom)cipherparameters).getParameters();
        } else
        {
            key = (RSAKeyParameters)cipherparameters;
        }
        forEncryption = flag;
    }

    public BigInteger processBlock(BigInteger biginteger)
    {
        if (key instanceof RSAPrivateCrtKeyParameters)
        {
            Object obj = (RSAPrivateCrtKeyParameters)key;
            BigInteger biginteger1 = ((RSAPrivateCrtKeyParameters) (obj)).getP();
            BigInteger biginteger2 = ((RSAPrivateCrtKeyParameters) (obj)).getQ();
            BigInteger biginteger4 = ((RSAPrivateCrtKeyParameters) (obj)).getDP();
            BigInteger biginteger3 = ((RSAPrivateCrtKeyParameters) (obj)).getDQ();
            obj = ((RSAPrivateCrtKeyParameters) (obj)).getQInv();
            biginteger4 = biginteger.remainder(biginteger1).modPow(biginteger4, biginteger1);
            biginteger = biginteger.remainder(biginteger2).modPow(biginteger3, biginteger2);
            return biginteger4.subtract(biginteger).multiply(((BigInteger) (obj))).mod(biginteger1).multiply(biginteger2).add(biginteger);
        } else
        {
            return biginteger.modPow(key.getExponent(), key.getModulus());
        }
    }
}
