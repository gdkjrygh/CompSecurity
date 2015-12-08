// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class zzapO
    implements com.google.android.gms.common.api.ier
{

    private final String zzapO;

    public void zza(RoomStatusUpdateListener roomstatusupdatelistener)
    {
        roomstatusupdatelistener.onP2PDisconnected(zzapO);
    }

    public void zzmw()
    {
    }

    public void zzn(Object obj)
    {
        zza((RoomStatusUpdateListener)obj);
    }

    (String s)
    {
        zzapO = s;
    }
}
