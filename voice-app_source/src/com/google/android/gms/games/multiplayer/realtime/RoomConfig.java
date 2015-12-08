// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomUpdateListener, RealTimeMessageReceivedListener, RoomStatusUpdateListener, RoomConfigImpl

public abstract class RoomConfig
{
    public static final class Builder
    {

        int zzaui;
        final RoomUpdateListener zzaut;
        RoomStatusUpdateListener zzauu;
        RealTimeMessageReceivedListener zzauv;
        String zzauw;
        ArrayList zzaux;
        Bundle zzauy;

        public Builder addPlayersToInvite(ArrayList arraylist)
        {
            zzu.zzu(arraylist);
            zzaux.addAll(arraylist);
            return this;
        }

        public transient Builder addPlayersToInvite(String as[])
        {
            zzu.zzu(as);
            zzaux.addAll(Arrays.asList(as));
            return this;
        }

        public RoomConfig build()
        {
            return new RoomConfigImpl(this);
        }

        public Builder setAutoMatchCriteria(Bundle bundle)
        {
            zzauy = bundle;
            return this;
        }

        public Builder setInvitationIdToAccept(String s)
        {
            zzu.zzu(s);
            zzauw = s;
            return this;
        }

        public Builder setMessageReceivedListener(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            zzauv = realtimemessagereceivedlistener;
            return this;
        }

        public Builder setRoomStatusUpdateListener(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            zzauu = roomstatusupdatelistener;
            return this;
        }

        public Builder setVariant(int i)
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

        private Builder(RoomUpdateListener roomupdatelistener)
        {
            zzauw = null;
            zzaui = -1;
            zzaux = new ArrayList();
            zzaut = (RoomUpdateListener)zzu.zzb(roomupdatelistener, "Must provide a RoomUpdateListener");
        }

    }


    protected RoomConfig()
    {
    }

    public static Builder builder(RoomUpdateListener roomupdatelistener)
    {
        return new Builder(roomupdatelistener);
    }

    public static Bundle createAutoMatchCriteria(int i, int j, long l)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("min_automatch_players", i);
        bundle.putInt("max_automatch_players", j);
        bundle.putLong("exclusive_bit_mask", l);
        return bundle;
    }

    public abstract Bundle getAutoMatchCriteria();

    public abstract String getInvitationId();

    public abstract String[] getInvitedPlayerIds();

    public abstract RealTimeMessageReceivedListener getMessageReceivedListener();

    public abstract RoomStatusUpdateListener getRoomStatusUpdateListener();

    public abstract RoomUpdateListener getRoomUpdateListener();

    public abstract int getVariant();
}
