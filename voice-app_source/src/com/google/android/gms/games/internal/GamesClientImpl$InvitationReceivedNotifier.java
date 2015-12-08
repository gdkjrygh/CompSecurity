// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class zzapk
    implements com.google.android.gms.common.api.ier
{

    private final Invitation zzapk;

    public void zza(OnInvitationReceivedListener oninvitationreceivedlistener)
    {
        oninvitationreceivedlistener.onInvitationReceived(zzapk);
    }

    public void zzmw()
    {
    }

    public void zzn(Object obj)
    {
        zza((OnInvitationReceivedListener)obj);
    }

    (Invitation invitation)
    {
        zzapk = invitation;
    }
}
