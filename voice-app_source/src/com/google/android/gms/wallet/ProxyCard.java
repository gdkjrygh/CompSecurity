// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzq

public final class ProxyCard
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzq();
    private final int zzCY;
    String zzaRB;
    String zzaRC;
    int zzaRD;
    int zzaRE;

    ProxyCard(int i, String s, String s1, int j, int k)
    {
        zzCY = i;
        zzaRB = s;
        zzaRC = s1;
        zzaRD = j;
        zzaRE = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCvn()
    {
        return zzaRC;
    }

    public int getExpirationMonth()
    {
        return zzaRD;
    }

    public int getExpirationYear()
    {
        return zzaRE;
    }

    public String getPan()
    {
        return zzaRB;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzq.zza(this, parcel, i);
    }

}
