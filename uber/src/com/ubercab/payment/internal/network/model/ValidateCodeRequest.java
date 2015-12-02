// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.network.model;


// Referenced classes of package com.ubercab.payment.internal.network.model:
//            Shape_ValidateCodeRequest

public abstract class ValidateCodeRequest
{

    public ValidateCodeRequest()
    {
    }

    public static ValidateCodeRequest create(String s)
    {
        return (new Shape_ValidateCodeRequest()).setCode(s);
    }

    public abstract String getCode();

    abstract ValidateCodeRequest setCode(String s);
}
