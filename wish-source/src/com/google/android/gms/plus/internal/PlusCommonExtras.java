// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.plus.internal:
//            zzf

public class PlusCommonExtras
    implements SafeParcelable
{

    public static final zzf CREATOR = new zzf();
    public static String TAG = "PlusCommonExtras";
    private String zzazd;
    private String zzaze;
    private final int zzzH;

    public PlusCommonExtras()
    {
        zzzH = 1;
        zzazd = "";
        zzaze = "";
    }

    PlusCommonExtras(int i, String s, String s1)
    {
        zzzH = i;
        zzazd = s;
        zzaze = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlusCommonExtras)
        {
            if (zzzH == ((PlusCommonExtras) (obj = (PlusCommonExtras)obj)).zzzH && zzu.equal(zzazd, ((PlusCommonExtras) (obj)).zzazd) && zzu.equal(zzaze, ((PlusCommonExtras) (obj)).zzaze))
            {
                return true;
            }
        }
        return false;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(zzzH), zzazd, zzaze
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("versionCode", Integer.valueOf(zzzH)).zzg("Gpsrc", zzazd).zzg("ClientCallingPackage", zzaze).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    public void zzt(Bundle bundle)
    {
        bundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", zzc.zza(this));
    }

    public String zzvy()
    {
        return zzazd;
    }

    public String zzvz()
    {
        return zzaze;
    }

}
