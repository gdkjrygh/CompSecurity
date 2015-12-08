// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.GamesStatusCodes;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class zzapZ extends AbstractGamesCallbacks
{

    private final com.google.android.gms.common.api.it> zzapZ;

    public void zzd(int i, Bundle bundle)
    {
        bundle.setClassLoader(getClass().getClassLoader());
        com.google.android.gms.common.api.Status status = GamesStatusCodes.zzfn(i);
        zzapZ.zzapZ(new zzapZ(status, bundle));
    }

    public Y(com.google.android.gms.common.api.cks cks)
    {
        zzapZ = (com.google.android.gms.common.api.cks.zzapZ)zzu.zzb(cks, "Holder must not be null");
    }
}
