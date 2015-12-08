// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequestRef, GameRequest

public final class GameRequestBuffer extends zzf
{

    public GameRequestBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object zzj(int i, int j)
    {
        return zzs(i, j);
    }

    protected String zzni()
    {
        return "external_request_id";
    }

    protected GameRequest zzs(int i, int j)
    {
        return new GameRequestRef(zzWu, i, j);
    }
}
