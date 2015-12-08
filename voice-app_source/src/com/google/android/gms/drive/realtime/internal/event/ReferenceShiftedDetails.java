// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            zze

public class ReferenceShiftedDetails
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    final int zzCY;
    final String zzaiT;
    final String zzaiU;
    final int zzaiV;
    final int zzaiW;

    ReferenceShiftedDetails(int i, String s, String s1, int j, int k)
    {
        zzCY = i;
        zzaiT = s;
        zzaiU = s1;
        zzaiV = j;
        zzaiW = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

}
