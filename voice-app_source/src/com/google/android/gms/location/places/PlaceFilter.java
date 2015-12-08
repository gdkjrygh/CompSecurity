// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            zza, zzf

public final class PlaceFilter extends com.google.android.gms.location.places.zza
    implements SafeParcelable
{
    public static final class zza
    {

        private boolean zzazC;
        private Collection zzazD;
        private Collection zzazE;
        private String zzazF[];

        public PlaceFilter zzuK()
        {
            List list = null;
            ArrayList arraylist;
            ArrayList arraylist1;
            if (zzazD != null)
            {
                arraylist = new ArrayList(zzazD);
            } else
            {
                arraylist = null;
            }
            if (zzazE != null)
            {
                arraylist1 = new ArrayList(zzazE);
            } else
            {
                arraylist1 = null;
            }
            if (zzazF != null)
            {
                list = Arrays.asList(zzazF);
            }
            return new PlaceFilter(arraylist, zzazC, list, arraylist1);
        }

        private zza()
        {
            zzazD = null;
            zzazC = false;
            zzazE = null;
            zzazF = null;
        }

    }


    public static final zzf CREATOR = new zzf();
    final int zzCY;
    final boolean zzazC;
    final List zzazs;
    private final Set zzazt;
    final List zzazu;
    final List zzazv;
    private final Set zzazw;
    private final Set zzazx;

    public PlaceFilter()
    {
        this(false, null);
    }

    PlaceFilter(int i, List list, boolean flag, List list1, List list2)
    {
        zzCY = i;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        zzazs = list;
        zzazC = flag;
        if (list2 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list2);
        }
        zzazv = list;
        if (list1 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list1);
        }
        zzazu = list;
        zzazt = zzl(zzazs);
        zzazx = zzl(zzazv);
        zzazw = zzl(zzazu);
    }

    public PlaceFilter(Collection collection, boolean flag, Collection collection1, Collection collection2)
    {
        this(0, zzc(collection), flag, zzc(collection1), zzc(collection2));
    }

    public PlaceFilter(boolean flag, Collection collection)
    {
        this(null, flag, collection, null);
    }

    public static PlaceFilter zzuJ()
    {
        return (new zza()).zzuK();
    }

    public int describeContents()
    {
        zzf zzf1 = CREATOR;
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
            if (!zzazt.equals(((PlaceFilter) (obj)).zzazt) || zzazC != ((PlaceFilter) (obj)).zzazC || !zzazx.equals(((PlaceFilter) (obj)).zzazx) || !zzazw.equals(((PlaceFilter) (obj)).zzazw))
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

    public Set getPlaceTypes()
    {
        return zzazt;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzazt, Boolean.valueOf(zzazC), zzazx, zzazw
        });
    }

    public boolean isRestrictedToPlacesOpenNow()
    {
        return zzazC;
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzt.zza zza1 = zzt.zzt(this);
        if (!zzazt.isEmpty())
        {
            zza1.zzg("types", zzazt);
        }
        zza1.zzg("requireOpenNow", Boolean.valueOf(zzazC));
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
        zzf zzf1 = CREATOR;
        zzf.zza(this, parcel, i);
    }

    public Set zzuI()
    {
        return zzazx;
    }

}
