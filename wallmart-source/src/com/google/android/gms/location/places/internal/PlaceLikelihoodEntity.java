// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceLikelihood;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzl, PlaceImpl

public class PlaceLikelihoodEntity
    implements SafeParcelable, PlaceLikelihood
{

    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    final int mVersionCode;
    final PlaceImpl zzaEI;
    final float zzaEJ;

    PlaceLikelihoodEntity(int i, PlaceImpl placeimpl, float f)
    {
        mVersionCode = i;
        zzaEI = placeimpl;
        zzaEJ = f;
    }

    public static PlaceLikelihoodEntity zza(PlaceImpl placeimpl, float f)
    {
        return new PlaceLikelihoodEntity(0, (PlaceImpl)zzx.zzv(placeimpl), f);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceLikelihoodEntity))
            {
                return false;
            }
            obj = (PlaceLikelihoodEntity)obj;
            if (!zzaEI.equals(((PlaceLikelihoodEntity) (obj)).zzaEI) || zzaEJ != ((PlaceLikelihoodEntity) (obj)).zzaEJ)
            {
                return false;
            }
        }
        return true;
    }

    public Object freeze()
    {
        return zzwt();
    }

    public float getLikelihood()
    {
        return zzaEJ;
    }

    public Place getPlace()
    {
        return zzaEI;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            zzaEI, Float.valueOf(zzaEJ)
        });
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("place", zzaEI).zzg("likelihood", Float.valueOf(zzaEJ)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

    public PlaceLikelihood zzwt()
    {
        return this;
    }

}
