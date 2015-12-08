// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzoj;
import com.google.android.gms.internal.zzok;
import com.google.android.gms.internal.zzol;
import com.google.android.gms.nearby.bootstrap.Device;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.request:
//            zza

public class ConnectRequest
    implements SafeParcelable
{

    public static final zza CREATOR = new zza();
    private final String description;
    private final String name;
    final int versionCode;
    private final long zzPr;
    private final byte zzaFg;
    private final Device zzaFh;
    private final zzoj zzaFi;
    private final zzok zzaFj;
    private final zzol zzaFk;
    private final String zzaFl;

    ConnectRequest(int i, Device device, String s, String s1, byte byte0, long l, 
            String s2, IBinder ibinder, IBinder ibinder1, IBinder ibinder2)
    {
        versionCode = i;
        zzaFh = (Device)zzu.zzu(device);
        name = zzu.zzcj(s);
        description = (String)zzu.zzu(s1);
        zzaFg = byte0;
        zzPr = l;
        zzaFl = s2;
        zzu.zzu(ibinder);
        zzaFi = com.google.android.gms.internal.zzoj.zza.zzcV(ibinder);
        zzu.zzu(ibinder1);
        zzaFj = com.google.android.gms.internal.zzok.zza.zzcW(ibinder1);
        zzu.zzu(ibinder2);
        zzaFk = com.google.android.gms.internal.zzol.zza.zzcX(ibinder2);
    }

    public int describeContents()
    {
        zza zza1 = CREATOR;
        return 0;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public String getToken()
    {
        return zzaFl;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza zza1 = CREATOR;
        zza.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        if (zzaFk == null)
        {
            return null;
        } else
        {
            return zzaFk.asBinder();
        }
    }

    public byte zzwK()
    {
        return zzaFg;
    }

    public Device zzwM()
    {
        return zzaFh;
    }

    public long zzwN()
    {
        return zzPr;
    }

    public IBinder zzwO()
    {
        if (zzaFi == null)
        {
            return null;
        } else
        {
            return zzaFi.asBinder();
        }
    }

    public IBinder zzwP()
    {
        if (zzaFj == null)
        {
            return null;
        } else
        {
            return zzaFj.asBinder();
        }
    }

}
