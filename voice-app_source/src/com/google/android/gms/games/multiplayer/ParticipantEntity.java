// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.zzlc;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, ParticipantEntityCreator, ParticipantResult

public final class ParticipantEntity extends GamesDowngradeableSafeParcel
    implements Participant
{
    static final class ParticipantEntityCreatorCompat extends ParticipantEntityCreator
    {

        public Object createFromParcel(Parcel parcel)
        {
            return zzdJ(parcel);
        }

        public ParticipantEntity zzdJ(Parcel parcel)
        {
            boolean flag = true;
            if (ParticipantEntity.zzc(ParticipantEntity.zzrH()) || ParticipantEntity.zzcM(com/google/android/gms/games/multiplayer/ParticipantEntity.getCanonicalName()))
            {
                return super.zzdJ(parcel);
            }
            String s = parcel.readString();
            String s1 = parcel.readString();
            Object obj = parcel.readString();
            Object obj1;
            String s2;
            int i;
            boolean flag1;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = Uri.parse(((String) (obj)));
            }
            obj1 = parcel.readString();
            if (obj1 == null)
            {
                obj1 = null;
            } else
            {
                obj1 = Uri.parse(((String) (obj1)));
            }
            i = parcel.readInt();
            s2 = parcel.readString();
            if (parcel.readInt() > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (parcel.readInt() <= 0)
            {
                flag = false;
            }
            if (flag)
            {
                parcel = (PlayerEntity)PlayerEntity.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            return new ParticipantEntity(3, s, s1, ((Uri) (obj)), ((Uri) (obj1)), i, s2, flag1, parcel, 7, null, null, null);
        }

        ParticipantEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new ParticipantEntityCreatorCompat();
    private final int zzCY;
    private final int zzQT;
    private final String zzadI;
    private final Uri zzanf;
    private final Uri zzang;
    private final String zzanq;
    private final String zzanr;
    private final String zzaoO;
    private final PlayerEntity zzaog;
    private final String zzapO;
    private final boolean zzaul;
    private final ParticipantResult zzaum;
    private final int zzwS;

    ParticipantEntity(int i, String s, String s1, Uri uri, Uri uri1, int j, String s2, 
            boolean flag, PlayerEntity playerentity, int k, ParticipantResult participantresult, String s3, String s4)
    {
        zzCY = i;
        zzapO = s;
        zzadI = s1;
        zzanf = uri;
        zzang = uri1;
        zzwS = j;
        zzaoO = s2;
        zzaul = flag;
        zzaog = playerentity;
        zzQT = k;
        zzaum = participantresult;
        zzanq = s3;
        zzanr = s4;
    }

    public ParticipantEntity(Participant participant)
    {
        zzCY = 3;
        zzapO = participant.getParticipantId();
        zzadI = participant.getDisplayName();
        zzanf = participant.getIconImageUri();
        zzang = participant.getHiResImageUri();
        zzwS = participant.getStatus();
        zzaoO = participant.zzsr();
        zzaul = participant.isConnectedToRoom();
        Object obj = participant.getPlayer();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new PlayerEntity(((Player) (obj)));
        }
        zzaog = ((PlayerEntity) (obj));
        zzQT = participant.getCapabilities();
        zzaum = participant.getResult();
        zzanq = participant.getIconImageUrl();
        zzanr = participant.getHiResImageUrl();
    }

    static int zza(Participant participant)
    {
        return zzt.hashCode(new Object[] {
            participant.getPlayer(), Integer.valueOf(participant.getStatus()), participant.zzsr(), Boolean.valueOf(participant.isConnectedToRoom()), participant.getDisplayName(), participant.getIconImageUri(), participant.getHiResImageUri(), Integer.valueOf(participant.getCapabilities()), participant.getResult(), participant.getParticipantId()
        });
    }

    static boolean zza(Participant participant, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Participant) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (participant == obj) goto _L4; else goto _L3
_L3:
        obj = (Participant)obj;
        if (!zzt.equal(((Participant) (obj)).getPlayer(), participant.getPlayer()) || !zzt.equal(Integer.valueOf(((Participant) (obj)).getStatus()), Integer.valueOf(participant.getStatus())) || !zzt.equal(((Participant) (obj)).zzsr(), participant.zzsr()) || !zzt.equal(Boolean.valueOf(((Participant) (obj)).isConnectedToRoom()), Boolean.valueOf(participant.isConnectedToRoom())) || !zzt.equal(((Participant) (obj)).getDisplayName(), participant.getDisplayName()) || !zzt.equal(((Participant) (obj)).getIconImageUri(), participant.getIconImageUri()) || !zzt.equal(((Participant) (obj)).getHiResImageUri(), participant.getHiResImageUri()) || !zzt.equal(Integer.valueOf(((Participant) (obj)).getCapabilities()), Integer.valueOf(participant.getCapabilities())) || !zzt.equal(((Participant) (obj)).getResult(), participant.getResult()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(((Participant) (obj)).getParticipantId(), participant.getParticipantId())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Participant participant)
    {
        return zzt.zzt(participant).zzg("ParticipantId", participant.getParticipantId()).zzg("Player", participant.getPlayer()).zzg("Status", Integer.valueOf(participant.getStatus())).zzg("ClientAddress", participant.zzsr()).zzg("ConnectedToRoom", Boolean.valueOf(participant.isConnectedToRoom())).zzg("DisplayName", participant.getDisplayName()).zzg("IconImage", participant.getIconImageUri()).zzg("IconImageUrl", participant.getIconImageUrl()).zzg("HiResImage", participant.getHiResImageUri()).zzg("HiResImageUrl", participant.getHiResImageUrl()).zzg("Capabilities", Integer.valueOf(participant.getCapabilities())).zzg("Result", participant.getResult()).toString();
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

    public Participant freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int getCapabilities()
    {
        return zzQT;
    }

    public String getDisplayName()
    {
        if (zzaog == null)
        {
            return zzadI;
        } else
        {
            return zzaog.getDisplayName();
        }
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (zzaog == null)
        {
            zzlc.zzb(zzadI, chararraybuffer);
            return;
        } else
        {
            zzaog.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getHiResImageUri()
    {
        if (zzaog == null)
        {
            return zzang;
        } else
        {
            return zzaog.getHiResImageUri();
        }
    }

    public String getHiResImageUrl()
    {
        if (zzaog == null)
        {
            return zzanr;
        } else
        {
            return zzaog.getHiResImageUrl();
        }
    }

    public Uri getIconImageUri()
    {
        if (zzaog == null)
        {
            return zzanf;
        } else
        {
            return zzaog.getIconImageUri();
        }
    }

    public String getIconImageUrl()
    {
        if (zzaog == null)
        {
            return zzanq;
        } else
        {
            return zzaog.getIconImageUrl();
        }
    }

    public String getParticipantId()
    {
        return zzapO;
    }

    public Player getPlayer()
    {
        return zzaog;
    }

    public ParticipantResult getResult()
    {
        return zzaum;
    }

    public int getStatus()
    {
        return zzwS;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zza(this);
    }

    public boolean isConnectedToRoom()
    {
        return zzaul;
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
        Object obj = null;
        boolean flag = false;
        if (!zznF())
        {
            ParticipantEntityCreator.zza(this, parcel, i);
        } else
        {
            parcel.writeString(zzapO);
            parcel.writeString(zzadI);
            String s;
            int j;
            if (zzanf == null)
            {
                s = null;
            } else
            {
                s = zzanf.toString();
            }
            parcel.writeString(s);
            if (zzang == null)
            {
                s = obj;
            } else
            {
                s = zzang.toString();
            }
            parcel.writeString(s);
            parcel.writeInt(zzwS);
            parcel.writeString(zzaoO);
            if (zzaul)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            if (zzaog == null)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = 1;
            }
            parcel.writeInt(j);
            if (zzaog != null)
            {
                zzaog.writeToParcel(parcel, i);
                return;
            }
        }
    }

    public String zzsr()
    {
        return zzaoO;
    }

}
