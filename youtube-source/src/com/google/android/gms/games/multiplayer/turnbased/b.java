// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchEntity

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(TurnBasedMatchEntity turnbasedmatchentity, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, turnbasedmatchentity.getGame(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, turnbasedmatchentity.getMatchId(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, turnbasedmatchentity.getCreatorId(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, turnbasedmatchentity.getCreationTimestamp());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, turnbasedmatchentity.getLastUpdaterId(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, turnbasedmatchentity.getLastUpdatedTimestamp());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, turnbasedmatchentity.getPendingParticipantId(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, turnbasedmatchentity.getStatus());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, turnbasedmatchentity.getVariant());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, turnbasedmatchentity.getVersion());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 12, turnbasedmatchentity.getData(), false);
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, 13, turnbasedmatchentity.getParticipants(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 14, turnbasedmatchentity.getRematchId(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 15, turnbasedmatchentity.getPreviousMatchData(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 17, turnbasedmatchentity.getAutoMatchCriteria(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 16, turnbasedmatchentity.getMatchNumber());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, turnbasedmatchentity.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 19, turnbasedmatchentity.isLocallyModified());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 18, turnbasedmatchentity.getTurnStatus());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j1 = 0;
        GameEntity gameentity = null;
        String s4 = null;
        String s3 = null;
        long l3 = 0L;
        String s2 = null;
        long l2 = 0L;
        String s1 = null;
        int i1 = 0;
        int l = 0;
        int k = 0;
        byte abyte1[] = null;
        java.util.ArrayList arraylist = null;
        String s = null;
        byte abyte0[] = null;
        int j = 0;
        android.os.Bundle bundle = null;
        int i = 0;
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() < k1)
            {
                int l1 = parcel.readInt();
                switch (0xffff & l1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l1);
                    break;

                case 1: // '\001'
                    gameentity = (GameEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, GameEntity.CREATOR);
                    break;

                case 2: // '\002'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
                    break;

                case 3: // '\003'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
                    break;

                case 4: // '\004'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, l1);
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
                    break;

                case 6: // '\006'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, l1);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
                    break;

                case 8: // '\b'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 10: // '\n'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 11: // '\013'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 12: // '\f'
                    abyte1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l1);
                    break;

                case 13: // '\r'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1, ParticipantEntity.CREATOR);
                    break;

                case 14: // '\016'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
                    break;

                case 15: // '\017'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l1);
                    break;

                case 17: // '\021'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    break;

                case 16: // '\020'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 1000: 
                    j1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 19: // '\023'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1);
                    break;

                case 18: // '\022'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;
                }
            } else
            if (parcel.dataPosition() != k1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k1).toString(), parcel);
            } else
            {
                return new TurnBasedMatchEntity(j1, gameentity, s4, s3, l3, s2, l2, s1, i1, l, k, abyte1, arraylist, s, abyte0, j, bundle, i, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new TurnBasedMatchEntity[i];
    }
}
