// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            zzc

public class AutocompleteFilter
    implements SafeParcelable
{

    public static final zzc CREATOR = new zzc();
    final int zzCY;
    final boolean zzazr;
    final List zzazs;
    private final Set zzazt;

    AutocompleteFilter(int i, boolean flag, Collection collection)
    {
        zzCY = i;
        zzazr = flag;
        if (collection == null)
        {
            collection = Collections.emptyList();
        } else
        {
            collection = new ArrayList(collection);
        }
        zzazs = collection;
        if (zzazs.isEmpty())
        {
            zzazt = Collections.emptySet();
            return;
        } else
        {
            zzazt = Collections.unmodifiableSet(new HashSet(zzazs));
            return;
        }
    }

    public static AutocompleteFilter create(Collection collection)
    {
        return zza(true, collection);
    }

    public static AutocompleteFilter zza(boolean flag, Collection collection)
    {
        return new AutocompleteFilter(0, flag, collection);
    }

    public int describeContents()
    {
        zzc zzc1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof AutocompleteFilter))
            {
                return false;
            }
            obj = (AutocompleteFilter)obj;
            if (!zzazt.equals(((AutocompleteFilter) (obj)).zzazt) || zzazr != ((AutocompleteFilter) (obj)).zzazr)
            {
                return false;
            }
        }
        return true;
    }

    public Set getPlaceTypes()
    {
        return zzazt;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Boolean.valueOf(zzazr), zzazt
        });
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzt.zza zza1 = zzt.zzt(this);
        if (!zzazr)
        {
            zza1.zzg("restrictedToPlaces", Boolean.valueOf(zzazr));
        }
        zza1.zzg("placeTypes", zzazt);
        return zza1.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc zzc1 = CREATOR;
        zzc.zza(this, parcel, i);
    }

    public boolean zzuE()
    {
        return zzazr;
    }

}
