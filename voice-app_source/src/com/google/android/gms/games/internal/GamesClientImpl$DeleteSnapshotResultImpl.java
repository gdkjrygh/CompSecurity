// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.GamesStatusCodes;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class zzapg
    implements com.google.android.gms.games.snapshot.zzapg
{

    private final Status zzOt;
    private final String zzapg;

    public String getSnapshotId()
    {
        return zzapg;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    (int i, String s)
    {
        zzOt = GamesStatusCodes.zzfn(i);
        zzapg = s;
    }
}
