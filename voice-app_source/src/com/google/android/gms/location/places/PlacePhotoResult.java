// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.location.places:
//            zzj

public class PlacePhotoResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    private final Bitmap mBitmap;
    final int zzCY;
    private final Status zzOt;
    final BitmapTeleporter zzazJ;

    PlacePhotoResult(int i, Status status, BitmapTeleporter bitmapteleporter)
    {
        zzCY = i;
        zzOt = status;
        zzazJ = bitmapteleporter;
        if (zzazJ != null)
        {
            mBitmap = bitmapteleporter.zznc();
            return;
        } else
        {
            mBitmap = null;
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

    public String toString()
    {
        return zzt.zzt(this).zzg("status", zzOt).zzg("bitmap", mBitmap).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

}
