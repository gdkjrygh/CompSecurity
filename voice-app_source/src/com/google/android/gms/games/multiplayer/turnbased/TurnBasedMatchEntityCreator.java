// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchEntity

public class TurnBasedMatchEntityCreator
    implements android.os.Parcelable.Creator
{

    public TurnBasedMatchEntityCreator()
    {
    }

    static void zza(TurnBasedMatchEntity turnbasedmatchentity, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, turnbasedmatchentity.getGame(), i, false);
        zzb.zza(parcel, 2, turnbasedmatchentity.getMatchId(), false);
        zzb.zza(parcel, 3, turnbasedmatchentity.getCreatorId(), false);
        zzb.zza(parcel, 4, turnbasedmatchentity.getCreationTimestamp());
        zzb.zza(parcel, 5, turnbasedmatchentity.getLastUpdaterId(), false);
        zzb.zza(parcel, 6, turnbasedmatchentity.getLastUpdatedTimestamp());
        zzb.zza(parcel, 7, turnbasedmatchentity.getPendingParticipantId(), false);
        zzb.zzc(parcel, 8, turnbasedmatchentity.getStatus());
        zzb.zzc(parcel, 10, turnbasedmatchentity.getVariant());
        zzb.zzc(parcel, 11, turnbasedmatchentity.getVersion());
        zzb.zza(parcel, 12, turnbasedmatchentity.getData(), false);
        zzb.zzc(parcel, 13, turnbasedmatchentity.getParticipants(), false);
        zzb.zza(parcel, 14, turnbasedmatchentity.getRematchId(), false);
        zzb.zza(parcel, 15, turnbasedmatchentity.getPreviousMatchData(), false);
        zzb.zza(parcel, 17, turnbasedmatchentity.getAutoMatchCriteria(), false);
        zzb.zzc(parcel, 16, turnbasedmatchentity.getMatchNumber());
        zzb.zzc(parcel, 1000, turnbasedmatchentity.getVersionCode());
        zzb.zza(parcel, 19, turnbasedmatchentity.isLocallyModified());
        zzb.zzc(parcel, 18, turnbasedmatchentity.getTurnStatus());
        zzb.zza(parcel, 21, turnbasedmatchentity.getDescriptionParticipantId(), false);
        zzb.zza(parcel, 20, turnbasedmatchentity.getDescription(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdN(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfW(i);
    }

    public TurnBasedMatchEntity zzdN(Parcel parcel)
    {
        int k1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int j1 = 0;
        GameEntity gameentity = null;
        String s6 = null;
        String s5 = null;
        long l3 = 0L;
        String s4 = null;
        long l2 = 0L;
        String s3 = null;
        int i1 = 0;
        int l = 0;
        int k = 0;
        byte abyte1[] = null;
        java.util.ArrayList arraylist = null;
        String s2 = null;
        byte abyte0[] = null;
        int j = 0;
        android.os.Bundle bundle = null;
        int i = 0;
        boolean flag = false;
        String s1 = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k1)
            {
                int l1 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(l1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l1);
                    break;

                case 1: // '\001'
                    gameentity = (GameEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l1, GameEntity.CREATOR);
                    break;

                case 2: // '\002'
                    s6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    break;

                case 4: // '\004'
                    l3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l1);
                    break;

                case 5: // '\005'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    break;

                case 6: // '\006'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l1);
                    break;

                case 7: // '\007'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    break;

                case 8: // '\b'
                    i1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    break;

                case 10: // '\n'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    break;

                case 11: // '\013'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    break;

                case 12: // '\f'
                    abyte1 = com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel, l1);
                    break;

                case 13: // '\r'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l1, ParticipantEntity.CREATOR);
                    break;

                case 14: // '\016'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    break;

                case 15: // '\017'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel, l1);
                    break;

                case 17: // '\021'
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, l1);
                    break;

                case 16: // '\020'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    break;

                case 1000: 
                    j1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    break;

                case 19: // '\023'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l1);
                    break;

                case 18: // '\022'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    break;

                case 21: // '\025'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    break;

                case 20: // '\024'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    break;
                }
            } else
            if (parcel.dataPosition() != k1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k1).toString(), parcel);
            } else
            {
                return new TurnBasedMatchEntity(j1, gameentity, s6, s5, l3, s4, l2, s3, i1, l, k, abyte1, arraylist, s2, abyte0, j, bundle, i, flag, s1, s);
            }
        } while (true);
    }

    public TurnBasedMatchEntity[] zzfW(int i)
    {
        return new TurnBasedMatchEntity[i];
    }
}
