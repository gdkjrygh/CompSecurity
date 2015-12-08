// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomRef, Room

public final class RoomBuffer extends zzf
{

    public RoomBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object zzj(int i, int j)
    {
        return zzp(i, j);
    }

    protected String zzni()
    {
        return "external_match_id";
    }

    protected Room zzp(int i, int j)
    {
        return new RoomRef(zzWu, i, j);
    }
}
