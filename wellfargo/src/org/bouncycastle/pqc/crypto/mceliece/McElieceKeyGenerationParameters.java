// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.mceliece;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

// Referenced classes of package org.bouncycastle.pqc.crypto.mceliece:
//            McElieceParameters

public class McElieceKeyGenerationParameters extends KeyGenerationParameters
{

    private McElieceParameters params;

    public McElieceKeyGenerationParameters(SecureRandom securerandom, McElieceParameters mcelieceparameters)
    {
        super(securerandom, 256);
        params = mcelieceparameters;
    }

    public McElieceParameters getParameters()
    {
        return params;
    }
}
