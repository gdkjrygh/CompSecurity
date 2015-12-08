// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzab

public class DriveServiceResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzab();
    final int zzCY;
    final IBinder zzafB;

    DriveServiceResponse(int i, IBinder ibinder)
    {
        zzCY = i;
        zzafB = ibinder;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzab.zza(this, parcel, i);
    }

    public ICancelToken zzpF()
    {
        return com.google.android.gms.common.internal.ICancelToken.zza.zzaE(zzafB);
    }

}
