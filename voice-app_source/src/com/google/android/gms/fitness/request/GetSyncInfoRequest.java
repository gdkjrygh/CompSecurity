// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzmv;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzm

public class GetSyncInfoRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzm();
    private final int zzCY;
    private final String zzMZ;
    private final zzmv zzaml;

    GetSyncInfoRequest(int i, IBinder ibinder, String s)
    {
        zzCY = i;
        zzaml = com.google.android.gms.internal.zzmv.zza.zzbG(ibinder);
        zzMZ = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getPackageName()
    {
        return zzMZ;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public String toString()
    {
        return String.format("GetSyncInfoRequest {%d, %s, %s}", new Object[] {
            Integer.valueOf(zzCY), zzaml, zzMZ
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        return zzaml.asBinder();
    }

}
