// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            TurnBasedMultiplayerImpl

class zzOl
    implements com.google.android.gms.games.multiplayer.turnbased.
{

    final Status zzOl;
    final zzOl zzasw;

    public String getMatchId()
    {
        return a(zzasw);
    }

    public Status getStatus()
    {
        return zzOl;
    }

    sult(sult sult, Status status)
    {
        zzasw = sult;
        zzOl = status;
        super();
    }
}
