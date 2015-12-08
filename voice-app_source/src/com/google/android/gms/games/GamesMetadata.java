// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.games:
//            Game, GameBuffer

public interface GamesMetadata
{
    public static interface LoadGameInstancesResult
        extends Releasable, Result
    {
    }

    public static interface LoadGameSearchSuggestionsResult
        extends Releasable, Result
    {
    }

    public static interface LoadGamesResult
        extends Releasable, Result
    {

        public abstract GameBuffer getGames();
    }


    public abstract Game getCurrentGame(GoogleApiClient googleapiclient);

    public abstract PendingResult loadGame(GoogleApiClient googleapiclient);
}
