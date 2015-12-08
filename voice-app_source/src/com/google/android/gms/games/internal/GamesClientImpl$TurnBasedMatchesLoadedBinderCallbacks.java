// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.GamesStatusCodes;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class zzaqn extends AbstractGamesCallbacks
{

    private final com.google.android.gms.common.api.cks.zzaqn zzaqn;

    public void zzc(int i, Bundle bundle)
    {
        bundle.setClassLoader(getClass().getClassLoader());
        com.google.android.gms.common.api.Status status = GamesStatusCodes.zzfn(i);
        zzaqn.zzaqn(new zzaqn(status, bundle));
    }

    public a(com.google.android.gms.common.api.cks cks)
    {
        zzaqn = (com.google.android.gms.common.api.cks.zzaqn)zzu.zzb(cks, "Holder must not be null");
    }
}
