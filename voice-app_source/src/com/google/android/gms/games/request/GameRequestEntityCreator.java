// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequestEntity

public class GameRequestEntityCreator
    implements android.os.Parcelable.Creator
{

    public GameRequestEntityCreator()
    {
    }

    static void zza(GameRequestEntity gamerequestentity, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, gamerequestentity.getGame(), i, false);
        zzb.zzc(parcel, 1000, gamerequestentity.getVersionCode());
        zzb.zza(parcel, 2, gamerequestentity.getSender(), i, false);
        zzb.zza(parcel, 3, gamerequestentity.getData(), false);
        zzb.zza(parcel, 4, gamerequestentity.getRequestId(), false);
        zzb.zzc(parcel, 5, gamerequestentity.getRecipients(), false);
        zzb.zzc(parcel, 7, gamerequestentity.getType());
        zzb.zza(parcel, 9, gamerequestentity.getCreationTimestamp());
        zzb.zza(parcel, 10, gamerequestentity.getExpirationTimestamp());
        zzb.zza(parcel, 11, gamerequestentity.zztP(), false);
        zzb.zzc(parcel, 12, gamerequestentity.getStatus());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdQ(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfZ(i);
    }

    public GameRequestEntity zzdQ(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int k = 0;
        GameEntity gameentity = null;
        PlayerEntity playerentity = null;
        byte abyte0[] = null;
        String s = null;
        java.util.ArrayList arraylist = null;
        int j = 0;
        long l2 = 0L;
        long l1 = 0L;
        android.os.Bundle bundle = null;
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
                    gameentity = (GameEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, GameEntity.CREATOR);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    playerentity = (PlayerEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, PlayerEntity.CREATOR);
                    break;

                case 3: // '\003'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel, i1);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1, PlayerEntity.CREATOR);
                    break;

                case 7: // '\007'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 9: // '\t'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 10: // '\n'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 11: // '\013'
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, i1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new GameRequestEntity(k, gameentity, playerentity, abyte0, s, arraylist, j, l2, l1, bundle, i);
            }
        } while (true);
    }

    public GameRequestEntity[] zzfZ(int i)
    {
        return new GameRequestEntity[i];
    }
}
