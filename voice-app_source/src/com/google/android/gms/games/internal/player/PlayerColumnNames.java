// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.text.TextUtils;

public final class PlayerColumnNames
{

    public final String zzasV;
    public final String zzasW;
    public final String zzasX;
    public final String zzasY;
    public final String zzasZ;
    public final String zzata;
    public final String zzatb;
    public final String zzatc;
    public final String zzatd;
    public final String zzate;
    public final String zzatf;
    public final String zzatg;
    public final String zzath;
    public final String zzati;
    public final String zzatj;
    public final String zzatk;
    public final String zzatl;
    public final String zzatm;
    public final String zzatn;
    public final String zzato;
    public final String zzatp;
    public final String zzatq;
    public final String zzatr;
    public final String zzats;
    public final String zzatt;
    public final String zzatu;

    public PlayerColumnNames(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            zzasV = "external_player_id";
            zzasW = "profile_name";
            zzasX = "profile_icon_image_uri";
            zzasY = "profile_icon_image_url";
            zzasZ = "profile_hi_res_image_uri";
            zzata = "profile_hi_res_image_url";
            zzatb = "last_updated";
            zzatc = "is_in_circles";
            zzatd = "played_with_timestamp";
            zzate = "current_xp_total";
            zzatf = "current_level";
            zzatg = "current_level_min_xp";
            zzath = "current_level_max_xp";
            zzati = "next_level";
            zzatj = "next_level_max_xp";
            zzatk = "last_level_up_timestamp";
            zzatl = "player_title";
            zzatm = "has_all_public_acls";
            zzatn = "is_profile_visible";
            zzato = "most_recent_external_game_id";
            zzatp = "most_recent_game_name";
            zzatq = "most_recent_activity_timestamp";
            zzatr = "most_recent_game_icon_uri";
            zzats = "most_recent_game_hi_res_uri";
            zzatt = "most_recent_game_featured_uri";
            zzatu = "has_debug_access";
            return;
        } else
        {
            zzasV = (new StringBuilder()).append(s).append("external_player_id").toString();
            zzasW = (new StringBuilder()).append(s).append("profile_name").toString();
            zzasX = (new StringBuilder()).append(s).append("profile_icon_image_uri").toString();
            zzasY = (new StringBuilder()).append(s).append("profile_icon_image_url").toString();
            zzasZ = (new StringBuilder()).append(s).append("profile_hi_res_image_uri").toString();
            zzata = (new StringBuilder()).append(s).append("profile_hi_res_image_url").toString();
            zzatb = (new StringBuilder()).append(s).append("last_updated").toString();
            zzatc = (new StringBuilder()).append(s).append("is_in_circles").toString();
            zzatd = (new StringBuilder()).append(s).append("played_with_timestamp").toString();
            zzate = (new StringBuilder()).append(s).append("current_xp_total").toString();
            zzatf = (new StringBuilder()).append(s).append("current_level").toString();
            zzatg = (new StringBuilder()).append(s).append("current_level_min_xp").toString();
            zzath = (new StringBuilder()).append(s).append("current_level_max_xp").toString();
            zzati = (new StringBuilder()).append(s).append("next_level").toString();
            zzatj = (new StringBuilder()).append(s).append("next_level_max_xp").toString();
            zzatk = (new StringBuilder()).append(s).append("last_level_up_timestamp").toString();
            zzatl = (new StringBuilder()).append(s).append("player_title").toString();
            zzatm = (new StringBuilder()).append(s).append("has_all_public_acls").toString();
            zzatn = (new StringBuilder()).append(s).append("is_profile_visible").toString();
            zzato = (new StringBuilder()).append(s).append("most_recent_external_game_id").toString();
            zzatp = (new StringBuilder()).append(s).append("most_recent_game_name").toString();
            zzatq = (new StringBuilder()).append(s).append("most_recent_activity_timestamp").toString();
            zzatr = (new StringBuilder()).append(s).append("most_recent_game_icon_uri").toString();
            zzats = (new StringBuilder()).append(s).append("most_recent_game_hi_res_uri").toString();
            zzatt = (new StringBuilder()).append(s).append("most_recent_game_featured_uri").toString();
            zzatu = (new StringBuilder()).append(s).append("has_debug_access").toString();
            return;
        }
    }
}
