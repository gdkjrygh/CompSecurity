// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class zzapH
    implements com.google.android.gms.common.api.ier
{

    private final RealTimeMessage zzapH;

    public void zza(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
    {
        realtimemessagereceivedlistener.onRealTimeMessageReceived(zzapH);
    }

    public void zzmw()
    {
    }

    public void zzn(Object obj)
    {
        zza((RealTimeMessageReceivedListener)obj);
    }

    ner(RealTimeMessage realtimemessage)
    {
        zzapH = realtimemessage;
    }
}
