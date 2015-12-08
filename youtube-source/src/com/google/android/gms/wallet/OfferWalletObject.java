// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            r

public final class OfferWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new r();
    String OL;
    String Pe;
    private final int jE;

    OfferWalletObject()
    {
        jE = 2;
    }

    OfferWalletObject(int i, String s, String s1)
    {
        jE = i;
        OL = s;
        Pe = s1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getId()
    {
        return OL;
    }

    public final String getRedemptionCode()
    {
        return Pe;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        r.a(this, parcel);
    }

}
