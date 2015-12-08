// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.e;
import com.google.android.gms.games.Game;
import com.google.android.gms.internal.gi;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, d, InvitationEntity, Participant

public final class b extends e
    implements Invitation
{

    private final ArrayList AF;
    private final d AI;
    private final Game zY;

    b(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        zY = new com.google.android.gms.games.b(dataholder, i);
        AF = new ArrayList(j);
        String s = getString("external_inviter_id");
        i = 0;
        dataholder = null;
        for (; i < j; i++)
        {
            d d1 = new d(mDataHolder, rJ + i);
            if (d1.getParticipantId().equals(s))
            {
                dataholder = d1;
            }
            AF.add(d1);
        }

        AI = (d)gi.a(dataholder, "Must have a valid inviter!");
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return InvitationEntity.a(this, obj);
    }

    public final Invitation freeze()
    {
        return new InvitationEntity(this);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final int getAvailableAutoMatchSlots()
    {
        if (!getBoolean("has_automatch_criteria"))
        {
            return 0;
        } else
        {
            return getInteger("automatch_max_players");
        }
    }

    public final long getCreationTimestamp()
    {
        return Math.max(getLong("creation_timestamp"), getLong("last_modified_timestamp"));
    }

    public final Game getGame()
    {
        return zY;
    }

    public final String getInvitationId()
    {
        return getString("external_invitation_id");
    }

    public final int getInvitationType()
    {
        return getInteger("type");
    }

    public final Participant getInviter()
    {
        return AI;
    }

    public final ArrayList getParticipants()
    {
        return AF;
    }

    public final int getVariant()
    {
        return getInteger("variant");
    }

    public final int hashCode()
    {
        return InvitationEntity.a(this);
    }

    public final String toString()
    {
        return InvitationEntity.b(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((InvitationEntity)freeze()).writeToParcel(parcel, i);
    }
}
