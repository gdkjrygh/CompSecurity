// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            PointOfInterest, LatLng

public class zzg
    implements android.os.Parcelable.Creator
{

    public zzg()
    {
    }

    static void zza(PointOfInterest pointofinterest, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, pointofinterest.getVersionCode());
        zzb.zza(parcel, 2, pointofinterest.zzaHy, i, false);
        zzb.zza(parcel, 3, pointofinterest.zzaHz, false);
        zzb.zza(parcel, 4, pointofinterest.name, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfc(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhC(i);
    }

    public PointOfInterest zzfc(Parcel parcel)
    {
        String s;
        Object obj;
        Object obj1;
        int i;
        int j;
        s = null;
        j = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        i = 0;
        obj1 = null;
        obj = null;
_L7:
        int k;
        if (parcel.dataPosition() >= j)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        k = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
        com.google.android.gms.common.internal.safeparcel.zza.zzbH(k);
        JVM INSTR tableswitch 1 4: default 68
    //                   1 97
    //                   2 118
    //                   3 142
    //                   4 159;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_159;
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
        LatLng latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, LatLng.CREATOR);
        obj = obj1;
        obj1 = latlng;
          goto _L8
_L4:
        String s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
        obj1 = obj;
        obj = s1;
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
            return new PointOfInterest(i, ((LatLng) (obj)), ((String) (obj1)), s);
        }
    }

    public PointOfInterest[] zzhC(int i)
    {
        return new PointOfInterest[i];
    }
}
