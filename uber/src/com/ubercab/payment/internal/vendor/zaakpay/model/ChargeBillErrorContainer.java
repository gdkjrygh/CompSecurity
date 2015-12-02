// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.zaakpay.model;


// Referenced classes of package com.ubercab.payment.internal.vendor.zaakpay.model:
//            Shape_ChargeBillErrorContainer, ChargeBillErrorResponse

public abstract class ChargeBillErrorContainer
{

    public ChargeBillErrorContainer()
    {
    }

    public static ChargeBillErrorContainer create(ChargeBillErrorResponse chargebillerrorresponse)
    {
        return (new Shape_ChargeBillErrorContainer()).setErrorObj(chargebillerrorresponse);
    }

    public abstract String getError();

    public abstract ChargeBillErrorResponse getErrorObj();

    public abstract ChargeBillErrorContainer setError(String s);

    public abstract ChargeBillErrorContainer setErrorObj(ChargeBillErrorResponse chargebillerrorresponse);
}
