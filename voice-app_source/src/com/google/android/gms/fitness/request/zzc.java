// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DailyTotalRequest

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void zza(DailyTotalRequest dailytotalrequest, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, dailytotalrequest.zzqU(), false);
        zzb.zzc(parcel, 1000, dailytotalrequest.getVersionCode());
        zzb.zza(parcel, 2, dailytotalrequest.getDataType(), i, false);
        zzb.zza(parcel, 3, dailytotalrequest.getPackageName(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcC(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzew(i);
    }

    public DailyTotalRequest zzcC(Parcel parcel)
    {
        String s;
        Object obj;
        Object obj1;
        int i;
        int j;
        s = null;
        j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        i = 0;
        obj1 = null;
        obj = null;
_L7:
        int k;
        if (parcel.dataPosition() >= j)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        k = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
        com.google.android.gms.common.internal.safeparcel.zza.zzbA(k);
        JVM INSTR lookupswitch 4: default 80
    //                   1: 109
    //                   2: 148
    //                   3: 171
    //                   1000: 127;
           goto _L1 _L2 _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_171;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
        Object obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L8:
        Object obj3 = obj1;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L7; else goto _L6
_L6:
        android.os.IBinder ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
        obj = obj1;
        obj1 = ibinder;
          goto _L8
_L5:
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L8
_L3:
        DataType datatype = (DataType)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, DataType.CREATOR);
        obj1 = obj;
        obj = datatype;
          goto _L8
        s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
        Object obj5 = obj;
        obj = obj1;
        obj1 = obj5;
          goto _L8
        if (parcel.dataPosition() != j)
        {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new DailyTotalRequest(i, ((android.os.IBinder) (obj)), ((DataType) (obj1)), s);
        }
    }

    public DailyTotalRequest[] zzew(int i)
    {
        return new DailyTotalRequest[i];
    }
}
