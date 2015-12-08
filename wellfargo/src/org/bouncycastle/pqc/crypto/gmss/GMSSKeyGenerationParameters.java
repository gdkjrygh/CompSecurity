// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.gmss;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

// Referenced classes of package org.bouncycastle.pqc.crypto.gmss:
//            GMSSParameters

public class GMSSKeyGenerationParameters extends KeyGenerationParameters
{

    private GMSSParameters params;

    public GMSSKeyGenerationParameters(SecureRandom securerandom, GMSSParameters gmssparameters)
    {
        super(securerandom, 1);
        params = gmssparameters;
    }

    public GMSSParameters getParameters()
    {
        return params;
    }
}
