// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;


final class l
{

    static final int a[];

    static 
    {
        a = new int[PostPairingActivity.FeedItem.values().length];
        try
        {
            a[PostPairingActivity.FeedItem.UPLOADS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[PostPairingActivity.FeedItem.HISTORY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[PostPairingActivity.FeedItem.FAVORITES.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[PostPairingActivity.FeedItem.WATCH_LATER.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[PostPairingActivity.FeedItem.POPULAR.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[PostPairingActivity.FeedItem.MUSIC.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[PostPairingActivity.FeedItem.POPULAR_WW.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
