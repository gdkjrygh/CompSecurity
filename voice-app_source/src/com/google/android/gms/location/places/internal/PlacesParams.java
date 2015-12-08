// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzs

public class PlacesParams
    implements SafeParcelable
{

    public static final zzs CREATOR = new zzs();
    public static final PlacesParams zzaAY = new PlacesParams("com.google.android.gms", Locale.getDefault(), null);
    public final int versionCode;
    public final String zzaAZ;
    public final String zzaBa;
    public final String zzaBb;
    public final String zzaBc;
    public final int zzaBd;
    public final String zzazX;

    public PlacesParams(int i, String s, String s1, String s2, String s3, String s4, int j)
    {
        versionCode = i;
        zzaAZ = s;
        zzaBa = s1;
        zzaBb = s2;
        zzazX = s3;
        zzaBc = s4;
        zzaBd = j;
    }

    public PlacesParams(String s, Locale locale, String s1)
    {
        this(1, s, locale.toString(), s1, null, null, GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public PlacesParams(String s, Locale locale, String s1, String s2, String s3)
    {
        this(1, s, locale.toString(), s1, s2, s3, GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public int describeContents()
    {
        zzs zzs1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof PlacesParams))
            {
                return false;
            }
            obj = (PlacesParams)obj;
            if (!zzaBa.equals(((PlacesParams) (obj)).zzaBa) || !zzaAZ.equals(((PlacesParams) (obj)).zzaAZ) || !zzt.equal(zzaBb, ((PlacesParams) (obj)).zzaBb) || !zzt.equal(zzazX, ((PlacesParams) (obj)).zzazX) || !zzt.equal(zzaBc, ((PlacesParams) (obj)).zzaBc))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzaAZ, zzaBa, zzaBb, zzazX, zzaBc
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("clientPackageName", zzaAZ).zzg("locale", zzaBa).zzg("accountName", zzaBb).zzg("gCoreClientName", zzazX).zzg("chargedPackageName", zzaBc).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzs zzs1 = CREATOR;
        zzs.zza(this, parcel, i);
    }

}
