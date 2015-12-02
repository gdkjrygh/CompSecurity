// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import cay;

public final class PayPalAuthorization
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cay();
    private String a;
    private String b;
    private String c;

    private PayPalAuthorization(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
    }

    public PayPalAuthorization(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public PayPalAuthorization(String s, String s1, String s2)
    {
        a = s;
        b = s1;
        if ("partner".equals("general"))
        {
            c = s2;
        }
    }

    public final String a()
    {
        return b;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
    }

    static 
    {
        com/paypal/android/sdk/payments/PayPalAuthorization.getSimpleName();
    }
}
