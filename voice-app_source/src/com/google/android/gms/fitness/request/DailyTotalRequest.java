// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzme;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzc

public class DailyTotalRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    private final int zzCY;
    private final String zzMZ;
    private final DataType zzajF;
    private final zzme zzalO;

    DailyTotalRequest(int i, IBinder ibinder, DataType datatype, String s)
    {
        zzCY = i;
        zzalO = com.google.android.gms.internal.zzme.zza.zzbp(ibinder);
        zzajF = datatype;
        zzMZ = s;
    }

    public DailyTotalRequest(zzme zzme1, DataType datatype, String s)
    {
        zzCY = 1;
        zzalO = zzme1;
        zzajF = datatype;
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

    public String toString()
    {
        return String.format("DailyTotalRequest{%s}", new Object[] {
            zzajF.zzqD()
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        return zzalO.asBinder();
    }

}
