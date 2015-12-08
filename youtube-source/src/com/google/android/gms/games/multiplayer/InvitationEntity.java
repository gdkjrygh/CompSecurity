// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gf;
import com.google.android.gms.internal.gg;
import com.google.android.gms.internal.gi;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, a, Participant, ParticipantEntity, 
//            g

public final class InvitationEntity extends gg
    implements Invitation
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final GameEntity AB;
    private final long AC;
    private final int AD;
    private final ParticipantEntity AE;
    private final ArrayList AF;
    private final int AG;
    private final int AH;
    private final int jE;
    private final String yx;

    InvitationEntity(int i, GameEntity gameentity, String s, long l, int j, ParticipantEntity participantentity, 
            ArrayList arraylist, int k, int i1)
    {
        jE = i;
        AB = gameentity;
        yx = s;
        AC = l;
        AD = j;
        AE = participantentity;
        AF = arraylist;
        AG = k;
        AH = i1;
    }

    InvitationEntity(Invitation invitation)
    {
        jE = 2;
        AB = new GameEntity(invitation.getGame());
        yx = invitation.getInvitationId();
        AC = invitation.getCreationTimestamp();
        AD = invitation.getInvitationType();
        AG = invitation.getVariant();
        AH = invitation.getAvailableAutoMatchSlots();
        String s = invitation.getInviter().getParticipantId();
        Object obj = null;
        ArrayList arraylist = invitation.getParticipants();
        int j = arraylist.size();
        AF = new ArrayList(j);
        int i = 0;
        invitation = obj;
        for (; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                invitation = participant;
            }
            AF.add((ParticipantEntity)participant.freeze());
        }

        gi.a(invitation, "Must have a valid inviter!");
        AE = (ParticipantEntity)invitation.freeze();
    }

    static int a(Invitation invitation)
    {
        return Arrays.hashCode(new Object[] {
            invitation.getGame(), invitation.getInvitationId(), Long.valueOf(invitation.getCreationTimestamp()), Integer.valueOf(invitation.getInvitationType()), invitation.getInviter(), invitation.getParticipants(), Integer.valueOf(invitation.getVariant()), Integer.valueOf(invitation.getAvailableAutoMatchSlots())
        });
    }

    static boolean a(Invitation invitation, Object obj)
    {
        if (obj instanceof Invitation)
        {
            if (invitation == obj)
            {
                return true;
            }
            obj = (Invitation)obj;
            if (ge.a(((Invitation) (obj)).getGame(), invitation.getGame()) && ge.a(((Invitation) (obj)).getInvitationId(), invitation.getInvitationId()) && ge.a(Long.valueOf(((Invitation) (obj)).getCreationTimestamp()), Long.valueOf(invitation.getCreationTimestamp())) && ge.a(Integer.valueOf(((Invitation) (obj)).getInvitationType()), Integer.valueOf(invitation.getInvitationType())) && ge.a(((Invitation) (obj)).getInviter(), invitation.getInviter()) && ge.a(((Invitation) (obj)).getParticipants(), invitation.getParticipants()) && ge.a(Integer.valueOf(((Invitation) (obj)).getVariant()), Integer.valueOf(invitation.getVariant())) && ge.a(Integer.valueOf(((Invitation) (obj)).getAvailableAutoMatchSlots()), Integer.valueOf(invitation.getAvailableAutoMatchSlots())))
            {
                return true;
            }
        }
        return false;
    }

    static boolean an(String s)
    {
        return W(s);
    }

    static String b(Invitation invitation)
    {
        return ge.a(invitation).a("Game", invitation.getGame()).a("InvitationId", invitation.getInvitationId()).a("CreationTimestamp", Long.valueOf(invitation.getCreationTimestamp())).a("InvitationType", Integer.valueOf(invitation.getInvitationType())).a("Inviter", invitation.getInviter()).a("Participants", invitation.getParticipants()).a("Variant", Integer.valueOf(invitation.getVariant())).a("AvailableAutoMatchSlots", Integer.valueOf(invitation.getAvailableAutoMatchSlots())).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer db()
    {
        return bR();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public final Invitation freeze()
    {
        return this;
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final int getAvailableAutoMatchSlots()
    {
        return AH;
    }

    public final long getCreationTimestamp()
    {
        return AC;
    }

    public final Game getGame()
    {
        return AB;
    }

    public final String getInvitationId()
    {
        return yx;
    }

    public final int getInvitationType()
    {
        return AD;
    }

    public final Participant getInviter()
    {
        return AE;
    }

    public final ArrayList getParticipants()
    {
        return new ArrayList(AF);
    }

    public final int getVariant()
    {
        return AG;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final int hashCode()
    {
        return a(this);
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return b(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (!bS())
        {
            g.a(this, parcel, i);
        } else
        {
            AB.writeToParcel(parcel, i);
            parcel.writeString(yx);
            parcel.writeLong(AC);
            parcel.writeInt(AD);
            AE.writeToParcel(parcel, i);
            int k = AF.size();
            parcel.writeInt(k);
            int j = 0;
            while (j < k) 
            {
                ((ParticipantEntity)AF.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

}
