// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.GameEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            InvitationEntity, ParticipantEntity

public class InvitationEntityCreator
    implements android.os.Parcelable.Creator
{

    public InvitationEntityCreator()
    {
    }

    static void zza(InvitationEntity invitationentity, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, invitationentity.getGame(), i, false);
        zzb.zzc(parcel, 1000, invitationentity.getVersionCode());
        zzb.zza(parcel, 2, invitationentity.getInvitationId(), false);
        zzb.zza(parcel, 3, invitationentity.getCreationTimestamp());
        zzb.zzc(parcel, 4, invitationentity.getInvitationType());
        zzb.zza(parcel, 5, invitationentity.getInviter(), i, false);
        zzb.zzc(parcel, 6, invitationentity.getParticipants(), false);
        zzb.zzc(parcel, 7, invitationentity.getVariant());
        zzb.zzc(parcel, 8, invitationentity.getAvailableAutoMatchSlots());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdI(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfR(i);
    }

    public InvitationEntity zzdI(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int i = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        long l1 = 0L;
        int j = 0;
        ParticipantEntity participantentity = null;
        int k = 0;
        String s = null;
        GameEntity gameentity = null;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, j1);
                    break;

                case 1: // '\001'
                    gameentity = (GameEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, j1, GameEntity.CREATOR);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, j1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 5: // '\005'
                    participantentity = (ParticipantEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, j1, ParticipantEntity.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1, ParticipantEntity.CREATOR);
                    break;

                case 7: // '\007'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 8: // '\b'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new InvitationEntity(l, gameentity, s, l1, k, participantentity, arraylist, j, i);
            }
        } while (true);
    }

    public InvitationEntity[] zzfR(int i)
    {
        return new InvitationEntity[i];
    }
}
