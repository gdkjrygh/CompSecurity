// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.games:
//            GameEntity

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(GameEntity gameentity, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, gameentity.getApplicationId(), false);
        b.a(parcel, 2, gameentity.getDisplayName(), false);
        b.a(parcel, 3, gameentity.getPrimaryCategory(), false);
        b.a(parcel, 4, gameentity.getSecondaryCategory(), false);
        b.a(parcel, 5, gameentity.getDescription(), false);
        b.a(parcel, 6, gameentity.getDeveloperName(), false);
        b.a(parcel, 7, gameentity.getIconImageUri(), i, false);
        b.a(parcel, 8, gameentity.getHiResImageUri(), i, false);
        b.a(parcel, 9, gameentity.getFeaturedImageUri(), i, false);
        b.a(parcel, 10, gameentity.isPlayEnabledGame());
        b.a(parcel, 11, gameentity.isInstanceInstalled());
        b.a(parcel, 12, gameentity.getInstancePackageName(), false);
        b.a(parcel, 13, gameentity.getGameplayAclStatus());
        b.a(parcel, 14, gameentity.getAchievementTotalCount());
        b.a(parcel, 15, gameentity.getLeaderboardCount());
        b.a(parcel, 17, gameentity.isTurnBasedMultiplayerEnabled());
        b.a(parcel, 16, gameentity.isRealTimeMultiplayerEnabled());
        b.a(parcel, 1000, gameentity.getVersionCode());
        b.a(parcel, j);
    }

    public GameEntity a(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int l = 0;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        Uri uri2 = null;
        Uri uri1 = null;
        Uri uri = null;
        boolean flag3 = false;
        boolean flag2 = false;
        String s = null;
        int k = 0;
        int j = 0;
        int i = 0;
        boolean flag1 = false;
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 2: // '\002'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 3: // '\003'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 4: // '\004'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 7: // '\007'
                    uri2 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Uri.CREATOR);
                    break;

                case 8: // '\b'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Uri.CREATOR);
                    break;

                case 9: // '\t'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Uri.CREATOR);
                    break;

                case 10: // '\n'
                    flag3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 11: // '\013'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 12: // '\f'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 13: // '\r'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 14: // '\016'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 15: // '\017'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 17: // '\021'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 16: // '\020'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new GameEntity(l, s6, s5, s4, s3, s2, s1, uri2, uri1, uri, flag3, flag2, s, k, j, i, flag1, flag);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new GameEntity[i];
    }
}
