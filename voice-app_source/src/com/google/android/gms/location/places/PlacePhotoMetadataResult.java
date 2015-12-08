// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.places:
//            zzi, zzh

public class PlacePhotoMetadataResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    final int zzCY;
    private final Status zzOt;
    final DataHolder zzazH;
    private final zzh zzazI;

    PlacePhotoMetadataResult(int i, Status status, DataHolder dataholder)
    {
        zzCY = i;
        zzOt = status;
        zzazH = dataholder;
        if (dataholder == null)
        {
            zzazI = null;
            return;
        } else
        {
            zzazI = new zzh(zzazH);
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

}
