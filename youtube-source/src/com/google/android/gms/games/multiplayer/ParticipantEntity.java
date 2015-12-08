// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gf;
import com.google.android.gms.internal.gg;
import com.google.android.gms.internal.gy;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, c, h, ParticipantResult

public final class ParticipantEntity extends gg
    implements Participant
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int AJ;
    private final String AK;
    private final boolean AL;
    private final PlayerEntity AM;
    private final int AN;
    private final ParticipantResult AO;
    private final int jE;
    private final String uf;
    private final Uri xe;
    private final Uri xf;
    private final String yH;

    ParticipantEntity(int i, String s, String s1, Uri uri, Uri uri1, int j, String s2, 
            boolean flag, PlayerEntity playerentity, int k, ParticipantResult participantresult)
    {
        jE = i;
        yH = s;
        uf = s1;
        xe = uri;
        xf = uri1;
        AJ = j;
        AK = s2;
        AL = flag;
        AM = playerentity;
        AN = k;
        AO = participantresult;
    }

    public ParticipantEntity(Participant participant)
    {
        jE = 2;
        yH = participant.getParticipantId();
        uf = participant.getDisplayName();
        xe = participant.getIconImageUri();
        xf = participant.getHiResImageUri();
        AJ = participant.getStatus();
        AK = participant.dz();
        AL = participant.isConnectedToRoom();
        Object obj = participant.getPlayer();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new PlayerEntity(((Player) (obj)));
        }
        AM = ((PlayerEntity) (obj));
        AN = participant.getCapabilities();
        AO = participant.getResult();
    }

    static int a(Participant participant)
    {
        return Arrays.hashCode(new Object[] {
            participant.getPlayer(), Integer.valueOf(participant.getStatus()), participant.dz(), Boolean.valueOf(participant.isConnectedToRoom()), participant.getDisplayName(), participant.getIconImageUri(), participant.getHiResImageUri(), Integer.valueOf(participant.getCapabilities()), participant.getResult()
        });
    }

    static boolean a(Participant participant, Object obj)
    {
        if (obj instanceof Participant)
        {
            if (participant == obj)
            {
                return true;
            }
            obj = (Participant)obj;
            if (ge.a(((Participant) (obj)).getPlayer(), participant.getPlayer()) && ge.a(Integer.valueOf(((Participant) (obj)).getStatus()), Integer.valueOf(participant.getStatus())) && ge.a(((Participant) (obj)).dz(), participant.dz()) && ge.a(Boolean.valueOf(((Participant) (obj)).isConnectedToRoom()), Boolean.valueOf(participant.isConnectedToRoom())) && ge.a(((Participant) (obj)).getDisplayName(), participant.getDisplayName()) && ge.a(((Participant) (obj)).getIconImageUri(), participant.getIconImageUri()) && ge.a(((Participant) (obj)).getHiResImageUri(), participant.getHiResImageUri()) && ge.a(Integer.valueOf(((Participant) (obj)).getCapabilities()), Integer.valueOf(participant.getCapabilities())) && ge.a(((Participant) (obj)).getResult(), participant.getResult()))
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

    static String b(Participant participant)
    {
        return ge.a(participant).a("Player", participant.getPlayer()).a("Status", Integer.valueOf(participant.getStatus())).a("ClientAddress", participant.dz()).a("ConnectedToRoom", Boolean.valueOf(participant.isConnectedToRoom())).a("DisplayName", participant.getDisplayName()).a("IconImage", participant.getIconImageUri()).a("HiResImage", participant.getHiResImageUri()).a("Capabilities", Integer.valueOf(participant.getCapabilities())).a("Result", participant.getResult()).toString();
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

    public final String dz()
    {
        return AK;
    }

    public final boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public final Participant freeze()
    {
        return this;
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final int getCapabilities()
    {
        return AN;
    }

    public final String getDisplayName()
    {
        if (AM == null)
        {
            return uf;
        } else
        {
            return AM.getDisplayName();
        }
    }

    public final void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (AM == null)
        {
            gy.a(uf, chararraybuffer);
            return;
        } else
        {
            AM.getDisplayName(chararraybuffer);
            return;
        }
    }

    public final Uri getHiResImageUri()
    {
        if (AM == null)
        {
            return xf;
        } else
        {
            return AM.getHiResImageUri();
        }
    }

    public final Uri getIconImageUri()
    {
        if (AM == null)
        {
            return xe;
        } else
        {
            return AM.getIconImageUri();
        }
    }

    public final String getParticipantId()
    {
        return yH;
    }

    public final Player getPlayer()
    {
        return AM;
    }

    public final ParticipantResult getResult()
    {
        return AO;
    }

    public final int getStatus()
    {
        return AJ;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final int hashCode()
    {
        return a(this);
    }

    public final boolean isConnectedToRoom()
    {
        return AL;
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
        Object obj = null;
        boolean flag = false;
        if (!bS())
        {
            h.a(this, parcel, i);
        } else
        {
            parcel.writeString(yH);
            parcel.writeString(uf);
            String s;
            int j;
            if (xe == null)
            {
                s = null;
            } else
            {
                s = xe.toString();
            }
            parcel.writeString(s);
            if (xf == null)
            {
                s = obj;
            } else
            {
                s = xf.toString();
            }
            parcel.writeString(s);
            parcel.writeInt(AJ);
            parcel.writeString(AK);
            if (AL)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            if (AM == null)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = 1;
            }
            parcel.writeInt(j);
            if (AM != null)
            {
                AM.writeToParcel(parcel, i);
                return;
            }
        }
    }

}
