// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            DataItemParcelable

public class zzab
    implements android.os.Parcelable.Creator
{

    public zzab()
    {
    }

    static void zza(DataItemParcelable dataitemparcelable, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, dataitemparcelable.zzCY);
        zzb.zza(parcel, 2, dataitemparcelable.getUri(), i, false);
        zzb.zza(parcel, 4, dataitemparcelable.zzAR(), false);
        zzb.zza(parcel, 5, dataitemparcelable.getData(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzgU(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzkc(i);
    }

    public DataItemParcelable zzgU(Parcel parcel)
    {
        byte abyte0[];
        Object obj;
        Object obj1;
        int i;
        int j;
        abyte0 = null;
        j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        i = 0;
        obj1 = null;
        obj = null;
_L7:
        int k;
        if (parcel.dataPosition() >= j)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        k = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
        com.google.android.gms.common.internal.safeparcel.zza.zzbA(k);
        JVM INSTR tableswitch 1 5: default 72
    //                   1 101
    //                   2 122
    //                   3 72
    //                   4 146
    //                   5 163;
           goto _L1 _L2 _L3 _L1 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_163;
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
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L8
_L3:
        Uri uri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Uri.CREATOR);
        obj = obj1;
        obj1 = uri;
          goto _L8
_L4:
        android.os.Bundle bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, k);
        obj1 = obj;
        obj = bundle;
          goto _L8
        abyte0 = com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel, k);
        Object obj5 = obj;
        obj = obj1;
        obj1 = obj5;
          goto _L8
        if (parcel.dataPosition() != j)
        {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new DataItemParcelable(i, ((Uri) (obj)), ((android.os.Bundle) (obj1)), abyte0);
        }
    }

    public DataItemParcelable[] zzkc(int i)
    {
        return new DataItemParcelable[i];
    }
}
