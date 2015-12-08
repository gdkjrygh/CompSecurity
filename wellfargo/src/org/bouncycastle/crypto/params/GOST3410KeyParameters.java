// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;


// Referenced classes of package org.bouncycastle.crypto.params:
//            AsymmetricKeyParameter, GOST3410Parameters

public class GOST3410KeyParameters extends AsymmetricKeyParameter
{

    private GOST3410Parameters params;

    public GOST3410KeyParameters(boolean flag, GOST3410Parameters gost3410parameters)
    {
        super(flag);
        params = gost3410parameters;
    }

    public GOST3410Parameters getParameters()
    {
        return params;
    }
}
