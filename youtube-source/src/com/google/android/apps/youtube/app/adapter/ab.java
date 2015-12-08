// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;


final class ab
{

    static final int a[];

    static 
    {
        a = new int[com.google.android.apps.youtube.datalib.legacy.model.Event.Action.values().length];
        try
        {
            a[com.google.android.apps.youtube.datalib.legacy.model.Event.Action.BULLETIN_POSTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.legacy.model.Event.Action.FRIEND_ADDED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_LIKED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_SHARED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_FAVORITED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_COMMENTED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_UPLOADED.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_ADDED_TO_PLAYLIST.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.legacy.model.Event.Action.USER_SUBSCRIPTION_ADDED.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_RECOMMENDED.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
