// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzb

public class AddPermissionRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    final int zzCY;
    final DriveId zzacT;
    final String zzadn;
    final Permission zzaek;
    final boolean zzael;
    final String zzaem;
    final boolean zzaen;

    AddPermissionRequest(int i, DriveId driveid, Permission permission, boolean flag, String s, boolean flag1, String s1)
    {
        zzCY = i;
        zzacT = driveid;
        zzaek = permission;
        zzael = flag;
        zzaem = s;
        zzaen = flag1;
        zzadn = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
