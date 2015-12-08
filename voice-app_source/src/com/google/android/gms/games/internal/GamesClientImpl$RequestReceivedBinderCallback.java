// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.zzi;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class zzafi extends AbstractGamesCallbacks
{

    private final zzi zzafi;

    public void onRequestRemoved(String s)
    {
        zzafi.zza(new zzafi(s));
    }

    public void zzr(DataHolder dataholder)
    {
        GameRequestBuffer gamerequestbuffer;
        gamerequestbuffer = new GameRequestBuffer(dataholder);
        dataholder = null;
        if (gamerequestbuffer.getCount() > 0)
        {
            dataholder = (GameRequest)((GameRequest)gamerequestbuffer.get(0)).freeze();
        }
        gamerequestbuffer.release();
        if (dataholder != null)
        {
            zzafi.zza(new (dataholder));
        }
        return;
        dataholder;
        gamerequestbuffer.release();
        throw dataholder;
    }

    Y(zzi zzi1)
    {
        zzafi = zzi1;
    }
}
