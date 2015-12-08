// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.internal.zzmu;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zze

public class DataInsertRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    private final int zzCY;
    private final String zzMZ;
    private final DataSet zzakO;
    private final zzmu zzalN;
    private final boolean zzalT;

    DataInsertRequest(int i, DataSet dataset, IBinder ibinder, String s, boolean flag)
    {
        zzCY = i;
        zzakO = dataset;
        if (ibinder == null)
        {
            dataset = null;
        } else
        {
            dataset = com.google.android.gms.internal.zzmu.zza.zzbF(ibinder);
        }
        zzalN = dataset;
        zzMZ = s;
        zzalT = flag;
    }

    public DataInsertRequest(DataSet dataset, zzmu zzmu1, String s, boolean flag)
    {
        zzCY = 3;
        zzakO = dataset;
        zzalN = zzmu1;
        zzMZ = s;
        zzalT = flag;
    }

    private boolean zzb(DataInsertRequest datainsertrequest)
    {
        return zzt.equal(zzakO, datainsertrequest.zzakO);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof DataInsertRequest) && zzb((DataInsertRequest)obj);
    }

    public String getPackageName()
    {
        return zzMZ;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzakO
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("dataSet", zzakO).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

    public DataSet zzqK()
    {
        return zzakO;
    }

    public IBinder zzqU()
    {
        if (zzalN == null)
        {
            return null;
        } else
        {
            return zzalN.asBinder();
        }
    }

    public boolean zzqY()
    {
        return zzalT;
    }

}
