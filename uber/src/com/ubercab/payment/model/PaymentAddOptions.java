// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.payment.model:
//            Shape_PaymentAddOptions

public abstract class PaymentAddOptions
    implements Parcelable
{

    public PaymentAddOptions()
    {
    }

    public static PaymentAddOptions create()
    {
        return new Shape_PaymentAddOptions();
    }

    public abstract boolean isCardScanFirst();

    public abstract PaymentAddOptions setCardScanFirst(boolean flag);
}
