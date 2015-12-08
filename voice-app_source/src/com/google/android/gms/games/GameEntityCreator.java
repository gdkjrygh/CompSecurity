// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games:
//            GameEntity

public class GameEntityCreator
    implements android.os.Parcelable.Creator
{

    public GameEntityCreator()
    {
    }

    static void zza(GameEntity gameentity, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, gameentity.getApplicationId(), false);
        zzb.zza(parcel, 2, gameentity.getDisplayName(), false);
        zzb.zza(parcel, 3, gameentity.getPrimaryCategory(), false);
        zzb.zza(parcel, 4, gameentity.getSecondaryCategory(), false);
        zzb.zza(parcel, 5, gameentity.getDescription(), false);
        zzb.zza(parcel, 6, gameentity.getDeveloperName(), false);
        zzb.zza(parcel, 7, gameentity.getIconImageUri(), i, false);
        zzb.zza(parcel, 8, gameentity.getHiResImageUri(), i, false);
        zzb.zza(parcel, 9, gameentity.getFeaturedImageUri(), i, false);
        zzb.zza(parcel, 10, gameentity.zzrC());
        zzb.zza(parcel, 11, gameentity.zzrE());
        zzb.zza(parcel, 12, gameentity.zzrF(), false);
        zzb.zzc(parcel, 13, gameentity.zzrG());
        zzb.zzc(parcel, 14, gameentity.getAchievementTotalCount());
        zzb.zzc(parcel, 15, gameentity.getLeaderboardCount());
        zzb.zza(parcel, 17, gameentity.isTurnBasedMultiplayerEnabled());
        zzb.zza(parcel, 16, gameentity.isRealTimeMultiplayerEnabled());
        zzb.zzc(parcel, 1000, gameentity.getVersionCode());
        zzb.zza(parcel, 19, gameentity.getHiResImageUrl(), false);
        zzb.zza(parcel, 18, gameentity.getIconImageUrl(), false);
        zzb.zza(parcel, 21, gameentity.isMuted());
        zzb.zza(parcel, 20, gameentity.getFeaturedImageUrl(), false);
        zzb.zza(parcel, 23, gameentity.areSnapshotsEnabled());
        zzb.zza(parcel, 22, gameentity.zzrD());
        zzb.zza(parcel, 25, gameentity.hasGamepadSupport());
        zzb.zza(parcel, 24, gameentity.getThemeColor(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdr(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfm(i);
    }

    public GameEntity zzdr(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int l = 0;
        String s10 = null;
        String s9 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        String s5 = null;
        Uri uri2 = null;
        Uri uri1 = null;
        Uri uri = null;
        boolean flag7 = false;
        boolean flag6 = false;
        String s4 = null;
        int k = 0;
        int j = 0;
        int i = 0;
        boolean flag5 = false;
        boolean flag4 = false;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        boolean flag3 = false;
        boolean flag2 = false;
        boolean flag1 = false;
        String s = null;
        boolean flag = false;
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
                    s10 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 2: // '\002'
                    s9 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 3: // '\003'
                    s8 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 4: // '\004'
                    s7 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 5: // '\005'
                    s6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 6: // '\006'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 7: // '\007'
                    uri2 = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, j1, Uri.CREATOR);
                    break;

                case 8: // '\b'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, j1, Uri.CREATOR);
                    break;

                case 9: // '\t'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, j1, Uri.CREATOR);
                    break;

                case 10: // '\n'
                    flag7 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 11: // '\013'
                    flag6 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 12: // '\f'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 13: // '\r'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 14: // '\016'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 15: // '\017'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 17: // '\021'
                    flag4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 16: // '\020'
                    flag5 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 19: // '\023'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 18: // '\022'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 21: // '\025'
                    flag3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 20: // '\024'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 23: // '\027'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 22: // '\026'
                    flag2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 25: // '\031'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 24: // '\030'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new GameEntity(l, s10, s9, s8, s7, s6, s5, uri2, uri1, uri, flag7, flag6, s4, k, j, i, flag5, flag4, s3, s2, s1, flag3, flag2, flag1, s, flag);
            }
        } while (true);
    }

    public GameEntity[] zzfm(int i)
    {
        return new GameEntity[i];
    }
}
