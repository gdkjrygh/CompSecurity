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
import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.location.places:
//            zzi

public class PlacePhotoResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    private final Bitmap mBitmap;
    final int mVersionCode;
    private final Status zzQA;
    final BitmapTeleporter zzaDG;

    PlacePhotoResult(int i, Status status, BitmapTeleporter bitmapteleporter)
    {
        mVersionCode = i;
        zzQA = status;
        zzaDG = bitmapteleporter;
        if (zzaDG != null)
        {
            mBitmap = bitmapteleporter.zznQ();
            return;
        } else
        {
            mBitmap = null;
            return;
        }
    }

    public PlacePhotoResult(Status status, BitmapTeleporter bitmapteleporter)
    {
        mVersionCode = 0;
        zzQA = status;
        zzaDG = bitmapteleporter;
        if (zzaDG != null)
        {
            mBitmap = bitmapteleporter.zznQ();
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

    public Bitmap getBitmap()
    {
        return mBitmap;
    }

    public Status getStatus()
    {
        return zzQA;
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("status", zzQA).zzg("bitmap", mBitmap).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

}
