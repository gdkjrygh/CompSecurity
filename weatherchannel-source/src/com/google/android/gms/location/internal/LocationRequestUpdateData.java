// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzc;
import com.google.android.gms.location.zzd;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzl, LocationRequestInternal

public class LocationRequestUpdateData
    implements SafeParcelable
{

    public static final zzl CREATOR = new zzl();
    PendingIntent mPendingIntent;
    private final int zzCY;
    int zzazf;
    LocationRequestInternal zzazg;
    zzd zzazh;
    zzc zzazi;

    LocationRequestUpdateData(int i, int j, LocationRequestInternal locationrequestinternal, IBinder ibinder, PendingIntent pendingintent, IBinder ibinder1)
    {
        Object obj = null;
        super();
        zzCY = i;
        zzazf = j;
        zzazg = locationrequestinternal;
        if (ibinder == null)
        {
            locationrequestinternal = null;
        } else
        {
            locationrequestinternal = com.google.android.gms.location.zzd.zza.zzbT(ibinder);
        }
        zzazh = locationrequestinternal;
        mPendingIntent = pendingintent;
        if (ibinder1 == null)
        {
            locationrequestinternal = obj;
        } else
        {
            locationrequestinternal = com.google.android.gms.location.zzc.zza.zzbS(ibinder1);
        }
        zzazi = locationrequestinternal;
    }

    public static LocationRequestUpdateData zza(LocationRequestInternal locationrequestinternal, zzc zzc1)
    {
        return new LocationRequestUpdateData(1, 1, locationrequestinternal, null, null, zzc1.asBinder());
    }

    public static LocationRequestUpdateData zza(zzc zzc1)
    {
        return new LocationRequestUpdateData(1, 2, null, null, null, zzc1.asBinder());
    }

    public static LocationRequestUpdateData zzb(LocationRequestInternal locationrequestinternal, PendingIntent pendingintent)
    {
        return new LocationRequestUpdateData(1, 1, locationrequestinternal, null, pendingintent, null);
    }

    public static LocationRequestUpdateData zzb(LocationRequestInternal locationrequestinternal, zzd zzd1)
    {
        return new LocationRequestUpdateData(1, 1, locationrequestinternal, zzd1.asBinder(), null, null);
    }

    public static LocationRequestUpdateData zzb(zzd zzd1)
    {
        return new LocationRequestUpdateData(1, 2, null, zzd1.asBinder(), null, null);
    }

    public static LocationRequestUpdateData zze(PendingIntent pendingintent)
    {
        return new LocationRequestUpdateData(1, 2, null, null, pendingintent, null);
    }

    public int describeContents()
    {
        return 0;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

    IBinder zzuy()
    {
        if (zzazh == null)
        {
            return null;
        } else
        {
            return zzazh.asBinder();
        }
    }

    IBinder zzuz()
    {
        if (zzazi == null)
        {
            return null;
        } else
        {
            return zzazi.asBinder();
        }
    }

}
