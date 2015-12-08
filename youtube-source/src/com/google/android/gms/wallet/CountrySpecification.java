// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            i

public class CountrySpecification
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    String ih;
    private final int jE;

    CountrySpecification(int j, String s)
    {
        jE = j;
        ih = s;
    }

    public CountrySpecification(String s)
    {
        jE = 1;
        ih = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCountryCode()
    {
        return ih;
    }

    public int getVersionCode()
    {
        return jE;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel);
    }

}
