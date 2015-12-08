// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzs

public class PlacesParams
    implements SafeParcelable
{

    public static final zzs CREATOR = new zzs();
    public static final PlacesParams zzaEY = new PlacesParams("com.google.android.gms", Locale.getDefault(), null);
    public final int versionCode;
    public final String zzaDU;
    public final String zzaEZ;
    public final String zzaFa;
    public final String zzaFb;
    public final String zzaFc;
    public final int zzaFd;

    public PlacesParams(int i, String s, String s1, String s2, String s3, String s4, int j)
    {
        versionCode = i;
        zzaEZ = s;
        zzaFa = s1;
        zzaFb = s2;
        zzaDU = s3;
        zzaFc = s4;
        zzaFd = j;
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
            if (!zzaFa.equals(((PlacesParams) (obj)).zzaFa) || !zzaEZ.equals(((PlacesParams) (obj)).zzaEZ) || !zzw.equal(zzaFb, ((PlacesParams) (obj)).zzaFb) || !zzw.equal(zzaDU, ((PlacesParams) (obj)).zzaDU) || !zzw.equal(zzaFc, ((PlacesParams) (obj)).zzaFc))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            zzaEZ, zzaFa, zzaFb, zzaDU, zzaFc
        });
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("clientPackageName", zzaEZ).zzg("locale", zzaFa).zzg("accountName", zzaFb).zzg("gCoreClientName", zzaDU).zzg("chargedPackageName", zzaFc).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzs zzs1 = CREATOR;
        zzs.zza(this, parcel, i);
    }

}
