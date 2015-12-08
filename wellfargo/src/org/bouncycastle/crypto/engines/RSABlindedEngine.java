// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.BigIntegers;

// Referenced classes of package org.bouncycastle.crypto.engines:
//            RSACoreEngine

public class RSABlindedEngine
    implements AsymmetricBlockCipher
{

    private static BigInteger ONE = BigInteger.valueOf(1L);
    private RSACoreEngine core;
    private RSAKeyParameters key;
    private SecureRandom random;

    public RSABlindedEngine()
    {
        core = new RSACoreEngine();
    }

    public int getInputBlockSize()
    {
        return core.getInputBlockSize();
    }

    public int getOutputBlockSize()
    {
        return core.getOutputBlockSize();
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        core.init(flag, cipherparameters);
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (ParametersWithRandom)cipherparameters;
            key = (RSAKeyParameters)cipherparameters.getParameters();
            random = cipherparameters.getRandom();
            return;
        } else
        {
            key = (RSAKeyParameters)cipherparameters;
            random = new SecureRandom();
            return;
        }
    }

    public byte[] processBlock(byte abyte0[], int i, int j)
    {
        if (key == null)
        {
            throw new IllegalStateException("RSA engine not initialised");
        }
        abyte0 = core.convertInput(abyte0, i, j);
        if (key instanceof RSAPrivateCrtKeyParameters)
        {
            Object obj = (RSAPrivateCrtKeyParameters)key;
            BigInteger biginteger = ((RSAPrivateCrtKeyParameters) (obj)).getPublicExponent();
            if (biginteger != null)
            {
                obj = ((RSAPrivateCrtKeyParameters) (obj)).getModulus();
                BigInteger biginteger1 = BigIntegers.createRandomInRange(ONE, ((BigInteger) (obj)).subtract(ONE), random);
                abyte0 = biginteger1.modPow(biginteger, ((BigInteger) (obj))).multiply(abyte0).mod(((BigInteger) (obj)));
                abyte0 = core.processBlock(abyte0).multiply(biginteger1.modInverse(((BigInteger) (obj)))).mod(((BigInteger) (obj)));
            } else
            {
                abyte0 = core.processBlock(abyte0);
            }
        } else
        {
            abyte0 = core.processBlock(abyte0);
        }
        return core.convertOutput(abyte0);
    }

}
