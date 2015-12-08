// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzmq;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzq

public class ReadRawRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzq();
    private final int zzCY;
    private final String zzMZ;
    private final boolean zzalZ;
    private final boolean zzama;
    private final zzmq zzamo;
    private final List zzamp;

    ReadRawRequest(int i, IBinder ibinder, String s, List list, boolean flag, boolean flag1)
    {
        zzCY = i;
        zzamo = com.google.android.gms.internal.zzmq.zza.zzbB(ibinder);
        zzamp = list;
        zzMZ = s;
        zzalZ = flag;
        zzama = flag1;
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

    public void writeToParcel(Parcel parcel, int i)
    {
        zzq.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        if (zzamo != null)
        {
            return zzamo.asBinder();
        } else
        {
            return null;
        }
    }

    public boolean zzqZ()
    {
        return zzama;
    }

    public boolean zzra()
    {
        return zzalZ;
    }

    public List zzrf()
    {
        return zzamp;
    }

}
