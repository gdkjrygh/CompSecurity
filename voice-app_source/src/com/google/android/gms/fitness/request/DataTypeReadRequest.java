// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzmh;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzj

public class DataTypeReadRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    private final String mName;
    private final int zzCY;
    private final String zzMZ;
    private final zzmh zzamk;

    DataTypeReadRequest(int i, String s, IBinder ibinder, String s1)
    {
        zzCY = i;
        mName = s;
        if (ibinder == null)
        {
            s = null;
        } else
        {
            s = com.google.android.gms.internal.zzmh.zza.zzbs(ibinder);
        }
        zzamk = s;
        zzMZ = s1;
    }

    public DataTypeReadRequest(String s, zzmh zzmh1, String s1)
    {
        zzCY = 2;
        mName = s;
        zzamk = zzmh1;
        zzMZ = s1;
    }

    private boolean zzb(DataTypeReadRequest datatypereadrequest)
    {
        return zzt.equal(mName, datatypereadrequest.mName);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof DataTypeReadRequest) && zzb((DataTypeReadRequest)obj);
    }

    public String getName()
    {
        return mName;
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
            mName
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("name", mName).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        return zzamk.asBinder();
    }

}
