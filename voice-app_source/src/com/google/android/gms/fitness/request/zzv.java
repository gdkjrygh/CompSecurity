// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//            SessionReadRequest

public class zzv
    implements android.os.Parcelable.Creator
{

    public zzv()
    {
    }

    static void zza(SessionReadRequest sessionreadrequest, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zza(parcel, 1, sessionreadrequest.getSessionName(), false);
        zzb.zzc(parcel, 1000, sessionreadrequest.getVersionCode());
        zzb.zza(parcel, 2, sessionreadrequest.getSessionId(), false);
        zzb.zza(parcel, 3, sessionreadrequest.zzkt());
        zzb.zza(parcel, 4, sessionreadrequest.zzqs());
        zzb.zzc(parcel, 5, sessionreadrequest.getDataTypes(), false);
        zzb.zzc(parcel, 6, sessionreadrequest.getDataSources(), false);
        zzb.zza(parcel, 7, sessionreadrequest.zzro());
        zzb.zza(parcel, 8, sessionreadrequest.zzqZ());
        zzb.zzb(parcel, 9, sessionreadrequest.getExcludedPackages(), false);
        zzb.zza(parcel, 10, sessionreadrequest.zzqU(), false);
        zzb.zza(parcel, 11, sessionreadrequest.getPackageName(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcU(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzeP(i);
    }

    public SessionReadRequest zzcU(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        String s2 = null;
        String s1 = null;
        long l1 = 0L;
        long l = 0L;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        boolean flag1 = false;
        boolean flag = false;
        java.util.ArrayList arraylist = null;
        android.os.IBinder ibinder = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 4: // '\004'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 5: // '\005'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, DataType.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, DataSource.CREATOR);
                    break;

                case 7: // '\007'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 9: // '\t'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, k);
                    break;

                case 10: // '\n'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 11: // '\013'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new SessionReadRequest(i, s2, s1, l1, l, arraylist2, arraylist1, flag1, flag, arraylist, ibinder, s);
            }
        } while (true);
    }

    public SessionReadRequest[] zzeP(int i)
    {
        return new SessionReadRequest[i];
    }
}
