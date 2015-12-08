// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSABlindingParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;

// Referenced classes of package org.bouncycastle.crypto.engines:
//            RSACoreEngine

public class RSABlindingEngine
    implements AsymmetricBlockCipher
{

    private BigInteger blindingFactor;
    private RSACoreEngine core;
    private boolean forEncryption;
    private RSAKeyParameters key;

    public RSABlindingEngine()
    {
        core = new RSACoreEngine();
    }

    private BigInteger blindMessage(BigInteger biginteger)
    {
        return biginteger.multiply(blindingFactor.modPow(key.getExponent(), key.getModulus())).mod(key.getModulus());
    }

    private BigInteger unblindMessage(BigInteger biginteger)
    {
        BigInteger biginteger1 = key.getModulus();
        return biginteger.multiply(blindingFactor.modInverse(biginteger1)).mod(biginteger1);
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
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (RSABlindingParameters)((ParametersWithRandom)cipherparameters).getParameters();
        } else
        {
            cipherparameters = (RSABlindingParameters)cipherparameters;
        }
        core.init(flag, cipherparameters.getPublicKey());
        forEncryption = flag;
        key = cipherparameters.getPublicKey();
        blindingFactor = cipherparameters.getBlindingFactor();
    }

    public byte[] processBlock(byte abyte0[], int i, int j)
    {
        abyte0 = core.convertInput(abyte0, i, j);
        if (forEncryption)
        {
            abyte0 = blindMessage(abyte0);
        } else
        {
            abyte0 = unblindMessage(abyte0);
        }
        return core.convertOutput(abyte0);
    }
}
