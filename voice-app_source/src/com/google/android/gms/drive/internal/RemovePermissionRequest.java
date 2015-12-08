// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbm

public class RemovePermissionRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzbm();
    final int zzCY;
    final DriveId zzacT;
    final String zzadn;
    final String zzadz;
    final boolean zzaen;

    RemovePermissionRequest(int i, DriveId driveid, String s, boolean flag, String s1)
    {
        zzCY = i;
        zzacT = driveid;
        zzadz = s;
        zzaen = flag;
        zzadn = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbm.zza(this, parcel, i);
    }

}
