// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.GamesStatusCodes;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class zzOs extends AbstractGamesCallbacks
{

    private final com.google.android.gms.common.api.cks.zzOs zzOs;

    public void zzkU()
    {
        com.google.android.gms.common.api.Status status = GamesStatusCodes.zzfn(0);
        zzOs.zzOs(status);
    }

    public (com.google.android.gms.common.api.cks cks)
    {
        zzOs = (com.google.android.gms.common.api.cks.zzOs)zzu.zzb(cks, "Holder must not be null");
    }
}
