// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.e;

// Referenced classes of package com.google.android.gms.games:
//            Game, GameEntity

public final class b extends e
    implements Game
{

    public b(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return GameEntity.a(this, obj);
    }

    public final Game freeze()
    {
        return new GameEntity(this);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final int getAchievementTotalCount()
    {
        return getInteger("achievement_total_count");
    }

    public final String getApplicationId()
    {
        return getString("external_game_id");
    }

    public final String getDescription()
    {
        return getString("game_description");
    }

    public final void getDescription(CharArrayBuffer chararraybuffer)
    {
        a("game_description", chararraybuffer);
    }

    public final String getDeveloperName()
    {
        return getString("developer_name");
    }

    public final void getDeveloperName(CharArrayBuffer chararraybuffer)
    {
        a("developer_name", chararraybuffer);
    }

    public final String getDisplayName()
    {
        return getString("display_name");
    }

    public final void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        a("display_name", chararraybuffer);
    }

    public final Uri getFeaturedImageUri()
    {
        return S("featured_image_uri");
    }

    public final int getGameplayAclStatus()
    {
        return getInteger("gameplay_acl_status");
    }

    public final Uri getHiResImageUri()
    {
        return S("game_hi_res_image_uri");
    }

    public final Uri getIconImageUri()
    {
        return S("game_icon_image_uri");
    }

    public final String getInstancePackageName()
    {
        return getString("package_name");
    }

    public final int getLeaderboardCount()
    {
        return getInteger("leaderboard_count");
    }

    public final String getPrimaryCategory()
    {
        return getString("primary_category");
    }

    public final String getSecondaryCategory()
    {
        return getString("secondary_category");
    }

    public final int hashCode()
    {
        return GameEntity.a(this);
    }

    public final boolean isInstanceInstalled()
    {
        return getInteger("installed") > 0;
    }

    public final boolean isPlayEnabledGame()
    {
        return getBoolean("play_enabled_game");
    }

    public final boolean isRealTimeMultiplayerEnabled()
    {
        return getInteger("real_time_support") > 0;
    }

    public final boolean isTurnBasedMultiplayerEnabled()
    {
        return getInteger("turn_based_support") > 0;
    }

    public final String toString()
    {
        return GameEntity.b(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((GameEntity)freeze()).writeToParcel(parcel, i);
    }
}
