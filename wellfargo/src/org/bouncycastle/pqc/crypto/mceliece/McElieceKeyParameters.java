// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

// Referenced classes of package org.bouncycastle.pqc.crypto.mceliece:
//            McElieceParameters

public class McElieceKeyParameters extends AsymmetricKeyParameter
{

    private McElieceParameters params;

    public McElieceKeyParameters(boolean flag, McElieceParameters mcelieceparameters)
    {
        super(flag);
        params = mcelieceparameters;
    }

    public McElieceParameters getParameters()
    {
        return params;
    }
}
