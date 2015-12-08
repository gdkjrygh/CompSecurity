// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.Message;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            MessageWrapper

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(MessageWrapper messagewrapper, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, messagewrapper.zzaFZ, i, false);
        zzb.zzc(parcel, 1000, messagewrapper.versionCode);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzft(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzii(i);
    }

    public MessageWrapper zzft(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        Message message = null;
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
                    message = (Message)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Message.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new MessageWrapper(i, message);
            }
        } while (true);
    }

    public MessageWrapper[] zzii(int i)
    {
        return new MessageWrapper[i];
    }
}
