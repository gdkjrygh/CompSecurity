// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            zze

public class PlaceUserData
    implements SafeParcelable
{

    public static final zze CREATOR = new zze();
    final int zzCY;
    private final String zzOx;
    private final List zzaBj;
    private final List zzaBk;
    private final List zzaBl;
    private final String zzazK;

    PlaceUserData(int i, String s, String s1, List list, List list1, List list2)
    {
        zzCY = i;
        zzOx = s;
        zzazK = s1;
        zzaBj = list;
        zzaBk = list1;
        zzaBl = list2;
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
            if (!(obj instanceof PlaceUserData))
            {
                return false;
            }
            obj = (PlaceUserData)obj;
            if (!zzOx.equals(((PlaceUserData) (obj)).zzOx) || !zzazK.equals(((PlaceUserData) (obj)).zzazK) || !zzaBj.equals(((PlaceUserData) (obj)).zzaBj) || !zzaBk.equals(((PlaceUserData) (obj)).zzaBk) || !zzaBl.equals(((PlaceUserData) (obj)).zzaBl))
            {
                return false;
            }
        }
        return true;
    }

    public String getPlaceId()
    {
        return zzazK;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzOx, zzazK, zzaBj, zzaBk, zzaBl
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("accountName", zzOx).zzg("placeId", zzazK).zzg("testDataImpls", zzaBj).zzg("placeAliases", zzaBk).zzg("hereContents", zzaBl).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze zze1 = CREATOR;
        zze.zza(this, parcel, i);
    }

    public String zzvb()
    {
        return zzOx;
    }

    public List zzvc()
    {
        return zzaBk;
    }

    public List zzvd()
    {
        return zzaBl;
    }

    public List zzve()
    {
        return zzaBj;
    }

}
