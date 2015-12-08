// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.GamesStatusCodes;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class zzOs extends AbstractGamesCallbacks
{

    private final com.google.android.gms.common.api.ack.zzOs zzOs;

    public void zzg(int i, Bundle bundle)
    {
        bundle.setClassLoader(getClass().getClassLoader());
        com.google.android.gms.common.api.Status status = GamesStatusCodes.zzfn(i);
        zzOs.zzOs(new zzOs(status, bundle));
    }

    (com.google.android.gms.common.api.ack ack)
    {
        zzOs = (com.google.android.gms.common.api.ack.zzOs)zzu.zzb(ack, "Holder must not be null");
    }
}
