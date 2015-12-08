// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.youtube.p;

final class isAccountFeed extends Enum
{

    private static final POPULAR_WW $VALUES[];
    public static final POPULAR_WW FAVORITES;
    public static final POPULAR_WW HISTORY;
    public static final POPULAR_WW MUSIC;
    public static final POPULAR_WW POPULAR;
    public static final POPULAR_WW POPULAR_WW;
    public static final POPULAR_WW UPLOADS;
    public static final POPULAR_WW WATCH_LATER;
    final WatchFeature feature;
    final boolean isAccountFeed;
    final int labelStringId;
    final int position;

    public static isAccountFeed valueOf(String s)
    {
        return (isAccountFeed)Enum.valueOf(com/google/android/apps/youtube/app/honeycomb/phone/PostPairingActivity$FeedItem, s);
    }

    public static isAccountFeed[] values()
    {
        return (isAccountFeed[])$VALUES.clone();
    }

    static 
    {
        WATCH_LATER = new <init>("WATCH_LATER", 0, 0, p.aj, WatchFeature.WATCH_LATER, true);
        FAVORITES = new <init>("FAVORITES", 1, 1, p.ad, WatchFeature.MY_FAVORITES, true);
        UPLOADS = new <init>("UPLOADS", 2, 2, p.ah, WatchFeature.MY_UPLOADS, true);
        HISTORY = new <init>("HISTORY", 3, 3, p.ai, WatchFeature.WATCH_HISTORY, true);
        POPULAR = new <init>("POPULAR", 4, 4, p.ci, WatchFeature.GUIDE_CATEGORY_POPULAR, false);
        MUSIC = new <init>("MUSIC", 5, 5, p.W, WatchFeature.GUIDE_CATEGORY_MUSIC, false);
        POPULAR_WW = new <init>("POPULAR_WW", 6, 6, p.ci, WatchFeature.GUIDE_CATEGORY_POPULAR, false);
        $VALUES = (new .VALUES[] {
            WATCH_LATER, FAVORITES, UPLOADS, HISTORY, POPULAR, MUSIC, POPULAR_WW
        });
    }

    private (String s, int i, int j, int k, WatchFeature watchfeature, boolean flag)
    {
        super(s, i);
        position = j;
        labelStringId = k;
        feature = watchfeature;
        isAccountFeed = flag;
    }
}
