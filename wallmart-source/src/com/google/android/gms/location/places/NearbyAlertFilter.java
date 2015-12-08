// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            zza, zzd

public final class NearbyAlertFilter extends zza
    implements SafeParcelable
{

    public static final zzd CREATOR = new zzd();
    final int mVersionCode;
    final List zzaDm;
    private final Set zzaDn;
    final List zzaDo;
    final List zzaDp;
    private final Set zzaDq;
    private final Set zzaDr;

    NearbyAlertFilter(int i, List list, List list1, List list2)
    {
        mVersionCode = i;
        if (list1 == null)
        {
            list1 = Collections.emptyList();
        } else
        {
            list1 = Collections.unmodifiableList(list1);
        }
        zzaDm = list1;
        if (list2 == null)
        {
            list1 = Collections.emptyList();
        } else
        {
            list1 = Collections.unmodifiableList(list2);
        }
        zzaDp = list1;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        zzaDo = list;
        zzaDn = zzl(zzaDm);
        zzaDr = zzl(zzaDp);
        zzaDq = zzl(zzaDo);
    }

    public static NearbyAlertFilter zza(Collection collection, Collection collection1, Collection collection2)
    {
        if ((collection == null || collection.isEmpty()) && (collection1 == null || collection1.isEmpty()) && (collection2 == null || collection2.isEmpty()))
        {
            throw new IllegalArgumentException("NearbyAlertFilters must contain at least onePlaceId, PlaceType, or UserDataType to match results with.");
        } else
        {
            return new NearbyAlertFilter(0, zzf(collection), zzf(collection1), zzf(collection2));
        }
    }

    public int describeContents()
    {
        zzd zzd1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof NearbyAlertFilter))
            {
                return false;
            }
            obj = (NearbyAlertFilter)obj;
            if (!zzaDn.equals(((NearbyAlertFilter) (obj)).zzaDn) || !zzaDr.equals(((NearbyAlertFilter) (obj)).zzaDr) || !zzaDq.equals(((NearbyAlertFilter) (obj)).zzaDq))
            {
                return false;
            }
        }
        return true;
    }

    public Set getPlaceIds()
    {
        return zzaDq;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            zzaDn, zzaDr, zzaDq
        });
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzw.zza zza1 = zzw.zzu(this);
        if (!zzaDn.isEmpty())
        {
            zza1.zzg("types", zzaDn);
        }
        if (!zzaDq.isEmpty())
        {
            zza1.zzg("placeIds", zzaDq);
        }
        if (!zzaDr.isEmpty())
        {
            zza1.zzg("requestedUserDataTypes", zzaDr);
        }
        return zza1.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd zzd1 = CREATOR;
        zzd.zza(this, parcel, i);
    }

}
