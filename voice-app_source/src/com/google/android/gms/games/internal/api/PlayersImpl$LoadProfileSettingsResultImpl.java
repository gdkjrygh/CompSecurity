// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            PlayersImpl

private static abstract class _cls1.zzOl extends com.google.android.gms.games.gsResultImpl
{

    protected Result createFailedResult(Status status)
    {
        return zzak(status);
    }

    protected com.google.android.gms.games.gsResultImpl zzak(Status status)
    {
        return new com.google.android.gms.games.Players.LoadProfileSettingsResult(status) {

            final Status zzOl;
            final PlayersImpl.LoadProfileSettingsResultImpl zzarC;

            public Status getStatus()
            {
                return zzOl;
            }

            public boolean isProfileVisible()
            {
                return true;
            }

            public boolean isVisibilityExplicitlySet()
            {
                return false;
            }

            
            {
                zzarC = PlayersImpl.LoadProfileSettingsResultImpl.this;
                zzOl = status;
                super();
            }
        };
    }
}
