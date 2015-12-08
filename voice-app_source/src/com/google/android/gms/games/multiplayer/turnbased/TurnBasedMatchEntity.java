// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.zzlc;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatch, TurnBasedMatchEntityCreator

public final class TurnBasedMatchEntity
    implements SafeParcelable, TurnBasedMatch
{

    public static final android.os.Parcelable.Creator CREATOR = new TurnBasedMatchEntityCreator();
    private final int mVersion;
    private final int zzCY;
    private final String zzakM;
    private final long zzaoj;
    private final String zzapF;
    private final String zzauA;
    private final String zzauI;
    private final String zzauJ;
    private final int zzauK;
    private final byte zzauL[];
    private final String zzauM;
    private final byte zzauN[];
    private final int zzauO;
    private final int zzauP;
    private final boolean zzauQ;
    private final String zzauR;
    private final GameEntity zzaud;
    private final long zzaue;
    private final ArrayList zzauh;
    private final int zzaui;
    private final Bundle zzauy;

    TurnBasedMatchEntity(int i, GameEntity gameentity, String s, String s1, long l, String s2, 
            long l1, String s3, int j, int k, int i1, byte abyte0[], 
            ArrayList arraylist, String s4, byte abyte1[], int j1, Bundle bundle, int k1, boolean flag, 
            String s5, String s6)
    {
        zzCY = i;
        zzaud = gameentity;
        zzapF = s;
        zzauA = s1;
        zzaue = l;
        zzauI = s2;
        zzaoj = l1;
        zzauJ = s3;
        zzauK = j;
        zzauP = k1;
        zzaui = k;
        mVersion = i1;
        zzauL = abyte0;
        zzauh = arraylist;
        zzauM = s4;
        zzauN = abyte1;
        zzauO = j1;
        zzauy = bundle;
        zzauQ = flag;
        zzakM = s5;
        zzauR = s6;
    }

    public TurnBasedMatchEntity(TurnBasedMatch turnbasedmatch)
    {
        zzCY = 2;
        zzaud = new GameEntity(turnbasedmatch.getGame());
        zzapF = turnbasedmatch.getMatchId();
        zzauA = turnbasedmatch.getCreatorId();
        zzaue = turnbasedmatch.getCreationTimestamp();
        zzauI = turnbasedmatch.getLastUpdaterId();
        zzaoj = turnbasedmatch.getLastUpdatedTimestamp();
        zzauJ = turnbasedmatch.getPendingParticipantId();
        zzauK = turnbasedmatch.getStatus();
        zzauP = turnbasedmatch.getTurnStatus();
        zzaui = turnbasedmatch.getVariant();
        mVersion = turnbasedmatch.getVersion();
        zzauM = turnbasedmatch.getRematchId();
        zzauO = turnbasedmatch.getMatchNumber();
        zzauy = turnbasedmatch.getAutoMatchCriteria();
        zzauQ = turnbasedmatch.isLocallyModified();
        zzakM = turnbasedmatch.getDescription();
        zzauR = turnbasedmatch.getDescriptionParticipantId();
        byte abyte0[] = turnbasedmatch.getData();
        int j;
        if (abyte0 == null)
        {
            zzauL = null;
        } else
        {
            zzauL = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, zzauL, 0, abyte0.length);
        }
        abyte0 = turnbasedmatch.getPreviousMatchData();
        if (abyte0 == null)
        {
            zzauN = null;
        } else
        {
            zzauN = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, zzauN, 0, abyte0.length);
        }
        turnbasedmatch = turnbasedmatch.getParticipants();
        j = turnbasedmatch.size();
        zzauh = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            zzauh.add((ParticipantEntity)(ParticipantEntity)((Participant)turnbasedmatch.get(i)).freeze());
        }

    }

    static int zza(TurnBasedMatch turnbasedmatch)
    {
        return zzt.hashCode(new Object[] {
            turnbasedmatch.getGame(), turnbasedmatch.getMatchId(), turnbasedmatch.getCreatorId(), Long.valueOf(turnbasedmatch.getCreationTimestamp()), turnbasedmatch.getLastUpdaterId(), Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp()), turnbasedmatch.getPendingParticipantId(), Integer.valueOf(turnbasedmatch.getStatus()), Integer.valueOf(turnbasedmatch.getTurnStatus()), turnbasedmatch.getDescription(), 
            Integer.valueOf(turnbasedmatch.getVariant()), Integer.valueOf(turnbasedmatch.getVersion()), turnbasedmatch.getParticipants(), turnbasedmatch.getRematchId(), Integer.valueOf(turnbasedmatch.getMatchNumber()), turnbasedmatch.getAutoMatchCriteria(), Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots()), Boolean.valueOf(turnbasedmatch.isLocallyModified())
        });
    }

    static int zza(TurnBasedMatch turnbasedmatch, String s)
    {
        ArrayList arraylist = turnbasedmatch.getParticipants();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                return participant.getStatus();
            }
        }

        throw new IllegalStateException((new StringBuilder()).append("Participant ").append(s).append(" is not in match ").append(turnbasedmatch.getMatchId()).toString());
    }

    static boolean zza(TurnBasedMatch turnbasedmatch, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof TurnBasedMatch) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (turnbasedmatch == obj) goto _L4; else goto _L3
_L3:
        obj = (TurnBasedMatch)obj;
        if (!zzt.equal(((TurnBasedMatch) (obj)).getGame(), turnbasedmatch.getGame()) || !zzt.equal(((TurnBasedMatch) (obj)).getMatchId(), turnbasedmatch.getMatchId()) || !zzt.equal(((TurnBasedMatch) (obj)).getCreatorId(), turnbasedmatch.getCreatorId()) || !zzt.equal(Long.valueOf(((TurnBasedMatch) (obj)).getCreationTimestamp()), Long.valueOf(turnbasedmatch.getCreationTimestamp())) || !zzt.equal(((TurnBasedMatch) (obj)).getLastUpdaterId(), turnbasedmatch.getLastUpdaterId()) || !zzt.equal(Long.valueOf(((TurnBasedMatch) (obj)).getLastUpdatedTimestamp()), Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp())) || !zzt.equal(((TurnBasedMatch) (obj)).getPendingParticipantId(), turnbasedmatch.getPendingParticipantId()) || !zzt.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getStatus()), Integer.valueOf(turnbasedmatch.getStatus())) || !zzt.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getTurnStatus()), Integer.valueOf(turnbasedmatch.getTurnStatus())) || !zzt.equal(((TurnBasedMatch) (obj)).getDescription(), turnbasedmatch.getDescription()) || !zzt.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getVariant()), Integer.valueOf(turnbasedmatch.getVariant())) || !zzt.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getVersion()), Integer.valueOf(turnbasedmatch.getVersion())) || !zzt.equal(((TurnBasedMatch) (obj)).getParticipants(), turnbasedmatch.getParticipants()) || !zzt.equal(((TurnBasedMatch) (obj)).getRematchId(), turnbasedmatch.getRematchId()) || !zzt.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getMatchNumber()), Integer.valueOf(turnbasedmatch.getMatchNumber())) || !zzt.equal(((TurnBasedMatch) (obj)).getAutoMatchCriteria(), turnbasedmatch.getAutoMatchCriteria()) || !zzt.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getAvailableAutoMatchSlots()), Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(Boolean.valueOf(((TurnBasedMatch) (obj)).isLocallyModified()), Boolean.valueOf(turnbasedmatch.isLocallyModified()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(TurnBasedMatch turnbasedmatch)
    {
        return zzt.zzt(turnbasedmatch).zzg("Game", turnbasedmatch.getGame()).zzg("MatchId", turnbasedmatch.getMatchId()).zzg("CreatorId", turnbasedmatch.getCreatorId()).zzg("CreationTimestamp", Long.valueOf(turnbasedmatch.getCreationTimestamp())).zzg("LastUpdaterId", turnbasedmatch.getLastUpdaterId()).zzg("LastUpdatedTimestamp", Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp())).zzg("PendingParticipantId", turnbasedmatch.getPendingParticipantId()).zzg("MatchStatus", Integer.valueOf(turnbasedmatch.getStatus())).zzg("TurnStatus", Integer.valueOf(turnbasedmatch.getTurnStatus())).zzg("Description", turnbasedmatch.getDescription()).zzg("Variant", Integer.valueOf(turnbasedmatch.getVariant())).zzg("Data", turnbasedmatch.getData()).zzg("Version", Integer.valueOf(turnbasedmatch.getVersion())).zzg("Participants", turnbasedmatch.getParticipants()).zzg("RematchId", turnbasedmatch.getRematchId()).zzg("PreviousData", turnbasedmatch.getPreviousMatchData()).zzg("MatchNumber", Integer.valueOf(turnbasedmatch.getMatchNumber())).zzg("AutoMatchCriteria", turnbasedmatch.getAutoMatchCriteria()).zzg("AvailableAutoMatchSlots", Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots())).zzg("LocallyModified", Boolean.valueOf(turnbasedmatch.isLocallyModified())).zzg("DescriptionParticipantId", turnbasedmatch.getDescriptionParticipantId()).toString();
    }

    static String zzb(TurnBasedMatch turnbasedmatch, String s)
    {
        turnbasedmatch = turnbasedmatch.getParticipants();
        int j = turnbasedmatch.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)turnbasedmatch.get(i);
            Player player = participant.getPlayer();
            if (player != null && player.getPlayerId().equals(s))
            {
                return participant.getParticipantId();
            }
        }

        return null;
    }

    static Participant zzc(TurnBasedMatch turnbasedmatch, String s)
    {
        ArrayList arraylist = turnbasedmatch.getParticipants();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                return participant;
            }
        }

        throw new IllegalStateException((new StringBuilder()).append("Participant ").append(s).append(" is not in match ").append(turnbasedmatch.getMatchId()).toString());
    }

    static ArrayList zzc(TurnBasedMatch turnbasedmatch)
    {
        turnbasedmatch = turnbasedmatch.getParticipants();
        int j = turnbasedmatch.size();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(((Participant)turnbasedmatch.get(i)).getParticipantId());
        }

        return arraylist;
    }

    public boolean canRematch()
    {
        return zzauK == 2 && zzauM == null;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public TurnBasedMatch freeze()
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

    public int getAvailableAutoMatchSlots()
    {
        if (zzauy == null)
        {
            return 0;
        } else
        {
            return zzauy.getInt("max_automatch_players");
        }
    }

    public long getCreationTimestamp()
    {
        return zzaue;
    }

    public String getCreatorId()
    {
        return zzauA;
    }

    public byte[] getData()
    {
        return zzauL;
    }

    public String getDescription()
    {
        return zzakM;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzakM, chararraybuffer);
    }

    public Participant getDescriptionParticipant()
    {
        String s = getDescriptionParticipantId();
        if (s == null)
        {
            return null;
        } else
        {
            return getParticipant(s);
        }
    }

    public String getDescriptionParticipantId()
    {
        return zzauR;
    }

    public Game getGame()
    {
        return zzaud;
    }

    public long getLastUpdatedTimestamp()
    {
        return zzaoj;
    }

    public String getLastUpdaterId()
    {
        return zzauI;
    }

    public String getMatchId()
    {
        return zzapF;
    }

    public int getMatchNumber()
    {
        return zzauO;
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

    public String getPendingParticipantId()
    {
        return zzauJ;
    }

    public byte[] getPreviousMatchData()
    {
        return zzauN;
    }

    public String getRematchId()
    {
        return zzauM;
    }

    public int getStatus()
    {
        return zzauK;
    }

    public int getTurnStatus()
    {
        return zzauP;
    }

    public int getVariant()
    {
        return zzaui;
    }

    public int getVersion()
    {
        return mVersion;
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

    public boolean isLocallyModified()
    {
        return zzauQ;
    }

    public String toString()
    {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        TurnBasedMatchEntityCreator.zza(this, parcel, i);
    }

}
