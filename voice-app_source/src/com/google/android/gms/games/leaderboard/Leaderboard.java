// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;
import java.util.ArrayList;

public interface Leaderboard
    extends Freezable
{

    public static final int SCORE_ORDER_LARGER_IS_BETTER = 1;
    public static final int SCORE_ORDER_SMALLER_IS_BETTER = 0;

    public abstract String getDisplayName();

    public abstract void getDisplayName(CharArrayBuffer chararraybuffer);

    public abstract Game getGame();

    public abstract Uri getIconImageUri();

    public abstract String getIconImageUrl();

    public abstract String getLeaderboardId();

    public abstract int getScoreOrder();

    public abstract ArrayList getVariants();
}
