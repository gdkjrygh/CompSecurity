// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class zzapR extends AbstractGamesCallbacks
{

    private final com.google.android.gms.common.api.cks.zzapR zzapQ;
    private final String zzapR;

    public void zzN(DataHolder dataholder)
    {
        zzapQ.zzapQ(new zzapQ(dataholder, zzapR));
    }

    public (com.google.android.gms.common.api.cks cks, String s)
    {
        zzapQ = (com.google.android.gms.common.api.cks.zzapQ)zzu.zzb(cks, "Holder must not be null");
        zzapR = (String)zzu.zzb(s, "MilestoneId must not be null");
    }
}
