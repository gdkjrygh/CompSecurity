// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.zzlc;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room, RoomEntityCreator

public final class RoomEntity extends GamesDowngradeableSafeParcel
    implements Room
{
    static final class RoomEntityCreatorCompat extends RoomEntityCreator
    {

        public Object createFromParcel(Parcel parcel)
        {
            return zzdM(parcel);
        }

        public RoomEntity zzdM(Parcel parcel)
        {
            if (RoomEntity.zzc(RoomEntity.zzrH()) || RoomEntity.zzcM(com/google/android/gms/games/multiplayer/realtime/RoomEntity.getCanonicalName()))
            {
                return super.zzdM(parcel);
            }
            String s = parcel.readString();
            String s1 = parcel.readString();
            long l1 = parcel.readLong();
            int j = parcel.readInt();
            String s2 = parcel.readString();
            int k = parcel.readInt();
            Bundle bundle = parcel.readBundle();
            int l = parcel.readInt();
            ArrayList arraylist = new ArrayList(l);
            for (int i = 0; i < l; i++)
            {
                arraylist.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
            }

            return new RoomEntity(2, s, s1, l1, j, s2, k, bundle, arraylist, -1);
        }

        RoomEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new RoomEntityCreatorCompat();
    private final int zzCY;
    private final String zzakM;
    private final String zzapn;
    private final String zzauA;
    private final int zzauB;
    private final int zzauC;
    private final long zzaue;
    private final ArrayList zzauh;
    private final int zzaui;
    private final Bundle zzauy;

    RoomEntity(int i, String s, String s1, long l, int j, String s2, 
            int k, Bundle bundle, ArrayList arraylist, int i1)
    {
        zzCY = i;
        zzapn = s;
        zzauA = s1;
        zzaue = l;
        zzauB = j;
        zzakM = s2;
        zzaui = k;
        zzauy = bundle;
        zzauh = arraylist;
        zzauC = i1;
    }

    public RoomEntity(Room room)
    {
        zzCY = 2;
        zzapn = room.getRoomId();
        zzauA = room.getCreatorId();
        zzaue = room.getCreationTimestamp();
        zzauB = room.getStatus();
        zzakM = room.getDescription();
        zzaui = room.getVariant();
        zzauy = room.getAutoMatchCriteria();
        ArrayList arraylist = room.getParticipants();
        int j = arraylist.size();
        zzauh = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            zzauh.add((ParticipantEntity)((Participant)arraylist.get(i)).freeze());
        }

        zzauC = room.getAutoMatchWaitEstimateSeconds();
    }

    static int zza(Room room)
    {
        return zzt.hashCode(new Object[] {
            room.getRoomId(), room.getCreatorId(), Long.valueOf(room.getCreationTimestamp()), Integer.valueOf(room.getStatus()), room.getDescription(), Integer.valueOf(room.getVariant()), room.getAutoMatchCriteria(), room.getParticipants(), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())
        });
    }

    static int zza(Room room, String s)
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

        throw new IllegalStateException((new StringBuilder()).append("Participant ").append(s).append(" is not in room ").append(room.getRoomId()).toString());
    }

    static boolean zza(Room room, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Room) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (room == obj) goto _L4; else goto _L3
_L3:
        obj = (Room)obj;
        if (!zzt.equal(((Room) (obj)).getRoomId(), room.getRoomId()) || !zzt.equal(((Room) (obj)).getCreatorId(), room.getCreatorId()) || !zzt.equal(Long.valueOf(((Room) (obj)).getCreationTimestamp()), Long.valueOf(room.getCreationTimestamp())) || !zzt.equal(Integer.valueOf(((Room) (obj)).getStatus()), Integer.valueOf(room.getStatus())) || !zzt.equal(((Room) (obj)).getDescription(), room.getDescription()) || !zzt.equal(Integer.valueOf(((Room) (obj)).getVariant()), Integer.valueOf(room.getVariant())) || !zzt.equal(((Room) (obj)).getAutoMatchCriteria(), room.getAutoMatchCriteria()) || !zzt.equal(((Room) (obj)).getParticipants(), room.getParticipants()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(Integer.valueOf(((Room) (obj)).getAutoMatchWaitEstimateSeconds()), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Room room)
    {
        return zzt.zzt(room).zzg("RoomId", room.getRoomId()).zzg("CreatorId", room.getCreatorId()).zzg("CreationTimestamp", Long.valueOf(room.getCreationTimestamp())).zzg("RoomStatus", Integer.valueOf(room.getStatus())).zzg("Description", room.getDescription()).zzg("Variant", Integer.valueOf(room.getVariant())).zzg("AutoMatchCriteria", room.getAutoMatchCriteria()).zzg("Participants", room.getParticipants()).zzg("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())).toString();
    }

    static String zzb(Room room, String s)
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

    static Participant zzc(Room room, String s)
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

        throw new IllegalStateException((new StringBuilder()).append("Participant ").append(s).append(" is not in match ").append(room.getRoomId()).toString());
    }

    static ArrayList zzc(Room room)
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

    static boolean zzc(Integer integer)
    {
        return zzd(integer);
    }

    static boolean zzcM(String s)
    {
        return zzca(s);
    }

    static Integer zzrH()
    {
        return zznE();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Room freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public Bundle getAutoMatchCriteria()
    {
        return zzauy;
    }

    public int getAutoMatchWaitEstimateSeconds()
    {
        return zzauC;
    }

    public long getCreationTimestamp()
    {
        return zzaue;
    }

    public String getCreatorId()
    {
        return zzauA;
    }

    public String getDescription()
    {
        return zzakM;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzakM, chararraybuffer);
    }

    public Participant getParticipant(String s)
    {
        return zzc(this, s);
    }

    public String getParticipantId(String s)
    {
        return zzb(this, s);
    }

    public ArrayList getParticipantIds()
    {
        return zzc(this);
    }

    public int getParticipantStatus(String s)
    {
        return zza(this, s);
    }

    public ArrayList getParticipants()
    {
        return new ArrayList(zzauh);
    }

    public String getRoomId()
    {
        return zzapn;
    }

    public int getStatus()
    {
        return zzauB;
    }

    public int getVariant()
    {
        return zzaui;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zza(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (!zznF())
        {
            RoomEntityCreator.zza(this, parcel, i);
        } else
        {
            parcel.writeString(zzapn);
            parcel.writeString(zzauA);
            parcel.writeLong(zzaue);
            parcel.writeInt(zzauB);
            parcel.writeString(zzakM);
            parcel.writeInt(zzaui);
            parcel.writeBundle(zzauy);
            int k = zzauh.size();
            parcel.writeInt(k);
            int j = 0;
            while (j < k) 
            {
                ((ParticipantEntity)zzauh.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

}
