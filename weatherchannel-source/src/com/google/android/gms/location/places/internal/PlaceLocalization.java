// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzn

public final class PlaceLocalization
    implements SafeParcelable
{

    public static final zzn CREATOR = new zzn();
    public final String name;
    public final int versionCode;
    public final String zzaAM;
    public final String zzaAN;
    public final String zzaAO;
    public final List zzaAP;

    public PlaceLocalization(int i, String s, String s1, String s2, String s3, List list)
    {
        versionCode = i;
        name = s;
        zzaAM = s1;
        zzaAN = s2;
        zzaAO = s3;
        zzaAP = list;
    }

    public static PlaceLocalization zza(String s, String s1, String s2, String s3, List list)
    {
        return new PlaceLocalization(0, s, s1, s2, s3, list);
    }

    public int describeContents()
    {
        zzn zzn1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceLocalization))
            {
                return false;
            }
            obj = (PlaceLocalization)obj;
            if (!zzt.equal(name, ((PlaceLocalization) (obj)).name) || !zzt.equal(zzaAM, ((PlaceLocalization) (obj)).zzaAM) || !zzt.equal(zzaAN, ((PlaceLocalization) (obj)).zzaAN) || !zzt.equal(zzaAO, ((PlaceLocalization) (obj)).zzaAO) || !zzt.equal(zzaAP, ((PlaceLocalization) (obj)).zzaAP))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            name, zzaAM, zzaAN, zzaAO
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("name", name).zzg("address", zzaAM).zzg("internationalPhoneNumber", zzaAN).zzg("regularOpenHours", zzaAO).zzg("attributions", zzaAP).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzn zzn1 = CREATOR;
        zzn.zza(this, parcel, i);
    }

}
