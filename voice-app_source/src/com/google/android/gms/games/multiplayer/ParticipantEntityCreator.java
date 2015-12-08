// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            ParticipantEntity, ParticipantResult

public class ParticipantEntityCreator
    implements android.os.Parcelable.Creator
{

    public ParticipantEntityCreator()
    {
    }

    static void zza(ParticipantEntity participantentity, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, participantentity.getParticipantId(), false);
        zzb.zzc(parcel, 1000, participantentity.getVersionCode());
        zzb.zza(parcel, 2, participantentity.getDisplayName(), false);
        zzb.zza(parcel, 3, participantentity.getIconImageUri(), i, false);
        zzb.zza(parcel, 4, participantentity.getHiResImageUri(), i, false);
        zzb.zzc(parcel, 5, participantentity.getStatus());
        zzb.zza(parcel, 6, participantentity.zzsr(), false);
        zzb.zza(parcel, 7, participantentity.isConnectedToRoom());
        zzb.zza(parcel, 8, participantentity.getPlayer(), i, false);
        zzb.zzc(parcel, 9, participantentity.getCapabilities());
        zzb.zza(parcel, 10, participantentity.getResult(), i, false);
        zzb.zza(parcel, 11, participantentity.getIconImageUrl(), false);
        zzb.zza(parcel, 12, participantentity.getHiResImageUrl(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdJ(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfS(i);
    }

    public ParticipantEntity zzdJ(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int k = 0;
        String s4 = null;
        String s3 = null;
        Uri uri1 = null;
        Uri uri = null;
        int j = 0;
        String s2 = null;
        boolean flag = false;
        PlayerEntity playerentity = null;
        int i = 0;
        ParticipantResult participantresult = null;
        String s1 = null;
        String s = null;
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
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 3: // '\003'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 8: // '\b'
                    playerentity = (PlayerEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, PlayerEntity.CREATOR);
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 10: // '\n'
                    participantresult = (ParticipantResult)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, ParticipantResult.CREATOR);
                    break;

                case 11: // '\013'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 12: // '\f'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new ParticipantEntity(k, s4, s3, uri1, uri, j, s2, flag, playerentity, i, participantresult, s1, s);
            }
        } while (true);
    }

    public ParticipantEntity[] zzfS(int i)
    {
        return new ParticipantEntity[i];
    }
}
