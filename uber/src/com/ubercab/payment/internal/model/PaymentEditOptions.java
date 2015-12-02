// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.payment.internal.model:
//            Shape_PaymentEditOptions

public abstract class PaymentEditOptions
    implements Parcelable
{

    public PaymentEditOptions()
    {
    }

    public static PaymentEditOptions create(boolean flag, boolean flag1, boolean flag2)
    {
        return (new Shape_PaymentEditOptions()).setDeleteAllowed(flag).setSelectAsPaymentAllowed(flag1).setSelectedAsPayment(flag2);
    }

    public abstract boolean isDeleteAllowed();

    public abstract boolean isSelectAsPaymentAllowed();

    public abstract boolean isSelectedAsPayment();

    abstract PaymentEditOptions setDeleteAllowed(boolean flag);

    abstract PaymentEditOptions setSelectAsPaymentAllowed(boolean flag);

    abstract PaymentEditOptions setSelectedAsPayment(boolean flag);
}
