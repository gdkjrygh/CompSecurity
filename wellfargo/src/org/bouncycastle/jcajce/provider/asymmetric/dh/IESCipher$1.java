// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import org.bouncycastle.crypto.KeyEncoder;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHKeyParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.util.BigIntegers;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.dh:
//            IESCipher

class this._cls0
    implements KeyEncoder
{

    final IESCipher this$0;

    public byte[] getEncoded(AsymmetricKeyParameter asymmetrickeyparameter)
    {
        byte abyte0[] = new byte[(((DHKeyParameters)asymmetrickeyparameter).getParameters().getP().bitLength() + 7) / 8];
        asymmetrickeyparameter = BigIntegers.asUnsignedByteArray(((DHPublicKeyParameters)asymmetrickeyparameter).getY());
        if (asymmetrickeyparameter.length > abyte0.length)
        {
            throw new IllegalArgumentException("Senders's public key longer than expected.");
        } else
        {
            System.arraycopy(asymmetrickeyparameter, 0, abyte0, abyte0.length - asymmetrickeyparameter.length, asymmetrickeyparameter.length);
            return abyte0;
        }
    }

    ()
    {
        this$0 = IESCipher.this;
        super();
    }
}
