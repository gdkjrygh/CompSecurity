// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.games.internal.events.EventIncrementCache;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl, IGamesService, GamesLog

private class zzaoZ extends EventIncrementCache
{

    final GamesClientImpl zzaoZ;

    protected void zzs(String s, int i)
    {
        if (zzaoZ.isConnected())
        {
            ((IGamesService)zzaoZ.zznM()).zzp(s, i);
            return;
        }
        try
        {
            GamesLog.zzv("GamesClientImpl", (new StringBuilder()).append("Unable to increment event ").append(s).append(" by ").append(i).append(" because the games client is no longer connected").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesClientImpl.zza(zzaoZ, s);
        }
        return;
    }

    public Y(GamesClientImpl gamesclientimpl)
    {
        zzaoZ = gamesclientimpl;
        super(gamesclientimpl.getContext().getMainLooper(), 1000);
    }
}
