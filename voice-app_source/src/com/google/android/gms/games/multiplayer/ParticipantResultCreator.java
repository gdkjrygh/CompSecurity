// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            ParticipantResult

public class ParticipantResultCreator
    implements android.os.Parcelable.Creator
{

    public ParticipantResultCreator()
    {
    }

    static void zza(ParticipantResult participantresult, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zza(parcel, 1, participantresult.getParticipantId(), false);
        zzb.zzc(parcel, 1000, participantresult.getVersionCode());
        zzb.zzc(parcel, 2, participantresult.getResult());
        zzb.zzc(parcel, 3, participantresult.getPlacing());
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdK(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfT(i);
    }

    public ParticipantResult zzdK(Parcel parcel)
    {
        int k = 0;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        String s = null;
        int j = 0;
        int i = 0;
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
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new ParticipantResult(i, s, j, k);
            }
        } while (true);
    }

    public ParticipantResult[] zzfT(int i)
    {
        return new ParticipantResult[i];
    }
}
