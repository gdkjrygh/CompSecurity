// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataDeleteRequest

public class zzd
    implements android.os.Parcelable.Creator
{

    public zzd()
    {
    }

    static void zza(DataDeleteRequest datadeleterequest, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zza(parcel, 1, datadeleterequest.zzkt());
        zzb.zzc(parcel, 1000, datadeleterequest.getVersionCode());
        zzb.zza(parcel, 2, datadeleterequest.zzqs());
        zzb.zzc(parcel, 3, datadeleterequest.getDataSources(), false);
        zzb.zzc(parcel, 4, datadeleterequest.getDataTypes(), false);
        zzb.zzc(parcel, 5, datadeleterequest.getSessions(), false);
        zzb.zza(parcel, 6, datadeleterequest.zzqV());
        zzb.zza(parcel, 7, datadeleterequest.zzqW());
        zzb.zza(parcel, 8, datadeleterequest.zzqU(), false);
        zzb.zza(parcel, 9, datadeleterequest.getPackageName(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcD(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzex(i);
    }

    public DataDeleteRequest zzcD(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        long l1 = 0L;
        long l = 0L;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        boolean flag = false;
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
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, DataSource.CREATOR);
                    break;

                case 4: // '\004'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, DataType.CREATOR);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, Session.CREATOR);
                    break;

                case 6: // '\006'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 8: // '\b'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 9: // '\t'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DataDeleteRequest(i, l1, l, arraylist2, arraylist1, arraylist, flag1, flag, ibinder, s);
            }
        } while (true);
    }

    public DataDeleteRequest[] zzex(int i)
    {
        return new DataDeleteRequest[i];
    }
}
