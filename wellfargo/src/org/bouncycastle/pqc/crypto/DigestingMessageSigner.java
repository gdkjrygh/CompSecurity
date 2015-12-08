// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;

// Referenced classes of package org.bouncycastle.pqc.crypto:
//            MessageSigner

public class DigestingMessageSigner
    implements Signer
{

    private boolean forSigning;
    private final Digest messDigest;
    private final MessageSigner messSigner;

    public DigestingMessageSigner(MessageSigner messagesigner, Digest digest)
    {
        messSigner = messagesigner;
        messDigest = digest;
    }

    public byte[] generateSignature()
    {
        if (!forSigning)
        {
            throw new IllegalStateException("RainbowDigestSigner not initialised for signature generation.");
        } else
        {
            byte abyte0[] = new byte[messDigest.getDigestSize()];
            messDigest.doFinal(abyte0, 0);
            return messSigner.generateSignature(abyte0);
        }
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        forSigning = flag;
        AsymmetricKeyParameter asymmetrickeyparameter;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            asymmetrickeyparameter = (AsymmetricKeyParameter)((ParametersWithRandom)cipherparameters).getParameters();
        } else
        {
            asymmetrickeyparameter = (AsymmetricKeyParameter)cipherparameters;
        }
        if (flag && !asymmetrickeyparameter.isPrivate())
        {
            throw new IllegalArgumentException("Signing Requires Private Key.");
        }
        if (!flag && asymmetrickeyparameter.isPrivate())
        {
            throw new IllegalArgumentException("Verification Requires Public Key.");
        } else
        {
            reset();
            messSigner.init(flag, cipherparameters);
            return;
        }
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

    public boolean verify(byte abyte0[])
    {
        if (forSigning)
        {
            throw new IllegalStateException("RainbowDigestSigner not initialised for verification");
        } else
        {
            byte abyte1[] = new byte[messDigest.getDigestSize()];
            messDigest.doFinal(abyte1, 0);
            return messSigner.verifySignature(abyte1, abyte0);
        }
    }

    public boolean verifySignature(byte abyte0[])
    {
        return verify(abyte0);
    }
}
