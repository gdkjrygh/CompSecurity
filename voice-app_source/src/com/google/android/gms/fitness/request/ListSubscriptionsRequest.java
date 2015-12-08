// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzmp;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzp

public class ListSubscriptionsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzp();
    private final int zzCY;
    private final String zzMZ;
    private final DataType zzajF;
    private final zzmp zzamn;

    ListSubscriptionsRequest(int i, DataType datatype, IBinder ibinder, String s)
    {
        zzCY = i;
        zzajF = datatype;
        if (ibinder == null)
        {
            datatype = null;
        } else
        {
            datatype = com.google.android.gms.internal.zzmp.zza.zzbA(ibinder);
        }
        zzamn = datatype;
        zzMZ = s;
    }

    public ListSubscriptionsRequest(DataType datatype, zzmp zzmp1, String s)
    {
        zzCY = 2;
        zzajF = datatype;
        zzamn = zzmp1;
        zzMZ = s;
    }

    public int describeContents()
    {
        return 0;
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

    public void writeToParcel(Parcel parcel, int i)
    {
        zzp.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        if (zzamn == null)
        {
            return null;
        } else
        {
            return zzamn.asBinder();
        }
    }

}
