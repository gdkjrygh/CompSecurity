// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.location.places:
//            zzl, PlaceFilter

public final class PlaceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    static final long zzazM;
    private final int mPriority;
    final int zzCY;
    private final long zzaxU;
    private final long zzaxz;
    private final PlaceFilter zzazN;

    public PlaceRequest(int i, PlaceFilter placefilter, long l, int j, long l1)
    {
        zzCY = i;
        zzazN = placefilter;
        zzaxU = l;
        mPriority = j;
        zzaxz = l1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceRequest))
            {
                return false;
            }
            obj = (PlaceRequest)obj;
            if (!zzt.equal(zzazN, ((PlaceRequest) (obj)).zzazN) || zzaxU != ((PlaceRequest) (obj)).zzaxU || mPriority != ((PlaceRequest) (obj)).mPriority || zzaxz != ((PlaceRequest) (obj)).zzaxz)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return zzaxz;
    }

    public long getInterval()
    {
        return zzaxU;
    }

    public int getPriority()
    {
        return mPriority;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzazN, Long.valueOf(zzaxU), Integer.valueOf(mPriority), Long.valueOf(zzaxz)
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("filter", zzazN).zzg("interval", Long.valueOf(zzaxU)).zzg("priority", Integer.valueOf(mPriority)).zzg("expireAt", Long.valueOf(zzaxz)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

    public PlaceFilter zzuG()
    {
        return zzazN;
    }

    static 
    {
        zzazM = TimeUnit.HOURS.toMillis(1L);
    }
}
