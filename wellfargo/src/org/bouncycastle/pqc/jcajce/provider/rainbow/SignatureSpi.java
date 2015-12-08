// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.rainbow.RainbowSigner;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.rainbow:
//            RainbowKeysToParams

public class SignatureSpi extends java.security.SignatureSpi
{

    private Digest digest;
    private SecureRandom random;
    private RainbowSigner signer;

    protected SignatureSpi(Digest digest1, RainbowSigner rainbowsigner)
    {
        digest = digest1;
        signer = rainbowsigner;
    }

    protected Object engineGetParameter(String s)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected void engineInitSign(PrivateKey privatekey)
    {
        privatekey = RainbowKeysToParams.generatePrivateKeyParameter(privatekey);
        if (random != null)
        {
            privatekey = new ParametersWithRandom(privatekey, random);
        }
        digest.reset();
        signer.init(true, privatekey);
    }

    protected void engineInitSign(PrivateKey privatekey, SecureRandom securerandom)
    {
        random = securerandom;
        engineInitSign(privatekey);
    }

    protected void engineInitVerify(PublicKey publickey)
    {
        publickey = RainbowKeysToParams.generatePublicKeyParameter(publickey);
        digest.reset();
        signer.init(false, publickey);
    }

    protected void engineSetParameter(String s, Object obj)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected void engineSetParameter(AlgorithmParameterSpec algorithmparameterspec)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected byte[] engineSign()
    {
        byte abyte0[] = new byte[digest.getDigestSize()];
        digest.doFinal(abyte0, 0);
        try
        {
            abyte0 = signer.generateSignature(abyte0);
        }
        catch (Exception exception)
        {
            throw new SignatureException(exception.toString());
        }
        return abyte0;
    }

    protected void engineUpdate(byte byte0)
    {
        digest.update(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
    {
        digest.update(abyte0, i, j);
    }

    protected boolean engineVerify(byte abyte0[])
    {
        byte abyte1[] = new byte[digest.getDigestSize()];
        digest.doFinal(abyte1, 0);
        return signer.verifySignature(abyte1, abyte0);
    }
}
