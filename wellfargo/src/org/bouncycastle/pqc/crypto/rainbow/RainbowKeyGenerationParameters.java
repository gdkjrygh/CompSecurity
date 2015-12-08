// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

// Referenced classes of package org.bouncycastle.pqc.crypto.rainbow:
//            RainbowParameters

public class RainbowKeyGenerationParameters extends KeyGenerationParameters
{

    private RainbowParameters params;

    public RainbowKeyGenerationParameters(SecureRandom securerandom, RainbowParameters rainbowparameters)
    {
        super(securerandom, rainbowparameters.getVi()[rainbowparameters.getVi().length - 1] - rainbowparameters.getVi()[0]);
        params = rainbowparameters;
    }

    public RainbowParameters getParameters()
    {
        return params;
    }
}
