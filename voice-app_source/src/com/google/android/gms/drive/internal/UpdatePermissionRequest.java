// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbv

public class UpdatePermissionRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzbv();
    final int zzCY;
    final DriveId zzacT;
    final String zzadn;
    final String zzadz;
    final boolean zzaen;
    final int zzagx;

    UpdatePermissionRequest(int i, DriveId driveid, String s, int j, boolean flag, String s1)
    {
        zzCY = i;
        zzacT = driveid;
        zzadz = s;
        zzagx = j;
        zzaen = flag;
        zzadn = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbv.zza(this, parcel, i);
    }

}
