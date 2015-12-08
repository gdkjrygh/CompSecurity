// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.mobile.sdk.uicontrols.creditcard;

import android.os.Parcel;
import android.os.Parcelable;

public class CreditCard
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    final String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public CreditCard()
    {
        a = getClass().getName();
        b = new String();
        c = new String();
        d = new String();
        e = new String();
        f = new String();
    }

    public CreditCard(Parcel parcel)
    {
        a = getClass().getName();
        b = new String();
        c = new String();
        d = new String();
        e = new String();
        f = new String();
        a(parcel);
    }

    private void a(Parcel parcel)
    {
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readString();
        f = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCardNumber()
    {
        return c;
    }

    public String getCvv()
    {
        return f;
    }

    public String getExpirationMonth()
    {
        return d;
    }

    public String getExpirationYear()
    {
        return e;
    }

    public String getName()
    {
        return b;
    }

    public void setCardNumber(String s)
    {
        c = s;
    }

    public void setCvv(String s)
    {
        f = s;
    }

    public void setExpirationMonth(String s)
    {
        d = s;
    }

    public void setExpirationYear(String s)
    {
        e = s;
    }

    public void setName(String s)
    {
        b = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public CreditCard a(Parcel parcel)
        {
            return new CreditCard(parcel);
        }

        public CreditCard[] a(int i)
        {
            return new CreditCard[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

        _cls1()
        {
        }
    }

}
