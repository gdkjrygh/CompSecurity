// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zza

public class BleDevicesResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    private final int zzCY;
    private final Status zzOt;
    private final List zzamO;

    BleDevicesResult(int i, List list, Status status)
    {
        zzCY = i;
        zzamO = Collections.unmodifiableList(list);
        zzOt = status;
    }

    public BleDevicesResult(List list, Status status)
    {
        zzCY = 3;
        zzamO = Collections.unmodifiableList(list);
        zzOt = status;
    }

    public static BleDevicesResult zzJ(Status status)
    {
        return new BleDevicesResult(Collections.emptyList(), status);
    }

    private boolean zzb(BleDevicesResult bledevicesresult)
    {
        return zzOt.equals(bledevicesresult.zzOt) && zzt.equal(zzamO, bledevicesresult.zzamO);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof BleDevicesResult) && zzb((BleDevicesResult)obj);
    }

    public List getClaimedBleDevices()
    {
        return zzamO;
    }

    public List getClaimedBleDevices(DataType datatype)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = zzamO.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            BleDevice bledevice = (BleDevice)iterator.next();
            if (bledevice.getDataTypes().contains(datatype))
            {
                arraylist.add(bledevice);
            }
        } while (true);
        return Collections.unmodifiableList(arraylist);
    }

    public Status getStatus()
    {
        return zzOt;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzOt, zzamO
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("status", zzOt).zzg("bleDevices", zzamO).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

}
