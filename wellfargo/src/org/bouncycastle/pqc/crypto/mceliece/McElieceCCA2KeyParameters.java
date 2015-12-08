// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

// Referenced classes of package org.bouncycastle.pqc.crypto.mceliece:
//            McElieceCCA2Parameters

public class McElieceCCA2KeyParameters extends AsymmetricKeyParameter
{

    private McElieceCCA2Parameters params;

    public McElieceCCA2KeyParameters(boolean flag, McElieceCCA2Parameters mceliececca2parameters)
    {
        super(flag);
        params = mceliececca2parameters;
    }

    public McElieceCCA2Parameters getParameters()
    {
        return params;
    }
}
