// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzg, zzf

public class DeviceStatus
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    private final int zzCY;
    private double zzSh;
    private boolean zzSi;
    private ApplicationMetadata zzUF;
    private int zzUu;
    private int zzUv;

    public DeviceStatus()
    {
        this(3, (0.0D / 0.0D), false, -1, null, -1);
    }

    DeviceStatus(int i, double d, boolean flag, int j, ApplicationMetadata applicationmetadata, int k)
    {
        zzCY = i;
        zzSh = d;
        zzSi = flag;
        zzUu = j;
        zzUF = applicationmetadata;
        zzUv = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof DeviceStatus))
            {
                return false;
            }
            obj = (DeviceStatus)obj;
            if (zzSh != ((DeviceStatus) (obj)).zzSh || zzSi != ((DeviceStatus) (obj)).zzSi || zzUu != ((DeviceStatus) (obj)).zzUu || !zzf.zza(zzUF, ((DeviceStatus) (obj)).zzUF) || zzUv != ((DeviceStatus) (obj)).zzUv)
            {
                return false;
            }
        }
        return true;
    }

    public ApplicationMetadata getApplicationMetadata()
    {
        return zzUF;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Double.valueOf(zzSh), Boolean.valueOf(zzSi), Integer.valueOf(zzUu), zzUF, Integer.valueOf(zzUv)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

    public double zzlO()
    {
        return zzSh;
    }

    public int zzlP()
    {
        return zzUu;
    }

    public int zzlQ()
    {
        return zzUv;
    }

    public boolean zzlX()
    {
        return zzSi;
    }

}
