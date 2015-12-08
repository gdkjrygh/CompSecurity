// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.fitness.data:
//            RawBucket, Session, RawDataSet

public class zzm
    implements android.os.Parcelable.Creator
{

    public zzm()
    {
    }

    static void zza(RawBucket rawbucket, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, rawbucket.zzKT);
        zzb.zzc(parcel, 1000, rawbucket.zzCY);
        zzb.zza(parcel, 2, rawbucket.zzajH);
        zzb.zza(parcel, 3, rawbucket.zzajJ, i, false);
        zzb.zzc(parcel, 4, rawbucket.zzakG);
        zzb.zzc(parcel, 5, rawbucket.zzajS, false);
        zzb.zzc(parcel, 6, rawbucket.zzajT);
        zzb.zza(parcel, 7, rawbucket.zzajU);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcs(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzel(i);
    }

    public RawBucket zzcs(Parcel parcel)
    {
        long l1 = 0L;
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        int j = 0;
        Session session = null;
        long l2 = 0L;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 3: // '\003'
                    session = (Session)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, Session.CREATOR);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1, RawDataSet.CREATOR);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new RawBucket(k, l2, l1, session, j, arraylist, i, flag);
            }
        } while (true);
    }

    public RawBucket[] zzel(int i)
    {
        return new RawBucket[i];
    }
}
