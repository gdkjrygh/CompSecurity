// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            GamesMetadataImpl

private static abstract class _cls1.zzOl extends com.google.android.gms.games.gestionsImpl
{

    public Result createFailedResult(Status status)
    {
        return zzY(status);
    }

    public com.google.android.gms.games.gestionsImpl zzY(Status status)
    {
        return new com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult(status) {

            final Status zzOl;
            final GamesMetadataImpl.LoadGameSearchSuggestionsImpl zzaqT;

            public Status getStatus()
            {
                return zzOl;
            }

            public void release()
            {
            }

            
            {
                zzaqT = GamesMetadataImpl.LoadGameSearchSuggestionsImpl.this;
                zzOl = status;
                super();
            }
        };
    }
}
