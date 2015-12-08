// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.mceliece;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

// Referenced classes of package org.bouncycastle.pqc.crypto.mceliece:
//            McElieceCCA2Parameters

public class McElieceCCA2KeyGenerationParameters extends KeyGenerationParameters
{

    private McElieceCCA2Parameters params;

    public McElieceCCA2KeyGenerationParameters(SecureRandom securerandom, McElieceCCA2Parameters mceliececca2parameters)
    {
        super(securerandom, 128);
        params = mceliececca2parameters;
    }

    public McElieceCCA2Parameters getParameters()
    {
        return params;
    }
}
