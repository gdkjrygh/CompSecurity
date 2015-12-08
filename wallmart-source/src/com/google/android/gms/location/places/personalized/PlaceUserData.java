// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            zze

public class PlaceUserData
    implements SafeParcelable
{

    public static final zze CREATOR = new zze();
    final int mVersionCode;
    private final String zzQE;
    private final String zzaDH;
    private final List zzaFj;
    private final List zzaFk;
    private final List zzaFl;

    PlaceUserData(int i, String s, String s1, List list, List list1, List list2)
    {
        mVersionCode = i;
        zzQE = s;
        zzaDH = s1;
        zzaFj = list;
        zzaFk = list1;
        zzaFl = list2;
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
            if (!zzQE.equals(((PlaceUserData) (obj)).zzQE) || !zzaDH.equals(((PlaceUserData) (obj)).zzaDH) || !zzaFj.equals(((PlaceUserData) (obj)).zzaFj) || !zzaFk.equals(((PlaceUserData) (obj)).zzaFk) || !zzaFl.equals(((PlaceUserData) (obj)).zzaFl))
            {
                return false;
            }
        }
        return true;
    }

    public String getPlaceId()
    {
        return zzaDH;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            zzQE, zzaDH, zzaFj, zzaFk, zzaFl
        });
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("accountName", zzQE).zzg("placeId", zzaDH).zzg("testDataImpls", zzaFj).zzg("placeAliases", zzaFk).zzg("hereContents", zzaFl).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze zze1 = CREATOR;
        zze.zza(this, parcel, i);
    }

    public String zzww()
    {
        return zzQE;
    }

    public List zzwx()
    {
        return zzaFk;
    }

    public List zzwy()
    {
        return zzaFl;
    }

    public List zzwz()
    {
        return zzaFj;
    }

}
