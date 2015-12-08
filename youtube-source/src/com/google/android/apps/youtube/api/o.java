// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import com.google.android.apps.youtube.core.player.event.SequencerNavigationRequestEvent;

final class o
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[SequencerNavigationRequestEvent.values().length];
        try
        {
            b[SequencerNavigationRequestEvent.NEXT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            b[SequencerNavigationRequestEvent.AUTOPLAY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            b[SequencerNavigationRequestEvent.PREVIOUS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        a = new int[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.values().length];
        try
        {
            a[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.UNPLAYABLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.VIDEO_ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.UNPLAYABLE_IN_BACKGROUND.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.PLAYER_ERROR.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.LICENSE_SERVER_ERROR.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.REQUEST_FAILED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.NO_STREAMS.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.USER_CHECK_FAILED.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
