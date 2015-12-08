// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.e;
import com.google.android.gms.games.Player;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, ParticipantEntity, ParticipantResult

public final class d extends e
    implements Participant
{

    private final com.google.android.gms.games.d AP;

    public d(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        AP = new com.google.android.gms.games.d(dataholder, i);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String dz()
    {
        return getString("client_address");
    }

    public final boolean equals(Object obj)
    {
        return ParticipantEntity.a(this, obj);
    }

    public final Participant freeze()
    {
        return new ParticipantEntity(this);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final int getCapabilities()
    {
        return getInteger("capabilities");
    }

    public final String getDisplayName()
    {
        if (T("external_player_id"))
        {
            return getString("default_display_name");
        } else
        {
            return AP.getDisplayName();
        }
    }

    public final void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (T("external_player_id"))
        {
            a("default_display_name", chararraybuffer);
            return;
        } else
        {
            AP.getDisplayName(chararraybuffer);
            return;
        }
    }

    public final Uri getHiResImageUri()
    {
        if (T("external_player_id"))
        {
            return S("default_display_hi_res_image_uri");
        } else
        {
            return AP.getHiResImageUri();
        }
    }

    public final Uri getIconImageUri()
    {
        if (T("external_player_id"))
        {
            return S("default_display_image_uri");
        } else
        {
            return AP.getIconImageUri();
        }
    }

    public final String getParticipantId()
    {
        return getString("external_participant_id");
    }

    public final Player getPlayer()
    {
        if (T("external_player_id"))
        {
            return null;
        } else
        {
            return AP;
        }
    }

    public final ParticipantResult getResult()
    {
        if (T("result_type"))
        {
            return null;
        } else
        {
            int i = getInteger("result_type");
            int j = getInteger("placing");
            return new ParticipantResult(getParticipantId(), i, j);
        }
    }

    public final int getStatus()
    {
        return getInteger("player_status");
    }

    public final int hashCode()
    {
        return ParticipantEntity.a(this);
    }

    public final boolean isConnectedToRoom()
    {
        return getInteger("connected") > 0;
    }

    public final String toString()
    {
        return ParticipantEntity.b(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((ParticipantEntity)freeze()).writeToParcel(parcel, i);
    }
}
