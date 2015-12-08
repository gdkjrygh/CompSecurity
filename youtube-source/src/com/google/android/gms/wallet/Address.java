// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            g

public final class Address
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    String Oe;
    String Of;
    String Og;
    String Oh;
    String Oi;
    String Oj;
    boolean Ok;
    String Ol;
    String ih;
    private final int jE;
    String name;
    String phoneNumber;

    Address()
    {
        jE = 1;
    }

    Address(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, boolean flag, String s9)
    {
        jE = i;
        name = s;
        Oe = s1;
        Of = s2;
        Og = s3;
        ih = s4;
        Oh = s5;
        Oi = s6;
        Oj = s7;
        phoneNumber = s8;
        Ok = flag;
        Ol = s9;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getAddress1()
    {
        return Oe;
    }

    public final String getAddress2()
    {
        return Of;
    }

    public final String getAddress3()
    {
        return Og;
    }

    public final String getCity()
    {
        return Oh;
    }

    public final String getCompanyName()
    {
        return Ol;
    }

    public final String getCountryCode()
    {
        return ih;
    }

    public final String getName()
    {
        return name;
    }

    public final String getPhoneNumber()
    {
        return phoneNumber;
    }

    public final String getPostalCode()
    {
        return Oj;
    }

    public final String getState()
    {
        return Oi;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final boolean isPostBox()
    {
        return Ok;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel);
    }

}
