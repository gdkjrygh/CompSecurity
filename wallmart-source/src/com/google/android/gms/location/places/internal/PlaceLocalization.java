// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzn

public final class PlaceLocalization
    implements SafeParcelable
{

    public static final zzn CREATOR = new zzn();
    public final String address;
    public final String name;
    public final int versionCode;
    public final String zzaEK;
    public final String zzaEL;
    public final List zzaEM;

    public PlaceLocalization(int i, String s, String s1, String s2, String s3, List list)
    {
        versionCode = i;
        name = s;
        address = s1;
        zzaEK = s2;
        zzaEL = s3;
        zzaEM = list;
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
            if (!zzw.equal(name, ((PlaceLocalization) (obj)).name) || !zzw.equal(address, ((PlaceLocalization) (obj)).address) || !zzw.equal(zzaEK, ((PlaceLocalization) (obj)).zzaEK) || !zzw.equal(zzaEL, ((PlaceLocalization) (obj)).zzaEL) || !zzw.equal(zzaEM, ((PlaceLocalization) (obj)).zzaEM))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            name, address, zzaEK, zzaEL
        });
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("name", name).zzg("address", address).zzg("internationalPhoneNumber", zzaEK).zzg("regularOpenHours", zzaEL).zzg("attributions", zzaEM).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzn zzn1 = CREATOR;
        zzn.zza(this, parcel, i);
    }

}
