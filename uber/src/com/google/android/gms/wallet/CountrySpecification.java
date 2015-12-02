// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import bjc;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CountrySpecification
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bjc();
    public String a;
    private final int b;

    public CountrySpecification(int i, String s)
    {
        b = i;
        a = s;
    }

    public final int a()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bjc.a(this, parcel);
    }

}
