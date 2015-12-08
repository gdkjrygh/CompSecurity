// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, ParticipantEntity, ParticipantResult

public final class ParticipantRef extends zzc
    implements Participant
{

    private final PlayerRef zzaun;

    public ParticipantRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        zzaun = new PlayerRef(dataholder, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return ParticipantEntity.zza(this, obj);
    }

    public Participant freeze()
    {
        return new ParticipantEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int getCapabilities()
    {
        return getInteger("capabilities");
    }

    public String getDisplayName()
    {
        if (zzbX("external_player_id"))
        {
            return getString("default_display_name");
        } else
        {
            return zzaun.getDisplayName();
        }
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (zzbX("external_player_id"))
        {
            zza("default_display_name", chararraybuffer);
            return;
        } else
        {
            zzaun.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getHiResImageUri()
    {
        if (zzbX("external_player_id"))
        {
            return zzbW("default_display_hi_res_image_uri");
        } else
        {
            return zzaun.getHiResImageUri();
        }
    }

    public String getHiResImageUrl()
    {
        if (zzbX("external_player_id"))
        {
            return getString("default_display_hi_res_image_url");
        } else
        {
            return zzaun.getHiResImageUrl();
        }
    }

    public Uri getIconImageUri()
    {
        if (zzbX("external_player_id"))
        {
            return zzbW("default_display_image_uri");
        } else
        {
            return zzaun.getIconImageUri();
        }
    }

    public String getIconImageUrl()
    {
        if (zzbX("external_player_id"))
        {
            return getString("default_display_image_url");
        } else
        {
            return zzaun.getIconImageUrl();
        }
    }

    public String getParticipantId()
    {
        return getString("external_participant_id");
    }

    public Player getPlayer()
    {
        if (zzbX("external_player_id"))
        {
            return null;
        } else
        {
            return zzaun;
        }
    }

    public ParticipantResult getResult()
    {
        if (zzbX("result_type"))
        {
            return null;
        } else
        {
            int i = getInteger("result_type");
            int j = getInteger("placing");
            return new ParticipantResult(getParticipantId(), i, j);
        }
    }

    public int getStatus()
    {
        return getInteger("player_status");
    }

    public int hashCode()
    {
        return ParticipantEntity.zza(this);
    }

    public boolean isConnectedToRoom()
    {
        return getInteger("connected") > 0;
    }

    public String toString()
    {
        return ParticipantEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((ParticipantEntity)freeze()).writeToParcel(parcel, i);
    }

    public String zzsr()
    {
        return getString("client_address");
    }
}
