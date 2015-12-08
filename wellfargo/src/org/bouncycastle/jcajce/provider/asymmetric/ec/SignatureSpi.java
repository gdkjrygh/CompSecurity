// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.jcajce.provider.asymmetric.util.DSABase;
import org.bouncycastle.jcajce.provider.asymmetric.util.DSAEncoder;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.ec:
//            ECUtil

public class SignatureSpi extends DSABase
{

    SignatureSpi(Digest digest, DSA dsa, DSAEncoder dsaencoder)
    {
        super(digest, dsa, dsaencoder);
    }

    protected void engineInitSign(PrivateKey privatekey)
    {
        privatekey = ECUtil.generatePrivateKeyParameter(privatekey);
        digest.reset();
        if (appRandom != null)
        {
            signer.init(true, new ParametersWithRandom(privatekey, appRandom));
            return;
        } else
        {
            signer.init(true, privatekey);
            return;
        }
    }

    protected void engineInitVerify(PublicKey publickey)
    {
        publickey = ECUtil.generatePublicKeyParameter(publickey);
        digest.reset();
        signer.init(false, publickey);
    }
}
