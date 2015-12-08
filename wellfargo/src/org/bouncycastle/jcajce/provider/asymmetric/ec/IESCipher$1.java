// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.ec;

import org.bouncycastle.crypto.KeyEncoder;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECPoint;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.ec:
//            IESCipher

class this._cls0
    implements KeyEncoder
{

    final IESCipher this$0;

    public byte[] getEncoded(AsymmetricKeyParameter asymmetrickeyparameter)
    {
        return ((ECPublicKeyParameters)asymmetrickeyparameter).getQ().getEncoded();
    }

    ()
    {
        this$0 = IESCipher.this;
        super();
    }
}
