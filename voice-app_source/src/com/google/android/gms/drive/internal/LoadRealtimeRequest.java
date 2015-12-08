// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzap

public class LoadRealtimeRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzap();
    final int zzCY;
    final DriveId zzacT;
    final boolean zzafQ;
    final List zzafR;
    final boolean zzafS;
    final DataHolder zzafT;

    LoadRealtimeRequest(int i, DriveId driveid, boolean flag, List list, boolean flag1, DataHolder dataholder)
    {
        zzCY = i;
        zzacT = driveid;
        zzafQ = flag;
        zzafR = list;
        zzafS = flag1;
        zzafT = dataholder;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzap.zza(this, parcel, i);
    }

}
