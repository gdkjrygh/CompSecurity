// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.security.spec.KeySpec;

// Referenced classes of package org.bouncycastle.jce.spec:
//            ElGamalParameterSpec

public class ElGamalKeySpec
    implements KeySpec
{

    private ElGamalParameterSpec spec;

    public ElGamalKeySpec(ElGamalParameterSpec elgamalparameterspec)
    {
        spec = elgamalparameterspec;
    }

    public ElGamalParameterSpec getParams()
    {
        return spec;
    }
}
