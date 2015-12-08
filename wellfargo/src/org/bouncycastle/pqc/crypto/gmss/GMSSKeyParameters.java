// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.gmss;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

// Referenced classes of package org.bouncycastle.pqc.crypto.gmss:
//            GMSSParameters

public class GMSSKeyParameters extends AsymmetricKeyParameter
{

    private GMSSParameters params;

    public GMSSKeyParameters(boolean flag, GMSSParameters gmssparameters)
    {
        super(flag);
        params = gmssparameters;
    }

    public GMSSParameters getParameters()
    {
        return params;
    }
}
