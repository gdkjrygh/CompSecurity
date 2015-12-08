// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
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
    final int zzCY;
    final List zzazs;
    private final Set zzazt;
    final List zzazu;
    final List zzazv;
    private final Set zzazw;
    private final Set zzazx;

    NearbyAlertFilter(int i, List list, List list1, List list2)
    {
        zzCY = i;
        if (list1 == null)
        {
            list1 = Collections.emptyList();
        } else
        {
            list1 = Collections.unmodifiableList(list1);
        }
        zzazs = list1;
        if (list2 == null)
        {
            list1 = Collections.emptyList();
        } else
        {
            list1 = Collections.unmodifiableList(list2);
        }
        zzazv = list1;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        zzazu = list;
        zzazt = zzl(zzazs);
        zzazx = zzl(zzazv);
        zzazw = zzl(zzazu);
    }

    public static NearbyAlertFilter zza(Collection collection, Collection collection1, Collection collection2)
    {
        if ((collection == null || collection.isEmpty()) && (collection1 == null || collection1.isEmpty()) && (collection2 == null || collection2.isEmpty()))
        {
            throw new IllegalArgumentException("NearbyAlertFilters must contain at least onePlaceId, PlaceType, or UserDataType to match results with.");
        } else
        {
            return new NearbyAlertFilter(0, zzc(collection), zzc(collection1), zzc(collection2));
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
            if (!zzazt.equals(((NearbyAlertFilter) (obj)).zzazt) || !zzazx.equals(((NearbyAlertFilter) (obj)).zzazx) || !zzazw.equals(((NearbyAlertFilter) (obj)).zzazw))
            {
                return false;
            }
        }
        return true;
    }

    public Set getPlaceIds()
    {
        return zzazw;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzazt, zzazx, zzazw
        });
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzt.zza zza1 = zzt.zzt(this);
        if (!zzazt.isEmpty())
        {
            zza1.zzg("types", zzazt);
        }
        if (!zzazw.isEmpty())
        {
            zza1.zzg("placeIds", zzazw);
        }
        if (!zzazx.isEmpty())
        {
            zza1.zzg("requestedUserDataTypes", zzazx);
        }
        return zza1.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd zzd1 = CREATOR;
        zzd.zza(this, parcel, i);
    }

}
