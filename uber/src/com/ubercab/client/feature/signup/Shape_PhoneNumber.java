// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.feature.signup:
//            PhoneNumber

public final class Shape_PhoneNumber extends PhoneNumber
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static PhoneNumber a(Parcel parcel)
        {
            return new Shape_PhoneNumber(parcel, (byte)0);
        }

        private static PhoneNumber[] a(int i)
        {
            return new PhoneNumber[i];
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
    private static final ClassLoader a = com/ubercab/client/feature/signup/Shape_PhoneNumber.getClassLoader();
    private String b;
    private String c;

    Shape_PhoneNumber()
    {
    }

    private Shape_PhoneNumber(Parcel parcel)
    {
        b = (String)parcel.readValue(a);
        c = (String)parcel.readValue(a);
    }

    Shape_PhoneNumber(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    final PhoneNumber a(String s)
    {
        b = s;
        return this;
    }

    public final String a()
    {
        return b;
    }

    final PhoneNumber b(String s)
    {
        c = s;
        return this;
    }

    public final String b()
    {
        return c;
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
            obj = (PhoneNumber)obj;
            if (((PhoneNumber) (obj)).a() == null ? a() != null : !((PhoneNumber) (obj)).a().equals(a()))
            {
                return false;
            }
            if (((PhoneNumber) (obj)).b() == null ? b() != null : !((PhoneNumber) (obj)).b().equals(b()))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (c != null)
        {
            j = c.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    public final String toString()
    {
        return (new StringBuilder("PhoneNumber{number=")).append(b).append(", countryIso2=").append(c).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(b);
        parcel.writeValue(c);
    }

}
