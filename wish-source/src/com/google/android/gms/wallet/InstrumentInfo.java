// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzh

public final class InstrumentInfo
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    private String zzaIv;
    private String zzaIw;
    private final int zzzH;

    InstrumentInfo(int i, String s, String s1)
    {
        zzzH = i;
        zzaIv = s;
        zzaIw = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getInstrumentDetails()
    {
        return zzaIw;
    }

    public String getInstrumentType()
    {
        return zzaIv;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

}
