// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.cast.games.PlayerInfo;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzt;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzlh

public final class zzjx
    implements PlayerInfo
{

    private final int zzSd;
    private final String zzTL;
    private final JSONObject zzUb;
    private final boolean zzUc;

    public zzjx(String s, int i, JSONObject jsonobject, boolean flag)
    {
        zzTL = s;
        zzSd = i;
        zzUb = jsonobject;
        zzUc = flag;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof PlayerInfo))
        {
            if (zzUc == ((PlayerInfo) (obj = (PlayerInfo)obj)).isControllable() && zzSd == ((PlayerInfo) (obj)).getPlayerState() && zzf.zza(zzTL, ((PlayerInfo) (obj)).getPlayerId()) && zzlh.zzd(zzUb, ((PlayerInfo) (obj)).getPlayerData()))
            {
                return true;
            }
        }
        return false;
    }

    public JSONObject getPlayerData()
    {
        return zzUb;
    }

    public String getPlayerId()
    {
        return zzTL;
    }

    public int getPlayerState()
    {
        return zzSd;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzTL, Integer.valueOf(zzSd), zzUb, Boolean.valueOf(zzUc)
        });
    }

    public boolean isConnected()
    {
        switch (zzSd)
        {
        default:
            return false;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return true;
        }
    }

    public boolean isControllable()
    {
        return zzUc;
    }
}
