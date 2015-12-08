// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.d;

public interface Game
    extends Parcelable, d
{

    public abstract int getAchievementTotalCount();

    public abstract String getApplicationId();

    public abstract String getDescription();

    public abstract void getDescription(CharArrayBuffer chararraybuffer);

    public abstract String getDeveloperName();

    public abstract void getDeveloperName(CharArrayBuffer chararraybuffer);

    public abstract String getDisplayName();

    public abstract void getDisplayName(CharArrayBuffer chararraybuffer);

    public abstract Uri getFeaturedImageUri();

    public abstract int getGameplayAclStatus();

    public abstract Uri getHiResImageUri();

    public abstract Uri getIconImageUri();

    public abstract String getInstancePackageName();

    public abstract int getLeaderboardCount();

    public abstract String getPrimaryCategory();

    public abstract String getSecondaryCategory();

    public abstract boolean isInstanceInstalled();

    public abstract boolean isPlayEnabledGame();

    public abstract boolean isRealTimeMultiplayerEnabled();

    public abstract boolean isTurnBasedMultiplayerEnabled();
}
