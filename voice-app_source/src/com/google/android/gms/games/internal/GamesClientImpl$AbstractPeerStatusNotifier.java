// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static abstract class zzapa extends zzapa
{

    private final ArrayList zzapa = new ArrayList();

    protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
    {
        zza(roomstatusupdatelistener, room, zzapa);
    }

    protected abstract void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist);

    (DataHolder dataholder, String as[])
    {
        super(dataholder);
        int i = 0;
        for (int j = as.length; i < j; i++)
        {
            zzapa.add(as[i]);
        }

    }
}
