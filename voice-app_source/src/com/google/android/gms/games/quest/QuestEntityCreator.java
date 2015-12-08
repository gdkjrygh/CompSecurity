// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.GameEntity;

// Referenced classes of package com.google.android.gms.games.quest:
//            QuestEntity, MilestoneEntity

public class QuestEntityCreator
    implements android.os.Parcelable.Creator
{

    public QuestEntityCreator()
    {
    }

    static void zza(QuestEntity questentity, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, questentity.getGame(), i, false);
        zzb.zza(parcel, 2, questentity.getQuestId(), false);
        zzb.zza(parcel, 3, questentity.getAcceptedTimestamp());
        zzb.zza(parcel, 4, questentity.getBannerImageUri(), i, false);
        zzb.zza(parcel, 5, questentity.getBannerImageUrl(), false);
        zzb.zza(parcel, 6, questentity.getDescription(), false);
        zzb.zza(parcel, 7, questentity.getEndTimestamp());
        zzb.zza(parcel, 8, questentity.getLastUpdatedTimestamp());
        zzb.zza(parcel, 9, questentity.getIconImageUri(), i, false);
        zzb.zza(parcel, 10, questentity.getIconImageUrl(), false);
        zzb.zza(parcel, 12, questentity.getName(), false);
        zzb.zza(parcel, 13, questentity.zztO());
        zzb.zza(parcel, 14, questentity.getStartTimestamp());
        zzb.zzc(parcel, 15, questentity.getState());
        zzb.zzc(parcel, 17, questentity.zztN(), false);
        zzb.zzc(parcel, 16, questentity.getType());
        zzb.zzc(parcel, 1000, questentity.getVersionCode());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdP(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfY(i);
    }

    public QuestEntity zzdP(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int k = 0;
        GameEntity gameentity = null;
        String s4 = null;
        long l5 = 0L;
        Uri uri1 = null;
        String s3 = null;
        String s2 = null;
        long l4 = 0L;
        long l3 = 0L;
        Uri uri = null;
        String s1 = null;
        String s = null;
        long l2 = 0L;
        long l1 = 0L;
        int j = 0;
        int i = 0;
        java.util.ArrayList arraylist = null;
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

                case 2: // '\002'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 3: // '\003'
                    l5 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 4: // '\004'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 7: // '\007'
                    l4 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 8: // '\b'
                    l3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 9: // '\t'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, Uri.CREATOR);
                    break;

                case 10: // '\n'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 12: // '\f'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 13: // '\r'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 14: // '\016'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 15: // '\017'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 17: // '\021'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1, MilestoneEntity.CREATOR);
                    break;

                case 16: // '\020'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new QuestEntity(k, gameentity, s4, l5, uri1, s3, s2, l4, l3, uri, s1, s, l2, l1, j, i, arraylist);
            }
        } while (true);
    }

    public QuestEntity[] zzfY(int i)
    {
        return new QuestEntity[i];
    }
}
