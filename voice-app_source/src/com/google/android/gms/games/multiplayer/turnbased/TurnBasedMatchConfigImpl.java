// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchConfig

public final class TurnBasedMatchConfigImpl extends TurnBasedMatchConfig
{

    private final int zzauH;
    private final int zzaui;
    private final Bundle zzauy;
    private final String zzauz[];

    TurnBasedMatchConfigImpl(TurnBasedMatchConfig.Builder builder)
    {
        zzaui = builder.zzaui;
        zzauH = builder.zzauH;
        zzauy = builder.zzauy;
        int i = builder.zzaux.size();
        zzauz = (String[])builder.zzaux.toArray(new String[i]);
    }

    public Bundle getAutoMatchCriteria()
    {
        return zzauy;
    }

    public String[] getInvitedPlayerIds()
    {
        return zzauz;
    }

    public int getVariant()
    {
        return zzaui;
    }

    public int zztL()
    {
        return zzauH;
    }
}
