// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static abstract class  extends zzb
{

    protected void zza(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
    {
        zza(roomupdatelistener, GamesClientImpl.zzV(dataholder), dataholder.getStatusCode());
    }

    protected abstract void zza(RoomUpdateListener roomupdatelistener, Room room, int i);

    protected volatile void zza(Object obj, DataHolder dataholder)
    {
        zza((RoomUpdateListener)obj, dataholder);
    }

    (DataHolder dataholder)
    {
        super(dataholder);
    }
}
