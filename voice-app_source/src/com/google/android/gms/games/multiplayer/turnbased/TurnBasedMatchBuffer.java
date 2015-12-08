// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchRef, TurnBasedMatch

public final class TurnBasedMatchBuffer extends zzf
{

    public TurnBasedMatchBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object zzj(int i, int j)
    {
        return zzq(i, j);
    }

    protected String zzni()
    {
        return "external_match_id";
    }

    protected TurnBasedMatch zzq(int i, int j)
    {
        return new TurnBasedMatchRef(zzWu, i, j);
    }
}
