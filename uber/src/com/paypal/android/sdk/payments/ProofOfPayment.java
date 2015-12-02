// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import bwq;
import cck;

public final class ProofOfPayment
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cck();
    private static final String a = com/paypal/android/sdk/payments/ProofOfPayment.getSimpleName();
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    private ProofOfPayment(Parcel parcel)
    {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public ProofOfPayment(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public ProofOfPayment(String s, String s1, String s2, String s3, String s4)
    {
        b = s;
        c = s1;
        d = s2;
        e = s3;
        f = s4;
        (new StringBuilder("ProofOfPayment created: ")).append(toString());
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        String s;
        if (bwq.d(f))
        {
            s = f;
        } else
        {
            s = "no transactionId";
        }
        return (new StringBuilder("{")).append(e).append(": ").append(s).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
    }

}
