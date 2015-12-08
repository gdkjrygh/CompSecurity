// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.e;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.d;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room, RoomEntity

public final class c extends e
    implements Room
{

    private final int zZ;

    c(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        zZ = j;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return RoomEntity.a(this, obj);
    }

    public final Room freeze()
    {
        return new RoomEntity(this);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final Bundle getAutoMatchCriteria()
    {
        if (!getBoolean("has_automatch_criteria"))
        {
            return null;
        } else
        {
            int i = getInteger("automatch_min_players");
            int j = getInteger("automatch_max_players");
            long l = getLong("automatch_bit_mask");
            Bundle bundle = new Bundle();
            bundle.putInt("min_automatch_players", i);
            bundle.putInt("max_automatch_players", j);
            bundle.putLong("exclusive_bit_mask", l);
            return bundle;
        }
    }

    public final int getAutoMatchWaitEstimateSeconds()
    {
        return getInteger("automatch_wait_estimate_sec");
    }

    public final long getCreationTimestamp()
    {
        return getLong("creation_timestamp");
    }

    public final String getCreatorId()
    {
        return getString("creator_external");
    }

    public final String getDescription()
    {
        return getString("description");
    }

    public final void getDescription(CharArrayBuffer chararraybuffer)
    {
        a("description", chararraybuffer);
    }

    public final Participant getParticipant(String s)
    {
        return RoomEntity.c(this, s);
    }

    public final String getParticipantId(String s)
    {
        return RoomEntity.b(this, s);
    }

    public final ArrayList getParticipantIds()
    {
        return RoomEntity.c(this);
    }

    public final int getParticipantStatus(String s)
    {
        return RoomEntity.a(this, s);
    }

    public final ArrayList getParticipants()
    {
        ArrayList arraylist = new ArrayList(zZ);
        for (int i = 0; i < zZ; i++)
        {
            arraylist.add(new d(mDataHolder, rJ + i));
        }

        return arraylist;
    }

    public final String getRoomId()
    {
        return getString("external_match_id");
    }

    public final int getStatus()
    {
        return getInteger("status");
    }

    public final int getVariant()
    {
        return getInteger("variant");
    }

    public final int hashCode()
    {
        return RoomEntity.a(this);
    }

    public final String toString()
    {
        return RoomEntity.b(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((RoomEntity)freeze()).writeToParcel(parcel, i);
    }
}
