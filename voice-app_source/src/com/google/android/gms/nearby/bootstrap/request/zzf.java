// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.bootstrap.Device;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.request:
//            SendDataRequest

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void zza(SendDataRequest senddatarequest, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, senddatarequest.zzwM(), i, false);
        zzb.zzc(parcel, 1000, senddatarequest.versionCode);
        zzb.zza(parcel, 2, senddatarequest.getData(), false);
        zzb.zza(parcel, 3, senddatarequest.zzqU(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfk(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhS(i);
    }

    public SendDataRequest zzfk(Parcel parcel)
    {
        android.os.IBinder ibinder;
        Object obj;
        byte abyte0[];
        int i;
        int j;
        ibinder = null;
        j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        i = 0;
        abyte0 = null;
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
    //                   2: 154
    //                   3: 171
    //                   1000: 133;
           goto _L1 _L2 _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_171;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
        byte abyte1[] = abyte0;
        abyte0 = ((byte []) (obj));
        obj = abyte1;
_L8:
        byte abyte2[] = abyte0;
        abyte0 = ((byte []) (obj));
        obj = abyte2;
        if (true) goto _L7; else goto _L6
_L6:
        Device device = (Device)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Device.CREATOR);
        obj = abyte0;
        abyte0 = device;
          goto _L8
_L5:
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
        Object obj1 = obj;
        obj = abyte0;
        abyte0 = ((byte []) (obj1));
          goto _L8
_L3:
        byte abyte3[] = com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel, k);
        abyte0 = ((byte []) (obj));
        obj = abyte3;
          goto _L8
        ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
        Object obj2 = obj;
        obj = abyte0;
        abyte0 = ((byte []) (obj2));
          goto _L8
        if (parcel.dataPosition() != j)
        {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new SendDataRequest(i, ((Device) (obj)), abyte0, ibinder);
        }
    }

    public SendDataRequest[] zzhS(int i)
    {
        return new SendDataRequest[i];
    }
}
