// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gf;
import com.google.android.gms.internal.gg;
import com.google.android.gms.internal.gy;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room, b, d

public final class RoomEntity extends gg
    implements Room
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final long AC;
    private final ArrayList AF;
    private final int AG;
    private final Bundle AZ;
    private final String Bd;
    private final int Be;
    private final int Bf;
    private final int jE;
    private final String xc;
    private final String yC;

    RoomEntity(int i, String s, String s1, long l, int j, String s2, 
            int k, Bundle bundle, ArrayList arraylist, int i1)
    {
        jE = i;
        yC = s;
        Bd = s1;
        AC = l;
        Be = j;
        xc = s2;
        AG = k;
        AZ = bundle;
        AF = arraylist;
        Bf = i1;
    }

    public RoomEntity(Room room)
    {
        jE = 2;
        yC = room.getRoomId();
        Bd = room.getCreatorId();
        AC = room.getCreationTimestamp();
        Be = room.getStatus();
        xc = room.getDescription();
        AG = room.getVariant();
        AZ = room.getAutoMatchCriteria();
        ArrayList arraylist = room.getParticipants();
        int j = arraylist.size();
        AF = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            AF.add((ParticipantEntity)((Participant)arraylist.get(i)).freeze());
        }

        Bf = room.getAutoMatchWaitEstimateSeconds();
    }

    static int a(Room room)
    {
        return Arrays.hashCode(new Object[] {
            room.getRoomId(), room.getCreatorId(), Long.valueOf(room.getCreationTimestamp()), Integer.valueOf(room.getStatus()), room.getDescription(), Integer.valueOf(room.getVariant()), room.getAutoMatchCriteria(), room.getParticipants(), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())
        });
    }

    static int a(Room room, String s)
    {
        ArrayList arraylist = room.getParticipants();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                return participant.getStatus();
            }
        }

        throw new IllegalStateException((new StringBuilder("Participant ")).append(s).append(" is not in room ").append(room.getRoomId()).toString());
    }

    static boolean a(Room room, Object obj)
    {
        if (obj instanceof Room)
        {
            if (room == obj)
            {
                return true;
            }
            obj = (Room)obj;
            if (ge.a(((Room) (obj)).getRoomId(), room.getRoomId()) && ge.a(((Room) (obj)).getCreatorId(), room.getCreatorId()) && ge.a(Long.valueOf(((Room) (obj)).getCreationTimestamp()), Long.valueOf(room.getCreationTimestamp())) && ge.a(Integer.valueOf(((Room) (obj)).getStatus()), Integer.valueOf(room.getStatus())) && ge.a(((Room) (obj)).getDescription(), room.getDescription()) && ge.a(Integer.valueOf(((Room) (obj)).getVariant()), Integer.valueOf(room.getVariant())) && ge.a(((Room) (obj)).getAutoMatchCriteria(), room.getAutoMatchCriteria()) && ge.a(((Room) (obj)).getParticipants(), room.getParticipants()) && ge.a(Integer.valueOf(((Room) (obj)).getAutoMatchWaitEstimateSeconds()), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())))
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

    static String b(Room room)
    {
        return ge.a(room).a("RoomId", room.getRoomId()).a("CreatorId", room.getCreatorId()).a("CreationTimestamp", Long.valueOf(room.getCreationTimestamp())).a("RoomStatus", Integer.valueOf(room.getStatus())).a("Description", room.getDescription()).a("Variant", Integer.valueOf(room.getVariant())).a("AutoMatchCriteria", room.getAutoMatchCriteria()).a("Participants", room.getParticipants()).a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())).toString();
    }

    static String b(Room room, String s)
    {
        room = room.getParticipants();
        int j = room.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)room.get(i);
            Player player = participant.getPlayer();
            if (player != null && player.getPlayerId().equals(s))
            {
                return participant.getParticipantId();
            }
        }

        return null;
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Participant c(Room room, String s)
    {
        ArrayList arraylist = room.getParticipants();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                return participant;
            }
        }

        throw new IllegalStateException((new StringBuilder("Participant ")).append(s).append(" is not in match ").append(room.getRoomId()).toString());
    }

    static ArrayList c(Room room)
    {
        room = room.getParticipants();
        int j = room.size();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(((Participant)room.get(i)).getParticipantId());
        }

        return arraylist;
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

    public final Room freeze()
    {
        return this;
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final Bundle getAutoMatchCriteria()
    {
        return AZ;
    }

    public final int getAutoMatchWaitEstimateSeconds()
    {
        return Bf;
    }

    public final long getCreationTimestamp()
    {
        return AC;
    }

    public final String getCreatorId()
    {
        return Bd;
    }

    public final String getDescription()
    {
        return xc;
    }

    public final void getDescription(CharArrayBuffer chararraybuffer)
    {
        gy.a(xc, chararraybuffer);
    }

    public final Participant getParticipant(String s)
    {
        return c(this, s);
    }

    public final String getParticipantId(String s)
    {
        return b(this, s);
    }

    public final ArrayList getParticipantIds()
    {
        return c(this);
    }

    public final int getParticipantStatus(String s)
    {
        return a(this, s);
    }

    public final ArrayList getParticipants()
    {
        return new ArrayList(AF);
    }

    public final String getRoomId()
    {
        return yC;
    }

    public final int getStatus()
    {
        return Be;
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
            d.a(this, parcel);
        } else
        {
            parcel.writeString(yC);
            parcel.writeString(Bd);
            parcel.writeLong(AC);
            parcel.writeInt(Be);
            parcel.writeString(xc);
            parcel.writeInt(AG);
            parcel.writeBundle(AZ);
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
