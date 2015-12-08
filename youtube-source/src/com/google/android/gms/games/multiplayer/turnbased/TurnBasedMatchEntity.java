// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gf;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatch, b

public final class TurnBasedMatchEntity
    implements SafeParcelable, TurnBasedMatch
{

    public static final b CREATOR = new b();
    private final GameEntity AB;
    private final long AC;
    private final ArrayList AF;
    private final int AG;
    private final Bundle AZ;
    private final String Bd;
    private final String Bm;
    private final long Bn;
    private final String Bo;
    private final int Bp;
    private final int Bq;
    private final byte Br[];
    private final String Bs;
    private final byte Bt[];
    private final int Bu;
    private final int Bv;
    private final boolean Bw;
    private final int jE;
    private final String yD;

    TurnBasedMatchEntity(int i, GameEntity gameentity, String s, String s1, long l, String s2, 
            long l1, String s3, int j, int k, int i1, byte abyte0[], 
            ArrayList arraylist, String s4, byte abyte1[], int j1, Bundle bundle, int k1, boolean flag)
    {
        jE = i;
        AB = gameentity;
        yD = s;
        Bd = s1;
        AC = l;
        Bm = s2;
        Bn = l1;
        Bo = s3;
        Bp = j;
        Bv = k1;
        AG = k;
        Bq = i1;
        Br = abyte0;
        AF = arraylist;
        Bs = s4;
        Bt = abyte1;
        Bu = j1;
        AZ = bundle;
        Bw = flag;
    }

    public TurnBasedMatchEntity(TurnBasedMatch turnbasedmatch)
    {
        jE = 2;
        AB = new GameEntity(turnbasedmatch.getGame());
        yD = turnbasedmatch.getMatchId();
        Bd = turnbasedmatch.getCreatorId();
        AC = turnbasedmatch.getCreationTimestamp();
        Bm = turnbasedmatch.getLastUpdaterId();
        Bn = turnbasedmatch.getLastUpdatedTimestamp();
        Bo = turnbasedmatch.getPendingParticipantId();
        Bp = turnbasedmatch.getStatus();
        Bv = turnbasedmatch.getTurnStatus();
        AG = turnbasedmatch.getVariant();
        Bq = turnbasedmatch.getVersion();
        Bs = turnbasedmatch.getRematchId();
        Bu = turnbasedmatch.getMatchNumber();
        AZ = turnbasedmatch.getAutoMatchCriteria();
        Bw = turnbasedmatch.isLocallyModified();
        byte abyte0[] = turnbasedmatch.getData();
        int j;
        if (abyte0 == null)
        {
            Br = null;
        } else
        {
            Br = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, Br, 0, abyte0.length);
        }
        abyte0 = turnbasedmatch.getPreviousMatchData();
        if (abyte0 == null)
        {
            Bt = null;
        } else
        {
            Bt = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, Bt, 0, abyte0.length);
        }
        turnbasedmatch = turnbasedmatch.getParticipants();
        j = turnbasedmatch.size();
        AF = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            AF.add((ParticipantEntity)((Participant)turnbasedmatch.get(i)).freeze());
        }

    }

    static int a(TurnBasedMatch turnbasedmatch)
    {
        return Arrays.hashCode(new Object[] {
            turnbasedmatch.getGame(), turnbasedmatch.getMatchId(), turnbasedmatch.getCreatorId(), Long.valueOf(turnbasedmatch.getCreationTimestamp()), turnbasedmatch.getLastUpdaterId(), Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp()), turnbasedmatch.getPendingParticipantId(), Integer.valueOf(turnbasedmatch.getStatus()), Integer.valueOf(turnbasedmatch.getTurnStatus()), Integer.valueOf(turnbasedmatch.getVariant()), 
            Integer.valueOf(turnbasedmatch.getVersion()), turnbasedmatch.getParticipants(), turnbasedmatch.getRematchId(), Integer.valueOf(turnbasedmatch.getMatchNumber()), turnbasedmatch.getAutoMatchCriteria(), Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots()), Boolean.valueOf(turnbasedmatch.isLocallyModified())
        });
    }

    static int a(TurnBasedMatch turnbasedmatch, String s)
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

        throw new IllegalStateException((new StringBuilder("Participant ")).append(s).append(" is not in match ").append(turnbasedmatch.getMatchId()).toString());
    }

    static boolean a(TurnBasedMatch turnbasedmatch, Object obj)
    {
        if (obj instanceof TurnBasedMatch)
        {
            if (turnbasedmatch == obj)
            {
                return true;
            }
            obj = (TurnBasedMatch)obj;
            if (ge.a(((TurnBasedMatch) (obj)).getGame(), turnbasedmatch.getGame()) && ge.a(((TurnBasedMatch) (obj)).getMatchId(), turnbasedmatch.getMatchId()) && ge.a(((TurnBasedMatch) (obj)).getCreatorId(), turnbasedmatch.getCreatorId()) && ge.a(Long.valueOf(((TurnBasedMatch) (obj)).getCreationTimestamp()), Long.valueOf(turnbasedmatch.getCreationTimestamp())) && ge.a(((TurnBasedMatch) (obj)).getLastUpdaterId(), turnbasedmatch.getLastUpdaterId()) && ge.a(Long.valueOf(((TurnBasedMatch) (obj)).getLastUpdatedTimestamp()), Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp())) && ge.a(((TurnBasedMatch) (obj)).getPendingParticipantId(), turnbasedmatch.getPendingParticipantId()) && ge.a(Integer.valueOf(((TurnBasedMatch) (obj)).getStatus()), Integer.valueOf(turnbasedmatch.getStatus())) && ge.a(Integer.valueOf(((TurnBasedMatch) (obj)).getTurnStatus()), Integer.valueOf(turnbasedmatch.getTurnStatus())) && ge.a(Integer.valueOf(((TurnBasedMatch) (obj)).getVariant()), Integer.valueOf(turnbasedmatch.getVariant())) && ge.a(Integer.valueOf(((TurnBasedMatch) (obj)).getVersion()), Integer.valueOf(turnbasedmatch.getVersion())) && ge.a(((TurnBasedMatch) (obj)).getParticipants(), turnbasedmatch.getParticipants()) && ge.a(((TurnBasedMatch) (obj)).getRematchId(), turnbasedmatch.getRematchId()) && ge.a(Integer.valueOf(((TurnBasedMatch) (obj)).getMatchNumber()), Integer.valueOf(turnbasedmatch.getMatchNumber())) && ge.a(((TurnBasedMatch) (obj)).getAutoMatchCriteria(), turnbasedmatch.getAutoMatchCriteria()) && ge.a(Integer.valueOf(((TurnBasedMatch) (obj)).getAvailableAutoMatchSlots()), Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots())) && ge.a(Boolean.valueOf(((TurnBasedMatch) (obj)).isLocallyModified()), Boolean.valueOf(turnbasedmatch.isLocallyModified())))
            {
                return true;
            }
        }
        return false;
    }

    static String b(TurnBasedMatch turnbasedmatch)
    {
        return ge.a(turnbasedmatch).a("Game", turnbasedmatch.getGame()).a("MatchId", turnbasedmatch.getMatchId()).a("CreatorId", turnbasedmatch.getCreatorId()).a("CreationTimestamp", Long.valueOf(turnbasedmatch.getCreationTimestamp())).a("LastUpdaterId", turnbasedmatch.getLastUpdaterId()).a("LastUpdatedTimestamp", Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp())).a("PendingParticipantId", turnbasedmatch.getPendingParticipantId()).a("MatchStatus", Integer.valueOf(turnbasedmatch.getStatus())).a("TurnStatus", Integer.valueOf(turnbasedmatch.getTurnStatus())).a("Variant", Integer.valueOf(turnbasedmatch.getVariant())).a("Data", turnbasedmatch.getData()).a("Version", Integer.valueOf(turnbasedmatch.getVersion())).a("Participants", turnbasedmatch.getParticipants()).a("RematchId", turnbasedmatch.getRematchId()).a("PreviousData", turnbasedmatch.getPreviousMatchData()).a("MatchNumber", Integer.valueOf(turnbasedmatch.getMatchNumber())).a("AutoMatchCriteria", turnbasedmatch.getAutoMatchCriteria()).a("AvailableAutoMatchSlots", Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots())).a("LocallyModified", Boolean.valueOf(turnbasedmatch.isLocallyModified())).toString();
    }

    static String b(TurnBasedMatch turnbasedmatch, String s)
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

    static Participant c(TurnBasedMatch turnbasedmatch, String s)
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

        throw new IllegalStateException((new StringBuilder("Participant ")).append(s).append(" is not in match ").append(turnbasedmatch.getMatchId()).toString());
    }

    static ArrayList c(TurnBasedMatch turnbasedmatch)
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

    public final boolean canRematch()
    {
        return Bp == 2 && Bs == null;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public final TurnBasedMatch freeze()
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

    public final int getAvailableAutoMatchSlots()
    {
        if (AZ == null)
        {
            return 0;
        } else
        {
            return AZ.getInt("max_automatch_players");
        }
    }

    public final long getCreationTimestamp()
    {
        return AC;
    }

    public final String getCreatorId()
    {
        return Bd;
    }

    public final byte[] getData()
    {
        return Br;
    }

    public final Game getGame()
    {
        return AB;
    }

    public final long getLastUpdatedTimestamp()
    {
        return Bn;
    }

    public final String getLastUpdaterId()
    {
        return Bm;
    }

    public final String getMatchId()
    {
        return yD;
    }

    public final int getMatchNumber()
    {
        return Bu;
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

    public final String getPendingParticipantId()
    {
        return Bo;
    }

    public final byte[] getPreviousMatchData()
    {
        return Bt;
    }

    public final String getRematchId()
    {
        return Bs;
    }

    public final int getStatus()
    {
        return Bp;
    }

    public final int getTurnStatus()
    {
        return Bv;
    }

    public final int getVariant()
    {
        return AG;
    }

    public final int getVersion()
    {
        return Bq;
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

    public final boolean isLocallyModified()
    {
        return Bw;
    }

    public final String toString()
    {
        return b(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.games.multiplayer.turnbased.b.a(this, parcel, i);
    }

}
