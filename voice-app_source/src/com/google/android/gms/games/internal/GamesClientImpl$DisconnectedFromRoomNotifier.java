// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class nit> extends nit>
{

    public void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
    {
        roomstatusupdatelistener.onDisconnectedFromRoom(room);
    }

    (DataHolder dataholder)
    {
        super(dataholder);
    }
}
