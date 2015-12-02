// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.unionpay.model;


// Referenced classes of package com.ubercab.payment.internal.vendor.unionpay.model:
//            Shape_LianLianError

public abstract class LianLianError
{

    public static final String CODE_MISSING_FIELDS = "5601";

    public LianLianError()
    {
    }

    public static LianLianError create()
    {
        return new Shape_LianLianError();
    }

    public abstract String getCode();

    public abstract String getMessage();

    abstract LianLianError setCode(String s);

    abstract LianLianError setMessage(String s);
}
