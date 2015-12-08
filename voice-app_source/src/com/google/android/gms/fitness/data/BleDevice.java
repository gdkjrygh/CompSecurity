// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzlt;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzb

public class BleDevice
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private final String mName;
    private final int zzCY;
    private final String zzajO;
    private final List zzajP;
    private final List zzajQ;

    BleDevice(int i, String s, String s1, List list, List list1)
    {
        zzCY = i;
        zzajO = s;
        mName = s1;
        zzajP = Collections.unmodifiableList(list);
        zzajQ = Collections.unmodifiableList(list1);
    }

    private boolean zza(BleDevice bledevice)
    {
        return mName.equals(bledevice.mName) && zzajO.equals(bledevice.zzajO) && zzlt.zza(bledevice.zzajP, zzajP) && zzlt.zza(zzajQ, bledevice.zzajQ);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof BleDevice) && zza((BleDevice)obj);
    }

    public String getAddress()
    {
        return zzajO;
    }

    public List getDataTypes()
    {
        return zzajQ;
    }

    public String getName()
    {
        return mName;
    }

    public List getSupportedProfiles()
    {
        return zzajP;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            mName, zzajO, zzajP, zzajQ
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("name", mName).zzg("address", zzajO).zzg("dataTypes", zzajQ).zzg("supportedProfiles", zzajP).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
