// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            TurnBasedMultiplayerImpl

private static abstract class zzKI extends com.google.android.gms.games.celMatchImpl
{

    private final String zzKI;

    static String zza(zzKI zzki)
    {
        return zzki.zzKI;
    }

    public Result createFailedResult(Status status)
    {
        return zzay(status);
    }

    public com.google.android.gms.games.multiplayer.turnbased.Q zzay(Status status)
    {
        return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult(status) {

            final Status zzOl;
            final TurnBasedMultiplayerImpl.CancelMatchImpl zzasw;

            public String getMatchId()
            {
                return TurnBasedMultiplayerImpl.CancelMatchImpl.zza(zzasw);
            }

            public Status getStatus()
            {
                return zzOl;
            }

            
            {
                zzasw = TurnBasedMultiplayerImpl.CancelMatchImpl.this;
                zzOl = status;
                super();
            }
        };
    }

    public _cls1.zzOl(String s, GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
        zzKI = s;
    }
}
