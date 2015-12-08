// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            s

public final class ProxyCard
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new s();
    String Pf;
    String Pg;
    int Ph;
    int Pi;
    private final int jE;

    ProxyCard(int i, String s1, String s2, int j, int k)
    {
        jE = i;
        Pf = s1;
        Pg = s2;
        Ph = j;
        Pi = k;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getCvn()
    {
        return Pg;
    }

    public final int getExpirationMonth()
    {
        return Ph;
    }

    public final int getExpirationYear()
    {
        return Pi;
    }

    public final String getPan()
    {
        return Pf;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        s.a(this, parcel);
    }

}
