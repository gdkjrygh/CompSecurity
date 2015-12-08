// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            zze, PlaceFilter, NearbyAlertFilter

public final class NearbyAlertRequest
    implements SafeParcelable
{

    public static final zze CREATOR = new zze();
    private final int mVersionCode;
    private final int zzaBA;
    private final int zzaDs;
    private final PlaceFilter zzaDt = null;
    private final NearbyAlertFilter zzaDu;
    private final boolean zzaDv;

    NearbyAlertRequest(int i, int j, int k, PlaceFilter placefilter, NearbyAlertFilter nearbyalertfilter, boolean flag)
    {
        mVersionCode = i;
        zzaBA = j;
        zzaDs = k;
        zzaDv = flag;
        if (nearbyalertfilter != null)
        {
            zzaDu = nearbyalertfilter;
        } else
        if (placefilter != null)
        {
            if (zza(placefilter))
            {
                zzaDu = NearbyAlertFilter.zza(placefilter.getPlaceIds(), placefilter.getPlaceTypes(), placefilter.zzwd());
            } else
            {
                zzaDu = null;
            }
        } else
        {
            zzaDu = null;
        }
    }

    public static boolean zza(PlaceFilter placefilter)
    {
        return placefilter.getPlaceTypes() != null && !placefilter.getPlaceTypes().isEmpty() || placefilter.getPlaceIds() != null && !placefilter.getPlaceIds().isEmpty() || placefilter.zzwd() != null && !placefilter.zzwd().isEmpty();
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
            if (zzaBA != ((NearbyAlertRequest) (obj)).zzaBA || zzaDs != ((NearbyAlertRequest) (obj)).zzaDs || !zzw.equal(zzaDt, ((NearbyAlertRequest) (obj)).zzaDt) || !zzw.equal(zzaDu, ((NearbyAlertRequest) (obj)).zzaDu))
            {
                return false;
            }
        }
        return true;
    }

    public int getVersionCode()
    {
        return mVersionCode;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Integer.valueOf(zzaBA), Integer.valueOf(zzaDs)
        });
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("transitionTypes", Integer.valueOf(zzaBA)).zzg("loiteringTimeMillis", Integer.valueOf(zzaDs)).zzg("nearbyAlertFilter", zzaDu).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze zze1 = CREATOR;
        zze.zza(this, parcel, i);
    }

    public int zzvW()
    {
        return zzaBA;
    }

    public int zzvZ()
    {
        return zzaDs;
    }

    public PlaceFilter zzwa()
    {
        return zzaDt;
    }

    public NearbyAlertFilter zzwb()
    {
        return zzaDu;
    }

    public boolean zzwc()
    {
        return zzaDv;
    }

}
