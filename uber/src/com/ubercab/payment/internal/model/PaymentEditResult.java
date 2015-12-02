// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.payment.internal.model:
//            Shape_PaymentEditResult

public abstract class PaymentEditResult
    implements Parcelable
{

    public PaymentEditResult()
    {
    }

    public static PaymentEditResult create()
    {
        return create(null);
    }

    public static PaymentEditResult create(Boolean boolean1)
    {
        return (new Shape_PaymentEditResult()).setSelectedAsPayment(boolean1);
    }

    public abstract Boolean isSelectedAsPayment();

    abstract PaymentEditResult setSelectedAsPayment(Boolean boolean1);
}
