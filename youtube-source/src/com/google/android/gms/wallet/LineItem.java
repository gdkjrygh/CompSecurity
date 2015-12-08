// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            m, d

public final class LineItem
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new m();
    String OH;
    String OI;
    int OJ;
    String Om;
    String On;
    String description;
    private final int jE;

    LineItem()
    {
        jE = 1;
        OJ = 0;
    }

    LineItem(int i, String s, String s1, String s2, String s3, int j, String s4)
    {
        jE = i;
        description = s;
        OH = s1;
        OI = s2;
        Om = s3;
        OJ = j;
        On = s4;
    }

    public static d newBuilder()
    {
        LineItem lineitem = new LineItem();
        lineitem.getClass();
        return new d(lineitem, (byte)0);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getCurrencyCode()
    {
        return On;
    }

    public final String getDescription()
    {
        return description;
    }

    public final String getQuantity()
    {
        return OH;
    }

    public final int getRole()
    {
        return OJ;
    }

    public final String getTotalPrice()
    {
        return Om;
    }

    public final String getUnitPrice()
    {
        return OI;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        m.a(this, parcel);
    }

}
