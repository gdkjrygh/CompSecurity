// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.payment.model:
//            PaymentError

public final class Shape_PaymentError extends PaymentError
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final ClassLoader PARCELABLE_CL = com/ubercab/payment/model/Shape_PaymentError.getClassLoader();
    private String code;
    private int errorCode;

    Shape_PaymentError()
    {
    }

    private Shape_PaymentError(Parcel parcel)
    {
        code = (String)parcel.readValue(PARCELABLE_CL);
        errorCode = ((Integer)parcel.readValue(PARCELABLE_CL)).intValue();
    }

    Shape_PaymentError(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PaymentError)obj;
            if (((PaymentError) (obj)).getCode() == null ? getCode() != null : !((PaymentError) (obj)).getCode().equals(getCode()))
            {
                return false;
            }
            if (((PaymentError) (obj)).getErrorCode() != getErrorCode())
            {
                return false;
            }
        }
        return true;
    }

    public final String getCode()
    {
        return code;
    }

    public final int getErrorCode()
    {
        return errorCode;
    }

    public final int hashCode()
    {
        int i;
        if (code == null)
        {
            i = 0;
        } else
        {
            i = code.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ errorCode;
    }

    final PaymentError setCode(String s)
    {
        code = s;
        return this;
    }

    final PaymentError setErrorCode(int i)
    {
        errorCode = i;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("PaymentError{code=")).append(code).append(", errorCode=").append(errorCode).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(code);
        parcel.writeValue(Integer.valueOf(errorCode));
    }


    /* member class not found */
    class _cls1 {}

}
