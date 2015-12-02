// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.Parcel;

public final class Shape_SignupData_PromoCode extends SignupData.PromoCode
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static SignupData.PromoCode a(Parcel parcel)
        {
            return new Shape_SignupData_PromoCode(parcel, (byte)0);
        }

        private static SignupData.PromoCode[] a(int i)
        {
            return new SignupData.PromoCode[i];
        }

        public final Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public final Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private static final ClassLoader a = com/ubercab/client/feature/signup/Shape_SignupData_PromoCode.getClassLoader();
    private String b;
    private String c;
    private String d;
    private String e;

    Shape_SignupData_PromoCode()
    {
    }

    private Shape_SignupData_PromoCode(Parcel parcel)
    {
        b = (String)parcel.readValue(a);
        c = (String)parcel.readValue(a);
        d = (String)parcel.readValue(a);
        e = (String)parcel.readValue(a);
    }

    Shape_SignupData_PromoCode(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public final SignupData.PromoCode a(String s)
    {
        b = s;
        return this;
    }

    public final String a()
    {
        return b;
    }

    public final SignupData.PromoCode b(String s)
    {
        c = s;
        return this;
    }

    public final String b()
    {
        return c;
    }

    public final SignupData.PromoCode c(String s)
    {
        d = s;
        return this;
    }

    public final String c()
    {
        return d;
    }

    public final SignupData.PromoCode d(String s)
    {
        e = s;
        return this;
    }

    public final String d()
    {
        return e;
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
            obj = (SignupData.PromoCode)obj;
            if (((SignupData.PromoCode) (obj)).a() == null ? a() != null : !((SignupData.PromoCode) (obj)).a().equals(a()))
            {
                return false;
            }
            if (((SignupData.PromoCode) (obj)).b() == null ? b() != null : !((SignupData.PromoCode) (obj)).b().equals(b()))
            {
                return false;
            }
            if (((SignupData.PromoCode) (obj)).c() == null ? c() != null : !((SignupData.PromoCode) (obj)).c().equals(c()))
            {
                return false;
            }
            if (((SignupData.PromoCode) (obj)).d() == null ? d() != null : !((SignupData.PromoCode) (obj)).d().equals(d()))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (c == null)
        {
            j = 0;
        } else
        {
            j = c.hashCode();
        }
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.hashCode();
        }
        if (e != null)
        {
            l = e.hashCode();
        }
        return (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l;
    }

    public final String toString()
    {
        return (new StringBuilder("SignupData.PromoCode{code=")).append(b).append(", value=").append(c).append(", inviterFirstName=").append(d).append(", inviterPictureUrl=").append(e).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(b);
        parcel.writeValue(c);
        parcel.writeValue(d);
        parcel.writeValue(e);
    }

}
