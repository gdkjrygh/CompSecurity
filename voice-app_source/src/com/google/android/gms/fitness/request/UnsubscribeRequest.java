// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzmu;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzae

public class UnsubscribeRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzae();
    private final int zzCY;
    private final String zzMZ;
    private final DataType zzajF;
    private final DataSource zzajG;
    private final zzmu zzalN;

    UnsubscribeRequest(int i, DataType datatype, DataSource datasource, IBinder ibinder, String s)
    {
        zzCY = i;
        zzajF = datatype;
        zzajG = datasource;
        if (ibinder == null)
        {
            datatype = null;
        } else
        {
            datatype = com.google.android.gms.internal.zzmu.zza.zzbF(ibinder);
        }
        zzalN = datatype;
        zzMZ = s;
    }

    public UnsubscribeRequest(DataType datatype, DataSource datasource, zzmu zzmu1, String s)
    {
        zzCY = 2;
        zzajF = datatype;
        zzajG = datasource;
        zzalN = zzmu1;
        zzMZ = s;
    }

    private boolean zzb(UnsubscribeRequest unsubscriberequest)
    {
        return zzt.equal(zzajG, unsubscriberequest.zzajG) && zzt.equal(zzajF, unsubscriberequest.zzajF);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof UnsubscribeRequest) && zzb((UnsubscribeRequest)obj);
    }

    public DataSource getDataSource()
    {
        return zzajG;
    }

    public DataType getDataType()
    {
        return zzajF;
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
            zzajG, zzajF
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzae.zza(this, parcel, i);
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

}
