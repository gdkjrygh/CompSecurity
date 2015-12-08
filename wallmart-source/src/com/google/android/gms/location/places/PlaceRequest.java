// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.location.places:
//            zzk, PlaceFilter

public final class PlaceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    static final long zzaDJ;
    private final int mPriority;
    final int mVersionCode;
    private final long zzaBB;
    private final long zzaBW;
    private final PlaceFilter zzaDK;

    public PlaceRequest(int i, PlaceFilter placefilter, long l, int j, long l1)
    {
        mVersionCode = i;
        zzaDK = placefilter;
        zzaBW = l;
        mPriority = j;
        zzaBB = l1;
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
            if (!zzw.equal(zzaDK, ((PlaceRequest) (obj)).zzaDK) || zzaBW != ((PlaceRequest) (obj)).zzaBW || mPriority != ((PlaceRequest) (obj)).mPriority || zzaBB != ((PlaceRequest) (obj)).zzaBB)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return zzaBB;
    }

    public long getInterval()
    {
        return zzaBW;
    }

    public int getPriority()
    {
        return mPriority;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            zzaDK, Long.valueOf(zzaBW), Integer.valueOf(mPriority), Long.valueOf(zzaBB)
        });
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("filter", zzaDK).zzg("interval", Long.valueOf(zzaBW)).zzg("priority", Integer.valueOf(mPriority)).zzg("expireAt", Long.valueOf(zzaBB)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public PlaceFilter zzwa()
    {
        return zzaDK;
    }

    static 
    {
        zzaDJ = TimeUnit.HOURS.toMillis(1L);
    }
}
