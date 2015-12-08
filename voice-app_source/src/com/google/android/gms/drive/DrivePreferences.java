// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive:
//            zze

public class DrivePreferences
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    final int zzCY;
    final boolean zzadh;

    DrivePreferences(int i, boolean flag)
    {
        zzCY = i;
        zzadh = flag;
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
