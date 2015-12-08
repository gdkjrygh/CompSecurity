// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
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
    final int mVersionCode;
    final boolean zzaDl;
    final List zzaDm;
    private final Set zzaDn;

    AutocompleteFilter(int i, boolean flag, Collection collection)
    {
        mVersionCode = i;
        zzaDl = flag;
        if (collection == null)
        {
            collection = Collections.emptyList();
        } else
        {
            collection = new ArrayList(collection);
        }
        zzaDm = collection;
        if (zzaDm.isEmpty())
        {
            zzaDn = Collections.emptySet();
            return;
        } else
        {
            zzaDn = Collections.unmodifiableSet(new HashSet(zzaDm));
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
            if (!zzaDn.equals(((AutocompleteFilter) (obj)).zzaDn) || zzaDl != ((AutocompleteFilter) (obj)).zzaDl)
            {
                return false;
            }
        }
        return true;
    }

    public Set getPlaceTypes()
    {
        return zzaDn;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Boolean.valueOf(zzaDl), zzaDn
        });
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzw.zza zza1 = zzw.zzu(this);
        if (!zzaDl)
        {
            zza1.zzg("restrictedToPlaces", Boolean.valueOf(zzaDl));
        }
        zza1.zzg("placeTypes", zzaDn);
        return zza1.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc zzc1 = CREATOR;
        zzc.zza(this, parcel, i);
    }

    public boolean zzvY()
    {
        return zzaDl;
    }

}
