// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomConfig, RoomUpdateListener, RoomStatusUpdateListener, RealTimeMessageReceivedListener

public final class RoomConfigImpl extends RoomConfig
{

    private final String zzapl;
    private final int zzaui;
    private final RoomUpdateListener zzaut;
    private final RoomStatusUpdateListener zzauu;
    private final RealTimeMessageReceivedListener zzauv;
    private final Bundle zzauy;
    private final String zzauz[];

    RoomConfigImpl(RoomConfig.Builder builder)
    {
        zzaut = builder.zzaut;
        zzauu = builder.zzauu;
        zzauv = builder.zzauv;
        zzapl = builder.zzauw;
        zzaui = builder.zzaui;
        zzauy = builder.zzauy;
        int i = builder.zzaux.size();
        zzauz = (String[])builder.zzaux.toArray(new String[i]);
        zzu.zzb(zzauv, "Must specify a message listener");
    }

    public Bundle getAutoMatchCriteria()
    {
        return zzauy;
    }

    public String getInvitationId()
    {
        return zzapl;
    }

    public String[] getInvitedPlayerIds()
    {
        return zzauz;
    }

    public RealTimeMessageReceivedListener getMessageReceivedListener()
    {
        return zzauv;
    }

    public RoomStatusUpdateListener getRoomStatusUpdateListener()
    {
        return zzauu;
    }

    public RoomUpdateListener getRoomUpdateListener()
    {
        return zzaut;
    }

    public int getVariant()
    {
        return zzaui;
    }
}
