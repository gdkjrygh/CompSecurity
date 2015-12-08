// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomConfig, RoomUpdateListener, RoomConfigImpl, RoomStatusUpdateListener, 
//            RealTimeMessageReceivedListener

public static final class <init>
{

    int zzaui;
    final RoomUpdateListener zzaut;
    RoomStatusUpdateListener zzauu;
    RealTimeMessageReceivedListener zzauv;
    String zzauw;
    ArrayList zzaux;
    Bundle zzauy;

    public <init> addPlayersToInvite(ArrayList arraylist)
    {
        zzu.zzu(arraylist);
        zzaux.addAll(arraylist);
        return this;
    }

    public transient zzaux addPlayersToInvite(String as[])
    {
        zzu.zzu(as);
        zzaux.addAll(Arrays.asList(as));
        return this;
    }

    public RoomConfig build()
    {
        return new RoomConfigImpl(this);
    }

    public t> setAutoMatchCriteria(Bundle bundle)
    {
        zzauy = bundle;
        return this;
    }

    public zzauy setInvitationIdToAccept(String s)
    {
        zzu.zzu(s);
        zzauw = s;
        return this;
    }

    public ivedListener setMessageReceivedListener(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
    {
        zzauv = realtimemessagereceivedlistener;
        return this;
    }

    public tener setRoomStatusUpdateListener(RoomStatusUpdateListener roomstatusupdatelistener)
    {
        zzauu = roomstatusupdatelistener;
        return this;
    }

    public zzauu setVariant(int i)
    {
        boolean flag;
        if (i == -1 || i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Variant must be a positive integer or Room.ROOM_VARIANT_ANY");
        zzaui = i;
        return this;
    }

    private tener(RoomUpdateListener roomupdatelistener)
    {
        zzauw = null;
        zzaui = -1;
        zzaux = new ArrayList();
        zzaut = (RoomUpdateListener)zzu.zzb(roomupdatelistener, "Must provide a RoomUpdateListener");
    }

    zzaut(RoomUpdateListener roomupdatelistener, zzaut zzaut1)
    {
        this(roomupdatelistener);
    }
}
