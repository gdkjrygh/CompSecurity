// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.Session;

// Referenced classes of package com.google.android.gms.fitness.request:
//            SessionStartRequest

public class zzx
    implements android.os.Parcelable.Creator
{

    public zzx()
    {
    }

    static void zza(SessionStartRequest sessionstartrequest, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, sessionstartrequest.getSession(), i, false);
        zzb.zzc(parcel, 1000, sessionstartrequest.getVersionCode());
        zzb.zza(parcel, 2, sessionstartrequest.zzqU(), false);
        zzb.zza(parcel, 3, sessionstartrequest.getPackageName(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcW(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzeR(i);
    }

    public SessionStartRequest zzcW(Parcel parcel)
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
        Object obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L8:
        Object obj3 = obj1;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L7; else goto _L6
_L6:
        Session session = (Session)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Session.CREATOR);
        obj = obj1;
        obj1 = session;
          goto _L8
_L5:
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L8
_L3:
        android.os.IBinder ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
        obj1 = obj;
        obj = ibinder;
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
            return new SessionStartRequest(i, ((Session) (obj)), ((android.os.IBinder) (obj1)), s);
        }
    }

    public SessionStartRequest[] zzeR(int i)
    {
        return new SessionStartRequest[i];
    }
}
