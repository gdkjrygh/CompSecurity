// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;


// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class zzapT
    implements com.google.android.gms.common.api.ier
{

    private final int zzTS;
    private final String zzapT;
    private final int zzapU;

    public void zza(com.google.android.gms.games.multiplayer.realtime.ack ack)
    {
        if (ack != null)
        {
            ack.onRealTimeMessageSent(zzTS, zzapU, zzapT);
        }
    }

    public void zzmw()
    {
    }

    public void zzn(Object obj)
    {
        zza((com.google.android.gms.games.multiplayer.realtime.ack)obj);
    }

    ageSentCallback(int i, int j, String s)
    {
        zzTS = i;
        zzapU = j;
        zzapT = s;
    }
}
