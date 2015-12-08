// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.plus.internal:
//            zzf

public class PlusCommonExtras
    implements SafeParcelable
{

    public static final zzf CREATOR = new zzf();
    private final int zzCY;
    private String zzaHr;
    private String zzaHs;

    public PlusCommonExtras()
    {
        zzCY = 1;
        zzaHr = "";
        zzaHs = "";
    }

    PlusCommonExtras(int i, String s, String s1)
    {
        zzCY = i;
        zzaHr = s;
        zzaHs = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlusCommonExtras)
        {
            if (zzCY == ((PlusCommonExtras) (obj = (PlusCommonExtras)obj)).zzCY && zzt.equal(zzaHr, ((PlusCommonExtras) (obj)).zzaHr) && zzt.equal(zzaHs, ((PlusCommonExtras) (obj)).zzaHs))
            {
                return true;
            }
        }
        return false;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Integer.valueOf(zzCY), zzaHr, zzaHs
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("versionCode", Integer.valueOf(zzCY)).zzg("Gpsrc", zzaHr).zzg("ClientCallingPackage", zzaHs).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    public String zzxv()
    {
        return zzaHr;
    }

    public String zzxw()
    {
        return zzaHs;
    }

    public void zzy(Bundle bundle)
    {
        bundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", zzc.zza(this));
    }

}
