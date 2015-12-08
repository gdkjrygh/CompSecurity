// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class zzapn
    implements com.google.android.gms.common.api.ier
{

    private final int zzTS;
    private final String zzapn;

    public void zza(RoomUpdateListener roomupdatelistener)
    {
        roomupdatelistener.onLeftRoom(zzTS, zzapn);
    }

    public void zzmw()
    {
    }

    public void zzn(Object obj)
    {
        zza((RoomUpdateListener)obj);
    }

    (int i, String s)
    {
        zzTS = i;
        zzapn = s;
    }
}
