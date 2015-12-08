// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

// Referenced classes of package org.bouncycastle.crypto.params:
//            DSAParameters

public class DSAKeyGenerationParameters extends KeyGenerationParameters
{

    private DSAParameters params;

    public DSAKeyGenerationParameters(SecureRandom securerandom, DSAParameters dsaparameters)
    {
        super(securerandom, dsaparameters.getP().bitLength() - 1);
        params = dsaparameters;
    }

    public DSAParameters getParameters()
    {
        return params;
    }
}
