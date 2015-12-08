// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            zza, zzg

public final class PlaceFilter extends com.google.android.gms.location.places.zza
    implements SafeParcelable
{
    public static final class zza
    {

        private Collection zzaDA;
        private Collection zzaDB;
        private String zzaDC[];
        private boolean zzaDz;

        public PlaceFilter zzwf()
        {
            List list = null;
            ArrayList arraylist;
            ArrayList arraylist1;
            if (zzaDA != null)
            {
                arraylist = new ArrayList(zzaDA);
            } else
            {
                arraylist = null;
            }
            if (zzaDB != null)
            {
                arraylist1 = new ArrayList(zzaDB);
            } else
            {
                arraylist1 = null;
            }
            if (zzaDC != null)
            {
                list = Arrays.asList(zzaDC);
            }
            return new PlaceFilter(arraylist, zzaDz, list, arraylist1);
        }

        private zza()
        {
            zzaDA = null;
            zzaDz = false;
            zzaDB = null;
            zzaDC = null;
        }

    }


    public static final zzg CREATOR = new zzg();
    final int mVersionCode;
    final List zzaDm;
    private final Set zzaDn;
    final List zzaDo;
    final List zzaDp;
    private final Set zzaDq;
    private final Set zzaDr;
    final boolean zzaDz;

    public PlaceFilter()
    {
        this(false, null);
    }

    PlaceFilter(int i, List list, boolean flag, List list1, List list2)
    {
        mVersionCode = i;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        zzaDm = list;
        zzaDz = flag;
        if (list2 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list2);
        }
        zzaDp = list;
        if (list1 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list1);
        }
        zzaDo = list;
        zzaDn = zzl(zzaDm);
        zzaDr = zzl(zzaDp);
        zzaDq = zzl(zzaDo);
    }

    public PlaceFilter(Collection collection, boolean flag, Collection collection1, Collection collection2)
    {
        this(0, zzf(collection), flag, zzf(collection1), zzf(collection2));
    }

    public PlaceFilter(boolean flag, Collection collection)
    {
        this(null, flag, collection, null);
    }

    public static PlaceFilter zzwe()
    {
        return (new zza()).zzwf();
    }

    public int describeContents()
    {
        zzg zzg1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceFilter))
            {
                return false;
            }
            obj = (PlaceFilter)obj;
            if (!zzaDn.equals(((PlaceFilter) (obj)).zzaDn) || zzaDz != ((PlaceFilter) (obj)).zzaDz || !zzaDr.equals(((PlaceFilter) (obj)).zzaDr) || !zzaDq.equals(((PlaceFilter) (obj)).zzaDq))
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

    public Set getPlaceTypes()
    {
        return zzaDn;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            zzaDn, Boolean.valueOf(zzaDz), zzaDr, zzaDq
        });
    }

    public boolean isRestrictedToPlacesOpenNow()
    {
        return zzaDz;
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzw.zza zza1 = zzw.zzu(this);
        if (!zzaDn.isEmpty())
        {
            zza1.zzg("types", zzaDn);
        }
        zza1.zzg("requireOpenNow", Boolean.valueOf(zzaDz));
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
        zzg zzg1 = CREATOR;
        zzg.zza(this, parcel, i);
    }

    public Set zzwd()
    {
        return zzaDr;
    }

}
