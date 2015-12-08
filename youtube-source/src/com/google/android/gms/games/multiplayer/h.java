// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            ParticipantEntity, ParticipantResult

public class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(ParticipantEntity participantentity, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, participantentity.getParticipantId(), false);
        b.a(parcel, 1000, participantentity.getVersionCode());
        b.a(parcel, 2, participantentity.getDisplayName(), false);
        b.a(parcel, 3, participantentity.getIconImageUri(), i, false);
        b.a(parcel, 4, participantentity.getHiResImageUri(), i, false);
        b.a(parcel, 5, participantentity.getStatus());
        b.a(parcel, 6, participantentity.dz(), false);
        b.a(parcel, 7, participantentity.isConnectedToRoom());
        b.a(parcel, 8, participantentity.getPlayer(), i, false);
        b.a(parcel, 9, participantentity.getCapabilities());
        b.a(parcel, 10, participantentity.getResult(), i, false);
        b.a(parcel, j);
    }

    public ParticipantEntity a(Parcel parcel)
    {
        int i = 0;
        ParticipantResult participantresult = null;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        PlayerEntity playerentity = null;
        boolean flag = false;
        String s = null;
        int j = 0;
        Uri uri = null;
        Uri uri1 = null;
        String s1 = null;
        String s2 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 3: // '\003'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 8: // '\b'
                    playerentity = (PlayerEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, PlayerEntity.CREATOR);
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 10: // '\n'
                    participantresult = (ParticipantResult)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, ParticipantResult.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ParticipantEntity(k, s2, s1, uri1, uri, j, s, flag, playerentity, i, participantresult);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new ParticipantEntity[i];
    }
}
