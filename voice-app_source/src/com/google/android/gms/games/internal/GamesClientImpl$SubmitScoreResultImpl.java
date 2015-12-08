// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class zzaqh extends zzaqh
    implements com.google.android.gms.games.leaderboard.qh
{

    private final ScoreSubmissionData zzaqh;

    public ScoreSubmissionData getScoreData()
    {
        return zzaqh;
    }

    public Q(DataHolder dataholder)
    {
        super(dataholder);
        zzaqh = new ScoreSubmissionData(dataholder);
        dataholder.close();
        return;
        Exception exception;
        exception;
        dataholder.close();
        throw exception;
    }
}
