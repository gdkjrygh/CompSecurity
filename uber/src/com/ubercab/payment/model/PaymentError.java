// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.payment.model:
//            Shape_PaymentError

public abstract class PaymentError
    implements Parcelable
{

    public static final int ERROR_CODE_INSUFFICIENT_BALANCE = 402;

    public PaymentError()
    {
    }

    public static PaymentError create(int i)
    {
        return (new Shape_PaymentError()).setErrorCode(i);
    }

    public static PaymentError create(String s)
    {
        return (new Shape_PaymentError()).setCode(s);
    }

    public abstract String getCode();

    public abstract int getErrorCode();

    abstract PaymentError setCode(String s);

    abstract PaymentError setErrorCode(int i);
}
