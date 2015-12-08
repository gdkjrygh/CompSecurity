// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            zze, PlaceFilter, NearbyAlertFilter

public final class NearbyAlertRequest
    implements SafeParcelable
{

    public static final zze CREATOR = new zze();
    private final int zzCY;
    private final int zzaxy;
    private final NearbyAlertFilter zzazA;
    private final int zzazy;
    private final PlaceFilter zzazz = null;

    NearbyAlertRequest(int i, int j, int k, PlaceFilter placefilter, NearbyAlertFilter nearbyalertfilter)
    {
        zzCY = i;
        zzaxy = j;
        zzazy = k;
        if (nearbyalertfilter != null)
        {
            zzazA = nearbyalertfilter;
        } else
        if (placefilter != null)
        {
            if (zza(placefilter))
            {
                zzazA = NearbyAlertFilter.zza(placefilter.getPlaceIds(), placefilter.getPlaceTypes(), placefilter.zzuI());
            } else
            {
                zzazA = null;
            }
        } else
        {
            zzazA = null;
        }
    }

    public static boolean zza(PlaceFilter placefilter)
    {
        return placefilter.getPlaceTypes() != null && !placefilter.getPlaceTypes().isEmpty() || placefilter.getPlaceIds() != null && !placefilter.getPlaceIds().isEmpty() || placefilter.zzuI() != null && !placefilter.zzuI().isEmpty();
    }

    public int describeContents()
    {
        zze zze1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof NearbyAlertRequest))
            {
                return false;
            }
            obj = (NearbyAlertRequest)obj;
            if (zzaxy != ((NearbyAlertRequest) (obj)).zzaxy || zzazy != ((NearbyAlertRequest) (obj)).zzazy || !zzt.equal(zzazz, ((NearbyAlertRequest) (obj)).zzazz) || !zzt.equal(zzazA, ((NearbyAlertRequest) (obj)).zzazA))
            {
                return false;
            }
        }
        return true;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Integer.valueOf(zzaxy), Integer.valueOf(zzazy)
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("transitionTypes", Integer.valueOf(zzaxy)).zzg("loiteringTimeMillis", Integer.valueOf(zzazy)).zzg("nearbyAlertFilter", zzazA).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze zze1 = CREATOR;
        zze.zza(this, parcel, i);
    }

    public int zzuC()
    {
        return zzaxy;
    }

    public int zzuF()
    {
        return zzazy;
    }

    public PlaceFilter zzuG()
    {
        return zzazz;
    }

    public NearbyAlertFilter zzuH()
    {
        return zzazA;
    }

}
