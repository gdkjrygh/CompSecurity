// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageEncryptor;

public class McEliecePointchevalDigestCipher
{

    private boolean forEncrypting;
    private final MessageEncryptor mcElieceCCA2Cipher;
    private final Digest messDigest;

    public McEliecePointchevalDigestCipher(MessageEncryptor messageencryptor, Digest digest)
    {
        mcElieceCCA2Cipher = messageencryptor;
        messDigest = digest;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        forEncrypting = flag;
        AsymmetricKeyParameter asymmetrickeyparameter;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            asymmetrickeyparameter = (AsymmetricKeyParameter)((ParametersWithRandom)cipherparameters).getParameters();
        } else
        {
            asymmetrickeyparameter = (AsymmetricKeyParameter)cipherparameters;
        }
        if (flag && asymmetrickeyparameter.isPrivate())
        {
            throw new IllegalArgumentException("Encrypting Requires Public Key.");
        }
        if (!flag && !asymmetrickeyparameter.isPrivate())
        {
            throw new IllegalArgumentException("Decrypting Requires Private Key.");
        } else
        {
            reset();
            mcElieceCCA2Cipher.init(flag, cipherparameters);
            return;
        }
    }

    public byte[] messageDecrypt(byte abyte0[])
    {
        if (forEncrypting)
        {
            throw new IllegalStateException("McEliecePointchevalDigestCipher not initialised for decrypting.");
        }
        try
        {
            abyte0 = mcElieceCCA2Cipher.messageDecrypt(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return null;
        }
        return abyte0;
    }

    public byte[] messageEncrypt()
    {
        if (!forEncrypting)
        {
            throw new IllegalStateException("McEliecePointchevalDigestCipher not initialised for encrypting.");
        }
        byte abyte0[] = new byte[messDigest.getDigestSize()];
        messDigest.doFinal(abyte0, 0);
        try
        {
            abyte0 = mcElieceCCA2Cipher.messageEncrypt(abyte0);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
        return abyte0;
    }

    public void reset()
    {
        messDigest.reset();
    }

    public void update(byte byte0)
    {
        messDigest.update(byte0);
    }

    public void update(byte abyte0[], int i, int j)
    {
        messDigest.update(abyte0, i, j);
    }
}
