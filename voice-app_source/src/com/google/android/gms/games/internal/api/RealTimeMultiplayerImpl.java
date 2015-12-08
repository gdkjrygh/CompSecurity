// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.zzi;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import java.util.List;

public final class RealTimeMultiplayerImpl
    implements RealTimeMultiplayer
{

    public RealTimeMultiplayerImpl()
    {
    }

    private static zzi zza(GoogleApiClient googleapiclient, Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            return googleapiclient.zzo(obj);
        }
    }

    public void create(GoogleApiClient googleapiclient, RoomConfig roomconfig)
    {
        GamesClientImpl gamesclientimpl = Games.zzb(googleapiclient, false);
        if (gamesclientimpl == null)
        {
            return;
        } else
        {
            gamesclientimpl.zza(googleapiclient.zzo(roomconfig.getRoomUpdateListener()), zza(googleapiclient, roomconfig.getRoomStatusUpdateListener()), zza(googleapiclient, roomconfig.getMessageReceivedListener()), roomconfig);
            return;
        }
    }

    public void declineInvitation(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.zzr(s, 0);
        }
    }

    public void dismissInvitation(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.zzq(s, 0);
        }
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient googleapiclient, int i, int j)
    {
        return Games.zzd(googleapiclient).zzc(i, j, true);
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient googleapiclient, int i, int j, boolean flag)
    {
        return Games.zzd(googleapiclient).zzc(i, j, flag);
    }

    public Intent getWaitingRoomIntent(GoogleApiClient googleapiclient, Room room, int i)
    {
        return Games.zzd(googleapiclient).zza(room, i);
    }

    public void join(GoogleApiClient googleapiclient, RoomConfig roomconfig)
    {
        GamesClientImpl gamesclientimpl = Games.zzb(googleapiclient, false);
        if (gamesclientimpl == null)
        {
            return;
        } else
        {
            gamesclientimpl.zzb(googleapiclient.zzo(roomconfig.getRoomUpdateListener()), zza(googleapiclient, roomconfig.getRoomStatusUpdateListener()), zza(googleapiclient, roomconfig.getMessageReceivedListener()), roomconfig);
            return;
        }
    }

    public void leave(GoogleApiClient googleapiclient, RoomUpdateListener roomupdatelistener, String s)
    {
        GamesClientImpl gamesclientimpl = Games.zzb(googleapiclient, false);
        if (gamesclientimpl != null)
        {
            gamesclientimpl.zza(googleapiclient.zzo(roomupdatelistener), s);
        }
    }

    public int sendReliableMessage(GoogleApiClient googleapiclient, com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback, byte abyte0[], String s, String s1)
    {
        reliablemessagesentcallback = zza(googleapiclient, reliablemessagesentcallback);
        return Games.zzd(googleapiclient).zza(reliablemessagesentcallback, abyte0, s, s1);
    }

    public int sendUnreliableMessage(GoogleApiClient googleapiclient, byte abyte0[], String s, String s1)
    {
        return Games.zzd(googleapiclient).zza(abyte0, s, new String[] {
            s1
        });
    }

    public int sendUnreliableMessage(GoogleApiClient googleapiclient, byte abyte0[], String s, List list)
    {
        list = (String[])list.toArray(new String[list.size()]);
        return Games.zzd(googleapiclient).zza(abyte0, s, list);
    }

    public int sendUnreliableMessageToOthers(GoogleApiClient googleapiclient, byte abyte0[], String s)
    {
        return Games.zzd(googleapiclient).zzd(abyte0, s);
    }
}
