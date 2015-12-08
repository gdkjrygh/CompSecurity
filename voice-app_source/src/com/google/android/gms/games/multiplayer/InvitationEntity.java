// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, Participant, ParticipantEntity, InvitationEntityCreator

public final class InvitationEntity extends GamesDowngradeableSafeParcel
    implements Invitation
{
    static final class InvitationEntityCreatorCompat extends InvitationEntityCreator
    {

        public Object createFromParcel(Parcel parcel)
        {
            return zzdI(parcel);
        }

        public InvitationEntity zzdI(Parcel parcel)
        {
            if (InvitationEntity.zzc(InvitationEntity.zzrH()) || InvitationEntity.zzcM(com/google/android/gms/games/multiplayer/InvitationEntity.getCanonicalName()))
            {
                return super.zzdI(parcel);
            }
            GameEntity gameentity = (GameEntity)GameEntity.CREATOR.createFromParcel(parcel);
            String s = parcel.readString();
            long l = parcel.readLong();
            int j = parcel.readInt();
            ParticipantEntity participantentity = (ParticipantEntity)ParticipantEntity.CREATOR.createFromParcel(parcel);
            int k = parcel.readInt();
            ArrayList arraylist = new ArrayList(k);
            for (int i = 0; i < k; i++)
            {
                arraylist.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
            }

            return new InvitationEntity(2, gameentity, s, l, j, participantentity, arraylist, -1, 0);
        }

        InvitationEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new InvitationEntityCreatorCompat();
    private final int zzCY;
    private final String zzapl;
    private final GameEntity zzaud;
    private final long zzaue;
    private final int zzauf;
    private final ParticipantEntity zzaug;
    private final ArrayList zzauh;
    private final int zzaui;
    private final int zzauj;

    InvitationEntity(int i, GameEntity gameentity, String s, long l, int j, ParticipantEntity participantentity, 
            ArrayList arraylist, int k, int i1)
    {
        zzCY = i;
        zzaud = gameentity;
        zzapl = s;
        zzaue = l;
        zzauf = j;
        zzaug = participantentity;
        zzauh = arraylist;
        zzaui = k;
        zzauj = i1;
    }

    InvitationEntity(Invitation invitation)
    {
        zzCY = 2;
        zzaud = new GameEntity(invitation.getGame());
        zzapl = invitation.getInvitationId();
        zzaue = invitation.getCreationTimestamp();
        zzauf = invitation.getInvitationType();
        zzaui = invitation.getVariant();
        zzauj = invitation.getAvailableAutoMatchSlots();
        String s = invitation.getInviter().getParticipantId();
        Object obj = null;
        ArrayList arraylist = invitation.getParticipants();
        int j = arraylist.size();
        zzauh = new ArrayList(j);
        int i = 0;
        invitation = obj;
        for (; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                invitation = participant;
            }
            zzauh.add((ParticipantEntity)participant.freeze());
        }

        zzu.zzb(invitation, "Must have a valid inviter!");
        zzaug = (ParticipantEntity)invitation.freeze();
    }

    static int zza(Invitation invitation)
    {
        return zzt.hashCode(new Object[] {
            invitation.getGame(), invitation.getInvitationId(), Long.valueOf(invitation.getCreationTimestamp()), Integer.valueOf(invitation.getInvitationType()), invitation.getInviter(), invitation.getParticipants(), Integer.valueOf(invitation.getVariant()), Integer.valueOf(invitation.getAvailableAutoMatchSlots())
        });
    }

    static boolean zza(Invitation invitation, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Invitation) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (invitation == obj) goto _L4; else goto _L3
_L3:
        obj = (Invitation)obj;
        if (!zzt.equal(((Invitation) (obj)).getGame(), invitation.getGame()) || !zzt.equal(((Invitation) (obj)).getInvitationId(), invitation.getInvitationId()) || !zzt.equal(Long.valueOf(((Invitation) (obj)).getCreationTimestamp()), Long.valueOf(invitation.getCreationTimestamp())) || !zzt.equal(Integer.valueOf(((Invitation) (obj)).getInvitationType()), Integer.valueOf(invitation.getInvitationType())) || !zzt.equal(((Invitation) (obj)).getInviter(), invitation.getInviter()) || !zzt.equal(((Invitation) (obj)).getParticipants(), invitation.getParticipants()) || !zzt.equal(Integer.valueOf(((Invitation) (obj)).getVariant()), Integer.valueOf(invitation.getVariant())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(Integer.valueOf(((Invitation) (obj)).getAvailableAutoMatchSlots()), Integer.valueOf(invitation.getAvailableAutoMatchSlots()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Invitation invitation)
    {
        return zzt.zzt(invitation).zzg("Game", invitation.getGame()).zzg("InvitationId", invitation.getInvitationId()).zzg("CreationTimestamp", Long.valueOf(invitation.getCreationTimestamp())).zzg("InvitationType", Integer.valueOf(invitation.getInvitationType())).zzg("Inviter", invitation.getInviter()).zzg("Participants", invitation.getParticipants()).zzg("Variant", Integer.valueOf(invitation.getVariant())).zzg("AvailableAutoMatchSlots", Integer.valueOf(invitation.getAvailableAutoMatchSlots())).toString();
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

    public Invitation freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int getAvailableAutoMatchSlots()
    {
        return zzauj;
    }

    public long getCreationTimestamp()
    {
        return zzaue;
    }

    public Game getGame()
    {
        return zzaud;
    }

    public String getInvitationId()
    {
        return zzapl;
    }

    public int getInvitationType()
    {
        return zzauf;
    }

    public Participant getInviter()
    {
        return zzaug;
    }

    public ArrayList getParticipants()
    {
        return new ArrayList(zzauh);
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
            InvitationEntityCreator.zza(this, parcel, i);
        } else
        {
            zzaud.writeToParcel(parcel, i);
            parcel.writeString(zzapl);
            parcel.writeLong(zzaue);
            parcel.writeInt(zzauf);
            zzaug.writeToParcel(parcel, i);
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
