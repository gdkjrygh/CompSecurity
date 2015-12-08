// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzf;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzlh

public final class zzjy
{

    private final int zzSd;
    private final String zzTL;
    private final JSONObject zzUb;

    public zzjy(String s, int i, JSONObject jsonobject)
    {
        zzTL = s;
        zzSd = i;
        zzUb = jsonobject;
    }

    public zzjy(JSONObject jsonobject)
        throws JSONException
    {
        this(jsonobject.optString("playerId"), jsonobject.optInt("playerState"), jsonobject.optJSONObject("playerData"));
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof zzjy))
        {
            if (zzSd == ((zzjy) (obj = (zzjy)obj)).getPlayerState() && zzf.zza(zzTL, ((zzjy) (obj)).getPlayerId()) && zzlh.zzd(zzUb, ((zzjy) (obj)).getPlayerData()))
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
}
