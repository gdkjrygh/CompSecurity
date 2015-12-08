// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.Strategy;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            PublishRequest, MessageWrapper

public class zzi
    implements android.os.Parcelable.Creator
{

    public zzi()
    {
    }

    static void zza(PublishRequest publishrequest, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, publishrequest.zzCY);
        zzb.zza(parcel, 2, publishrequest.zzaGb, i, false);
        zzb.zza(parcel, 3, publishrequest.zzaGc, i, false);
        zzb.zza(parcel, 4, publishrequest.zzxa(), false);
        zzb.zza(parcel, 5, publishrequest.zzayp, false);
        zzb.zza(parcel, 6, publishrequest.zzaGe, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfu(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzij(i);
    }

    public PublishRequest zzfu(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        String s1 = null;
        android.os.IBinder ibinder = null;
        Strategy strategy = null;
        MessageWrapper messagewrapper = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    messagewrapper = (MessageWrapper)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, MessageWrapper.CREATOR);
                    break;

                case 3: // '\003'
                    strategy = (Strategy)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Strategy.CREATOR);
                    break;

                case 4: // '\004'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PublishRequest(i, messagewrapper, strategy, ibinder, s1, s);
            }
        } while (true);
    }

    public PublishRequest[] zzij(int i)
    {
        return new PublishRequest[i];
    }
}
