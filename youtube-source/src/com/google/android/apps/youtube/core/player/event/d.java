// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.event;


final class d
{

    static final int a[];

    static 
    {
        a = new int[PlaybackServiceException.ErrorReason.values().length];
        try
        {
            a[PlaybackServiceException.ErrorReason.REQUEST_FAILED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            a[PlaybackServiceException.ErrorReason.WATCH_NEXT_ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            a[PlaybackServiceException.ErrorReason.UNPLAYABLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[PlaybackServiceException.ErrorReason.VIDEO_ERROR.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[PlaybackServiceException.ErrorReason.USER_CHECK_FAILED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[PlaybackServiceException.ErrorReason.UNPLAYABLE_IN_BACKGROUND.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[PlaybackServiceException.ErrorReason.LICENSE_SERVER_ERROR.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[PlaybackServiceException.ErrorReason.NO_STREAMS.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[PlaybackServiceException.ErrorReason.UNKNOWN.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[PlaybackServiceException.ErrorReason.PLAYER_ERROR.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
