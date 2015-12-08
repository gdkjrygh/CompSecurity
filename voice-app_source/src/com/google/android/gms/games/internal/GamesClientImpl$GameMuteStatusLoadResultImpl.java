// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GamesStatusCodes;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class zzapi
    implements com.google.android.gms.games.sultImpl
{

    private final Status zzOt;
    private final String zzaph;
    private final boolean zzapi;

    public Status getStatus()
    {
        return zzOt;
    }

    public (DataHolder dataholder)
    {
        zzOt = GamesStatusCodes.zzfn(dataholder.getStatusCode());
        if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
        zzaph = dataholder.zzd("external_game_id", 0, 0);
        zzapi = dataholder.zze("muted", 0, 0);
_L4:
        dataholder.close();
        return;
_L2:
        zzaph = null;
        zzapi = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        dataholder.close();
        throw exception;
    }
}
